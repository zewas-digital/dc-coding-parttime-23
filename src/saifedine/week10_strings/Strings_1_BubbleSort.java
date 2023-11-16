package saifedine.week10_strings;

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

public class Strings_1_BubbleSort {
    static String[] names = new String[]{
            "Max", "Anna", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
    };

    public static void main(String[] args) {

        lengthAscending();
        lengthDescending();
        lexikoAscending();
        lexikoDescending();
    }

    private static void lengthAscending() {
        //sortieren nach Länge der Namen
        String exchange;

        for (int i = 0; i < names.length - 1; i++) {

            for (int j = 0; j < names.length - 1 - i; j++) {

                if (names[j].length() > names[j + 1].length()){

                    // exchange
                    exchange = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = exchange;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }

    private static void lengthDescending() {
        //sortieren nach Länge der Namen
        String exchange;

        for (int i = 0; i < names.length - 1; i++) {

            for (int j = 0; j < names.length - 1 - i; j++) {

                if (names[j].length() < names[j + 1].length()){

                    // exchange
                    exchange = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = exchange;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }

    private static void lexikoAscending() {

        //sortieren nach Länge der Namen
        String exchange;

        for (int i = 0; i < names.length - 1; i++) {

            for (int j = 0; j < names.length - 1 - i; j++) {

                if (names[j].compareTo(names[j + 1]) > 0){

                    // exchange
                    exchange = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = exchange;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }

    private static void lexikoDescending() {

        //sortieren nach Länge der Namen
        String exchange;

        for (int i = 0; i < names.length - 1; i++) {

            for (int j = 0; j < names.length - 1 - i; j++) {

                if (names[j].compareTo(names[j + 1]) < 0){

                    // exchange
                    exchange = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = exchange;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }
}