package saifedine.week02.example16;

/*
Erstelle eine Methode welche einen Rhombus von variabler Größe und mit angegebene Zeichen ausgibt. Die Größe soll dabei die Höhe des Rhombus sein.

    Löse das Problem wie es dir gefällt
    Löse das Problem mit nur zwei ineinander verschachtelten Schleifen

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

/*
Version von Claudia
 */

class PrintRhombus {

    public static void main(String[] args) {

        printRhombus('x', 7);

    }

    public static void printRhombus(char zeichen, int size){

        int zeilenmitte = (size - 1) / 2;

        //obere Hälfte inkl. Mitte
        for (int i = 0; i < (size + 1) / 2; i++) {
            for (int j = 0; j < size; j++) {
                if ((j == zeilenmitte - i) || (j == zeilenmitte + i)){
                    System.out.print(zeichen);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // untere Hälfte
        for (int i = zeilenmitte - 1; i >= 0; i--) {
            for (int j = 0; j < size ; j++) {
                if ((j == zeilenmitte - i) || (j == zeilenmitte + i)) {
                    System.out.print(zeichen);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}