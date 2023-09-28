/*
Dieses Programm soll die Ziffernsumme für jede Zahl innerhalb bestimmten Intervalls bilden und jeweils auf der Console ausgeben.
 */

package solutions.alpi.week1.weekend1.example22;

public class SumOfDigits {
    public static void main(String[] args) {
        int ziffernsumme = SumOfdigits (245);
        System.out.println(ziffernsumme);



        }
        static int SumOfdigits (int number) {

            int ergebnis = 0;

            while (number > 0) {

                int ziffer = number % 10;
                ergebnis = ergebnis + ziffer;
                number = number / 10;


            }


            return ergebnis;

        }







        }










