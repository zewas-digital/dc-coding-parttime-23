package Alpi.week22_carsimulation;

/*
Aufgabe: Carsimulation Extended
---------------------------------------------------------
1/
Erweitere das vorhergehende Beispiel um die Klassen
Engine (Motor)
Tank
GasStation
RepairStation
-------------------
2/
Sowohl Tank und Motor sollen in Car als Attribute existieren und durch die RepairStation austauschbar sein.
-------------------
3/
Eine Engine soll nach einer zufälligen Wahrscheinlichkeit einen Defekt haben und in der RepairStation getauscht werden.
Je mehr Kilometer gefahren wurden, desto höher ist die Wahrscheinlichkeit, dass die Engine kaputt geht.
-------------------
4/
Wenn die Car nicht die gewünschten Kilometer fährt, so ist entweder der Tank leer, oder der Motor kaputt.
Erstelle Methoden der Car Klasse die den Tankinhalt und den Zustand des Motors (defekt oder ganz) zurückgeben.
-------------------
5/
Wird die drive(int kilometers) Methode ausgeführt, so soll nun eine Methode im Motor aufgerufen werden,
die diesen startet, und nach den gefahrenen Kilometern wieder stoppt.
Auch der Treibstoffverbrauch soll mit dem Motor zusammenhängen.
Vielleicht ist es eine gute Idee beim Starten den Tank an den Motor zu übergeben?
-------------------
6/
Erstelle folgende Subklassen von Tank
Battery
FuelTank

Überlege welche Methoden in der Superklasse Tank Sinn machen.
-------------------
7/
Erstelle folgende Subklassen von Car
SelfRepairingCar (hat der Motor einen Schaden, so soll dieser automatisch repariert und weitergefahren werden)
AeroDynamicCar (reduziert den Treibstoffverbrauch um 50%)
CrapCar (erhöht die Wahrscheinlichkeit dass der Motor kaputt geht um 50%)

Überlege welche Methoden in der Superklasse Car sinn machen.
Eine eigene Methode in der Superklasse welche den Treibstoffverbrauch pro Kilometer ausrechnet, macht wahrscheinlich sinn.
Diese kann dann in den Subklassen überschrieben werden.
-------------------
8/
Teste deine Autosimulation ausgiebig.
-------------------
9/
Bonusoption: Verwende Threads für deine Simulation
 */
public class Main_CarsimulationExtended {
    public static void main(String[] args) throws InterruptedException {
        Tankstelle t1 = new Tankstelle("Express");
        Werkstatt w1 = new Werkstatt("Bastelbude");
        Dieselauto d1 = new Dieselauto("Skoda", "Oktavia", 10000, 60.0, "Tank 1",  7.0, "Dieselmotor 1");
        //System.out.println(d1 + " erstellt.");
       // t1.tanken(d1, 50.0);
        //d1.volltanken();
       // d1.fahren(100);
        t1.volltanken(d1);
        Elektroauto e2 = new Elektroauto("Tesla", "XY", 2000, "Akku super", 20.0, "Elektromotor 2");//20 % pro 100 km

        Elektroauto e1 = new Elektroauto("Renault", "Zoe", 500, "Akku mini", 30.0, "Elektromotor 1");//30 % pro 100 km
        //System.out.println("\n" + e1 + " erstellt.");
        t1.volltanken(e1);
        t1.volltanken(e2);
       // e1.fahren(100);
        /*
        t1.ansteuern(e1);
        t1.tanken(e1, 10);
        t1.tanken(e1, 20);
        t1.tanken(e1, 500);
        t1.volltanken(e1);
        */
        //Motor dm2 = new Motor(4.0, Antriebsarten.DIESEL, "Dieselmotor 2");
        //w1.motorTauschen(d1, dm2);

      // Akku akku2 = new Akku("Superakku");
       // w1.tankTauschen(e1, akku2);
        //t1.volltanken(e1);

        AutoThread at1 = new AutoThread(d1, 150,'*');
        AutoThread at2 = new AutoThread(e1, 1000,'°');
        AutoThread at3 = new AutoThread(e2, 15,'#');
        at1.start();
        at2.start();
        at3.start();
        at1.join();
        at2.join();
        at3.join();



    }
}
