package Simonsway.Week9;

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
import java.util.Collections;

public class Strings_1_BubbleSort_Bonus1 {

    public static void main(String[] args) {

        String[] names = new String[]{
                "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"};

        sortAscending(names, true);

    }

    private static void sortAscending(String[] names, boolean status){

        String exchange;

        if (status == true){
                
            for (int i = 0; i < names.length; i++) {
                for (int j = 0; j < names.length; j++) {
                    if (names[j].length() < names[i].length()){
                        exchange = names[i];
                        names[i] = names[j];
                        names[j] = exchange;
                    }
                }
            }
            System.out.println(Arrays.toString(names));

        } else if (status == false) {
            for (int i = 0; i < names.length; i++) {
                for (int j = 0; j < names.length; j++) {
                    if (names[j].length() < names[i].length()){
                        exchange = names[i];
                        names[i] = names[j];
                        names[j] = exchange;
                        Arrays.sort(names, Collections.reverseOrder());
                    }
                }
            }
            System.out.println(Arrays.toString(names));
        }
        else {
            System.out.println("Wrong");
        }
    }
}