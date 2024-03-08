package eslem.week22;

import java.util.ArrayList;
import eslem.week22.Auto;

public class Carsimulation {
    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList<>();

        autos.add(new Auto("Mercedes", "Mercedes Benz Group", "CLA", 135, 160, 1400, Antriebsart.Diesel));
        autos.add(new Auto("BMW", "BMW Group", "X5", 150, 177, 1600, Antriebsart.Benzin));
        autos.add(new Auto("Audi", "Audi AG", "RS 7", 165, 208, 1555, Antriebsart.Benzin));

        for (Auto a : autos) {
            System.out.println("Aktuelles Auto: " + a.getName() + " " + a.getModell());
            System.out.println("Tankinhalt vor dem Fahren: " + a.getTankinhalt() + " Liter");

            double gefahreneStrecke = a.drive(200); // Fahren einer Strecke von 200 km
            System.out.println("Gefahrene Strecke: " + gefahreneStrecke + " km");

            if (gefahreneStrecke < 200) { // Überprüfe, ob das Auto die gesamte Strecke zurückgelegt hat
                a.Tankfuellen(50); // Betanken des Tanks mit 50 Litern
                System.out.println("Tank wurde aufgefüllt. Neuer Tankinhalt: " + a.getTankinhalt() + " Liter");
            }
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }
}
