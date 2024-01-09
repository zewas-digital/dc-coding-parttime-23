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
import java.util.Random;
import java.util.Scanner;

public class Arrays_3_RandomNumberArray {

    public static void main( String[] args ) {
        Scanner scanner= new Scanner(System.in);

        //Variabeln deklarieren

        int SizeArray=0;
        int [] Arrayradomnumbers= new int[SizeArray];

        // Start Programm
        System.out.println( "Willkommen Geben Sie die Size des Eindemensionalen Arrays ein:" );

        // Holt sich die Size des Arrays vom Benutzer
        SizeArray=scanner.nextInt();

        // Druckt den Array an Zufallszahlen mit der Array.toString Methode
        System.out.println( Arrays.toString( createRandomArray0( Arrayradomnumbers, SizeArray )));

        // Druckt den Array mit der selbsterstellten print Methode mit for each Ausgabe
        printRandomArray( Arrayradomnumbers, SizeArray );

        // Abstand
        System.out.println(  );

        // Gibt den 2, 5, 10 Wert des Arrays aus
        int [] Arraybefüllt= createRandomArray0(Arrayradomnumbers, SizeArray);

        System.out.println( Arraybefüllt[1]);

        System.out.println(Arraybefüllt[4] );

        System.out.println( Arraybefüllt[9]);

        // Abstand
        System.out.println(  );

        // Gibt jeden zweiten ArrayInhalt aus
        System.out.println( Arrays.toString( createRandomArray2( Arrayradomnumbers, SizeArray )));


    }

    //Methode 1:
    public static int[] createRandomArray0( int[] original, int maxBoundRandom ) {
        int[] Array = new int[original.length];
        Random random = new Random();
        for (int i = 0; i <original.length ; i++) {
            Array[i]= random.nextInt(maxBoundRandom);
        }
        return Array;
    }

    //Methode 2: Druckt einen Array mit Random Array, wie eine Array.toString Methode
    public static void printRandomArray( int[] original, int maxBoundRandom ) {
        int[] Array = createRandomArray0( original, maxBoundRandom );
        for (int number: Array) {
            System.out.print(number + ","+ " ");
        }
    }

    //Methode 3: Befüllt jeden zweiten Arrayplatz mit der Zufallszahl
    public static int[] createRandomArray2( int[] original, int maxBoundRandom ) {
        int[] Array = new int[original.length];
        Random random = new Random();
        for (int i = 0; i <original.length ; i+=2) {
            Array[i]= random.nextInt(maxBoundRandom);
        }
        return Array;
    }
}
