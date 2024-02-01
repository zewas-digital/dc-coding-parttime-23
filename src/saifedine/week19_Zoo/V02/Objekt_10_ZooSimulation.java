package saifedine.week19_Zoo.V02;

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


public class Objekt_10_ZooSimulation {

    public static void main(String[] args) {

        // Anlage Instanz Zoo
        Zoo tiergartenDornbirn = new Zoo("Tiergarten Dornbirn",2022);

        // Anlage Instanzen Gehege
        Gehege ried = new Gehege("Ried");
        Gehege terrarium = new Gehege("Terrarium (warm)");
        Gehege alpenwiese = new Gehege("Alpenwiese");

        // Gehegezuordnung zum Zoo
        tiergartenDornbirn.addGehege(ried);
        tiergartenDornbirn.addGehege(terrarium);
        tiergartenDornbirn.addGehege(alpenwiese);

        System.out.println("getgehegeArrayList(): " + tiergartenDornbirn.getgehegeArrayList() + "\n");

        tiergartenDornbirn.zooStrukturGehege();

        // Anlage Instanzen Tiere mit alten Konstruktor
        Tiere schlange1reptil = new Tiere("Schlange","Reptil");
        Tiere schlange2reptil = new Tiere("Danger Nudel", "Reptil");
        Tiere hirsch1wild = new Tiere("Hirsch1", "Wild");
        Tiere hirsch2wild = new Tiere("Hirsch2","Wild");
        Tiere reh1wild = new Tiere("Reh", "Wild");
        Tiere schlidkroete1reptil = new Tiere("Schildkröte","Reptil");

        // Tierzuordnung zum Gehege
        terrarium.addTiere(schlange1reptil);
        terrarium.addTiere(schlange2reptil);
        ried.addTiere(hirsch1wild);
        ried.addTiere(hirsch2wild);
        alpenwiese.addTiere(reh1wild);
        terrarium.addTiere(schlidkroete1reptil);

        Pfleger pflegerHugo = new Pfleger("Hugo");
        Pfleger pflegerFranz = new Pfleger("Franz");

        tiergartenDornbirn.addPfleger(pflegerHugo);
        tiergartenDornbirn.addPfleger(pflegerFranz);

        tiergartenDornbirn.zustaendigkeitGehege(pflegerHugo, ried);
        tiergartenDornbirn.zustaendigkeitGehege(pflegerFranz, ried);
        tiergartenDornbirn.zustaendigkeitGehege(pflegerHugo, terrarium);
        tiergartenDornbirn.zustaendigkeitGehege(pflegerFranz, terrarium);
        tiergartenDornbirn.zustaendigkeitGehege(pflegerHugo, alpenwiese);
        tiergartenDornbirn.zustaendigkeitGehege(pflegerFranz, alpenwiese);

        tiergartenDornbirn.zooStrukturGehegeTierePfleger();

        Simulation_1 sim1 = new Simulation_1(tiergartenDornbirn);

        System.out.println("\n" + sim1);

        boolean checkStatus = sim1.checkZustaendigkeit(pflegerFranz,terrarium);
        System.out.println("\n" + pflegerFranz.toString() + " ist zuständig für " + terrarium.toString() + " : " + checkStatus);

        checkStatus = sim1.checkZustaendigkeit(pflegerHugo,alpenwiese);
        System.out.println("\n" + pflegerHugo.toString() + " ist zuständig für " + alpenwiese.toString() + " : " + checkStatus + "\n");

        sim1.arbeitListe();

        sim1.arbeit(tiergartenDornbirn);

    }
}
