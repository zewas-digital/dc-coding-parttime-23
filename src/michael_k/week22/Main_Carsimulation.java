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


        ScheißAuto auto1 = new ScheißAuto ( "Audi", "A5", 1500, 60, Antriebsart.Benzin, 105, 7.5 );
        //Car auto2 = new Car ( "BMW", "5", 1400, 60, Antriebsart.Diesel, 130, 8.0 );
        //Car auto3 = new Car ( "Mercedes", "E", 1600, 60, Antriebsart.Benzin, 110, 7.0 );
        Repairstation garage1 = new Repairstation ( "Dave's Garage" );
        Gasstation tankstelle1 = new Gasstation ("Jack's Tankstelle");

        auto1.garageZuordnen ( garage1 );
        //auto2.garageZuordnen ( garage1 );
        //auto3.garageZuordnen ( garage1 );

        auto1.tankstelleZuordnen ( tankstelle1 );
        //auto2.tankstelleZuordnen ( tankstelle1 );
        //auto3.tankstelleZuordnen ( tankstelle1 );

        Scanner inputKonsole = new Scanner ( System.in );
        int kilometer;
        String status;
        int ablauf=0;
        boolean abbruch = true;
        while ( abbruch ) {

            switch (ablauf){
                case 0:
                    System.out.println (
                            "Auto1\n" +
                                    "Eingabe:\n" +
                                    " 1-n = Kilometer fahren \n" +
                                    " 0   = Autofahrt beenden\n" +
                                    "-1   = tanken\n"
                    );

                    kilometer = inputKonsole.nextInt ( );

                    if (kilometer > 0) {

                        double kilometerNichtGefahren = auto1.drive ( kilometer );
                        if (kilometerNichtGefahren == 0) {
                            System.out.println ("Auto1: Es wurden " + kilometer + " zurückgelegt" );
                            System.out.println ("Tankinhalt: " + auto1.getTankinhalt ());
                        }else{
                            System.out.println ("Es konnten nur " + (kilometer-kilometerNichtGefahren) + " gefahren werden, weil der Tank leer ist" );
                            System.out.println ("Tankinhalt: " + auto1.getTankinhalt ());
                        }
                        status = auto1.statusCheck ();

                        if (status.equals ( "alles OK" )){
                            ablauf = 0;
                            System.out.println ("Autostatus ok.\n" );
                        } else if (status.equals ( "Motor defekt" )) {
                            ablauf = 1;
                            System.out.println ("Der Motor ist defekt, sie können nicht weiter fahren.\n" );
                        } else if (status.equals ( "Tank leer" )) {
                            ablauf = 2;
                            System.out.println ("Der Tank ist leer, tanken sie das Auto.\n" );
                        }else if (status.equals ( "Tank leer, Motor defekt ")) {
                            ablauf = 3;
                            System.out.println ("Der Motor ist defekt und der Tank ist leer.\n" );
                        }

                    } else if (kilometer < 0) {
                        auto1.tanken ( );
                        System.out.println ("Das Auto wurde wieder komplett vollgetankt");
                        System.out.println ("Tankinhalt: "+auto1.getTankinhalt ());
                    } else {
                        abbruch = false;
                    }
                    break;
                case 1:
                    boolean schleife1= true;
                    if (auto1.selbstReparierend){
                        auto1.motorreparieren ( );
                        System.out.println ("Der Motor wurde automatisch repariert." );
                    }else {
                        while ( schleife1 ) {
                            System.out.println (
                                    "Eingabe:\n" +
                                            " j/n = Wollen sie ihr Auto in ihrer Garage reparieren? \n"
                            );
                            String eingabe = inputKonsole.next ( );
                            if (eingabe.equals ( "j" )) {
                                auto1.motorreparieren ( );
                                System.out.println ("Der Motor wurde repariert." );
                                schleife1 = false;
                            } else if (eingabe.equals ( "n" )) {
                                System.out.println ( "Der Motor wird nicht mehr repariert, das Auto kann nicht weiter gefahren werden." );
                                abbruch = false;
                                schleife1 = false;
                            } else {
                                System.out.println ("Eingabe ist nicht gültig." );
                            }
                        }
                    }
                    ablauf = 0;
                    break;
                case 2:
                    boolean schleife2= true;
                    while ( schleife2 ) {
                        System.out.println (
                                "Eingabe:\n" +
                                        " j/n = Wollen sie ihr Auto volltanken? \n"
                        );
                        String eingabe = inputKonsole.next ( );
                        if (eingabe.equals ( "j" )) {
                            auto1.tanken ( );
                            schleife2 = false;
                        } else if (eingabe.equals ( "n" )) {
                            System.out.println ( "Das Auto wird nicht mehr vollgetankt, das Auto kann nicht weiter gefahren werden." );
                            abbruch = false;
                            schleife2 = false;
                        } else {
                            System.out.println ("Eingabe ist nicht gültig." );
                        }
                    }
                    ablauf = 0;
                    break;
                case 3:
                    boolean schleife3= true;
                    while ( schleife3 ) {
                        System.out.println (
                                "Eingabe:\n" +
                                        " j/n = Wollen sie ihr Auto reparieren und volltanken? \n"
                        );
                        String eingabe = inputKonsole.next ( );
                        if (eingabe.equals ( "j" )) {
                            auto1.motorreparieren ();
                            auto1.tanken ( );
                            schleife3 = false;
                        } else if (eingabe.equals ( "n" )) {
                            System.out.println ( "Das Auto wird weder vollgetankt noch repariert, das Auto kann nicht weiter gefahren werden." );
                            abbruch = false;
                            schleife3 = false;
                        } else {
                            System.out.println ("Eingabe ist nicht gültig." );
                        }
                    }
                    ablauf = 0;
                    break;
            }


        }
        /*
        Thread a = new Thread() {
            public void run() {
                Scanner inputKonsole = new Scanner ( System.in );
                int kilometer;
                String status;
                int ablauf=0;
                boolean abbruch = true;
                while ( abbruch ) {

                    switch (ablauf){
                        case 0:
                            System.out.println (
                                    "Auto1\n" +
                                            "Eingabe:\n" +
                                            " 1-n = Kilometer fahren \n" +
                                            " 0   = Autofahrt beenden\n" +
                                            "-1   = tanken\n"
                            );

                            kilometer = inputKonsole.nextInt ( );

                            if (kilometer > 0) {

                                double kilometerNichtGefahren = auto1.drive ( kilometer );
                                if (kilometerNichtGefahren == 0) {
                                    System.out.println ("Auto1: Es wurden " + kilometer + " zurückgelegt" );
                                    System.out.println ("Tankinhalt: " + auto1.getTankinhalt ());
                                }else{
                                    System.out.println ("Es konnten nur " + (kilometer-kilometerNichtGefahren) + " gefahren werden, weil der Tank leer ist" );
                                    System.out.println ("Tankinhalt: " + auto1.getTankinhalt ());
                                }
                                status = auto1.statusCheck ();

                                if (status.equals ( "alles OK" )){
                                    ablauf = 0;
                                    System.out.println ("Autostatus ok.\n" );
                                } else if (status.equals ( "Motor defekt" )) {
                                    ablauf = 1;
                                    System.out.println ("Der Motor ist defekt, sie können nicht weiter fahren.\n" );
                                } else if (status.equals ( "Tank leer" )) {
                                    ablauf = 2;
                                    System.out.println ("Der Tank ist leer, tanken sie das Auto.\n" );
                                }

                            } else if (kilometer < 0) {
                                auto1.tanken ( );
                                System.out.println ("Das Auto wurde wieder komplett vollgetankt");
                                System.out.println ("Tankinhalt: "+auto1.getTankinhalt ());
                            } else {
                                abbruch = false;
                            }
                            break;
                        case 1:
                            boolean schleife1= true;
                            while ( schleife1 ) {
                                System.out.println (
                                        "Eingabe:\n" +
                                                " j/n = Wollen sie ihr Auto in ihrer Garage reparieren? \n"
                                );
                                String eingabe = inputKonsole.next ( );
                                if (eingabe.equals ( "j" )) {
                                    auto1.motorreparieren ( );
                                    System.out.println ("Der Motor wurde repariert." );
                                    schleife1 = false;
                                } else if (eingabe.equals ( "n" )) {
                                    System.out.println ( "Der Motor wird nicht mehr repariert, das Auto kann nicht weiter gefahren werden." );
                                    abbruch = false;
                                    schleife1 = false;
                                } else {
                                    System.out.println ("Eingabe ist nicht gültig." );
                                }
                            }
                            ablauf = 0;
                            break;
                        case 2:
                            boolean schleife2= true;
                            while ( schleife2 ) {
                                System.out.println (
                                        "Eingabe:\n" +
                                                " j/n = Wollen sie ihr Auto Volltanken? \n"
                                );
                                String eingabe = inputKonsole.next ( );
                                if (eingabe.equals ( "j" )) {
                                    auto1.tanken ( );
                                    schleife2 = false;
                                } else if (eingabe.equals ( "n" )) {
                                    System.out.println ( "Das Auto wird nicht mehr vollgetankt, das Auto kann nicht weiter gefahren werden." );
                                    abbruch = false;
                                    schleife2 = false;
                                } else {
                                    System.out.println ("Eingabe ist nicht gültig." );
                                }
                            }
                            ablauf = 0;
                            break;
                    }


                }
            }
        };
        Thread b = new Thread() {
            public void run() {
                Scanner inputKonsole = new Scanner ( System.in );
                int kilometer;
                String status;
                int ablauf=0;
                boolean abbruch = true;
                while ( abbruch ) {

                    switch (ablauf){
                        case 0:
                            System.out.println (
                                    "Auto2\n" +
                                            "Eingabe:\n" +
                                            " 1-n = Kilometer fahren \n" +
                                            " 0   = Autofahrt beenden\n" +
                                            "-1   = tanken\n"
                            );

                            kilometer = inputKonsole.nextInt ( );

                            if (kilometer > 0) {

                                double kilometerNichtGefahren = auto2.drive ( kilometer );
                                if (kilometerNichtGefahren == 0) {
                                    System.out.println ("Auto2: Es wurden " + kilometer + " zurückgelegt" );
                                    System.out.println ("Tankinhalt: " + auto2.getTankinhalt ());
                                }else{
                                    System.out.println ("Es konnten nur " + (kilometer-kilometerNichtGefahren) + " gefahren werden, weil der Tank leer ist" );
                                    System.out.println ("Tankinhalt: " + auto2.getTankinhalt ());
                                }
                                status = auto2.statusCheck ();

                                if (status.equals ( "alles OK" )){
                                    ablauf = 0;
                                    System.out.println ("Autostatus ok.\n" );
                                } else if (status.equals ( "Motor defekt" )) {
                                    ablauf = 1;
                                    System.out.println ("Der Motor ist defekt, sie können nicht weiter fahren.\n" );
                                } else if (status.equals ( "Tank leer" )) {
                                    ablauf = 2;
                                    System.out.println ("Der Tank ist leer, tanken sie das Auto.\n" );
                                }

                            } else if (kilometer < 0) {
                                auto2.tanken ( );
                                System.out.println ("Das Auto wurde wieder komplett vollgetankt");
                                System.out.println ("Tankinhalt: "+auto2.getTankinhalt ());
                            } else {
                                abbruch = false;
                            }
                            break;
                        case 1:
                            boolean schleife1= true;
                            while ( schleife1 ) {
                                System.out.println (
                                        "Eingabe:\n" +
                                                " j/n = Wollen sie ihr Auto in ihrer Garage reparieren? \n"
                                );
                                String eingabe = inputKonsole.next ( );
                                if (eingabe.equals ( "j" )) {
                                    auto2.motorreparieren ( );
                                    System.out.println ("Der Motor wurde repariert." );
                                    schleife1 = false;
                                } else if (eingabe.equals ( "n" )) {
                                    System.out.println ( "Der Motor wird nicht mehr repariert, das Auto kann nicht weiter gefahren werden." );
                                    abbruch = false;
                                    schleife1 = false;
                                } else {
                                    System.out.println ("Eingabe ist nicht gültig." );
                                }
                            }
                            ablauf = 0;
                            break;
                        case 2:
                            boolean schleife2= true;
                            while ( schleife2 ) {
                                System.out.println (
                                        "Eingabe:\n" +
                                                " j/n = Wollen sie ihr Auto Volltanken? \n"
                                );
                                String eingabe = inputKonsole.next ( );
                                if (eingabe.equals ( "j" )) {
                                    auto2.tanken ( );
                                    schleife2 = false;
                                } else if (eingabe.equals ( "n" )) {
                                    System.out.println ( "Das Auto wird nicht mehr vollgetankt, das Auto kann nicht weiter gefahren werden." );
                                    abbruch = false;
                                    schleife2 = false;
                                } else {
                                    System.out.println ("Eingabe ist nicht gültig." );
                                }
                            }
                            ablauf = 0;
                            break;
                    }


                }
            }
        };
        Thread c = new Thread() {
            public void run() {
                Scanner inputKonsole = new Scanner ( System.in );
                int kilometer;
                String status;
                int ablauf=0;
                boolean abbruch = true;
                while ( abbruch ) {

                    switch (ablauf){
                        case 0:
                            System.out.println (
                                    "Auto3\n" +
                                            "Eingabe:\n" +
                                            " 1-n = Kilometer fahren \n" +
                                            " 0   = Autofahrt beenden\n" +
                                            "-1   = tanken\n"
                            );

                            kilometer = inputKonsole.nextInt ( );

                            if (kilometer > 0) {

                                double kilometerNichtGefahren = auto3.drive ( kilometer );
                                if (kilometerNichtGefahren == 0) {
                                    System.out.println ("Auto3: Es wurden " + kilometer + " zurückgelegt" );
                                    System.out.println ("Tankinhalt: " + auto3.getTankinhalt ());
                                }else{
                                    System.out.println ("Es konnten nur " + (kilometer-kilometerNichtGefahren) + " gefahren werden, weil der Tank leer ist" );
                                    System.out.println ("Tankinhalt: " + auto3.getTankinhalt ());
                                }
                                status = auto3.statusCheck ();

                                if (status.equals ( "alles OK" )){
                                    ablauf = 0;
                                    System.out.println ("Autostatus ok.\n" );
                                } else if (status.equals ( "Motor defekt" )) {
                                    ablauf = 1;
                                    System.out.println ("Der Motor ist defekt, sie können nicht weiter fahren.\n" );
                                } else if (status.equals ( "Tank leer" )) {
                                    ablauf = 2;
                                    System.out.println ("Der Tank ist leer, tanken sie das Auto.\n" );
                                }

                            } else if (kilometer < 0) {
                                auto3.tanken ( );
                                System.out.println ("Das Auto wurde wieder komplett vollgetankt");
                                System.out.println ("Tankinhalt: "+auto1.getTankinhalt ());
                            } else {
                                abbruch = false;
                            }
                            break;
                        case 1:
                            boolean schleife1= true;
                            while ( schleife1 ) {
                                System.out.println (
                                        "Eingabe:\n" +
                                                " j/n = Wollen sie ihr Auto in ihrer Garage reparieren? \n"
                                );
                                String eingabe = inputKonsole.next ( );
                                if (eingabe.equals ( "j" )) {
                                    auto3.motorreparieren ( );
                                    System.out.println ("Der Motor wurde repariert." );
                                    schleife1 = false;
                                } else if (eingabe.equals ( "n" )) {
                                    System.out.println ( "Der Motor wird nicht mehr repariert, das Auto kann nicht weiter gefahren werden." );
                                    abbruch = false;
                                    schleife1 = false;
                                } else {
                                    System.out.println ("Eingabe ist nicht gültig." );
                                }
                            }
                            ablauf = 0;
                            break;
                        case 2:
                            boolean schleife2= true;
                            while ( schleife2 ) {
                                System.out.println (
                                        "Eingabe:\n" +
                                                " j/n = Wollen sie ihr Auto Volltanken? \n"
                                );
                                String eingabe = inputKonsole.next ( );
                                if (eingabe.equals ( "j" )) {
                                    auto3.tanken ( );
                                    schleife2 = false;
                                } else if (eingabe.equals ( "n" )) {
                                    System.out.println ( "Das Auto wird nicht mehr vollgetankt, das Auto kann nicht weiter gefahren werden." );
                                    abbruch = false;
                                    schleife2 = false;
                                } else {
                                    System.out.println ("Eingabe ist nicht gültig." );
                                }
                            }
                            ablauf = 0;
                            break;
                    }
                }
            }
        };

        a.start ();
        b.start ();
        c.start ();

*/
    }
}
