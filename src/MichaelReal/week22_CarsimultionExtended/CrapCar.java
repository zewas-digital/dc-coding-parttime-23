package MichaelReal.week22_CarsimultionExtended;

public class CrapCar extends Car {
    public CrapCar(String hersteller, String modell, int kW, Antriebsart antrieb, double gewicht, double verbrauch, Engine engine, FuelTank tank) {
        super(hersteller, modell, kW, antrieb, gewicht, verbrauch, engine, tank);
    }

    @Override
    public boolean drive(int kilometers) {
        if (Math.random() < 0.5) { // Simuliere erhöhte Defektwahrscheinlichkeit
            engine.setFunctional(false);
        }
        return super.drive(kilometers);
    }
}