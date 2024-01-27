package claudia.week19_Zoo;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/*
Aufgabe: Simulation 0.1
Erweitere das Programm mit einer Tagessimulation.

1/ An jeden Tag, gehen die Pfleger los, und kümmern sich um die Gehege in deren Zuständigkeitsbereich.
Falls ein Pfleger ein Gehege findet, welche schon bearbeitet wurde, überspringt die Gehege und nimmt das nächste.
2/ Wenn ein Pfleger zu einem Gehege kommt, werden zuerst die Tiere gefüttert.
3/ Nach dem Füttern wird er ein zufälliges Tier länger beobachten.

Bonus/ Mit einer Erweiterung der Pfleger um seine Lieblings-Tier-Gattung, kann der Pfleger ein Tier seiner Lieblings-Gattung bewundern.

Drucke auf der Konsole aus, wer-was macht...
 */

import claudia.week18_neuerZoo.*;

public class Objekt_10_ZooSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Zoo zoo = Zoohilfe.erstelleStandardZooMitPflegern();

        //Test: für ein Gehege alle zuständigen Pfleger entfernen:
        for (Pfleger pfleger : zoo.getListeDerPfleger()) {
            pfleger.getListeDerBetreutenGehege().remove(zoo.getListeDerGehege().get(1));
            // pfleger.gehegeLoeschen(zoo.getListeDerGehege().get(0));

        }
        //zoo.getLagerhaus().printStocklist();
        //Test: Lagerbestand senken:
        //zoo.getLagerhaus().setStockListSingleFeed(Lagerhaus.Futterarten.FISCH, 200);

        /*
        for (Gehege g : zoo.getListeDerGehege()) {
            System.out.print("Gehege: " + g.getName() + " betreut von: ");
            Zoohilfe.printArrayListPfleger(g.getListeDerZustaendigenPfleger(zoo.getListeDerPfleger()));
            System.out.println();
        }
*/
        System.out.println("\nZoo erstellt! ");
        zoo.printStructure();
        //TEST LAGERHAUS UND FÜTTERN:
        /*
        zoo.getLagerhaus().printStocklist();
        for (Tier t : zoo.getListeDerTiere()){
            t.feed(zoo.getLagerhaus());
        }
        zoo.getLagerhaus().printStocklist();
*/
        zoo.printFeedList();

        // zoo.printPflegerUndGehegeListe();
        /*
        for (Gehege g : zoo.getListeDerGehege()) {
            System.out.print("Gehege: " + g.getName() + " betreut von: ");
            Zoohilfe.printArrayListPfleger(g.getListeDerZustaendigenPfleger(zoo.getListeDerPfleger()));
            System.out.println();
        }*/



        System.out.println("\nStarte Zoowoche mit ENTER!");
        sc.nextLine();


        System.out.println("\nEine Woche im Zoo: ");

        for (int i = 0; i < 7; i++) {
            System.out.println("\n *** TAG " + (i + 1) + " *** ");
            //Tagesablauf pro Gehege: jeweils Pfleger aussuchen - füttern - anschließend alle Pfleger Tiere beobachten
            tagesablaufProGehege(zoo);

            //Tagesablauf pro Pfleger: pro Pfleger Gehege durchlaufen - ggf. füttern - Tier beobachten
            //tagesablaufProPfleger(zoo);
        }

    }

    private static void tagesablaufProPfleger(Zoo zoo) {
        zoo.getDirektor().startDay();
        //Alle Gehege auf "nicht gefüttert" setzen:
        Zoohilfe.setAllEnclosuresToUnfed(zoo);

        for (Pfleger pfleger : zoo.getListeDerPfleger()) {
            pfleger.startDay();
            for (Gehege gehege : pfleger.getListeDerBetreutenGehege()) {
                if (gehege.getListeDerTiere().isEmpty()) break;
                if (!gehege.isAlreadyFed()) {
                    System.out.println("\n" + pfleger + " füttert alle Tiere in Gehege " + gehege.getName() + ":\n");
                    gehege.feedAllAnimalsInEnclosure(zoo.getLagerhaus());
                    gehege.changeFeedStatus();
                } else
                    System.out.println("\nGehege " + gehege.getName() + " bereits von anderem Pfleger betreut - Pfleger " + pfleger.getName() + " geht weiter!");
            }

            //zufälliges Tier beobachten:
            Zoohilfe.watchRandom(zoo, pfleger);
            //Tier der Lieblingsart beobachten:
            Zoohilfe.watchFavourite(zoo, pfleger);
            pfleger.endDay();
        }
        //überprüfen, ob alle Gehege betreut wurden:
        for (Gehege g : zoo.getListeDerGehege()) {
            if (!g.isAlreadyFed() && !g.getListeDerTiere().isEmpty()) {
                directorsIntervention(zoo, g);
            }
        }
        Zoohilfe.watchFavourite(zoo, zoo.getDirektor());
        zoo.getLagerhaus().printStocklist();
        zoo.getDirektor().endDay();
    }



    private static void tagesablaufProGehege(Zoo zoo) {
        zoo.getDirektor().startDay();
        //setze alle Gehege auf "ungefüttert"
        Zoohilfe.setAllEnclosuresToUnfed(zoo);
        for (Pfleger p : zoo.getListeDerPfleger())
            p.startDay();
        //Schleife über alle Gehege:
        for (Gehege gehege : zoo.getListeDerGehege()) {
            if (gehege.getListeDerTiere().isEmpty()) break;
            //alle zuständigen Pfleger:
            ArrayList<Pfleger> zustaendigePfleger = gehege.getListeDerZustaendigenPfleger(zoo.getListeDerPfleger());
            if (zustaendigePfleger.isEmpty())
                    directorsIntervention(zoo,gehege);
            else {
                Random random = new Random();
                //suche zufälligen Pfleger aus der Liste aus:
                Pfleger pfleger = zustaendigePfleger.get(random.nextInt(zustaendigePfleger.size()));
                System.out.println("\n" + pfleger + " füttert alle Tiere in Gehege " + gehege.getName() + ":\n");
                gehege.feedAllAnimalsInEnclosure(zoo.getLagerhaus());
                gehege.changeFeedStatus();
            }
        }

            for (Pfleger pfleger : zoo.getListeDerPfleger()) {
                //zufälliges Tier anschauen
                Zoohilfe.watchRandom(zoo, pfleger);
                //Tier der Lieblingsart anschauen
                Zoohilfe.watchFavourite(zoo, pfleger);
                pfleger.endDay();
            }

        Zoohilfe.watchFavourite(zoo, zoo.getDirektor());
        zoo.getLagerhaus().printStocklist();
        zoo.getDirektor().endDay();
    }

    private static void directorsIntervention(Zoo zoo, Gehege g) {
        System.out.println("\nKein Pfleger zuständig für Gehege " + g.getName() + " - ");
        System.out.println("die Direktorin muss eingreifen!");
        System.out.println("\n" + zoo.getDirektor() + " füttert alle Tiere in Gehege " + g.getName() + ":\n");
        g.feedAllAnimalsInEnclosure(zoo.getLagerhaus());
        g.changeFeedStatus();
    }
}