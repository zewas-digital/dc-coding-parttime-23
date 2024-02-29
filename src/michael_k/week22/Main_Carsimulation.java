package michael_k.week22;

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

import michael_k.week22.Antriebsart;
import michael_k.week22.Car;

import java.util.Scanner;

public class Main_Carsimulation {

    public static void main(String[] args) {

        int kilometer;
        Car auto1 = new Car ( "Audi", "A5", 60, Antriebsart.Benzin, 7.5 );

        while ( true ) {

            System.out.println (
                    "Eingabe:\n" +
                            " 1-n = Kilometer fahren \n" +
                            " 0   = Autofahrt beenden\n" +
                            "-1   = tanken"
            );

            Scanner inputKonsole = new Scanner ( System.in );
            kilometer = inputKonsole.nextInt ( );


            if (kilometer > 0) {

                double kilometerNichtGefahren = auto1.drive ( kilometer );
                if (kilometerNichtGefahren == 0) {
                    System.out.println ( "Es wurden "+ kilometer + " zurückgelegt" );
                    System.out.println ("Tankinhalt: "+auto1.getTankinhalt ());
                }else{
                    System.out.println ("Es konnten nur "+ (kilometer-kilometerNichtGefahren) + " gefahren werden, weil der Tank leer ist" );
                    System.out.println ("Tankinhalt: "+auto1.getTankinhalt ());
                }

            } else if (kilometer < 0) {
                auto1.volltanken ( );
                System.out.println ("Das Auto wurde wieder komplett vollgetankt");
                System.out.println ("Tankinhalt: "+auto1.getTankinhalt ());
            } else {
                break;
            }

        }

    }


}
