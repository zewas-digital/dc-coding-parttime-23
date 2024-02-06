package Matthias.week19_Zoo.Zoo5_gehegeFuerGehege;

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
    public static void main( String[] args ) {
        Zoo zoo1 = getDemoZoo( );
        ZooSimulator1 zooSimulator11 =new ZooSimulator1( zoo1 );
        zooSimulator11.TagesSimulation( 3 );

    }

    public static Zoo getDemoZoo() {
        Zoo zoo1 = new Zoo( "Tiergarten Dornbirn", 2022 );

        //Pfleger erstellen
        Pfleger pflegerSafi = new Pfleger( "Safi" );
        Pfleger pflegerClaudi = new Pfleger( "Claudi" );

        //Pfleger Zoos zuweisen
        zoo1.neuerPfleger( pflegerSafi );
        zoo1.neuerPfleger( pflegerClaudi );

        //Gehege
        Gehege wildwiese = zoo1.addGehege( "Ried" );
        Gehege wuestenlandschaft = zoo1.addGehege( "Terrarium (warm)" );
        Gehege blubberBecken = zoo1.addGehege( "Wasserplanschbecken" );

        //Plegern ihre Verantwortung mit Validierung hinzufügen

        zoo1.verantwortlichFuerGehege( pflegerSafi, wildwiese );
        zoo1.verantwortlichFuerGehege( pflegerSafi, wuestenlandschaft );
        zoo1.verantwortlichFuerGehege( pflegerSafi, blubberBecken );
        zoo1.verantwortlichFuerGehege( pflegerClaudi, blubberBecken );
        zoo1.verantwortlichFuerGehege( pflegerClaudi, wildwiese);


        Futterbedarf regMenge = new Futterbedarf( 3 );

        Tier Kuh = wildwiese.addNewAnimal( "Garmond", "Kuh", Futter.Futtersorten.HEU, regMenge );
        Tier Fisch = wildwiese.addNewAnimal( "Rijska", "Hai", Futter.Futtersorten.FLEISCH, regMenge );
        Tier Giraffe = wildwiese.addNewAnimal( "Berti", "Giarffe", Futter.Futtersorten.HEU, regMenge );
        Tier Kamelion = wildwiese.addNewAnimal( "Jucki", "Kamelion", Futter.Futtersorten.HEU, regMenge );
        Tier Hengst = wildwiese.addNewAnimal( "Joe", "Ross", Futter.Futtersorten.HEU, regMenge );

        //Zoo Struktur
        zoo1.printFormated( );

        // Zoo Bedarfsliste
        zoo1.printFutterbedarfsliteZoo( );
        return zoo1;
    }

}
