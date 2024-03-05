package MichaelReal.week22_CarsimultionExtended;

public class SelfRepairingCar extends Car{
    public SelfRepairingCar(String hersteller, String modell, int kW, Antriebsart antrieb, double gewicht, double verbrauch, Engine engine, FuelTank tank) {
        super(hersteller, modell, kW, antrieb, gewicht, verbrauch, engine, tank);
    }

    @Override
    public boolean drive(int kilometers) {
        boolean driven = super.drive(kilometers);
        if (!engine.isFunctional()) {
            engine.repair();
            super.drive(kilometers); // Versuche erneut zu fahren nach der Reparatur
        }
        return driven;
    }
}
