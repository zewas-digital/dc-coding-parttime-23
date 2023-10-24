package saifedine.week02.example14;

/*
Erstelle eine Methode welche eine Diagonale von variabler Größe und mit angegebene Zeichen ausgibt,
weiters soll der Parameter backslash angegeben werden können. Wenn backslash wahr ist, soll die Diagonale
von rechts Unten nach Links Oben gehen, ansonsten umgekehrt.

Aufruf:
printSlash('x', 3, true);

Ausgabe:
x
 x
  x

Aufruf:
printSlash('y', 4 false);

Ausgabe:
   y
  y
 y
y

 */

public class PrintSlash {


    public static void main(String[] args) {

        printSlash('x', 3);
    }

    static void printSlash (char value, int size){

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {

            }
            for (int j = 0; j < size; j++) {
                System.out.print(value);
            }
            System.out.println('-');

        }
    }
}
