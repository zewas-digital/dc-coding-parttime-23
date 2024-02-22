package saifedine.week20_Zoo.V04Bonus1;

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

        System.out.println("\ngetgehegeArrayList(): " + tiergartenDornbirn.getgehegeArrayList());

        tiergartenDornbirn.zooStrukturGehege();

        // Anlage Instanzen Tiere mit Konstruktor 3
        Tiere schlange1reptil = new Tiere("Schlange1","Reptil",80,40);
        Tiere schlange2reptil = new Tiere("Schlange2", "Reptil",80,40);
        Tiere schlange3reptil = new Tiere("Schlange3","Reptil",80,40);
        Tiere schlange4reptil = new Tiere("Schlange4","Reptil",80,40);
        Tiere hirsch1wild = new Tiere("Hirsch1","Wild",5,5);
        Tiere hirsch2wild = new Tiere("Hirsch2","Wild",5,5);
        Tiere hirsch3wild = new Tiere("Hirsch3","Wild",5,5);
        Tiere hirsch4wild = new Tiere("Hirsch4","Wild",5,5);
        Tiere reh1wild = new Tiere("Reh1", "Wild",100,5);
        Tiere reh2wild = new Tiere("Reh2", "Wild",100,5);
        Tiere reh3wild = new Tiere("Reh3", "Wild",100,5);
        Tiere reh4wild = new Tiere("Reh4", "Wild",100,5);
        Tiere schlidkroete1reptil = new Tiere("Schildkröte1","Reptil",150,15);
        Tiere schlidkroete2reptil = new Tiere("Schildkröte2","Reptil",150,15);

        // Tierzuordnung zum Gehege
        terrarium.addTiere(schlange1reptil);
        terrarium.addTiere(schlange2reptil);
        terrarium.addTiere(schlange3reptil);
        terrarium.addTiere(schlange4reptil);
        ried.addTiere(hirsch1wild);
        ried.addTiere(hirsch2wild);
        ried.addTiere(hirsch3wild);
        ried.addTiere(hirsch4wild);
        alpenwiese.addTiere(reh1wild);
        alpenwiese.addTiere(reh2wild);
        alpenwiese.addTiere(reh3wild);
        alpenwiese.addTiere(reh4wild);
        terrarium.addTiere(schlidkroete1reptil);
        terrarium.addTiere(schlidkroete2reptil);

        Pfleger pflegerHugo = new Pfleger("Hugo");
        Pfleger pflegerFranz = new Pfleger("Franz");

        tiergartenDornbirn.addPfleger(pflegerHugo);
        tiergartenDornbirn.addPfleger(pflegerFranz);

        tiergartenDornbirn.zustaendigkeitGehege(pflegerHugo, ried);
        //tiergartenDornbirn.zustaendigkeitGehege(pflegerFranz, ried);
        //tiergartenDornbirn.zustaendigkeitGehege(pflegerHugo, terrarium);
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

        //sim1.arbeitsSimulation(5);

        //sim1.zufallsTier();

        sim1.zufallsTierBiss(ried);

    }
}
