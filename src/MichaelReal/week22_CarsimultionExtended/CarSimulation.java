package MichaelReal.week22_CarsimultionExtended;

import java.util.List;

public class CarSimulation {

    public void simulateDrive(List<Car> cars, int totalDistance) {
        for (Car car : cars) {
            int traveledDistance = 0;
            while (traveledDistance < totalDistance && car.getEngine().isFunctional()) {
                boolean driven = car.drive((int)Math.min(car.getTank().calculatePossibleDistance(car.getVerbrauch()), totalDistance - traveledDistance));
                if (!driven) {
                    // Aufladen oder Betanken basierend auf dem Tanktyp
                    if (car.getTank() instanceof Battery) {
                        ChargeStation.charge(car); // Angenommen, diese Methode ist korrekt implementiert
                    } else if (car.getTank() instanceof FuelTank) {
                        GasStation.refuel((FuelTank) car.getTank());
                    }
                    // Motor reparieren, falls notwendig
                    if (!car.getEngine().isFunctional()) {
                        RepairStation.repair(car.getEngine()); // Angenommen, diese Methode ist korrekt implementiert
                    }
                }
                traveledDistance += driven ? Math.min(car.getTank().calculatePossibleDistance(car.getVerbrauch()), totalDistance - traveledDistance) : 0;
            }
            System.out.println(car.getModell() + " hat " + traveledDistance + " km von " + totalDistance + " km zurückgelegt.");
        }
    }
}