package saifedine.week10_strings;

/*
Aufgabe: Bubblesort mit Strings Extended
Verwende das aus der vorhergehenden Aufgabe gegebene String[] und sortiere es
mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus.

Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden.
Der Aufruf und die Ausgabe erfolgt in der main Methode.

Die Methode soll nun zusätzlich zum String[] Parameter einen weiteren boolean als Parameter erhalten.
Dieser boolean entscheidet, ob das String[] aufsteigend, oder absteigend sortiert wird.
 */

import java.util.Arrays;

public class Strings_1_BubbleSort_Bonus1 {
    static String[] names = new String[]{
            "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
    };

    public static void main(String[] args) {

        boolean sort = false;

        length(sort);
        lexiko(sort);

    }

    //sortieren nach Länge der Namen
    private static void length(boolean sort) {

        String exchange;

        // Ascending
        if (sort) {
            for (int i = 0; i < names.length - 1; i++) {

                for (int j = 0; j < names.length - 1 - i; j++) {

                    if (names[j].length() > names[j + 1].length()) {

                        // exchange
                        exchange = names[j];
                        names[j] = names[j + 1];
                        names[j + 1] = exchange;
                    }
                }
            }
            System.out.println(Arrays.toString(names));
        }

        // Descending
        else {
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
    }

    //sortieren lexikographisch der Namen
    private static void lexiko(boolean sort) {

        String exchange;

        if (sort) {
            //sortieren lexikoAscending der Namen
            for (int i = 0; i < names.length - 1; i++) {

                for (int j = 0; j < names.length - 1 - i; j++) {

                    if (names[j].compareTo(names[j + 1]) > 0) {

                        // exchange
                        exchange = names[j];
                        names[j] = names[j + 1];
                        names[j + 1] = exchange;
                    }
                }
            }
            System.out.println(Arrays.toString(names));
        }
        //sortieren lexikoDescending der Namen
        else {
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
}