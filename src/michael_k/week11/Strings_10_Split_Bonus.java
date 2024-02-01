package michael_k.week11;

/*
Aufgabe: Split -------

1/ Erstelle eine Methode welche den String

"Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!"

mit Hilfe eines gegebenen Strings zerlegt,
+ welcher als Parameter mitgegeben wird
+ und das String[] zurückgibt.

2/ Füge das String[] mittels eines StringBuilder wieder zusammen
und füge jedoch nach jedem append auch einen System.lineSeparator() hinzu.

Gib dann den String den du vom StringBuilder erhältst aus.
(siehe StringBuilder in oliver.week11_strings.Strings_4_Zaehlen)

Teste deine Methode in der main Methode mit einigen Beispielen.


Aufruf ---

String[] words = wordSplit(text, "Tag");
...
Ausgabe ---

Heute wird ein guter
! Heute wird der beste
 überhaupt! Heute wird ein spitzen super
!

 */

import java.util.Arrays;

public class Strings_10_Split_Bonus {

    public static String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";
    public static void main(String[] args) {

        String[] textParts = wordSplit(text, "Tag");

        StringBuilder sb = new StringBuilder ();
        String s = System.lineSeparator ();
        for (String xy: textParts) {
            sb.append ( xy );
            sb.append ( s );
        }

        System.out.println ( sb.toString () );
    }


    public static String[] wordSplit(String text, String splitvalue){

        String[] words = text.split ( splitvalue );

        return words;
    }
}