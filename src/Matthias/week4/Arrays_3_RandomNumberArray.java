package Matthias.week4;

/*
Aufgabe: Random Number Array
Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 100.

Random random = new Random();
...
int randomNumber = random.nextInt([Upper bound]);
Gib es mit Hilfe einer foreach-Schleife aus.
Gib es mit Hilfe einer fori-Schleife aus. Das Ziel ist eine identische Ausgabe, wie Arrays.toString()
Gib den zweiten, fünften und zehnten Wert des Arrays aus.
Gib jeden zweiten Wert des int[] mit Hilfe einer Schleife aus.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_3_RandomNumberArray {
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
