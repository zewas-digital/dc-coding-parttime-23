package MichaelReal.week22_CarsimultionExtended;

public class AeroDynamicCar extends Car{
    public AeroDynamicCar(Engine engine, Tank tank) {
        super(engine, tank);
    }

    @Override
    public boolean drive(int kilometers) {
        this.verbrauch *= 0.5; // Reduziere den Verbrauch um 50%.
        return super.drive(kilometers);
    }
}
