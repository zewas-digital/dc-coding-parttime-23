/*
Erstelle ein Programm, das den Durschnittswert für alle Zahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.eslem.example21;

public class Average {
    public static void main(String[] args) {
        int startwert=10;
        int endwert=20;
        int summe=0;
        int anzahl=0;

        for (int i = startwert; i <= endwert; i++) {
            anzahl++;
            System.out.print(anzahl + ":");
            summe=summe+i;
            System.out.println(summe);
        }
        System.out.println((double) summe / anzahl);
    }
}
