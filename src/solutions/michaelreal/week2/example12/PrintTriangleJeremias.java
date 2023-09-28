package solutions.michaelreal.week2.example12;
/*
Erstellen Sie vier Methoden welche ein Dreieck mit variabler Größe und mit angegebenem Zeichen ausgibt.
Die Methode hat 2 Übergabeparameter und keinen Rückgabeparameter. Für jede Methode soll es eine andere Ausrichtung geben.
Die Ausrichtungen sind zuerst einmal Links und Rechts und oben und unten.

Methode 1:
    Aufruf:
    printTriangleBottomLeft('x', 4)

    Ausgabe:
    x
    xx
    xxx
    xxxx

Methode 2:
    Aufruf:
    printTriangleTopLeft('x', 5)

    Ausgabe:
    xxxxx
    xxxx
    xxx
    xx
    x

Methode 3:
    Aufruf:
    printTriangleTopRight('x', 5)

    Ausgabe:
    xxxxx
     xxxx
      xxx
       xx
        x

Methode 4:
    Aufruf:
    printTriangleBottomRight('x', 5)

    Ausgabe:
        x
       xx
      xxx
     xxxx
    xxxxx

 */
public class PrintTriangleJeremias {

    public static void main(String[] args) {
        printTriangleBottomLeft('x', 4);
        printTriangleTopLeft('x', 4);
        printTriangleBottomRight('x', 4);
        printTriangleTopRight('x', 4);
    }

    static void printTriangleBottomLeft(char value, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i +1; j++) {
                System.out.print(value);
            }
            System.out.println();

        }
    }

    static void printTriangleTopLeft(char value, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(value);
            }
            System.out.println();

        }
    }

    static void printTriangleBottomRight(char value, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(size - j > i +1 ) {
                    System.out.print(" ");
                } else {
                    System.out.print(value);
                }

            }
            System.out.println();

        }
    }

    static void printTriangleTopRight(char value, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(size - i < size - j) {
                    System.out.print(" ");
                } else {
                    System.out.print(value);
                }
            }
            System.out.println();
        }
    }
}
