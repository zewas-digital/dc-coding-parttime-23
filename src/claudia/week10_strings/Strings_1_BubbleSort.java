package claudia.week10_strings;

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

import claudia.BasicFunctions;

public class Strings_1_BubbleSort {
    public static void main(String[] args) {
        String[] names = new String[]{
                "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
        };


        System.out.println("ursprüngliche Namensliste: ");
        BasicFunctions.print1DArray(names);
        System.out.println("Längster Name an Stelle: " + findLongest(names));
        System.out.println("Kürzester Name an Stelle: " + findShortest(names));

        bubbleSortAscendingRegardingLength(names);
        System.out.println("sortiert nach Länge, aufsteigend, innerhalb der Kategorien alphabetisch: ");
        BasicFunctions.print1DArray(names);
        bubbleSortDescendingRegardingLength(names);
        System.out.println("sortiert nach Länge, absteigend, innerhalb der Kategorien alphabetisch: ");
        BasicFunctions.print1DArray(names);
        bubbleSortAscendingRegardingAlphabet(names);
        System.out.println("sortiert nach Alphabet, aufsteigend: ");
        BasicFunctions.print1DArray(names);
        bubbleSortDescendingRegardingAlphabet(names);
        System.out.println("sortiert nach Alphabet, absteigend: ");
        BasicFunctions.print1DArray(names);
    }


    public static int findShortest(String[] list){
        int index = 0;
        int minlength = list[0].length();

        for (int i = 1; i < list.length; i++) {
            int lengthOfString = list[i].length();
            if (lengthOfString < minlength) {
                minlength = lengthOfString;
                index = i;
            }
        }
        return index;
    }
    public static int findLongest(String[] list){
        int index = 0;
        int maxlength = list[0].length();

        for (int i = 1; i < list.length; i++) {
            int lengthOfString = list[i].length();
            if (lengthOfString > maxlength) {
                maxlength = lengthOfString;
                index = i;
            }
        }
        return index;
    }
    public static void bubbleSortAscendingRegardingAlphabet(String[] list) {
        for (int j = 0; j < list.length - 1; j++) {
            for (int i = 0; i < list.length - j - 1; i++) {
                if (list[i].compareTo(list[i + 1]) > 0) {
                    swapElements(list, i, i + 1);
                }
            }
        }
    }
    public static void bubbleSortDescendingRegardingAlphabet(String[] list) {
        for (int j = 0; j < list.length - 1; j++) {
            for (int i = 0; i < list.length - j - 1; i++) {
                if (list[i].compareTo(list[i + 1]) < 0) {
                    swapElements(list, i, i + 1);
                }
            }
        }
    }
    public static void bubbleSortAscendingRegardingLength(String[] list) {
        for (int j = 0; j < list.length - 1; j++) {
            for (int i = 0; i < list.length - j - 1; i++) {
                if (list[i].length() > list[i + 1].length()) {
                    swapElements(list, i, i + 1);
                }
                else if (list[i].length() == list[i + 1].length() && list[i].compareTo(list[i + 1]) > 0)
                    swapElements(list, i, i + 1);
            }
        }
    }
    public static void bubbleSortDescendingRegardingLength(String[] list) {
        for (int j = 0; j < list.length - 1; j++) {
            for (int i = 0; i < list.length - j - 1; i++) {
                if (list[i].length() < list[i + 1].length()) {
                    swapElements(list, i, i + 1);
                }
                else if (list[i].length() == list[i + 1].length() && list[i].compareTo(list[i + 1]) > 0)
                    swapElements(list, i, i + 1);
            }
        }
    }
    public static void swapElements(String[] list, int i, int j) {
        if (i != j) {
            String temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}