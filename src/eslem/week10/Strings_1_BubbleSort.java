package eslem.week10;

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
import java.util.Comparator;

public class Strings_1_BubbleSort {
    public static void main(String[] args) {
        String[] names = new String[]{"Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"};

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(bubbleSortAscending(names, names.length)));
        System.out.println(Arrays.toString(bubbleSortDescending(names, names.length)));
    }
    static String[] bubbleSortAscending(String[] names, int length){

        String[] arraySort= new String[length];
        String x;
        String y;
        int counter=0;

        for (int i = 0; i < length; i++) {
            arraySort[i] = names[i];
        }
        while(counter != length-1){
            counter =0;
            for (int i = 0; i <length-1 ; i++) {

                if (arraySort[i].length() > arraySort[i+1].length()){
                    x = arraySort[i];
                    y = arraySort[i+1];

                    arraySort[i] = y;
                    arraySort[i+1] = x;
                }else {counter++;}
            }

        }
        return arraySort;
    }
    static String[] bubbleSortDescending(String[] names, int length){

        String[] arraySort= new String[length];
        String x;
        String y;
        int counter=0;

        for (int i = 0; i < length; i++) {
            arraySort[i] = names[i];
        }
        while(counter != length-1){
            counter =0;
            for (int i = 0; i <length-1 ; i++) {

                if (arraySort[i].length() < arraySort[i+1].length()){
                    x = arraySort[i];
                    y = arraySort[i+1];

                    arraySort[i] = y;
                    arraySort[i+1] = x;
                }else {counter++;}
            }
        }
        return arraySort;
    }
}

