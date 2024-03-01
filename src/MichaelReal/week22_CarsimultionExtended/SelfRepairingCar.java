package MichaelReal.week22_CarsimultionExtended;

public class SelfRepairingCar extends Car{
    public SelfRepairingCar(Engine engine, Tank tank) {
        super(engine, tank);
    }

    @Override
    public boolean drive(int kilometers) {
        boolean driven = super.drive(kilometers);
        if (!engine.isFunctional()) {
            engine.repair(); // Nehmen wir an, dass eine `repair` Methode im Engine existiert.
            super.drive(kilometers); // Versuche erneut zu fahren nach der Reparatur.
        }
        return driven;
    }
}
