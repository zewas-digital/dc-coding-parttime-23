package Matthias.week5_arrays;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Summe der Werte zurückgibt.
 */

import java.util.Arrays;
import java.util.Random;

public class Array_6_Summe {
    public static void main( String[] args ) {
        //Start Programm
        System.out.println( "Programm Start" );

        //deklaration von neuen Variabeln
        int SizeArray=100;
        int [] Arrayradomnumbers= new int[SizeArray]; // deklaraton eines Arrays von 0-100?
        System.out.println( Arrays.toString( Arrayradomnumbers=befuellen( Arrayradomnumbers, 1,100)));
        System.out.println( "Summe Array: "+ summe( Arrayradomnumbers ) );
    }

    //Methode 1: Befüllen: Sinn Befuellt einen Array mit Zufallszahlen
    public static int[] befuellen( int[] original, int min, int max ) {
        int[] copy = new int[original.length];
        Random random = new Random( );
        int counter=0;
        for (int i = 0; i < original.length; i++) {
            copy[i] = random.nextInt( min, max );
            counter=i;
        }
        System.out.println( "Counter:"+counter );
        return copy;
    }
    // Fragen: den Orginal Array Übernehmen und diesen  mit i Befüllen und RücKgeben Oliver fragen, ob es einfacher geht
    
    //Methode 2: Gibt die Summe des Inhaltes eines Arrays zurück
    public static int summe( int[] original) {
        int storage=0;
        for (int sum:original) {
            storage= storage+sum;
        }
        return storage;
    }
}