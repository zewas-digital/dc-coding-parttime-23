package MichaelReal.week22_CarsimultionExtended;

import java.util.List;

public class CarSimulation {

    public static void simulateDrive(List<Car> cars, int totalDistance) {
        for (Car car : cars) {
            System.out.println("\n🛣️Starte Simulation für: " + car.getModell() + " von " + car.getHersteller() + "🛣️");

            int remainingDistance = totalDistance;
            int repairAttempts = 0;
            int maxRepairAttempts = 3; // Limit für Reparaturversuche

            while (remainingDistance > 0) {
                if (car.drive(remainingDistance)) {
                    System.out.println(car.getModell() + " hat die Zieldestination nach insgesamt " + (totalDistance - remainingDistance) + " km erreicht. 🏁");
                    break;
                }

                if (!car.isEngineFunctional() && repairAttempts < maxRepairAttempts) {
                    System.out.println(car.getModell() + ": Motor defekt. Eine Reparatur wird durchgeführt.");
                    car.repairEngine();
                    repairAttempts++;
                } else if (car.getFuelLevel() <= 0) {
                    System.out.println(car.getModell() + ": Tank leer. Wird aufgetankt.");
                    car.refill();
                } else {
                    System.out.println(car.getModell() + ": Kann nicht weiterfahren.");
                    break; // Beendet die Schleife, falls das Auto nicht fahren kann und die max. Reparaturversuche erreicht sind.
                }
            }

            if (remainingDistance > 0 && repairAttempts >= maxRepairAttempts) {
                System.out.println(car.getModell() + " konnte die Zieldestination nicht erreichen aufgrund wiederholter Motordefekte.");
            }
        }
    }
}






