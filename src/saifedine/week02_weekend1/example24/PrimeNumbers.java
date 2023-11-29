/*
Erstelle ein Programm, dass als Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package saifedine.week02_weekend1.example24;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 100  ; i++) {
            isPrime(i);
        }

    }
    static void isPrime(int x){
        boolean prime = true;

        for (int i = 2; i < x/2; i++) {
            if (x % i ==0){
                prime = false;

            }
        }
        if (prime == true){
            System.out.println(x);
        }

    }


}












/*


public class LoopWithModulo {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i += 2) {
            System.out.println(i);
        }

        int j = 0;
        while (j <= 10) {
            if (j % 2 == 0)
                System.out.println(j);
            j++;
        }
    }
}

public class LoopControl {
    public static void main(String[] args) {
        int anzahlschleifen = 0;
        int i = 1;
        while (i <= 100) {
            i++;

            if (i % 2 == 0) {
                System.out.println(i);
                anzahlschleifen++;
            } else if (i % 3 == 0) {
                System.out.println(i);
                anzahlschleifen++;
            }
            if (anzahlschleifen == 20){
                break;
            }

        }
    }
}
 */