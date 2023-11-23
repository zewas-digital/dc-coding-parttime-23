package MichaelReal.week10_strings;

/*
Aufgabe: Buchstaben zählen
In der folgenden Aufgabe sollen alle Buchstaben und Zeichen eines Texts gezählt werden.
Den Text erhältst du vom Package data: data.Texts.getSimpleText().

Um die einzelnen Buchstaben und Zeichen zu zählen soll ein int[] verwendet werden.
Der entsprechende char kann für das Array als Index verwendet werden.
Gib am Schluss die Anzahl der einzelnen Zeichen (zb. A,a,ä,.) aus.

Ausgabe

A: 10
B: 20
C: 1
...
 */

public class Strings_4_Zaehlen {
        public static void main(String[] args) {
            // Den Text erhalten wir vom Package data
            String text = data.Texts.getSimpleText();

            // Ein Array mit 128 Elementen für alle ASCII-Zeichen
            int[] zeichenZaehler = new int[10000];

            // Durch den Text iterieren und die Zeichen zählen
            for (char zeichen : text.toCharArray()) {
                // Zähler für das entsprechende Zeichen erhöhen
               //if (zeichen < 10000) {
                   zeichenZaehler[zeichen]++;
              // }
            }

            // Die Ergebnisse ausgeben
            for (int i = 0; i < zeichenZaehler.length; i++) {
                if (zeichenZaehler[i] > 0) {
                    System.out.println((char) i + ": " + zeichenZaehler[i]);
                }
            }
        }
    }



