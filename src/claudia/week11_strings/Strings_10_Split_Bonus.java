package claudia.week11_strings;

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

import claudia.BasicFunctions;

public class Strings_10_Split_Bonus {
    public static void main(String[] args) {
        String text = "Heute wird ein guter Tag! Heute wird der beste Tag überhaupt! Heute wird ein spitzen super Tag!";
        String[] words1 = wordSplit(text, "Tag");
        String[] words2 = wordSplit(text, "ut");
       // BasicFunctions.print1DArray(words);
        StringBuilder newlyBuilt1 = new StringBuilder();
        StringBuilder newlyBuilt2 = new StringBuilder();

        for (String word:words1) {
            newlyBuilt1.append(word + System.lineSeparator());
        }
        for (String word:words2){
            newlyBuilt2.append(word + System.lineSeparator());
        }

        System.out.println(newlyBuilt1.toString());
        System.out.println(newlyBuilt2.toString());
    }

    public static String[] wordSplit(String text, String cut){
        return text.split(cut);
    }
}