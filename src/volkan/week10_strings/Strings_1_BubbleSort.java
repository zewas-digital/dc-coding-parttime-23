package volkan.week10_strings;

/*
Aufgabe: Bubblesort mit Strings
Verwende den gegebenen String[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus.
Sortiere zuerst nach der Länge der Namen, dann nach dem Alphabet.
Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden.
Der Aufruf und die Ausgabe erfolgt in der main Methode.

Sortiere die Namen nach Länge aufsteigend (Ascending)
Sortiere die Namen nach Länge absteigend (Descending)
Sortiere die Namen lexikographisch aufsteigend (Ascending)
Sortiere die Namen lexikographisch absteigend (Descending)

Tip.: Strings können mit der Instanz Methode compareTo der String Klasse verglichen werden: "a".compareTo("b")
 */

public class Strings_1_BubbleSort {

    public static void main(String[] args) {
        // Initialisierung
        String[] names = new String[]{
                "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
        };

        // Sortieren nach Länge aufsteigend
        bubbleSort(names, true, true);
        System.out.println("Länge aufsteigend:");
        for (String name : names) {
            System.out.println(name);
        }

        // Sortieren nach Länge absteigend
        bubbleSort(names, false, true);
        System.out.println("\nLänge absteigend:");
        for (String name : names) {
            System.out.println(name);
        }

        // Sortieren lexikographisch aufsteigend
        bubbleSort(names, true, false);
        System.out.println("\nLexikografisch aufsteigend:");
        for (String name : names) {
            System.out.println(name);
        }

        // Sortieren lexikographisch absteigend
        bubbleSort(names, false, false);
        System.out.println("\nLexikografisch absteigend:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    /**
     * Sortiert ein Array von Strings nach Länge und Alphabet.
     *
     * @param strings Das zu sortierende Array.
     * @param ascending Wenn true, wird aufsteigend sortiert, sonst absteigend.
     * @param lengthFirst Wenn true, wird zuerst nach der Länge sortiert, sonst nach dem Alphabet.
     */
    public static void bubbleSort(String[] strings, boolean ascending, boolean lengthFirst) {
        for (int i = 0; i < strings.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (lengthFirst) {
                    if (strings[j].length() > strings[j + 1].length()) {
                        // Strings tauschen
                        String temp = strings[j];
                        strings[j] = strings[j + 1];
                        strings[j + 1] = temp;
                        swapped = true;
                    } else if (strings[j].length() == strings[j + 1].length()) {
                        if (strings[j].compareTo(strings[j + 1]) > 0) {
                            // Strings tauschen
                            String temp = strings[j];
                            strings[j] = strings[j + 1];
                            strings[j + 1] = temp;
                            swapped = true;
                        }
                    }
                } else {
                    if (strings[j].length() < strings[j + 1].length()) {
                        // Strings tauschen
                        String temp = strings[j];
                        strings[j] = strings[j + 1];
                        strings[j + 1] = temp;
                        swapped = true;
                    } else if (strings[j].length() == strings[j + 1].length()) {
                        if (strings[j].compareTo(strings[j + 1]) < 0) {
                            // Strings tauschen
                            String temp = strings[j];
                            strings[j] = strings[j + 1];
                            strings[j + 1] = temp;
                            swapped = true;
                        }
                    }
                }
            }
            if (!swapped) {
                // Array ist sortiert
                break;
            }
        }
    }
}
