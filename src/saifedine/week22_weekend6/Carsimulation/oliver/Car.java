package saifedine.week22_weekend6.Carsimulation.oliver;

public class Car extends Vehicle {
    Engine engine;
    CarTank carTank;

    double consumptionPerKilometer;

    public Car(double mileage, double fuelCapacity) {
        this.engine = new Engine();
        this.carTank = new CarTank();
    }

    public void drive(int distance) {
        System.out.println("driving around");

        try {
            this.engine.useFuel(this.carTank, this.consumptionPerKilometer);

        } catch (EngineBrokeExeption exeption) {
            // reagieren auf Motorschaden
        }
    }
}
