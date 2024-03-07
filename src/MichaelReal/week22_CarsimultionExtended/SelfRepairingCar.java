package MichaelReal.week22_CarsimultionExtended;

public class SelfRepairingCar extends Car {
    public SelfRepairingCar(String hersteller, String modell, Engine engine, Tank tank, double verbrauch) {
        super(hersteller, modell, engine, tank, verbrauch);
    }

    @Override
    public boolean drive(int kilometers) {
        if (!isEngineFunctional()) {
            repairEngine(); // Automatische Reparatur vor der Fahrt
        }
        return super.drive(kilometers);
    }
}



