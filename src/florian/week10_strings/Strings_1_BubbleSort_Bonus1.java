package florian.week10_strings;

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
    public static void main(String[] args) {
        String[] names = new String[]{
                "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
        };

        boolean variable = false;

        String[] ascending = bubblesort(names, variable);
        System.out.println(Arrays.toString(ascending));

    }


    static String[] bubblesort(String[] names, boolean variable) {
        String sort = null;

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (variable == names[i].length() > names[j].length()) {
                    sort = names[i];
                    names[i] = names[j];
                    names[j] = sort;
                } else if (!variable == names[i].length() < names[j].length()) {
                    sort = names[i];
                    names[i] = names[j];
                    names[j] = sort;

                }
            }
        }
        return names;
    }
}