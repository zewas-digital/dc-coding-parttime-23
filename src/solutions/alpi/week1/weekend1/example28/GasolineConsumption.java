/*
Erstelle ein Programm, dass die gefahrenen Kilometer sowie den Benzinverbrauch in Litern einließt.
Speichere beide Werte in passenden Datentypen ab und gib den Benzinverbrauch in l/100km in der Console aus.
 */

package solutions.alpi.week1.weekend1.example28;


import java.util.Scanner;
public class GasolineConsumption {


    public static void main(String[] args) {
        Scanner Usersollangeben = new Scanner(System.in);


        //Gefahrene Kilometer = Usersollangeben
        System.out.print("Gefahrene Kilometer: ");
        double gefahreneKilometer = Usersollangeben.nextDouble();

        //VerbrauchteLiter = Usersollangeben
        System.out.print("Benzinverbrauch in Litern: ");
        double verbrauchteLiter = Usersollangeben.nextDouble();


        // Datentyp double verbrauch 100km definieren und dann Liter geteilt durch gefahrene KM * 100
        double verbrauch100km = (verbrauchteLiter / gefahreneKilometer) * 100;




        System.out.println("Benzinverbrauch: " + verbrauch100km + " l/100km");

        // Wertausgabe schließen
        Usersollangeben.close();
    }
}