/*
Erstelle ein Programm, dass als Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

// https://studyflix.de/mathematik/primzahlen-3161

package saifedine.week02_weekend1.example24;

public class PrimeNumbers {

    public static void main(String[] args) {

        int num = 10;

        for (int i = 2; i <= num; i++) {

            boolean isPrim = primzahl(i);

            if (isPrim == true){
                System.out.println(i);
            }
        }
    }

    static boolean primzahl(int num){

        boolean isPrim = true;

        for (int j = 2; j < num; j++) {

            if (num % j == 0) {
                isPrim = false;
                break;
            }
            else {
                isPrim = true;
            }
        }
        return isPrim;
    }
}