package saifedine.week02.example17;

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

    public static void main(String[] args) {

        printX('x', 5);
    }

    public static void printX(char zeichen, int size){

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((j == i) || (j == size - 1 - i)){
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