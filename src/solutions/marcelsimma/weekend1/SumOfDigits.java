/*
Dieses Programm soll die Ziffernsumme für jede Zahl innerhalb bestimmten
Intervalls bilden und jeweils auf der Console ausgeben.
 */

package solutions.marcelsimma.weekend1;

public class SumOfDigits {

    public static void main(String[] args) {
        calculateSumOfDigits(13245);
    }

    static void calculateSumOfDigits(int number) {
        //number: 245

        int ergebnis = 0;

        /*
        while (number > 0) {
            int ziffer = number % 10; // 5; 4; 2
            ergebnis = ergebnis + ziffer; // 0 + 5; 5 + 4; 9 + 2
            number = number / 10;
        }
        */

        for (int i = 0; number > 0; i++) {
            int ziffer = number % 10; // 5; 4; 2
            ergebnis = ergebnis + ziffer; // 0 + 5; 5 + 4; 9 + 2
            number = number / 10;
        }

        System.out.println(ergebnis);
        //Ziffernsumme = 2 + 4 + 5 = 11

    }


}
