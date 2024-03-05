package MichaelReal.week22_CarsimultionExtended;

public abstract class Car {
    protected String hersteller;
    protected String modell;
    protected Engine engine;
    protected Tank tank;
    protected double verbrauch; // angenommen, Verbrauch pro 100 km

    public Car(String hersteller, String modell, Engine engine, Tank tank, double verbrauch) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.engine = engine;
        this.tank = tank;
        this.verbrauch = verbrauch;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModell() {
        return modell;
    }

    public boolean drive(int kilometers) {
        if (!isEngineFunctional() || getFuelLevel() <= 0) {
            return false;
        }
        // Fiktive Berechnung des Treibstoffverbrauchs und Aktualisierung des Tankinhalts
        double requiredFuel = kilometers * verbrauch / 100.0;
        if (requiredFuel > getFuelLevel()) {
            return false;
        }
        tank.setCurrentLevel(getFuelLevel() - requiredFuel); // Treibstoff verbrauchen
        return true;
    }

    public void refill() {
        tank.refill();
        System.out.println(modell + ": Wurde aufgetankt.");
    }

    public void repairEngine() {
        if (!engine.isFunctional()) {
            engine.repair();
            System.out.println(modell + ": Motor wurde repariert.");
        }
    }

    public boolean isEngineFunctional() {
        return engine.isFunctional();
    }

    public double getFuelLevel() {
        return tank.getCurrentLevel();
    }
}





