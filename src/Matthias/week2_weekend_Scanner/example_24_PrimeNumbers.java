/*
Erstelle ein Programm, dass als Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package Matthias.week2_weekend_Scanner;

public class example_24_PrimeNumbers {
    public static void main(String[] args) {
        int i = 1; //
        boolean Prim = true; // Prim = true wenn i eine Primzahl ist
        while (i < 30) { //
            for (int j = 2; j < (i - 1); j++){
                if (i % j == 0){
                    Prim = false;
                }
            }
            if (Prim) {
                System.out.println(i);
            } else {
                Prim = true;
            }
            i++;
        }
    }
}