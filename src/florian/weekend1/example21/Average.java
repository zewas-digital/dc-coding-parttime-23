/*
Erstelle ein Programm, das den Durschnittswert für alle Zahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.florian.weekend1.example21;

public class Average {
    public static void main(String[] args) {
        int startWert = 10;
        int endWert = 20;
        int summe = 0;
        int anzahl = 0;

        for (int i = startWert; i < endWert; i++) {
            anzahl++;
            System.out.print(anzahl + ": " + summe + " + " + i + " =");
            summe += i; // summe = summe + i;
            System.out.println (" " + summe);
            //System.out.println(summe / anzahl); Wenn in der Schleife ausgeführt, werden alle Durchschnittswerte ausgerechnet
        }

        System.out.println((double) summe / anzahl);
    }
}
