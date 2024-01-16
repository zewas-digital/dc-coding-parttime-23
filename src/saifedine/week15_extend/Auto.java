package saifedine.week15_extend;

// Klasse Auto erweitert die Klasse Fahrzeug
public class Auto extends Fahrzeug {

    // Klassenattribut
    protected static int wheels = 4;

    // Instanzattribut
    public String marke;
    public float mileage = 10; // Verbrauch pro 100 km

    // Methode zur Erstellung einer Instanz Auto mit Konstruktor
    public Auto(String name) {
        // Konstruktor der Super-Klasse muss aufgerufen werden, da sie sich den Wert für das private Attribut erwartet.
        super(name);
    }

    // Klassenmethode
    public static float calcLiterPerKilometer(float mileage) {
        // in Klassenmethoden kann nicht auf Instanzattribute zugegriffen werden
        // return this.mileage / 100;
        return mileage / 100;
    }

    // Abstrakte Methode in Klasse Fahrzeug, muss von Subklassen implementiert werden
    @Override
    public void drive(int kilometer) {
        System.out.println("Fahre Auto.");
        //TODO drive x kilometer...
    }

    // Methode mit der Befugnisse zum Überschreiben (@Override), hier wird die Standard-Methode der Objekt Klasse (extended Object - on the Top) überschrieben und gibt eine individuelle Darstellung / Version
    @Override
    public String toString() {
        return super.getName() +" der Marke "+ this.marke + " verbraucht "+ this.mileage +" Liter pro 100 km.";
    }
}
