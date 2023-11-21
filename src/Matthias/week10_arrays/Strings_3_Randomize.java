package Matthias.week10_arrays;

/*
Aufgabe: Randomize
Es soll ein Wort über die Kommandozeile eingelesen werden,
dieses die Buchstaben des Wortes sollen zufällig vertauscht werden und anschließend ausgegeben werden. Verwende hierfür text.toCharArray() für das Aufsplitten, erstelle ein neues char[], befülle es zufällig mit den Buchstaben des Wortes, füge es mittels new String(charArray) zusammen und gib es aus.

Ausgabe

Willkommen zum Zufallsshuffle Programm
>>>Hallo
lolHa
 */

import Matthias.week7_arrays.Arrays_11_2dArray;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Strings_3_Randomize {
    public static Scanner scanner = new Scanner( System.in );
    public static Random rand = new Random( );

    public static void main( String[] args ) {
        System.out.println( "Willkommen zum Reverseprogramm " );
        String Wort = scanner.nextLine( );
        char[] charArray = Wort.toCharArray( );
        printcharArray( charArray );
        System.out.println( );
        //printreversecharArray(charArray);
        System.out.println( );
        randomarray( charArray );
    }

    //Methode 1: Gibt den Array aus
    static public void printcharArray( char[] array ) {
        for (char swap : array) {
            System.out.print( swap );
        }
    }

    //Methode 2: Gibt den Array Rückwerts aus
    static public void printreversecharArray( char[] array ) {

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print( array[i] + " " );
        }
    }

    //Methode3: B
    static public void randomarray( char[] array ) {
        int[] randindexArray = new int[array.length];
        // Einlesen der Indexe aus dem org. Array und dann random zuordnen
        for (int i = 0; i < array.length; i++) {
            System.out.println( "Random Index:" + "[" + i + "]:" + +(randindexArray[i] = rand.nextInt( 0, array.length )) + " " );
        }
        // Abstand halter
        System.out.println( );
        // Ausgabe: For-Schleife gibt den Random Array aus
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[randindexArray[i]] );
        }
        //TODO Wie bekomme ich es hin das ich nur Einmal ausgebe?
    }
}
    // Algorithmus
