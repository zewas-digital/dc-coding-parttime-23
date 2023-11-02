package Matthias.week2.example17;

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

public class PrintX {
    public static void main( String[] args ) {
        printX( 'c', 5);
    }
    public static void printX(char c, int size) {
        // Zeichne die obere Hälfte des X.
        for (int i = 0; i < size; i++) {
            // Zeichne ein Zeichen auf der linken Seite.
            System.out.print(c);

            // Zeichne Leerzeichen in der Mitte.
            for (int j = 1; j < size - i; j++) {
                System.out.print(" ");
            }

            // Zeichne ein Zeichen auf der rechten Seite.
            System.out.println(c);
        }

        // Zeichne die untere Hälfte des X.
        for (int i = size - 1; i >= 0; i--) {
            // Zeichne ein Zeichen auf der linken Seite.
            System.out.print(c);

            // Zeichne Leerzeichen in der Mitte.
            for (int j = 1; j < size - i; j++) {
                System.out.print(" ");
            }

            // Zeichne ein Zeichen auf der rechten Seite.
            System.out.println(c);
        }
    }
}
