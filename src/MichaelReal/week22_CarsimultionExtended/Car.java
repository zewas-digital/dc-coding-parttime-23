package MichaelReal.week22_CarsimultionExtended;

public abstract class Car {

    public enum Antriebsart {
        BENZIN, DIESEL, GAS, STROM
    }

    protected String hersteller;
    protected String modell;
    protected int kW; // Leistung
    protected Antriebsart antrieb;
    protected double gewicht;
    protected double verbrauch;
    protected Engine engine;
    protected Tank tank;
    protected double totalKilometers = 0;

    public Car(String hersteller, String modell, int kW, Antriebsart antrieb, double gewicht, double verbrauch, Engine engine, Tank tank) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.kW = kW;
        this.antrieb = antrieb;
        this.gewicht = gewicht;
        this.verbrauch = verbrauch;
        this.engine = engine;
        this.tank = tank;
    }


    public boolean drive(int kilometers) {
        if (!engine.isFunctional() || tank.getCurrentLevel() == 0) {
            return false;
        }
        // Berechnung des Verbrauchs und Aktualisierung des Tankinhalts
        double requiredFuel = calculateFuelConsumption(kilometers);
        tank.setCurrentLevel(tank.getCurrentLevel() - requiredFuel);

        // Aktualisierung des Kilometerstands
        totalKilometers += kilometers;

        // Überprüfung, ob der Tank leer ist
        if (tank.getCurrentLevel() <= 0) {
            System.out.println("Tank ist leer.");
            return false;
        }

        return true;
    }

    protected double calculateFuelConsumption(int kilometers) {
        return kilometers * (verbrauch / 100.0);
    }


    // Getter-Methoden
    public String getHersteller() {
        return hersteller;
    }

    public String getModell() {
        return modell;
    }

    public double getTotalKilometers() {
        return totalKilometers;
    }

    public Tank getTank() {
        return this.tank;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public double getVerbrauch() {
        return verbrauch;
    }


}

