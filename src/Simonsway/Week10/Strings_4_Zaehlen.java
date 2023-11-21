package Simonsway.Week10;

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
import data.Texts;

public class Strings_4_Zaehlen {

    public static void main(String[] args) {

        String text = Texts.getSimpleText();                              // Hier rufen wir den Text aus der externen Klasse ab.
        int maxCharValue = 0;                                             // Initalisiert eine Variable die den höchsten ASCI wert der im Text gespeicher ist.

        for (int i = 0; i < text.length(); i++) {
            maxCharValue = Math.max(maxCharValue, text.charAt(i));        // Für jedes Zeichen wird er ASCI ermittelt,  und maxCharValue aktualisiert falls ein Zeichen mit höherem ASCI zeichen gefunden wird.
        }

        int[] counter = new int[maxCharValue + 1];                        // Neues Array mit der größe des größten ASCI wertes der oben ermittelt wurde mit +1 wird immer das Array vergrößert um eins wenn höhere Zahl gefunden wurde.

        for (int i = 0; i < text.length(); i++) {                         // Jeder Index eines ASCI zeichens wird gefunden und inkrementiert um zu schauen wie oft er vorkommt.
            counter[text.charAt(i)]++;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }
}

