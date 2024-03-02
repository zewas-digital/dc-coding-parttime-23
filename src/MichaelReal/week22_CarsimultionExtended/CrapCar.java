package MichaelReal.week22_CarsimultionExtended;

public class CrapCar extends Car {
    public CrapCar(String hersteller, String modell, int kW, double gewicht, double verbrauch, double maximaleTankkapazitaet, double tankinhalt, double totalKilometers, Antriebsart antrieb) {
        super(hersteller, modell, kW, antrieb, gewicht, verbrauch, new Engine(), new FuelTank());
    }

    @Override
    public boolean drive(int kilometers) {
        if (Math.random() < 0.5) { // Simuliere erhöhte Defektwahrscheinlichkeit
            engine.setFunctional(false);
        }
        return super.drive(kilometers);
    }
}