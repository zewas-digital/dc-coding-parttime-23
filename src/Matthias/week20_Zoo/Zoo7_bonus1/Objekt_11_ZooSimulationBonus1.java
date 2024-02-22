package Matthias.week20_Zoo.Zoo7_bonus1;


/*
Bonusaufgabe: Simulation 0.2
Erweitere die Simulation

ToDo:
 Simulation mit Simulationstage als Übergabeparameter erweitern

1/ Jedes Tier hat eine Gesundheit, ein MaxGesundheit und einen Biss.
ToDo:
 int MaxGesundheit pro Tier (individuell - siehe nächste Aufgabe "ZooSimulationBonus2)
 int Biss pro Tier (individuell - Punkteabzug bei Biss)
 Konsturktor von Tiere um 2 Übergabeparameter erweitern!! --> Klasse Tiere

2/ Jedes Tier versucht mit 40 % Wahrscheinlichkeit, ein Nachbar von ihm aus dem gleichen Gehege zu beißen.
ToDo:
 pro Tier Bisswahrscheinlichkeit von 0,4
 Random von 0 - 1 wird eine Bisswahrscheinlichkeit einem Tier zugeordnet, d.h. wenn random von 0 - 0,4 --> BISS - von 0,4 - 1 --> KEIN BISS
 Random wird für jedes Tier berechnet und ausgeführt
 Random TierAuswahl, darf nicht sich selbst beißen und keine toten Tiere beissen

3/ Falls ein Tier gebissen wird, wird seine Gesundheit mit dem Biss von Angreifer reduziert
ToDo:
 Definition der Bissverletztung bzw. Bissauswirkung ist immer Punkteabzug vom MaxGesundheit.
3.1/ "toten Tiere" beißen nicht.
ToDo:
 tote Tiere aus der Liste der Tiere entfernen nach jeder Sim.

4/ Am Ende des Tages werden "toten Tiere" aus dem Gehege entfernt
ToDo:
 tote Tiere aus der Liste der Tiere entfernen nach jeder Sim.

Lass auf der Konsole ausdrucken, wer was macht.++
 */
public class Objekt_11_ZooSimulationBonus1 {
    public static void main( String[] args ) {


            Zoo zoo1 = getDemoZoo( );
            ZooSimulator2 zooSimulator2 =new ZooSimulator2(zoo1 );
            zooSimulator2.TagesSimulation( 10);

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

        Tier Kuh = wildwiese.addNewAnimal( "Garmond", "Kuh", Futter.Futtersorten.HEU, regMenge,100,50 );
        Tier Fisch = wildwiese.addNewAnimal( "Rijska", "Hai", Futter.Futtersorten.FLEISCH, regMenge,100,60 );
        Tier Giraffe = blubberBecken.addNewAnimal( "Berti", "Giarffe", Futter.Futtersorten.HEU, regMenge ,100,70);
        Tier Kamelion = wildwiese.addNewAnimal( "Jucki", "Kamelion", Futter.Futtersorten.HEU, regMenge,100,80 );
        Tier Hengst = wildwiese.addNewAnimal( "Joe", "Ross", Futter.Futtersorten.HEU, regMenge,120,40 );

        //Zoo Struktur
       //zoo1.printFormated( );

        // Zoo Bedarfsliste
        //zoo1.printFutterbedarfsliteZoo( );
        return zoo1;
    }
}
