package michael_k.week10;

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

import java.sql.SQLOutput;
import java.util.Arrays;

public class Strings_1_BubbleSort {

    public static void main(String[] args) {

        String[] names = new String[]{
                "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
        };
        int length = names.length;


        String[] arrayminmax = bubbleSortminmax ( names, length);
        String[] arraymaxmin = bubbleSortmaxmin ( names, length);
        String[] arrayUpwards = sortLexioUpwards ( names, length );
        String[] arrayDownwards = sortLexioDownwards ( names, length );
        String[] arrayUpwards2 = bubbelsortUpwards ( names, length );
        String[] arrayDownwards2 = bubbelsortDownwards (  names, length );

        System.out.println ("Originalarray:" );
        System.out.println ( Arrays.toString ( names) );
        System.out.println ( );
        System.out.println ( "Nach Namenlänge aufsteigend sortiert:");
        System.out.println (Arrays.toString ( arrayminmax ) );
        System.out.println ( );
        System.out.println ( "Nach Namenlänge absteigend sortiert:");
        System.out.println (Arrays.toString ( arraymaxmin ) );
        System.out.println ( );
        System.out.println ( "Lexiografisch aufsteigend sortiert:");
        System.out.println ( Arrays.toString ( arrayUpwards ) );
        System.out.println ( Arrays.toString ( arrayUpwards2 ) );
        System.out.println ( );
        System.out.println ( "Lexiografisch absteigend sortiert:");
        System.out.println ( Arrays.toString ( arrayDownwards ) );
        System.out.println ( Arrays.toString ( arrayDownwards2 ) );

    }

    static String[] bubbleSortminmax(String[] names, int length){

        String[] namesSort= new String[length];
        String x;
        String y;
        int counter=0;

        for (int i = 0; i < length; i++) {
            namesSort[i] = names[i];
        }

        while(counter != length-1){
            counter =0;
            for (int i = 0; i <length-1 ; i++) {

                if (namesSort[i].length () > namesSort[i+1].length ()){
                    x = namesSort[i];
                    y = namesSort[i+1];

                    namesSort[i] = y;
                    namesSort[i+1] = x;
                }else{ counter++;}
            }

        }

        return namesSort;
    }

    static String[] bubbleSortmaxmin(String[] array, int length){

        String[] arraySort= new String[length];
        String x;
        String y;
        int counter=0;

        for (int i = 0; i < length; i++) {
            arraySort[i] = array[i];
        }

        while(counter != length-1){
            counter =0;
            for (int i = 0; i <length-1 ; i++) {

                if (arraySort[i].length () < arraySort[i+1].length ()){
                    x = arraySort[i];
                    y = arraySort[i+1];

                    arraySort[i] = y;
                    arraySort[i+1] = x;
                }else{ counter++;}
            }

        }

        return arraySort;
    }

    static String[] sortLexioUpwards(String[] array, int length){

        String[] arrayUpwards= new String[length];
        String x;
        String y;
        int counter=0;

        for (int i = 0; i < length; i++) {
            arrayUpwards[i] = array[i];
        }

        Arrays.sort(arrayUpwards);

        return arrayUpwards;
    }

    static String[] sortLexioDownwards (String[] array, int length){

        String[] arrayUpwards= new String[length];
        String[] arrayDownwards= new String[length];
        String x;
        String y;
        int counter=0;

        for (int i = 0; i < length; i++) {
            arrayUpwards[i] = array[i];
        }

        Arrays.sort(arrayUpwards);

        for (int i = 0; i < length; i++) {
            arrayDownwards[length-1-i] = arrayUpwards[i];
        }


        return arrayDownwards;
    }

    static String[] bubbelsortUpwards(String[] array, int length){

        String[] arraySort= new String[length];
        String x;
        String y;
        int z;
        int counter=0;

        for (int i = 0; i < length; i++) {
            arraySort[i] = array[i];
        }


        while(counter != length-1){
            counter =0;
            for (int i = 0; i <length-1 ; i++) {
                z = arraySort[i].compareTo (arraySort[i+1]);
                if ( z > 0 ){
                    x = arraySort[i];
                    y = arraySort[i+1];

                    arraySort[i] = y;
                    arraySort[i+1] = x;
                }else{ counter++;}
            }

        }

        return arraySort;
    }

    static String[] bubbelsortDownwards(String[] array, int length){

        String[] arraySort= new String[length];
        String x;
        String y;
        int z;
        int counter=0;

        for (int i = 0; i < length; i++) {
            arraySort[i] = array[i];
        }


        while(counter != length-1){
            counter =0;
            for (int i = 0; i <length-1 ; i++) {
                z = arraySort[i].compareTo (arraySort[i+1]);
                if ( z < 0 ){
                    x = arraySort[i];
                    y = arraySort[i+1];

                    arraySort[i] = y;
                    arraySort[i+1] = x;
                }else{ counter++;}
            }

        }

        return arraySort;
    }
}