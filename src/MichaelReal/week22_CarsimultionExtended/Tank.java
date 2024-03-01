package MichaelReal.week22_CarsimultionExtended;

public abstract class Tank {
    protected double capacity;
    protected double currentLevel;

    public abstract void refill();

    public double getCurrentLevel() {
        return currentLevel;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCurrentLevel(double level) {
        this.currentLevel = level;
    }

}
