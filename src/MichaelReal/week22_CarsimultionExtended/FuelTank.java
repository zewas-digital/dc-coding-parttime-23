package MichaelReal.week22_CarsimultionExtended;

public class FuelTank extends Tank {
    public FuelTank(double capacity) {
        super(capacity);
    }

    @Override
    public void refill() {
        setCurrentLevel(capacity); // Füllt den Treibstofftank vollständig
    }
}
