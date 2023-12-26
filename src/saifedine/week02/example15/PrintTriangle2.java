package saifedine.week02.example15;

/*
Erstelle eine Methode welche ein Dreick von variabler Größe und mit angegebene Zeichen ausgibt.
Dabei sollen die angegebene Größe die Höhe des Dreicks sein. Nimm an, dass die Zahl immer Ungerade ist.

Aufruf:
printTriangle('x', 3);

Ausgabe:
  x
 x x
xxxxx

Aufruf:
printTriangle('x', 5);

Ausgabe:
    x
   x x
  x   x
 x     x
xxxxxxxxx

*/


/*
Version von Claudia
 */

public class PrintTriangle2 {

    public static void main(String[] args) {

        printTriangle('x', 3);
        printTriangle('x', 5);

    }

    public static void printTriangle(char zeichen, int size){

        // oberer Teil "Spitzer-Teil"
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < 2 * size - 1; j++) {
                if ((j == size - 1 - i) || (j == size - 1 + i)){
                    System.out.print(zeichen);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // unterer Deckel
        for (int i = 0; i < 2 * size - 1; i++) {
            System.out.print(zeichen);
        }
        System.out.println();
    }
}