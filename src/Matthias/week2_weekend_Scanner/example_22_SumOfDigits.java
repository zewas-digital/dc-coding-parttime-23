/*
Dieses Programm soll die Ziffernsumme für jede Zahl innerhalb bestimmten Intervalls bilden und jeweils auf der Console ausgeben.
 */

package Matthias.week2_weekend_Scanner;

public class example_22_SumOfDigits {

    static void SumofDigits ( int zahl1){

        int summe = 0;

        for (int i = 0; i < zahl1 +1 ; i++) {
            //
            int idigit = zahl1  % 10;
                    ;
            //
            summe = summe + idigit;

            //
            zahl1=zahl1/10;

        }
        System.out.println("Summe der Digits: "+ summe);
    }
    public static void main(String[] args) {
        //definieren Variabeln

        int zahl1 = 12;
        int zahl2 = 15;
        int zahl3 = 85;

        //Programm Start
        SumofDigits(zahl1);
        SumofDigits(zahl2);
        SumofDigits(zahl3);
    }
}
