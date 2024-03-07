package MichaelReal.week22_Carsimulation;

import java.util.List;

public class CarSimulation {

    public static void simulateCars(List<Car> cars, int totalDistance) {
        for (Car car : cars) {
            System.out.println("\n🛣️Starte Simulation für: " + car.getModell() + " von " + car.getHersteller() + "🛣️");
            int verbleibendeDistanz = totalDistance;
            while (verbleibendeDistanz > 0) {
                int gefahreneDistanz = car.drive(verbleibendeDistanz);
                verbleibendeDistanz -= gefahreneDistanz;
                System.out.println(car.getModell() + " fuhr " + gefahreneDistanz + " km, verbleibende Distanz: " + verbleibendeDistanz + " km.");

                if (gefahreneDistanz > 0 && verbleibendeDistanz > 0) {
                    // Überprüfe, ob das Auto aufladbar ist (für Elektroautos)
                    if (car instanceof Chargeable && car instanceof ElectricCar) {
                        ElectricCar electricCar = (ElectricCar) car;
                        electricCar.charge(electricCar.getBatteriekapazitaet() - electricCar.getAktuelleLadung());
                    }
                    // Überprüfe, ob das Auto betankt werden kann (für Benzin-, Diesel- und Gasautos)
                    else if (car instanceof Refuelable) {
                        double toRefuel = 0;
                        if (car instanceof PetrolCar) {
                            toRefuel = ((PetrolCar) car).getMaximaleTankkapazitaet() - ((PetrolCar) car).getTankinhalt();
                        } else if (car instanceof DieselCar) {
                            toRefuel = ((DieselCar) car).getMaximaleTankkapazitaet() - ((DieselCar) car).getTankinhalt();
                        } else if (car instanceof GasCar) {
                            toRefuel = ((GasCar) car).getMaximaleTankkapazitaet() - ((GasCar) car).getTankinhalt();
                        }
                        ((Refuelable) car).refuel(toRefuel);
                    }
                }
            }
            System.out.println("🏁" + car.getModell() + " hat die Gesamtdistanz von " + totalDistance + " km erreicht.🏁");
        }
    }
}
