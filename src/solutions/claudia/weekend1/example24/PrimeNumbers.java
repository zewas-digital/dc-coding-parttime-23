/*
Erstelle ein Programm, das alle Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.claudia.weekend1.example24;

public class PrimeNumbers {
    public static void main(String[] args) {
        findPrime(3, 100);

    }

    static void findPrime(int lower, int upper){

        double root = Math.sqrt(upper);

        for (int i = lower; i <= upper ; i++) {
            for (int j = 2; j <= root; j++) {
                if ((i % j) == 0) break;
            }

        }

    }
}
