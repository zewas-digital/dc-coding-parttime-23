package Matthias.week5_arrays;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.
Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt. Die Methoden sollen jeweils
den Wert zurückgeben (nicht Ausgeben). In der main Methode Rufe die Methoden mit den Zufallszahlen auf und gib diese aus.

Erstelle zwei weitere Funktionen, die den Index des Minimums und des Maximums zurückgeben.
 */

import java.util.Arrays;
import java.util.Random;

public class Array_7_MinMaxAvg {
    public static void main( String[] args ) {
        //Start Programm
        System.out.println( "Programm Start" );

        //deklaration von neuen Variabeln
        int SizeArray = 10;
        int[] Arrayradomnumbers = new int[SizeArray]; // deklaraton eines Arrays von 0-100?
        System.out.println( "Ausgabe der Zusfallszahlen: " + Arrays.toString( Arrayradomnumbers=befuellen( Arrayradomnumbers, 1, 100 ) ) );
        System.out.println( "Min Wert:" + minValue( Arrayradomnumbers));
        System.out.println( "Max Wert:" + maxValue(Arrayradomnumbers));
        System.out.println( "Summe Array: " + sum( Arrayradomnumbers ) );
        System.out.println( "Mittelwert:"+  mittelwert( Arrayradomnumbers ));
        System.out.println( "min ValueIndex:"+  minValueIndex( Arrayradomnumbers));
        System.out.println( "max ValueIndex:"+  maxValueIndex( Arrayradomnumbers ));

    }

    //Methode 1: Befüllen: Sinn Befuellt einen Array mit Zufallszahlen
    public static int[] befuellen( int[] original, int min, int max ) {
        Random random = new Random( );
        int counter = 0;
        for (int i = 0; i < original.length; i++) {
            original[i] = random.nextInt( min, max );
            counter = i;
        }
        return original;
    }
    //Methode 2: min Value: gibt den minmal Wert zurück, mod. min Wert einstellbar
    public static int minValue( int[] original) {
            int postion = 0;
            int min = original[postion];
            for (int i = 1; i < original.length; i++) {
                if ( original[i] < min ) {
                    min = original[i];
                }
            }
            return min;
        }
    //Methode 3: gibt den maximal Wert zurück, mod. max Wert Hardgecodet
    public static int maxValue( int[] original ) {
        int storage = 1;
        for (int maxValue : original) {
            if ( maxValue > storage ) {
                storage = maxValue;
            }
        }return storage;
    }
    //Methode 4: Gibt die Summe des Arrays aus
    public static int sum( int[] original) {
        int storage=0;
        for (int sum:original) {
            storage= storage+sum;
        }
        return storage;
    }
    //Methode 5: gibt die Array-Anzahl zrueck
    public static int counterarray(int[] original){
        int counter=0;
        for (int i = 0; i <= original.length; i++) {
            counter=i;
        }
        return counter;
    }
    //Methode 6: gibt den Mittelwert zureck
    public static double mittelwert(int[] original){
        double summe= (double) sum( original ) / (double) counterarray(original);
        return summe;
    }
    //Methode 7: Index des Minimums
    public static int minValueIndex(int[] original) {
        int postion = 0;
        int min = original[postion];
        for (int i = 0; i < original.length; i++) {
            if ( original[i] < min ) {
                min = original[i];
                postion = i;
            }
        }
        return postion;

    }
    //Methode 8:Index des Maximums
    public static int maxValueIndex(int[] original){
        int positon=0;
        int max=original[positon];
        for (int i = 0; i < original.length; i++) {
            if ( original[i] > max ) {
                max= original[i];
                positon = i;
            }
        }
        return positon;
    }
}
