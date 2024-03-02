package MichaelReal.week22_CarsimultionExtended;

public class ChargeStation {

    public static void charge(Car car) {
        if (car.getTank() instanceof Battery) {
            Battery battery = (Battery) car.getTank();
            battery.setCurrentLevel(battery.getCapacity()); // Setze den aktuellen Level auf die maximale Kapazität
            System.out.println(car.getModel() + " wurde erfolgreich aufgeladen.");
        } else {
            System.out.println("Das Fahrzeug unterstützt kein Aufladen.");
        }
    }
}
