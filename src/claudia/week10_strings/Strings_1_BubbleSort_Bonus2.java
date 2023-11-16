package claudia.week10_strings;

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

Einen char an einer bestimmten Stelle eines String erhältst du mit string.charAt(i),
oder auch mit string.toCharArray()[i], wobei das natürlich ineffizient ist, wenn es öfter aufgerufen werden muss.

Prüfe zuerst ob die Sortierung nach dem gegebenen Index erfolgen kann.
Wenn der Index zu groß ist, mach eine entsprechende Ausgabe und sortiere nicht.
 */

import claudia.BasicFunctions;
import com.sun.net.httpserver.BasicAuthenticator;

import static java.lang.Character.compare;

public class Strings_1_BubbleSort_Bonus2 {
    public static void main(String[] args) {
        int shortest = names[findShortest(names)].length();
        System.out.println("Ursprüngliche Liste: ");
        BasicFunctions.print1DArray(names);
        int index = BasicFunctions.readInt("Bubblesort; nach welcher Stelle soll sortiert werden? ");

        while (index < 0 || index > shortest) {
            index = BasicFunctions.readInt("Die Zahl muss zwischen " + 0 + " und " + shortest + " liegen! Versuch's noch mal!");
        }
        index--; //first letter at index 0

        bubbleSortAscendingRegardingIndex(names, index);
        BasicFunctions.print1DArray(names);

    }
    static String[] names = new String[]{
            "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
    };
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
    public static void bubbleSortAscendingRegardingIndex(String[] list, int index) {
        for (int j = 0; j < list.length - 1; j++) {
            for (int i = 0; i < list.length - j - 1; i++) {
                if (compare(list[i].charAt(index), list[i + 1].charAt(index)) > 0) {
                    BasicFunctions.swapElements(list, i, i + 1);
                }
            }
        }
    }
}