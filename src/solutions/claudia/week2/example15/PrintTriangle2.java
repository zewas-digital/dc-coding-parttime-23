package solutions.claudia.week2.example15;

/*
Erstelle eine Methode welche ein Dreieck von variabler Größe und mit angegebene Zeichen ausgibt.
Dabei sollen die angegebene Größe die Höhe des Dreiecks sein. Nimm an, dass die Zahl immer Ungerade ist.

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

maximale Anzahl Zeichen: 2 * height - 1
erste Zeile, i == 0: Zeichen in Spalte height-1, davor Leerschritte
zweite Zeile, i == 1: Zeichen in height - 1 und height + 1
...
letzte Zeile: (2 * height - 1) Zeichen
Breite: 1 - 3 - 5 - 7 - ...

*/

public class PrintTriangle2 {
    public static void main(String[] args) {
        System.out.println("Dreieck Höhe 3");
        printTriangle('x', 3);
        System.out.println("Dreieck Höhe 5");
        printTriangle('x', 5);
    }
    static void printTriangle(char c, int height){
        for (int i = 0; i < height - 1; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                if ((j == height - 1 - i)|| (j == height - 1 + i)) System.out.print(c);
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 2 * height - 1; i++) {
            System.out.print(c);
        }
        System.out.println();




    }
}
