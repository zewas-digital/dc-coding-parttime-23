/*
Dieses Programm soll die Ziffernsumme für jede Zahl innerhalb bestimmten Intervalls bilden und jeweils auf der Console ausgeben.
 */

package solutions.claudia.weekend1.example22;

public class SumOfDigits {
    public static void main(String[] args) {

        sumOfDigitsInterval(11134, 11137);
        System.out.println();
        sumOfDigitsInterval(1, 28);
        System.out.println();
    }

    static void sumOfDigitsInterval(int lower, int upper){
        //gibt Quersummen aller Zahlen von lower bis upper aus
        for (int i = lower; i <= upper ; i++) {
            System.out.print(sumOfDigits(i) + " ");
        }
    }

    static int sumOfDigits(int zahl){
    //berechnet Quersumme einer beliebigen Zahl
       int quersumme = 0;

        while (zahl > 0){
            quersumme = quersumme + zahl % 10;
            zahl = zahl/10;
        }
        return quersumme;
        }
    }


