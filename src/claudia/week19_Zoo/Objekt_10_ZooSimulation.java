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

        //zoo.printStructure();

        zoo.printPflegerUndGehegeListe();

       /*
        System.out.println("\nPfleger " + zoo.getListeDerPfleger().get(0).getName() + " hat am liebsten die Art: " + zoo.getListeDerPfleger().get(0).getLieblingsArt());
        System.out.println("Gibt es ein solches Tier im Zoo? ");
        Tier t1 = zoo.findArt(zoo.getListeDerPfleger().get(0).getLieblingsArt());
        if (t1 != null) System.out.println("Lieblingstier vorhanden! " + t1.getName());

        System.out.println("\nPfleger " + zoo.getListeDerPfleger().get(1).getName() + " hat am liebsten die Art: " + zoo.getListeDerPfleger().get(1).getLieblingsArt());
        System.out.println("Gibt es ein solches Tier im Zoo? ");
        Tier t2 =zoo.findArt(zoo.getListeDerPfleger().get(1).getLieblingsArt());
        if (t2 != null) System.out.println("Lieblingstier vorhanden! " + t1.getName());

*/


        System.out.println("\nEine Woche im Zoo: ");

        for (int i = 0; i < 7; i++) {
            System.out.println("\n *** TAG " + (i + 1) + " *** ");
            //Tagesablauf pro Gehege: jeweils Pfleger finden/aussuchen - füttern - anschließend alle Pfleger Tiere beobachten
            tagesablaufProGehege(zoo);//TODO Fehler bei Zuordnung! Pfleger für falsches Gehege! Bernie Tiefsee?

            //Tagesablauf pro Pfleger: pro Pfleger Gehege durchlaufen - ggf. füttern - Tier beobachten
            //tagesablaufProPfleger(zoo);
        }

    }

    private static void tagesablaufProPfleger(Zoo zoo) {
        //Alle Gehege auf "nicht gefüttert" setzen:
        for (Gehege g : zoo.getListeDerGehege()) {
            if (g.isAlreadyFed()) {
               g.changeFeedStatus();
            }
        }

        for (Pfleger pfleger : zoo.getListeDerPfleger()) {
            System.out.println("\nPfleger " + pfleger.getName() + " beginnt seinen Arbeitstag.");
            for (Gehege gehege : pfleger.getListeDerBetreutenGehege()) {
                if (!gehege.isAlreadyFed()) {
                    System.out.println("\nPfleger " + pfleger.getName() + " füttert alle Tiere in Gehege " + gehege.getName() + ":\n");
                    for (Tier tier : gehege.getListeDerTiere()) {
                        tier.feed();
                    }
                    gehege.changeFeedStatus();
                } else
                    System.out.println("\nGehege " + gehege.getName() + " bereits von anderem Pfleger betreut - Pfleger " + pfleger.getName() + " geht weiter!");
            }
            Random random = new Random();

            zoo.getListeDerTiere().get(random.nextInt(zoo.getListeDerTiere().size())).watch(pfleger);
            watchFavourite(zoo, pfleger);
            System.out.println("Pfleger " + pfleger.getName() + " beendet seinen Arbeitstag. ");
        }

        for (Gehege g : zoo.getListeDerGehege()) {
            if (!g.isAlreadyFed()) {
                System.out.println("\nKein Pfleger zuständig für Gehege " + g.getName() + "! ");
                System.out.println("Dieser Zoo ist wirklich schlecht gemanagt! ");
            }

        }
    }

    private static void tagesablaufProGehege(Zoo zoo) {
        //Alle Gehege auf "nicht gefüttert" setzen:
        for (Gehege g : zoo.getListeDerGehege()) {
            if (g.isAlreadyFed()) {
                g.changeFeedStatus();
            }
        }
        for (Gehege gehege : zoo.getListeDerGehege()) {
            ArrayList<Object[]> liste = zoo.getPflegerUndGehegeListe();

            Gehege temp = (Gehege) liste.get(0)[1];

            int i = 1;
            while (!temp.equals(gehege) && i < liste.size() - 1) {
                temp = (Gehege) liste.get(i)[1];
                i++;
            }

            if (!temp.equals(gehege)) System.out.println("\nFür das Gehege " + gehege.getName() + " ist niemand zuständig!\nDieser Zoo ist wirklich schlecht gemanagt!");
            else {

                Pfleger pfleger = (Pfleger) liste.get(i)[0];
                System.out.println("\nPfleger " + pfleger.getName() + " füttert alle Tiere in Gehege " + gehege.getName() + ":\n");
                for (Tier tier : gehege.getListeDerTiere()) {
                    tier.feed();
                }
                gehege.changeFeedStatus();
            }
        }
        for (Pfleger pfleger : zoo.getListeDerPfleger()) {
            Random random = new Random();
            zoo.getListeDerTiere().get(random.nextInt(zoo.getListeDerTiere().size())).watch(pfleger);


            watchFavourite(zoo, pfleger);


            System.out.println("Pfleger " + pfleger.getName() + " beendet seinen Arbeitstag. ");
        }
    }

    private static void watchFavourite(Zoo zoo, Pfleger pfleger) {
        System.out.println("\nPfleger " + pfleger.getName() + " schaut noch sein Lieblingstier an: ");
        Tier t = zoo.findArt(pfleger.getLieblingsArt());
        if (t != null){
            t.watch(pfleger);
        }
        //else System.out.println("Leider ist das Lieblingtier " + pfleger.getLieblingsArt() + " im Zoo nicht vorhanden.");
    }
}
