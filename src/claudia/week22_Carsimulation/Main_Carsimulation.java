package claudia.week22_Carsimulation;

/*
Erstelle eine Car Klasse.
Diese enthält alle gängigen Attribute die für ein Auto benötigt werden.
Zumindest sollte die Klasse folgende Attribute enthalten:

Hersteller
Modell
kW (Leistung) - bzw. Verbrauch in Liter/100 km?
Tankinhalt - bzw. Ladestatus Batterie?
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



Interface drive
class motor: hier Kilometerstand, boolean heil, boolean angeschaltet, Methoden start und stop
class tank: hier Füllstand


 */

public class Main_Carsimulation {
    public static void main(String[] args) {
        //Auto auto1 = new Auto("Skoda", "Oktavia", 0, 60, 30, 6);
        //Auto auto2 = new Auto("Fiat", "500", 100000, 35.0, 15.0, 8.0);

        double[] strecken = {200.0, 1500.0, 200.0, 35.0};

        for (int i = 0; i < 4; i++) {
            //if (auto1.fahren(strecken[i]) > 0) auto1.volltanken();
           // if (auto2.fahren(strecken[i]) > 0) auto2.volltanken();
        }

    }
}
/*
protected void useFuel (tank, verbrauch) thorows new CarBrokenException{
... Code...
throw new EngineBrokeException() : Auto stoppen, Werkstatt Motor tauschen


vokd drive (distance){
...
 */