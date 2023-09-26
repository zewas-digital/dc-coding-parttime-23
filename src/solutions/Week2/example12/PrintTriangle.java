package solutions.alpi.week1.example12;
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

public class PrintTriangle {
    public static void main(String[] args) {
        printTriangleBottomLeft('x', 4);
        System.out.println();
        printTriangleTopLeft('x', 5);
        System.out.println();
        printTriangleTopRight('x', 5);
        System.out.println();
        //printTriangleBottomRight('x', 5)


    }

    static void printTriangleBottomLeft(char x, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(x);

            }
            System.out.println();

        }

    }

    static void printTriangleTopLeft(char x, int size) {


        for (int i = 0; i < size; i++) {
            for (int j = 6; j > i + 1; j--) {
                System.out.print(x);


            }
            System.out.println();

        }
    }

    static void printTriangleTopRight(char x, int size) {

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < i  ; k++) {
                System.out.print(" ");
            }
            for (int j = 6; j > i +1; j--) {



                System.out.print(x);


            }
            System.out.println();

        }

    }static void printTriangleBottomRight (char x , int size){

        //for (int i = 0; i < ; i++) {

        }
    }



