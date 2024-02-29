package MichaelReal.week22_Carsimulation;

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

public class Main_Carsimulation {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 500, 100, 2000, 0.2, 100); // Angenommen, 0.2 Liter pro km (oder entsprechend für Elektroautos)

        // Versuche, 500 km zu fahren
        int gefahreneKilometer = tesla.drive(500);
        System.out.println("Gefahrene Kilometer: " + gefahreneKilometer);

        // Tankinhalt überprüfen und Auto auftanken
        System.out.println("Tank wird aufgefüllt...");
        tesla.refuel(50); // Füge 50 Liter hinzu

        // Versuche, weitere 300 km zu fahren
        int weitereKilometer = tesla.drive(300);
        System.out.println("Weitere gefahrene Kilometer: " + weitereKilometer);
    }
}
