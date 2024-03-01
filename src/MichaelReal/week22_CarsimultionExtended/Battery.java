package MichaelReal.week22_CarsimultionExtended;

public class Battery extends Tank {
    @Override
    public void refill() {
        this.currentLevel = this.capacity;
    }
}
