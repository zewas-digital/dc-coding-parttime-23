/*
Erstelle ein Programm, dass die gefahrenen Kilometer sowie den Benzinverbrauch in Litern einliest.
Speichere beide Werte in passenden Datentypen ab und gib den Benzinverbrauch in l/100km in der Console aus.
 */

package solutions.claudia.weekend1.example28;
import java.util.Scanner;
public class GasolineConsumption {
    public static void main(String[] args) {
        int strecke;
        double verbrauch;
        double verbrauchPro100;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie weit bist Du gefahren? ");
        strecke = scanner.nextInt();
        System.out.print("Wieviele Liter Treibstoff hast Du verbraucht? ");
        verbrauch = scanner.nextDouble();

        verbrauchPro100 = verbrauch/strecke * 100;
        System.out.print("Verbrauch in l pro 100 km: ");
        System.out.print(verbrauchPro100);
    }

}
