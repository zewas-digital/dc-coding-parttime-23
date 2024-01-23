package claudia.week19_Zoo;

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

import claudia.week18_neuerZoo.Zoo;
import claudia.week18_neuerZoo.Zoohilfe;

public class Objekt_10_ZooSimulation {
    public static void main(String[] args) {
        Zoo zoo = Zoohilfe.erstelleStandardZooMitPflegern();

        zoo.printStructure();

        zoo.printPflegerUndGehegeListe();


    }

}
