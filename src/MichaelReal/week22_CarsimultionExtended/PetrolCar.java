package MichaelReal.week22_CarsimultionExtended;

public class PetrolCar extends Car {
    public PetrolCar(String hersteller, String modell, int kW, Antriebsart antrieb, double gewicht, double verbrauch, Engine engine, FuelTank tank) {
        super(hersteller, modell, kW, antrieb, gewicht, verbrauch, engine, tank);
    }

    @Override
    public boolean drive(int kilometers) {
        if (!engine.isFunctional() || tank.getCurrentLevel() == 0) {
            return false;
        }
        double requiredFuel = calculateFuelConsumption(kilometers);
        tank.setCurrentLevel(tank.getCurrentLevel() - requiredFuel);

        totalKilometers += kilometers;

        if (tank.getCurrentLevel() <= 0) {
            System.out.println("Tank ist leer.");
            return false;
        }

        return true;
    }
}

