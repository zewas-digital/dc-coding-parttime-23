package Matthias.week4;

/*
Aufgabe: Number Array
Erstelle ein int[] mit der Dimension von Benutzerangabe und befülle mit 1, 2, 3, usw.

Erstelle ein zweites int[] und befülle mit Zahlen entsprechend der Größe ..., 3, 2, 1.
 */
import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

    public class Arrays_1_NumberArray {
    //Methode 1
    public static int[] arraybefuellen(int[] original, int anzahl){
        for (int i = 0; i < anzahl; i++) {
            original[i]=i+1;
        }
        return original;
    }
        public static int[] arraybefuellenRückwärts(int[] original, int anzahl){
            for (int i = anzahl; i > 0 ; i--) {
                original[i-1]=(anzahl+1)-i;
            }
            return original;
        }
    //Methode 2

    public static void main( String[] args ) {
        int EingabeAnzahlArray=0;
        System.out.println( "Willkommen Geben Sie die Anzahl der Arrays ein" );
        Scanner scanner= new Scanner(System.in);
        EingabeAnzahlArray=scanner.nextInt();
        int [] number= new int[EingabeAnzahlArray];
        System.out.println( Arrays.toString(arraybefuellen( number, EingabeAnzahlArray)));
        System.out.println( Arrays.toString(arraybefuellenRückwärts( number, EingabeAnzahlArray)));
    }
}