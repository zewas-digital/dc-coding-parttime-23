/*
Dieses Programm soll die Ziffernsumme für jede Zahl innerhalb bestimmten Intervalls bilden und jeweils auf der Console ausgeben.
 */

package solutions.florian.weekend1.example22;

public class SumOfDigits {
    public static void main(String[] args) {
        int ziffernsumme = calculateSumofDigits(245);
        int ziffernsumme2 = calculateSumofDigit(245);
        System.out.println(ziffernsumme);
        System.out.println(ziffernsumme2);
    }

    static int calculateSumofDigits(int number) {
        //245

        int ergebnis = 0;

        while (number > 0) {
            int ziffer = number % 10; // 5; 4; 2;
            ergebnis = ergebnis + ziffer; // 0 + 5; 5 + 4; 9 + 2
            number = number / 10;
        }

        return ergebnis;
    }
    static int calculateSumofDigit(int number) {
        //245

        int ergebnis = 0;

        for (int i = 0; number > 0; i++) {

            int ziffer = number % 10; // 5; 4; 2;
            ergebnis = ergebnis + ziffer; // 0 + 5; 5 + 4; 9 + 2
            number = number / 10;
        }

        return ergebnis;
    }
}