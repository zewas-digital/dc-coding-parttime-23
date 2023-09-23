/*
Erstelle ein Programm, dass als Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.matthias.week2.weekend1.example24;

public class PrimeNumbers {
    public static void main(String[] args) {

        int wert1= 5;
        int wert2= 15;
        int div =2;
        int counter= 1;
        int counter1=15;

        while (counter > counter1) {
            for (int j = 2; j < wert2 ; j++) {
                if (wert1 % j == 0) {wert1 = wert1 + 1;}

                counter++;
            }
            System.out.println(wert1);

    }
}
