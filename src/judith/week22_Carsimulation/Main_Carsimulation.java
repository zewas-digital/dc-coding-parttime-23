package judith.week22_Carsimulation;

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


import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Locale;

public class Main_Carsimulation {

    public static void main(String[] args) {


        BenzinAuto vwGolf = new BenzinAuto("VW","Golf",2022,85,800,40000,40,0.65,40);
        DieselAuto skodaOctavia = new DieselAuto("Skoda","Octavia",2023,147,1200,4000,50,8.0,20);


        vwGolf.drive(100);
       // System.out.println("Das Auto "  + vwGolf + " hat " + gefahreneKilometer + " km zurückgelegt.");
       // System.out.println("Der neue Kilometerstand beträgt " + NumberFormat.getInstance(Locale.GERMAN).format(vwGolf.getKilometerstand() + gefahreneKilometer) + " km");
        // System.out.println("Neuer Tankinhalt " + vwGolf.getTankinhalt());
       // vwGolf.fahren(100);






    }
}
