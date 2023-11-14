package florian.week10_strings;

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

import java.util.Arrays;
import java.util.Objects;

public class Strings_1_BubbleSort {
    public static void main(String[] args) {
        String[] names = new String[]{
                "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
        };

        String [] ascending = lenghtAscending(names);
        System.out.println(Arrays.toString(ascending));             // Länge Aufsteigend
        System.out.println();

        String [] lengthdescending = lenghtDescending(names);
        System.out.println(Arrays.toString(lengthdescending));      // Länge Absteigend
        System.out.println();

        String [] alphabetAscending = alphabetAscending(names);     // Alphabetisch Aufsteigend
        System.out.println(Arrays.toString(alphabetAscending));
        System.out.println();

        String [] alphabetDescending = alphabetDescending(names);   // Alphabetisch Absteigend
        System.out.println(Arrays.toString(alphabetDescending));
        System.out.println();

    }

    static String[] lenghtAscending(String[] names) {
        String sortieren = null;

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i] .length() > names[j].length()) {
                    sortieren = names[i];
                    names[i] = names[j];
                    names[j] = sortieren;

                }
            }
        }
        return names;
    }

    static String[] lenghtDescending (String[] names) {
        String sortieren = null;

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i] .length() < names[j].length()) {
                    sortieren = names[i];
                    names[i] = names[j];
                    names[j] = sortieren;
                }
            }
        }
        return names;
    }

    static String[] alphabetAscending(String[] names) {         // Alphabetisch Absteigend
        String sortieren = null;

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    sortieren = names[i];
                    names[i] = names[j];
                    names[j] = sortieren;
                }
            }
        }
        return names;

    }






    static String[] alphabetDescending(String[] names) {         // Alphabetisch Absteigend
        String sortieren = null;

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) < 0) {
                    sortieren = names[i];
                    names[i] = names[j];
                    names[j] = sortieren;
                }
            }
        }
        return names;

    }

}