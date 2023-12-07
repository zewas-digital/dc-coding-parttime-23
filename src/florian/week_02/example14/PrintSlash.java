package florian.week_02.example14;

/*
Erstelle eine Methode welche eine Diagonale von variabler Größe und mit angegebene Zeichen ausgibt,

  x

Aufruf:
printSlash('y', 4 false);
printSlash('y', 4, false);

Ausgabe:
   y


 */
public class PrintSlash {
    public static void main(String[] args) {
        printSlash('x', 3, true);
    }

    static void printSlash(char value, int size, boolean backslash) {
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(value);
            }
        }
        System.out.println();
    }

}

