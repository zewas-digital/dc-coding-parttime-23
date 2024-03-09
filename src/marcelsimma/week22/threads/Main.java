package marcelsimma.week22.threads;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Math.PI


        ConsoleManager consoleManager = new ConsoleManager();
        Thread car1 = new Car("Car 1", consoleManager);
        Thread car2 = new Car("Car 2", consoleManager);
        Thread car3 = new Car("Car 3", consoleManager);

        Thread t1 = new Thread() {
            @Override

            public void run() {
                super.run();
                while(true) {
                    consoleManager.doSmth();
                    try {
                        this.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t1.start();

        car1.start();
        car2.start();
        car3.start();
    }
}