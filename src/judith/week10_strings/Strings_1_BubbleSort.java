package judith.week10_strings;

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
    String[] names = new String[]{
            "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
    };

    // Ziel ist es das in der Main die 4 Methoden, die jeweils für die Fragestellung angelegt wurden aufgerufen wird.

    public static void main(String[] args) {
        String[] names = new String[]{
                "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
        };

        laengeAufsteigend(names);
        laengeAbsteigend(names);
        lexiographischAufsteigen(names);

    }


    static void laengeAufsteigend(String []names){
        String temp;
        for (int i = 0; i < names.length  -1 ; i++) {
            for (int j = 0; j < names.length -1 - i ; j++) {

                if (names[j].length() > names[j + 1].length()) {
                    //Werte tauschen
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(names));
    }

    static void laengeAbsteigend(String []names){
        String temp;
        for (int i = 0; i < names.length  -1 ; i++) {
            for (int j = 0; j < names.length -1 - i ; j++) {

                if (names[j].length() < names[j + 1].length()) {
                    //Werte tauschen
                    temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(names));
    }


    static void lexiographischAufsteigen(String[] names){
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }

    static void lexiographischAbsteigend(String[] names){
        Arrays.sort(names, Comparator.reverseOrder());      ///??????????????????????????????
        System.out.println(Arrays.toString(names));
    }


    // "a" compareTo "b" kann auch zur Sortierung verwendet werden.



}