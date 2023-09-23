/*
Dieses Programm soll die Ziffernsumme für jede Zahl innerhalb bestimmten Intervalls bilden und jeweils auf der Console ausgeben.
 */

package solutions.florian.weekend1.example22;

public class SumOfDigits {
    public static void main(String[] args) {
        int startwert= 10;
        int endwert = 20;
        int summe = 0;
        int zahl1 = 0;

        for (int i = startwert; i < endwert ; i++) {
            summe += i;
            System.out.println(summe);
        }
        System.out.println(summe / 100);
        //if (true)
        System.out.println(summe % 100);
        summe = zahl1;
        System.out.println(zahl1);

    }
}
