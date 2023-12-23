package Matthias.week2;

/*
Erstelle eine Methode welche ein X von variabler Größe und mit angegebene Zeichen ausgibt.

    Löse das Problem wie es dir gefällt
    Löse das Problem mit nur zwei ineinander verschachtelten Schleifen

Aufruf:
printX('x', 5);

Ausgabe:
x   x
 x x
  x
 x x
x   x
 */

public class example_16_PrintX {
    public static void main( String[] args ) {
        printX( 'c', 5 );
    }

    public static void printX( char buchstabe, int size ) {
        for (int i = 0; i < size; i++) {
            System.out.print( "Zeile: " + i + " " );
            for (int j = 0; j < size; j++) {
                if ( j == i ) {
                    System.out.print( buchstabe );
                } else if ( j + 1 == size - i ) {
                    System.out.print( buchstabe );
                } else {
                    System.out.print( " " );
                }
            }
            System.out.println( );
        }
    }
}