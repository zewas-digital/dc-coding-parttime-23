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
            totalKilometers += kilometers; // Kilometerstand aktualisieren
            System.out.println("Aktueller Kilometerstand: " + totalKilometers + " km.");
            // Optional: Überprüfe den Zustand des Motors nach der Fahrt
            if (!this.engine.isFunctional()) {
                System.out.println("Motordefekt festgestellt. Reparatur erforderlich.");
                return false;
            }
            return true;
        } else if (!this.engine.isFunctional()) {
            System.out.println("Der Motor ist defekt.");
        } else {
            System.out.println("Nicht genügend Treibstoff für die Fahrt.");
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

