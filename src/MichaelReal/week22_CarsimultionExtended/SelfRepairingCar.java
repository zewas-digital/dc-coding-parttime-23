package MichaelReal.week22_CarsimultionExtended;

public class SelfRepairingCar extends Car{
    public SelfRepairingCar(String hersteller, String modell, int kW, double gewicht, double verbrauch, double maximaleTankkapazitaet, double tankinhalt, double totalKilometers, Antriebsart antrieb) {
        super(hersteller, modell, kW, antrieb, gewicht, verbrauch, new Engine(), new FuelTank());
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
