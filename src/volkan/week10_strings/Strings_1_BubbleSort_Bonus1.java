package volkan.week10_strings;

/*
Aufgabe: Bubblesort mit Strings Extended
Verwende das aus der vorhergehenden Aufgabe gegebene String[] und sortiere es
mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus.

Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden.
Der Aufruf und die Ausgabe erfolgt in der main Methode.

Die Methode soll nun zusätzlich zum String[] Parameter einen weiteren boolean als Parameter erhalten.
Dieser boolean entscheidet, ob das String[] aufsteigend, oder absteigend sortiert wird.
 */

public class Strings_1_BubbleSort_Bonus1 {

    public static void main(String[] args) {

        String[] names = new String[]{
                "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
        };

        // Bubblesort mit aufsteigender Sortierung
        bubbleSort(names, true);
        System.out.println("Aufsteigend:");
        for (String name : names) {
            System.out.println(name);
        }

        // Bubblesort mit absteigender Sortierung
        bubbleSort(names, false);
        System.out.println("\nAbsteigend:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void bubbleSort(String[] strings, boolean ascending) {
        for (int i = 0; i < strings.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (ascending) {
                    if (strings[j].compareTo(strings[j + 1]) > 0) {
                        String temp = strings[j];
                        strings[j] = strings[j + 1];
                        strings[j + 1] = temp;
                        swapped = true;
                    }
                } else {
                    if (strings[j].compareTo(strings[j + 1]) < 0) {
                        String temp = strings[j];
                        strings[j] = strings[j + 1];
                        strings[j + 1] = temp;
                        swapped = true;
                    }
                }
            }
            if (!swapped) {

                break;
            }
        }
    }
}
