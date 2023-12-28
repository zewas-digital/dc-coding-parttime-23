/*
Dieses Programm soll die Ziffernsumme (z.B. Zahl 11 --> 1+1 = 2) für jede Zahl innerhalb bestimmten Intervalls bilden und jeweils auf der Console ausgeben.
 */

package saifedine.week02_weekend1.example22;

public class SumOfDigits {
    public static void main(String[] args) {

        ziffernSumme(11,15);

    }

    static void ziffernSumme (int startWert, int endWert){

        int ziffer1 = 0;
        int ziffer2 = 0;

        for (int i = startWert; i <= endWert ; i++) {

            System.out.println("i: " + i);
            ziffer1 = (i / 10);
            //System.out.println("ziffer1: " + ziffer1);

            ziffer2 = i % 10;
            //System.out.println("ziffer2: " + ziffer2);

            System.out.println("ziffernsumme = "  + ziffer1 + " + " +  ziffer2);

            System.out.println("ergenis: " + (ziffer1 + ziffer2));
        }
    }
}