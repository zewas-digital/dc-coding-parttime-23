/*
Erstelle ein Programm, das den Durschnittswert für alle Zahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package saifedine.week02_weekend1.example21;

public class Average {
    public static void main(String[] args) {

 int startWert = 10;
 int endWert = 20;
 int summe = 0;
 int anzahl = 0;

        for (int i = startWert; i <= endWert ; i++) {
            anzahl ++;
            System.out.println("fori: " + i);
            System.out.println("anzahl: " + anzahl);
            summe = summe + i;
            System.out.println("summe: " + summe);

        }
        System.out.println("Ergebnis: " + summe / anzahl);
    }
}
