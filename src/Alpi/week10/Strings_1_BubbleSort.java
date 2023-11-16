package Alpi.week10;

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

public class Strings_1_BubbleSort {

    public static void main(String[] args) {
        String[] names = new String[]{
                "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"


        };
        bubblesort(names);

        for (String name : names){
            System.out.println(name);
        }


    }

    public static void bubblesort(String[] names) {
        int i = 0;
        while (i < names.length -1){
            for (int j = 0; j < names.length - 1 ; j++) {
                if (names[j].compareTo(names[j +1]) >0){

                    String temp = names [j];
                    names[j] = names[j+1];
                    names[j+1] = temp;

                }

            }
            i++;
        }

    }




}