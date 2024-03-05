package MichaelReal.week22_CarsimultionExtended;

public class AeroDynamicCar extends Car {
    public AeroDynamicCar(String hersteller, String modell, Engine engine, Tank tank, double verbrauch) {
        super(hersteller, modell, engine, tank, verbrauch);
    }

    @Override
    public boolean drive(int kilometers) {
        // Halbiere den Treibstoffverbrauch für die aerodynamische Effizienz vor der Fahrt
        this.verbrauch *= 0.5;
        boolean result = super.drive(kilometers);
        this.verbrauch *= 2; // Stelle den ursprünglichen Verbrauch wieder her
        return result;
    }
}




