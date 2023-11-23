package MichaelReal.week11_strings;

/*
Aufgabe: Suche nach "Hesse"
Verwende für folgende Aufgabe den Text in data.Texts.HESSE.

Wie oft kommt das Wort "Hesse" in folgendem Text vor? An welchen Stellen?

Knobelaufgabe: Gibt es eine einfache Lösung die Anzahl der Vorkommnisse in einer Zeile ermittelt?

Bonus:
Bei der Ausgabe des Texts sollen alle Vorkommnisse von Hesse auf Uppercase (HESSE) gestellt werden.
Verwende die replace() Funktion.
 */

import data.Texts;

public class Strings_7_Hesse {

        public static void main(String[] args) {
            // Annahme: Der Text ist in der Variable text gespeichert.
            String text = data.Texts.HESSE;
            String wordToSearch = "Hesse";
            String uppercaseWord = "HESSE";

            // Suche nach den Positionen der Vorkommen von "Hesse" im Text
            int[] positions = findOccurrences(text.toLowerCase(), wordToSearch.toLowerCase());

            // Zähle die Vorkommen von "Hesse" im Text
            int count = positions.length;

            // Ersetze alle Vorkommen von "Hesse" durch "HESSE" im Text
            String modifiedText = text.replace(wordToSearch, uppercaseWord);

            // Drucke die Anzahl der Vorkommen, den modifizierten Text und die Positionen
            System.out.printf("Das Wort \"%s\" kommt %d Mal vor.%n", wordToSearch, count);
            System.out.println("Modifizierter Text:");
            System.out.println(modifiedText);
            System.out.println("Positionen:");
            for (int position : positions) {
                System.out.println(position);
            }
        }

        // Methode zur Suche nach den Positionen der Vorkommen eines Wortes in einem Text
        private static int[] findOccurrences(String text, String word) {
            int[] positions = new int[0];
            int index = text.indexOf(word);
            while (index != -1) {
                positions = appendToArray(positions, index);
                index = text.indexOf(word, index + 1);
            }
            return positions;
        }

        // Hilfsmethode zum Hinzufügen einer Position zu einem Array
        private static int[] appendToArray(int[] array, int value) {
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[array.length] = value;
            return newArray;
        }
    }



    /*  public static void main(String[] args) {

                // Annahme: Der Text ist in der Variable text gespeichert.
                String text = Texts.HESSE;
                String wordToSearch = "Hesse";
                String uppercaseWord = "HESSE";

                // Zähle die Vorkommen von "Hesse" im Text
                int count = countOccurrences(text.toLowerCase(), wordToSearch.toLowerCase());

                // Ersetze alle Vorkommen von "Hesse" durch "HESSE" im Text
                String modifiedText = text.replace(wordToSearch, uppercaseWord);

                // Drucke die Anzahl der Vorkommen und den modifizierten Text
                System.out.printf("Das Wort \"%s\" kommt %d Mal vor.%n", wordToSearch, count);
                System.out.println("Modifizierter Text:");
                System.out.println(modifiedText);
            }

            // Methode zur Zählung der Vorkommen eines Wortes in einem Text
            private static int countOccurrences(String text, String word) {
                int count = 0;
                int index = text.indexOf(word);
                while (index != -1) {
                    count++;
                    index = text.indexOf(word, index + 1);
                }
                return count;
            }
        }*/