/*
Erstelle ein Programm, das den Durschnittswert für alle Zahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.judith.weekend1.example21;
// (10 + 11 + .... 20) Summe addieren und dann durch die Anzahl der Zahlen (11)
public class Average {
    public static void main(String[] args) {

        int startWert = 10;
        int endWert = 20;
        int summe = 0;
        int anzahl = 0;

        for (int i = startWert; i <=endWert ; i++) {
            anzahl++;
            summe = summe +i;
            System.out.println(i);
        }
        System.out.println(" Durchschnitt " + summe / anzahl);

}

}






