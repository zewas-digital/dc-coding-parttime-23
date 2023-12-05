/*
Dieses Programm soll die Ziffernsumme für jede Zahl innerhalb bestimmten Intervalls bilden und jeweils auf der Console ausgeben.
 */

/*
10 % 10 = 1 (Zahl1)
11 / 10 = 1,1 (Zahl zwei, weil integer komma wird gestrichen)
 */

package solutions.Simon.example22;

public class SumOfDigits {
    public static void main(String[] args) {

        int StartWert = 10;
        int EndWert = 20;
        int Zahl1 = 0;
        int Zahl2 = 0;

        for (int i = StartWert; i <=EndWert ; i++) {
            System.out.println(i);
            Zahl1 = i % 10;
            Zahl2 = i / 10;
            System.out.println("Ziffernsumme" + " " + (Zahl1 + Zahl2));
        }
    }
}
