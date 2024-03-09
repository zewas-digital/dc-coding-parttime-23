package marcelsimma.week22.threads;

import marcelsimma.week22.threads.ConsoleManager;

class Car extends Thread {

    public final String name;
    private final ConsoleManager consoleManager;

    public Car(String name, ConsoleManager consoleManager) {
        this.name = name;
        this.consoleManager = consoleManager;
    }

    @Override
    public void run() {
        consoleManager.print(name + " started.");

        int totalDistance = 0;
        while (totalDistance < 100) { // Assuming race is 100 units long
            int nextDistance = consoleManager.readInt(name + " has traveled " + totalDistance + " units. How far to go next? Enter distance: ");
            totalDistance += nextDistance;
        }

        consoleManager.print(name + " finished the race.");
    }
}
