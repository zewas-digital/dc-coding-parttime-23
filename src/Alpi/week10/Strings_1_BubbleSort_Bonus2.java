package Alpi.week10;

/*
Aufgabe: Bubblesort mit Strings und Character Index
Verwende den aus der vorhergehenden Aufgabe gegebenen String[],
sortiere ihn mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus.

Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden.
Der Aufruf und die Ausgabe erfolgt in der main Methode.

Die Methode soll nun zusätzlich zum String[] Parameter einen weiteren int als Parameter erhalten.
Dieser int steht für den Index des char im String, nach dem sortiert werden soll.
Das bedeutet: von "apfel" wäre charAt(2) = "f" und von "Birne" "r".
Sortiere also nicht nach dem ersten Buchstabe wie in der Aufgabe zuvor, sondern nach charAt(2), also nach dem 3. Buchstaben.

Einen char an einer bestimmten Stelle eines String erhälst du mit string.charAt(i),
oder auch mit string.toCharArray()[i], wobei das natürlich ineffizient ist, wenn es öfter aufgerufen werden muss.

Prüfe zuerst ob die Sortierung nach dem gegebenen Index erfolgen kann.
Wenn der Index zu groß ist, mach eine entsprechende Ausgabe und sortiere nicht.
 */

public class Strings_1_BubbleSort_Bonus2 {

    public static void main(String[] args) {

        String[] names = new String[]{
                "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
        };


    }

    public static void bubbleSort(String[] names, int index) {
        if (index < 0 || index >= names[0].length()) {
            System.out.println("Der Index ist ungültig.");
            return;
        }

        int i = 0;
        while (i < names.length - 1) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].charAt(index) > names[j + 1].charAt(index)) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
            i++;
        }
    }


    public class Strings_2_BubbleSort {

        public static void main(String[] args) {
            String[] names = new String[]{
                    "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
            };

            bubbleSort(names, 2); // Sortiere nach dem dritten Buchstaben

            for (String name : names) {
                System.out.println(name);
            }
        }
    }

}
