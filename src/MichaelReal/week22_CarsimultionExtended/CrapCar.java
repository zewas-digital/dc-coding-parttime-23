package MichaelReal.week22_CarsimultionExtended;

import java.util.Random;

public class CrapCar extends Car {
    private Random random = new Random();

    public CrapCar(String hersteller, String modell, Engine engine, Tank tank, double verbrauch) {
        super(hersteller, modell, engine, tank, verbrauch);
    }

    @Override
    public boolean drive(int kilometers) {
        if (random.nextDouble() < 0.2) { // 20% Chance, dass der Motor ausfällt
            engine.setFunctional(false);
            return false; // Fahrt ist nicht möglich, wenn der Motor ausfällt
        }
        return super.drive(kilometers);
    }
}

