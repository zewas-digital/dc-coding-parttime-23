package MichaelReal.week22_CarsimultionExtended;

public class DieselCar extends Car implements Refuelable {
    private double tankinhalt; // Aktueller Tankinhalt in Litern
    private double maximaleTankkapazitaet; // Maximale Tankkapazität in Litern

    public DieselCar(String hersteller, String modell, int kW, double gewicht, double verbrauch, double maximaleTankkapazitaet, double tankinhalt) {
        super(hersteller, modell, kW, Antriebsart.DIESEL, gewicht, verbrauch, new Engine(), new FuelTank());
        this.maximaleTankkapazitaet = maximaleTankkapazitaet;
        this.tankinhalt = tankinhalt;
    }

    @Override
    public void refuel(double liter) {
        tankinhalt = Math.min(tankinhalt + liter, maximaleTankkapazitaet);
        System.out.println(getModell() + " betankt: Aktueller Tankinhalt ist jetzt " + tankinhalt + " Liter.");
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
