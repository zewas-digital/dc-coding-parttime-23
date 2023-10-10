/*
Dieses Programm soll die Ziffernsumme für jede Zahl innerhalb bestimmten Intervalls bilden und jeweils auf der Console ausgeben.
 */

package solutions.judith.weekend1.example22;

public class SumOfDigits {
    public static void main(String[] args) {
        int startWert = 10;
        int endWert = 20;
        int zahl1 = 0;
        int zahl2 = 0;
        int ziffernSumme = 0;

        for (int i = startWert; i <= endWert ; i++) {
            zahl1 = i % 10 ;
            zahl2 = i / 10;
            System.out.println(i);
            System.out.println("Ziffernsumme" + " " + (zahl1+zahl2));


        }



    }
}
// 56%10 = 6 (Erste Zahl die benötigt wird)
// 56/10 = 5,6 (Integer kann aber nur ganze zahlen und "vergisst" somit das 0,6 somit ist jetzt die zweite Zahl "5" gegeben.
