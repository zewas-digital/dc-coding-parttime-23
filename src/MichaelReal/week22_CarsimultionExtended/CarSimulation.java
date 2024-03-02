package MichaelReal.week22_CarsimultionExtended;

import java.util.List;

public class CarSimulation {

    public void simulateDrive(List<Car> cars, int totalDistance) {
        for (Car car : cars) {
            int remainingDistance = totalDistance;
            while (remainingDistance > 0 && car.getEngine().isFunctional()) {
                boolean driven = car.drive(Math.min(car.getTank().getCurrentLevel(), remainingDistance));
                remainingDistance -= driven ? Math.min(car.getTank().getCurrentLevel(), remainingDistance) : 0;
                if (!driven) {
                    // Aufladen oder Betanken basierend auf dem Tanktyp
                    if (car.getTank() instanceof Battery) {
                        ChargeStation.charge((ElectricCar) car); // Stelle sicher, dass diese Methode existiert und richtig implementiert ist
                    } else if (car.getTank() instanceof FuelTank) {
                        GasStation.refuel(car); // Stelle sicher, dass diese Methode existiert und richtig implementiert ist
                    }
                    // Motor reparieren, falls notwendig
                    if (!car.getEngine().isFunctional()) {
                        RepairStation.repair(car.getEngine()); // Stelle sicher, dass diese Methode existiert und richtig implementiert ist
                    }
                }
            }
            System.out.println(car.getModel() + " hat die Distanz von " + (totalDistance - remainingDistance) + " km zurückgelegt.");
        }
    }
}