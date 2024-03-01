package MichaelReal.week22_CarsimultionExtended;

public class ElectricCar extends Car implements Chargeable {
    private double batteriekapazitaet; // Maximale Batteriekapazität in kWh
    private double aktuelleLadung; // Aktuelle Ladung in kWh

    public ElectricCar(String hersteller, String modell, int kW, double gewicht, double verbrauch, double batteriekapazitaet, double aktuelleLadung) {
        super(hersteller, modell, kW, Antriebsart.STROM, gewicht, verbrauch, new Engine(), new Battery());
        this.batteriekapazitaet = batteriekapazitaet;
        this.aktuelleLadung = aktuelleLadung;
    }

    @Override
    public void charge(double kWh) {
        aktuelleLadung = Math.min(aktuelleLadung + kWh, batteriekapazitaet);
        System.out.println(getModell() + " geladen: Aktuelle Ladung ist jetzt " + aktuelleLadung + " kWh.");
    }

    @Override
    public boolean drive(int kilometers) {
        double requiredEnergy = kilometers * (verbrauch / 100.0);
        if (requiredEnergy <= this.tank.getCurrentLevel() && this.engine.isFunctional()) {
            this.tank.setCurrentLevel(this.tank.getCurrentLevel() - requiredEnergy);
            // Zusätzliche Logik für Kilometerstand und Energieverbrauch
            return true;
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
