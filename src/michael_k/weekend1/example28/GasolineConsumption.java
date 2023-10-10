/*
Erstelle ein Programm, dass die gefahrenen Kilometer sowie den Benzinverbrauch in Litern einließt.
Speichere beide Werte in passenden Datentypen ab und gib den Benzinverbrauch in l/100km in der Console aus.
 */

package solutions.michael_k.weekend1.example28;
import java.util.Scanner;

public class GasolineConsumption {

    public static void main(String[] args){
        while ( true ) {

            Scanner inputKonsole = new Scanner ( System.in );

            System.out.println ( "Wie viel Kilometer bist du gefahren?:" );
            double Strecke = inputKonsole.nextDouble ( );

            System.out.println ( "Wie viel Liter hast du verbraucht?:" );
            double Liter = inputKonsole.nextDouble ( );

            System.out.println ( ( Liter / Strecke ) * 100 );
        }
    }

}
