package eslem.week10;

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
        String[] names = new String[]{ "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"};

        boolean var = false;
        String[] ascending = bubblesort(names, var);

        System.out.println(Arrays.toString(ascending));
    }

    static String[] bubblesort(String[] names, boolean var){
        String counter = null;

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (var == names[i].length() > names[j].length()){
                    counter = names[i];
                    names[i] = names[j];
                    names[j] = counter;}
                    else if (!var == names[i].length() < names[j].length()){
                        counter = names[i];
                        names[i] = names[j];
                        names[j] = counter;
                    }
                }
            }
        return names;
    }
}