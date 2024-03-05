package MichaelReal.week22_CarsimultionExtended;

public abstract class Tank {
    protected double capacity; // Maximale Kapazität des Tanks
    protected double currentLevel; // Aktueller Füllstand des Tanks

    public Tank(double capacity) {
        this.capacity = capacity;
        this.currentLevel = capacity; // Standardmäßig ist der Tank voll
    }

    // Füllt den Tank
    public abstract void refill();

    // Gibt den aktuellen Füllstand zurück
    public double getCurrentLevel() {
        return currentLevel;
    }

    // Setzt den aktuellen Füllstand
    public void setCurrentLevel(double level) {
        this.currentLevel = level;
    }
}
