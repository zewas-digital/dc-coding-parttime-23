/*
Erstelle ein Programm, dass als Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.michael_k.weekend1.example24;

public class PrimeNumbers {
    public static void main(String[] args) {

        int wert1=3;
        int wert2=80;

        if (wert1==2){                          //die If-Abfrage ist notwendig, weil die Methode keine 2 auswerten kann.
            System.out.println(2);wert1++;
        }
        for (int i = wert1; i<=wert2; i++) {

            boolean result = PrimeNumber(i);
            if (result == true) {
                System.out.println(i);
            }
        }
    }

    static boolean PrimeNumber(int wert){       //In dieser Methode wird ein Wert übergeben die prüft, ob die Zahl eine
                                                //Primzahl ist und gibt ein True aus, wenn das der Fall ist.
        boolean result =false;

        for (int i = 2; i <wert; i++) {

            if (wert % i ==0){ result=false;break;}
                else {result= true;}
        }
        return result;
    }
}
