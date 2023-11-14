package Simonsway.Week9;

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
import java.util.Collection;
import java.util.Collections;

public class Strings_1_BubbleSort {

    public static void main(String[] args) {

        String[] names = new String[]{"Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"};

        System.out.println("Ascending");
        sortAscending(names);
        System.out.println("Descending");
        sortDescending(names);
        System.out.println("Lenght Ascending");
        sortLengthAscending(names);

    }

    private static void sortAscending(String[] names) {
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }

    private static void sortDescending(String[] names) {
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println(Arrays.toString(names));
    }


    private static void sortLengthAscending(String[] names){

        String exchange;

        for (int i = 0; i < names.length -1 ; i++) {
            for (int j = 0; j < names.length -1; j++) {
                if (names[j].length() > names[i +1].length()) {
                    exchange = names[i];
                    names[i] = names[j];
                    names[j] = exchange;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }

    private static void sortAscendingBubble(String[] names) {
        String temp;
        System.out.println("Sorted Bubble Sort Ascending");
        for (int i = 0; i < names.length; i++) {
            for (int j = i; j < names.length; j++) {
                if (names[j].compareTo(names[i]) < 0){
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
            System.out.println(names[i]);
        }
    }
}



