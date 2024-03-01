package MichaelReal.week22_CarsimultionExtended;

public class FuelTank extends Tank {
    @Override
    public void refill() {
        this.currentLevel = this.capacity;
    }
}
