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

    // Methode zur Berechnung der möglichen Distanz basierend auf dem aktuellen Füllstand und dem Verbrauch pro 100 km
    public double calculatePossibleDistance(double verbrauchPerHundredKm) {
        return (currentLevel / verbrauchPerHundredKm) * 100;
    }

}
