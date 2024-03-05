package MichaelReal.week22_CarsimultionExtended;

import java.util.Random;

public class Engine {
    private boolean isFunctional;
    private final int power; // Leistung des Motors in kW
    private double kilometersDriven; // Anzahl der gefahrenen Kilometer
    private final Random random = new Random();

    public Engine(int power) {
        this.isFunctional = true; // Standardmäßig ist der Motor funktionsfähig
        this.power = power;
        this.kilometersDriven = 0;
    }

    public boolean startEngine() {
        // Erhöhe die Wahrscheinlichkeit eines Ausfalls basierend auf der Anzahl der gefahrenen Kilometer
        double failureChance = 0.001 + (kilometersDriven / 10000) * 0.001; // Basisrate plus Zunahme pro 10.000 km

        // Überprüfe, ob der Motor ausfällt
        if(random.nextDouble() < failureChance) {
            isFunctional = false; // Motor fällt aus
        }

        return isFunctional;
    }

    public void drive(double kilometers) {
        if (startEngine()) {
            kilometersDriven += kilometers;
            // Weiterführende Logik für das Fahren
        } else {
            System.out.println("Motor hat versagt und kann nicht starten.");
        }
    }

    // Getter und Setter
    public boolean isFunctional() {
        return isFunctional;
    }

    public void setFunctional(boolean functional) {
        isFunctional = functional;
    }

    public void repair() {
        isFunctional = true; // Repariert den Motor
        // Eventuell könntest du hier auch die gefahrenen Kilometer zurücksetzen oder anpassen
    }

    public double getKilometersDriven() {
        return kilometersDriven;
    }

    public void setKilometersDriven(double kilometersDriven) {
        this.kilometersDriven = kilometersDriven;
    }

    public int getPower() {
        return power;
    }
}


