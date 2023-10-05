/*
Erstelle ein Programm, das alle Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.claudia.weekend1.example24;

public class PrimeNumbers {
    public static void main(String[] args) {
        findPrime(1, 100);
    }

    static void findPrime(int lower, int upper){

         if (lower == 0 || lower == 1){
             lower = 2;
         }

         if (lower == 2) System.out.print(lower + " ");

         for (int i = lower; i <= upper; i++) {
            double root = Math.sqrt(i) + 1; // bis hierher Faktoren prüfen; +1 ist allerdings häßlich
            boolean isPrime = true;

            for (int j = 2; j <= root; j++) {
                if (isPrime && (i % j) == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) System.out.print(i + " ");
        }

    }
}
