package saifedine.week22_weekend6.Carsimulation.oliver;

public class Engine {
    private double mileage;
    private boolean functional = true;

    public boolean isRunning = false;
    private double currentDistance;

    public void start() {
        this.currentDistance = 0;
        this.isRunning = true;
    }

    public void stop() {
        this.isRunning = false;
    }

    protected void useFuel(CarTank carTank, double consumptionPerKilometer) throws EngineBrokeExeption {
        double factor = currentDistance > 5 ? 1 : 3;

        // reduce car tank capacity by consumptionPerKilometer

        //TODO break motor with an increasing possibility on higher mileage
        throw new EngineBrokeExeption();
    }

}