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
        }