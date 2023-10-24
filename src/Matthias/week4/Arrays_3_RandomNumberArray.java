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

    //Methode 1
    public static int[] makeACopy0( int[] original, int iArraylenth ) {
        int[] copy = new int[original.length];
        Random random = new Random();
        for (int i = 0; i <original.length ; i++) {
            copy[i]= random.nextInt(iArraylenth);
        }
        return copy;
    }

    //Methode 2
    public static void makeACopy1( int[] original, int iArraylenth ) {
        int[] copy = makeACopy0( original, iArraylenth );
        for (int number: copy) {
           System.out.print(number + ","+ " ");
        }
    }
    //Methode 3
    public static int[] makeACopy3( int[] original, int iArraylenth ) {
        int[] copy = new int[original.length];
        Random random = new Random();
        for (int i = 0; i <original.length ; i+=2) {
            copy[i]= random.nextInt(iArraylenth);
        }
        return copy;
    }

    public static void main( String[] args ) {
        //Variabeln dokumentieren

        int SizeArray=0;

        // Start Programm

        System.out.println( "Willkommen Geben Sie die Anzahl der Arrays ein:" );

        Scanner scanner= new Scanner(System.in);

        SizeArray=scanner.nextInt();


        int [] Arrayradomnumbers= new int[SizeArray];

        // User Output
        System.out.println( Arrays.toString(makeACopy0( Arrayradomnumbers, SizeArray )));
        makeACopy1( Arrayradomnumbers, SizeArray );
        System.out.println(  );
        System.out.println( Arrays.toString(makeACopy3( Arrayradomnumbers, SizeArray )));
        int [] Arraybefüllt= makeACopy0(Arrayradomnumbers, SizeArray);
        System.out.println( Arraybefüllt[1]);

        System.out.println(Arraybefüllt[4] );

        System.out.println( Arraybefüllt[9]);
    }
}
