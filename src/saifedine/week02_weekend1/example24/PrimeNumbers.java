/*
Erstelle ein Programm, dass als Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
*/

// https://studyflix.de/mathematik/primzahlen-3161

// Import der Klasse "PrimeNumbers" im Package "saifedine.week02_weekend1.example24"
package saifedine.week02_weekend1.example24;

// Deklaration der Klasse "PrimeNumbers"
public class PrimeNumbers {

    // Hauptmethode, die das Programm startet
    public static void main(String[] args) {

        int num = 100;                                                                                                   // Initialisierung der Variablen "num" mit dem Wert 10

        // Schleife, die alle Zahlen von 2 bis "num" überprüft
        for (int i = 2; i <= num; i++) {

            // Wenn "i" eine Primzahl ist, wird sie auf der Konsole ausgegeben
            if (primzahl(i) == true){
                System.out.println(i);
            }
        }
    }

    // Methode zur Überprüfung, ob eine Zahl eine Primzahl ist
    static boolean primzahl(int num){

        boolean isPrim = true;                                                                                          // Initialisierung der Variablen "isPrim" als "true"

        // Schleife, die alle Zahlen von 2 bis "num" überprüft
        for (int j = 2; j < num; j++) {

            // Wenn "num" durch "j" teilbar ist, ist es keine Primzahl
            if (num % j == 0) {
                isPrim = false;                                                                                         // Setzt "isPrim" auf "false"
                break;                                                                                                  // Beendet die Schleife
            }
            else {
                isPrim = true;                                                                                          // Setzt "isPrim" auf "true"
            }
        }
        return isPrim;                                                                                                  // Gibt den Wert von "isPrim" zurück
    }
}