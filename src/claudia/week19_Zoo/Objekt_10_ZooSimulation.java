package claudia.week19_Zoo;
import java.util.ArrayList;
import java.util.Random;


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
        Zoo zoo = Zoohilfe.erstelleStandardZooMitPflegern();

        zoo.printStructure();

       // zoo.printPflegerUndGehegeListe();
/*
        for (Gehege g : zoo.getListeDerGehege()) {
            System.out.print("Gehege: " + g.getName() + " betreut von: ");
            Zoohilfe.printArrayListPfleger(g.getListeDerZustaendigenPfleger(zoo.getListeDerPfleger()));
            System.out.println();
        }
*/
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
        //Alle Gehege auf "nicht gefüttert" setzen:
        Zoohilfe.setAllEnclosuresToUnfed(zoo);

        for (Pfleger pfleger : zoo.getListeDerPfleger()) {
            pfleger.startDay();
            for (Gehege gehege : pfleger.getListeDerBetreutenGehege()) {
                if (gehege.getListeDerTiere().isEmpty()) break;
                if (!gehege.isAlreadyFed()) {
                    System.out.println("\nPfleger " + pfleger.getName() + " füttert alle Tiere in Gehege " + gehege.getName() + ":\n");
                    gehege.feedAllAnimalsInEnclosure(zoo.getLagerhaus());
                    gehege.changeFeedStatus();
                } else
                    System.out.println("\nGehege " + gehege.getName() + " bereits von anderem Pfleger betreut - Pfleger " + pfleger.getName() + " geht weiter!");
            }

            Random random = new Random();
            //zufälliges Tier beobachten:
            zoo.getListeDerTiere().get(random.nextInt(zoo.getListeDerTiere().size())).watch(pfleger);
            //Tier der Lieblingsart beobachten:
            Zoohilfe.watchFavourite(zoo, pfleger);
            pfleger.endDay();
        }
        //überprüfen, ob alle Gehege betreut wurden:
        for (Gehege g : zoo.getListeDerGehege()) {
            if (!g.isAlreadyFed() && !g.getListeDerTiere().isEmpty()) {
                System.out.println("\nKein Pfleger zuständig für Gehege " + g.getName() + "! ");
                System.out.println("Dieser Zoo ist wirklich schlecht gemanagt! ");
            }
        }
    }

    private static void tagesablaufProGehege(Zoo zoo) {
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
                System.out.println("\nFür das Gehege " + gehege.getName() + " ist niemand zuständig! Dieser Zoo ist wirklich schlecht gemanagt!");
            else {
                Random random = new Random();
                //suche zufälligen Pfleger aus der Liste aus:
                Pfleger pfleger = zustaendigePfleger.get(random.nextInt(zustaendigePfleger.size()));
                System.out.println("\nPfleger " + pfleger.getName() + " füttert alle Tiere in Gehege " + gehege.getName() + ":\n");
                gehege.feedAllAnimalsInEnclosure(zoo.getLagerhaus());
                gehege.changeFeedStatus();
            }
        }

            for (Pfleger pfleger : zoo.getListeDerPfleger()) {
                Random random = new Random();
                //zufälliges Tier anschauen
                zoo.getListeDerTiere().get(random.nextInt(zoo.getListeDerTiere().size())).watch(pfleger);
                //Tier der Lieblingsart anschauen
                Zoohilfe.watchFavourite(zoo, pfleger);

                pfleger.endDay();
            }
    }
}