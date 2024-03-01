package MichaelReal.week22_CarsimultionExtended;

public class GasCar extends Car implements Refuelable {
    private double tankinhalt; // Aktueller Tankinhalt in kg
    private double maximaleTankkapazitaet; // Maximale Tankkapazität in kg
    private double totalKilometers = 0; // Gesamtkilometerstand


    public GasCar(String hersteller, String modell, int kW, double gewicht, double verbrauch, double maximaleTankkapazitaet, double tankinhalt, double totalKilometers) {
        super(hersteller, modell, kW, Antriebsart.GAS, gewicht, verbrauch, new Engine(), new FuelTank());
        this.maximaleTankkapazitaet = maximaleTankkapazitaet;
        this.tankinhalt = tankinhalt;
        this.totalKilometers = totalKilometers;
sf
    }

    @Override
    public void refuel(double kilogramm) {
        tankinhalt = Math.min(tankinhalt + kilogramm, maximaleTankkapazitaet);
        System.out.println(getModell() + " betankt: Aktueller Tankinhalt ist jetzt " + tankinhalt + " Kilogramm.");
    }

    @Override
    public boolean drive(int kilometers) {
        double requiredFuel = kilometers * (verbrauch / 100.0);
        if (requiredFuel <= this.tank.getCurrentLevel() && this.engine.isFunctional()) {
            this.tank.setCurrentLevel(this.tank.getCurrentLevel() - requiredFuel);
            // Zusätzliche Logik für Kilometerstand und Treibstoffverbrauch
            return true;
        }
        return false;
    }

    public double getTankinhalt() {
        return tankinhalt;
    }

    public double getMaximaleTankkapazitaet() {
        return maximaleTankkapazitaet;
    }
}

