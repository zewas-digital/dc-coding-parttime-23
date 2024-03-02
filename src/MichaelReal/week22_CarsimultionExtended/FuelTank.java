package MichaelReal.week22_CarsimultionExtended;

public class FuelTank extends Tank {

    private int capacity;

    public FuelTank(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void refill() {
        this.currentLevel = this.capacity;
    }
}
