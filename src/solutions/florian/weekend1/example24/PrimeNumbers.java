/*
Erstelle ein Programm, dass als Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.florian.weekend1.example24;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        boolean number = primenumber(20);
        System.out.println(number);

    }
    static boolean primenumber (int n) {
        boolean number = false;

        for (n = 0; n < 20; n++) {
            if (n % 2 == 0) {
                number = false;
            } else if (n % 3 == 0) {
                number = false;
            }


        }


        return number;
    }

}