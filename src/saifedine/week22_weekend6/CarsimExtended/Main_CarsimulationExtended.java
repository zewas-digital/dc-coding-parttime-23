package saifedine.week22_weekend6.CarsimExtended;
/*
Aufgabe: Carsimulation Extended
---------------------------------------------------------
1/
Erweitere das vorhergende Beispiel um die Klassen
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
die diesen startet, und nach den gefahrenen Kilomtern wieder stoppt.
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
}
