package claudia.week15_extend;

public class Auto extends Fahrzeug {
    // Klassenattribut
    protected static int wheels = 4;
    // Instanzattribut
    public String marke;
    public float mileage = 10; // Verbrauch pro 100 km

    public Auto(String name) {
        // Konstruktor der Super-Klasse muss aufgerufen werden, da sie sich den Wert für das private Attribut erwartet.
        super(name);
    }

    // Klassenmethode
    public static float calcLiterPerKilometer(float mileage) {
        // return this.mileage / 100; // in Klassenmethoden kann nicht auf Instanzattribute zugegriffen werden
        return mileage / 100;
    }

    @Override
    public void drive(int kilometer) {
        //TODO drive x kilometer...
    }

    @Override
    public String toString() {
        return super.getName() + " der Marke " + this.marke + " verbraucht " + this.mileage + " Liter pro 100 km.";
    }
}
