package MichaelReal.week22_CarsimultionExtended;

public class ElectricCar extends Car implements Chargeable {
    private double batteriekapazitaet; // Maximale Batteriekapazität in kWh
    private double aktuelleLadung; // Aktuelle Ladung in kWh
    private double totalKilometers = 0; // Gesamtkilometerstand


    public ElectricCar(String hersteller, String modell, int kW, double gewicht, double verbrauch, double batteriekapazitaet, double aktuelleLadung, double totalKilometers) {
        super(hersteller, modell, kW, Antriebsart.STROM, gewicht, verbrauch, new Engine(), new Battery());
        this.batteriekapazitaet = batteriekapazitaet;
        this.aktuelleLadung = aktuelleLadung;
        this.totalKilometers = totalKilometers;

    }

    @Override
    public void charge(double kWh) {
        aktuelleLadung = Math.min(aktuelleLadung + kWh, batteriekapazitaet);
        System.out.println(getModell() + " geladen: Aktuelle Ladung ist jetzt " + aktuelleLadung + " kWh.");
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

    public double getBatteriekapazitaet() {
        return batteriekapazitaet;
    }

    public double getAktuelleLadung() {
        return aktuelleLadung;
    }
}
