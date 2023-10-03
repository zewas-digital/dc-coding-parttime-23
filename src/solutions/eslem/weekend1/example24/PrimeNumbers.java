/*
Erstelle ein Programm, dass als Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.eslem.weekend1.example24;

import javax.imageio.stream.ImageInputStream;

public class PrimeNumbers {
    public static void primzahl(int n) {
        boolean PrimeNumbers = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                PrimeNumbers = false;
            }
        }
        if (PrimeNumbers == true) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        for (int i = 2; i <= 19 ; i++) {
           primzahl(i);
        }
    }
}
