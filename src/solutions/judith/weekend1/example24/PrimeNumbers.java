/*
Erstelle ein Programm, dass als Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.judith.weekend1.example24;

public class PrimeNumbers {


    public static void main(String[] args) {

        int StartWert = 2;
        int EndWert = 100;

        for (int i = StartWert ; i <=EndWert ; i++) {
            if (i % 2 == 0){
            }
            else if (i % i ==0 || i % 1 == 0){
                System.out.println(i);
            }
        }
    }
}