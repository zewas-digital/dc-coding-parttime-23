package saifedine.week02.example12;
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

        char zeichen = 'x';
        int size = 5;

        printTriangleBottomLeft1('x', 4);
        System.out.println(":::::::::::::::::::::::::::::::");
        printTriangleBottomLeft2('x', 4);
        System.out.println(":::::::::::::::::::::::::::::::");
        printTriangleTopLeft1('x', 5);
        System.out.println(":::::::::::::::::::::::::::::::");
        printTriangleTopLeft2('x', 5);
        System.out.println(":::::::::::::::::::::::::::::::");
        printTriangleTopRight1('x', 5);
        System.out.println(":::::::::::::::::::::::::::::::");
        printTriangleTopRight2('x', 5);
        System.out.println(":::::::::::::::::::::::::::::::");
        printTriangleBottomRight1('x', 5);
        System.out.println(":::::::::::::::::::::::::::::::");
        printTriangleBottomRight2('x', 5);

    }

    public static void printTriangleBottomLeft1(char zeichen, int size){

        String value = String.valueOf(zeichen);

        for (int i = 1; i <= size; i++) {
            System.out.print(value.repeat(i));
            for (int j = 0; j < size; j++) {
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomLeft2(char zeichen, int size){

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(zeichen);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft1(char zeichen, int size){

        String value = String.valueOf(zeichen);

        for (int i = size; i > 0 ; i--) {
            System.out.print(value.repeat(i));
            for (int j = 0; j < size; j++) {
            }
            System.out.println();
        }
    }

    public static void printTriangleTopLeft2(char zeichen, int size){

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(zeichen);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopRight1(char zeichen, int size){

        String value = String.valueOf(zeichen);

        for (int i = 0; i < size; i++) {
            System.out.print(" ".repeat(i));
            for (int j = 0; j < size - i; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printTriangleTopRight2(char zeichen, int size){

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print(zeichen);
                }
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight1(char zeichen, int size){

        String value = String.valueOf(zeichen);

        for (int i = size; i > 0; i--) {
            System.out.print(" ".repeat(i - 1));
            for (int j = 0; j <= size - i; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printTriangleBottomRight2(char zeichen, int size){

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j < 5 - i){
                    System.out.print(" ");
                } else {
                    System.out.print(zeichen);
                }
            }
            System.out.println();
        }
    }
}