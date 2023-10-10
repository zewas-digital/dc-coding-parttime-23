package solutions.claudia.week2.example17;

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
    static void printX(char c, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i == j) System.out.print(c);
                else if (j == height - 1 - i) System.out.print(c);
                else System.out.print("-");
            }
            System.out.println();
        }
    }
}
