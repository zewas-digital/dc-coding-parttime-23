package MichaelReal.week22_CarsimultionExtended;

public class Battery extends Tank {
    private int capacity;

    public Battery(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public void refill() {
        this.currentLevel = this.capacity;
    }
}
