/*
Erstelle ein Programm, das den Durschnittswert für alle Zahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.Simon.example21;

public class Average {
    public static void main(String[] args) {

        int StartWert = 10;
        int EndWert = 20;
        int Anzahl = 0;
        int Summe = 0;

        for (int i =StartWert; i <= EndWert; i++) {
            System.out.println(i);
            Anzahl++;
            Summe = Summe + i;
        }
        System.out.println("Summe " + Summe / Anzahl); // Summe ist am Anfang mit Wert null darum muss ich Summe = Summe + i weil i sich mit
        // jeder interation um eines erhöht.
    }
}

