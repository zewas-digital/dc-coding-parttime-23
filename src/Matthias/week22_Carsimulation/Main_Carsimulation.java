package Matthias.week22_Carsimulation;

/*
Erstelle eine Car Klasse.
Diese enthält alle gängigen Attribute die für ein Auto benötigt werden.
Zumindest sollte die Klasse folgende Attribute enthalten:

Hersteller
Modell
kW (Leistung)
Tankinhalt
Antriebsart (erstelle dafür eine Enumeration Benzin, Diesel, Gas, Strom)
Gewicht

Überlege welche Attribute du im Konstruktor als Parameter erhalten willst.
Ohne welche kann eine Auto Instanz nicht existieren?

Erstelle nun die Methode drive(int kilometer) welche einen int zurückgibt.
Diese Methode soll, wenn es der Tankinhalt zulässt, die gegebene Strecke zurücklegen.
Wenn der Tank leer ist, soll nur die Strecke zurückgegeben werden, die zurückgelegt werden konnte, ansonsten die gesamte Strecke.

Wenn der Tank leer ist, soll der Tank über eine Methode mit einer gewissen Menge an Kraftstoff aufgefüllt werden.
Erstelle dazu eine entsprechende Methode und fahr weiter.

Erstelle nun eine Carsimulation welche eine gewisse Anzahl von Autoinstanzen erstellt und diese fahren lässt und wenn nötig wieder betankt.

Wunsch: Die Methoden sollen zu ihrer eigentlichen Funktion auch eine schöne Ausgabe erstellen
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main_Carsimulation {
    public static void main( String[] args ) {
        RapairStation ATU=new RapairStation( "ATU" );
        RapairStation OEAMTC=new RapairStation( "ÖAMTC" );
        GasStation Shell=new GasStation( "Shell" );
        GasStation ENI=new GasStation( "ENI" );
        GasStation OMV=new GasStation( "OMV" );
        Tank BigTank=new Tank( 50 );
        Tank MediumTank=new Tank( 25 );
        Tank SmallTank= new Tank( 5 );
        Fuel Diesel= new Fuel( Powertrain.Diesel );
    Engine Engine1= new Engine( "V1",  Diesel,5);
    Engine Engine2= new Engine( "V2",  Diesel,5);
    Engine Engine3= new Engine( "V3",  Diesel,5);
    Engine Engine4= new Engine( "V4",  Diesel,5);
    Car Audi    =new Car("Audi","A5",Engine1,BigTank);
    Car Fiat    =new Car("Fiat","A8",Engine2,MediumTank);
    Car Porsche =new Car("Porsche","A4",Engine3,SmallTank);
    Car Toyota  =new Car("Toyota","A3",Engine4,BigTank);
    ArrayList<Car> TaxiPartyFlotte= new ArrayList<>(  );
    TaxiPartyFlotte.add( Audi );
    TaxiPartyFlotte.add( Fiat );
    TaxiPartyFlotte.add( Porsche );
    TaxiPartyFlotte.add( Toyota );
    Main_Carsimulation.carSimulation( TaxiPartyFlotte, ENI,ATU);

    }

    public static void carSimulation(ArrayList<Car> CarList,GasStation gasStation,RapairStation rapairStation ) {
        Collections.shuffle( CarList);
        printList( CarList );
            for (Car c:CarList) {
                // jedes Auto fährt 10 km
                    for (int i = 0; i < 5000; i++) { // For Schleife im Theard auslagern und mit der Repairstation veralgern
                        System.out.println("Ziel: " + c + " hat " +  i +"Kilometer" );
                        c.drive( i );
                        if ( 5>=c.getTank().getFillLevel()) {
                            System.out.println("Das Auto "+ c + " WARNUNG: Tankstelle anfahren!" );
                            gasStation.checkIn( c );
                            gasStation.refuel( 50 );// fixer Wert
                        }
                        if ( c.getEngine().isEngineDefekt()) {
                            //Fuel Diesel = new Fuel( Powertrain.Diesel );
                            //Engine V5 = new Engine( "V5", Diesel, 6.4 );
                            rapairStation.changeEngine( c, new Engine( "V5",new Fuel( Powertrain.Diesel ), 6.4 ));
                        }
                    }

            }
    }
    public static void printList(ArrayList<Car> CarList){
        for (Car c : CarList) {
            System.out.println(c.toString() );
        }
    }
}
