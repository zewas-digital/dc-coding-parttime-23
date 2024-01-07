package claudia.week11_strings;

/*
Aufgabe: Wortanalyse
Verwende für folgende Aufgabe den Text in data.Texts.HESSE und data.Texts.getSimpleText() um eine Wortanalyse durchzuführen.

Erstelle für folgende Aufgabenstellungen eigene Methoden.
Diese sollen so flexibel wie möglich und testbar geschrieben werden.

Achte darauf vor der Verarbeitung unerwünschte Zeichenfolgen zu entfernen,
diese könnten sich negativ auf die Textverarbeitung auswirken
(, oder . oder - ist nicht das kürzeste Wort).

Ermittle für jeden Text:
+ Längstes Wort
+ Kürzestes Wort
+ Worte alphabetisch sortieren
+ Worte alphabetisch sortieren Unique (jedes Wort darf nur einmal ausgegeben werden)
+ Worte zählen und nach ihrer Häufigkeit ausgeben
 */

import claudia.BasicFunctions;

import java.util.Arrays;

public class Strings_11_Hesse_Bonus {
    public static void main(String[] args) {
        String text = "abc, ßü! äé.  .? ZYX";
        String text1 = data.Texts.HESSE;
        String text2 = data.Texts.getSimpleText();
        //TEST:
        System.out.println(text);
        System.out.println(text.replaceAll("[^a-zA-Z0-9]", ""));
        System.out.println(text.replaceAll("[^\\p{L}\\p{N}]", ""));// regex: beliebiger Buchstabe oder beliebige Zahl!
       /*
        Das p in \\p{N} und \\p{L} steht für property. Es gibt viele andere Zeichenklassen, die Sie mit regulären Ausdrücken in Java definieren können,
        wie z.B\\p{P} für Satzzeichen und \\p{S} für Symbole.

        Die doppelten Backslashes (\\) sind notwendig, weil der Backslash in Java ein Escape-Zeichen ist.
        Das bedeutet, dass er verwendet wird, um das folgende Zeichen zu maskieren
        */
        String[] words1 = getWords(text1);
        String[] words2 = getWords(text2);

        System.out.println("Längste Wörter: ");
        System.out.print("Text 1: ");
        findLongestWord(words1, true);
        System.out.print("Text 2: ");
        findLongestWord(words2, true);

        System.out.println("Kürzeste Wörter: ");
        System.out.print("Text 1: ");
        findLongestWord(words1, false);
        //TODO wozu die einzelnen "s" im Text?
        System.out.print("Text 2: ");
        findLongestWord(words2, false);

        System.out.println("Sortiert nach Alphabet: ");
        System.out.println("Text 1: ");
        String[] sorted1 = bubbleSortRegardingAlphabet(words1);
        BasicFunctions.print1DArray(sorted1);
        System.out.println("Ohne Doppelungen: ");
        BasicFunctions.print1DArray(removeDoubles(sorted1));

        System.out.println("Text 2: ");
        String[] sorted2 = bubbleSortRegardingAlphabet(words2);
        BasicFunctions.print1DArray(sorted2);
        System.out.println("Ohne Doppelungen: ");
        BasicFunctions.print1DArray(removeDoubles(sorted2));


        }

    private static String[] getWords(String text) {
        //Entferne alles, was kein Buchstabe ist und ersetze durch Leerzeichen:
        text = text.replaceAll("[^\\p{L}]", " ");
        return(text.split(" +"));//trenne Text bei ein oder mehreren Leerzeichen
    }

    private static void findLongestWord(String[] words, boolean maximum) {
        int ext = words[0].length();
        int index = -1;

        for (int i = 1; i < words.length; i++){
            if ((maximum && words[i].length() > ext) || (!maximum && words[i].length() < ext && words[i].length() > 1/*es gibt kein Wort mit einem Buchstaben!*/)){
                ext = words[i].length();
                index = i;
            }

        }
        System.out.println("Gesuchtes Wort ist " + words[index] + ", Länge: " + ext + " an Stelle " + index);
    }

    public static String[] removeDoubles(String[] words){
        String[] onlyUniques =  new String[1];
        onlyUniques[0] = words[0];

        for (int i = 1; i < words.length; i++) {
            String last = onlyUniques[onlyUniques.length - 1];
            String current = words[i];

            if (!current.equals(last)) {
                onlyUniques = Arrays.copyOf(onlyUniques, onlyUniques.length + 1);
                onlyUniques[onlyUniques.length - 1] = current;
            }
        }
        return onlyUniques;
    }
    public static String[] bubbleSortRegardingAlphabet(String[] data) {
        int rows = data.length;
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                if (data[j].compareTo(data[j + 1]) > 0) {
                    swapElements(data, j, j + 1);
                }
            }
        }
        return data;
    }
    public static void swapElements(String[] data, int i1, int i2) {
        if (i1 != i2) {
            String temp = data[i1];
            data[i1] = data[i2];
            data[i2] = temp;
        }
    }


}


    /*
    public static void main(String[] args) {
    String input = "Hallo! Wie geht es dir?";
    String output = input.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println("Output: " + output);
}

public static void main(String[] args) {
    String input = "Hallo! Wie geht es dir?";
    String letters = "";
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (Character.isLetter(ch)) {
            letters += ch;
        }
    }
    System.out.println("Buchstaben: " + letters);
}
     */
