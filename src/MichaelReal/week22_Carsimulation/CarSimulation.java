package MichaelReal.week22_Carsimulation;

import java.util.List;

public class CarSimulation {

    public static void simulateCars(List<Car> cars, int distance, int cycles) {
        for (int i = 0; i < cycles; i++) {
            System.out.println("Zyklus " + (i + 1) + " von " + cycles);
            for (Car car : cars) {
                int drivenDistance = car.drive(distance);
                System.out.println(car.getModell() + " von " + car.getHersteller() + " fuhr " + drivenDistance + " km.");
                if (drivenDistance < distance) {
                    System.out.println(car.getModell() + " muss aufgetankt werden.");
                    car.refuel(car.getMaximaleTankkapazitaet() - car.getTankinhalt()); // Tank bis Maximalfüllung auffüllen
                    System.out.println(car.getModell() + " wurde aufgetankt. Neuer Tankinhalt: " + car.getTankinhalt() + " Liter.");
                }
            }
            System.out.println();
        }
    }
}
