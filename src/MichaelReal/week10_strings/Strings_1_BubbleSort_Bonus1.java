package MichaelReal.week10_strings;

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

        System.out.println("Original");
        Strings_1_BubbleSort.printArray(names);

        bubbleSortBoolean(names.clone(), true);
        bubbleSortBoolean(names.clone(), false);

    }

    public static void bubbleSortBoolean(String[] array, boolean ascending) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int comparisonResult = ascending ? array[j].compareTo(array[j + 1]) : array[j + 1].compareTo(array[j]);
                if (comparisonResult > 0) {
                    // Swap
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        String order = ascending ? "aufsteigend" : "absteigend";
        System.out.println("Sortiert " + order + ":");
        Strings_1_BubbleSort.printArray(array);
    }
}
