package MichaelReal.week22_CarsimultionExtended;

public class CrapCar extends Car {
    public CrapCar(String hersteller, String modell, int kW, double gewicht, double verbrauch, double maximaleTankkapazitaet, double tankinhalt, double totalKilometers, Antriebsart antrieb) {
        super(hersteller, modell, kW, antrieb, gewicht, verbrauch, new Engine(), new FuelTank());
    }

    @Override
    public boolean drive(int kilometers) {
        super.drive(kilometers);

        // Simuliere eine erhöhte Defektwahrscheinlichkeit
        if (Math.random() < 0.5) { // Annahme: 50% Wahrscheinlichkeit für einen Defekt
            this.engine.setFunctional(false);
            System.out.println("Motor ist defekt.");
        }

        return this.engine.isFunctional();
    }
}