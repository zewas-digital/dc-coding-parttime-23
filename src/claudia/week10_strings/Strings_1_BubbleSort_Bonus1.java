package claudia.week10_strings;

/*
Aufgabe: Bubblesort mit Strings Extended
Verwende das aus der vorhergehenden Aufgabe gegebene String[] und sortiere es
mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus.

Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden.
Der Aufruf und die Ausgabe erfolgt in der main Methode.

Die Methode soll nun zusätzlich zum String[] Parameter einen weiteren boolean als Parameter erhalten.
Dieser boolean entscheidet, ob das String[] aufsteigend, oder absteigend sortiert wird.
 */

import claudia.BasicFunctions;

import java.util.Scanner;

public class Strings_1_BubbleSort_Bonus1 {
    public static void main(String[] args) {
        System.out.println("ursprüngliche Namensliste: ");
        BasicFunctions.print1DArray(names);

        char c = 'x';
        while (c != 'a' && c != 'A' && c != 'd' && c != 'D') {
            System.out.print("Sortierung nach Alphabet, Aufsteigend (A) oder Absteigend (D)?  ");
            c = BasicFunctions.readChar("");
        }

        boolean ascending = false;
        if(c == 'a' || c =='A') ascending = true;

        bubbleSortRegardingAlphabet(names, ascending);
        BasicFunctions.print1DArray(names);

    }
    static String[] names = new String[]{
            "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
    };

    public static void bubbleSortRegardingAlphabet(String[] list, boolean ascending) {
        for (int j = 0; j < list.length - 1; j++) {
            for (int i = 0; i < list.length - j - 1; i++) {
                if ((ascending && list[i].compareTo(list[i + 1]) > 0 || (!ascending && list[i].compareTo(list[i + 1]) < 0))) {
                    BasicFunctions.swapElements(list, i, i + 1);
                }
            }
        }
    }
}