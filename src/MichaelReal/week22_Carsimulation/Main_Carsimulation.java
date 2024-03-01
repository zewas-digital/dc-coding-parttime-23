package MichaelReal.week22_Carsimulation;

/*
Erstelle eine Car Klasse.
Diese enthält alle gängigen Attribute die für ein Auto benötigt werden.
Zumindest sollte die Klasse folgende Attribute enthalten:

Hersteller
Modell
kW (Leistung)
Tankinhalt
Antriebsart (erstelle dafür eine Enumeration Benzin, Diesel, Gas, Strom)
Gewicht

Überlege welche Attribute du im Konstruktor als Parameter erhalten willst.
Ohne welche kann eine Auto Instanz nicht existieren?

Erstelle nun die Methode drive(int kilometer) welche einen int zurückgibt.
Diese Methode soll, wenn es der Tankinhalt zulässt, die gegebene Strecke zurücklegen.
Wenn der Tank leer ist, soll nur die Strecke zurückgegeben werden, die zurückgelegt werden konnte, ansonsten die gesamte Strecke.

Wenn der Tank leer ist, soll der Tank über eine Methode mit einer gewissen Menge an Kraftstoff aufgefüllt werden.
Erstelle dazu eine entsprechende Methode und fahr weiter.

Erstelle nun eine Carsimulation welche eine gewisse Anzahl von Autoinstanzen erstellt und diese fahren lässt und wenn nötig wieder betankt.

Wunsch: Die Methoden sollen zu ihrer eigentlichen Funktion auch eine schöne Ausgabe erstellen
 */

import java.util.ArrayList;
import java.util.List;

public class Main_Carsimulation {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        cars.add(new ElectricCar("Tesla", "Model S", 386, 2000, 18.5, 100, 100));
        cars.add(new DieselCar("BMW", "320d", 140, 1500, 4.5, 57, 57));

        cars.add(new PetrolCar("Volkswagen", "Golf", 110, 1370, 5.2, 50, 50));
        cars.add(new GasCar("Fiat", "Panda Natural Power", 51, 1020, 3.1, 30, 30));


        CarSimulation.simulateCars(cars, 1000);

    }
}
