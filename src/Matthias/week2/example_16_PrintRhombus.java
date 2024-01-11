package Matthias.week2;

/*
Erstelle eine Methode welche einen Rhombus von variabler Größe und mit angegebene Zeichen ausgibt. Die Größe soll dabei die Höhe des Rhombus sein.

Aufruf:
printRhombus('x', 7);

Ausgabe:
   x
  x x
 x   x
x     x
 x   x
  x x
   x
 */

public class example_16_PrintRhombus {

    public static void main( String[] args ) {
        printRhombus( 'a', 8 );// Aufruf zur Überprüfung, ob die Benutzer überprüfung überhaupt funktioniert
        printRhombus( 'a', 7 );
    }

    static void printRhombus( char buchstabe, int höhedesrohmbus ) {

        //Überprüfung ob die Eingabe des Benutzers überhaubt gültig für einen Rohmbus ist, ein Rohmbus
        if ( höhedesrohmbus % 2 == 0 ) {
            System.out.println( "Fehler, Höhe muss ungerade sein!" );
            return; // geht aus der Bendiung aus
        }
        System.out.println( "Start" );
        int zeilenmitte = (höhedesrohmbus - 1) / 2;

        //obere Hälfte inkl. Mitte
        for (int i = 0; i < (höhedesrohmbus + 1) / 2; i++) {
            for (int j = 0; j < höhedesrohmbus; j++) {
                if ( (j == zeilenmitte - i) || (j == zeilenmitte + i) ) {
                    System.out.print( buchstabe );
                } else {
                    System.out.print( " " );
                }
            }
            System.out.println( );
        }
        // untere Hälfte
        for (int i = zeilenmitte - 1; i >= 0; i--) {
            for (int j = 0; j < höhedesrohmbus; j++) {
                if ( (j == zeilenmitte - i) || (j == zeilenmitte + i) ) {
                    System.out.print( buchstabe );
                } else {
                    System.out.print( " " );
                }
            }
            System.out.println( );
        }
    }
}