/*
Dieses Programm soll die Ziffernsumme für jede Zahl innerhalb bestimmten Intervalls bilden und jeweils auf der Console ausgeben.
 */

package eslem.week03.example22;

public class SumOfDigits {
    public static void main(String[] args) {
        int ziffernsumme= calculaterSumofDigits(245);       //Ziffernsumme:2+4+5=11
        System.out.println(ziffernsumme);
    }
    static int calculaterSumofDigits(int number){
        int ergebnis=0;
        while(number>0){
            int ziffer=number%10;   //245%100=5
            ergebnis=ergebnis+ziffer;       //0+5=5; 4+5=9; 9+2=11
            number=number/10;
        }
        return ergebnis;
    }
}
