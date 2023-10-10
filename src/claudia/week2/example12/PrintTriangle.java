package solutions.claudia.week2.example12;
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

     /*   System.out.println("TriangleBottomLeft");
        printTriangleBottomLeft('*', 4);
        System.out.println("TriangleTopLeft");
        printTriangleTopLeft('*', 4);*/
        System.out.println("TriangleTopRight");
        printTriangleTopRight('*', 4);
        System.out.println("TriangleTopRight mit if-Condition anstelle von for-Schleife");
        printTriangleTopRight2('*', 4);
        System.out.println("TriangleBottomRight");
        printTriangleBottomRight('*', 4);
        System.out.println("TriangleBottomRight mit if-Condition anstelle von for-Schleife");
        printTriangleBottomRight2('*', 4);
    }
    static void printTriangleBottomLeft(char c, int size){
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    static void printTriangleTopLeft(char c, int size){
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    //TriangleTopRight mit drei For-Schleifen
    static void printTriangleTopRight(char c, int size){
        for (int i = 0; i < size; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < size-i; k++) {
                    System.out.print(c);
                }
            System.out.println();
        }
    }
    //TriangleTopRight mit zwei For-Schleifen und einer if-Condition
    static void printTriangleTopRight2(char c, int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j < i) System.out.print(" ");
                else System.out.print(c);
            }
            System.out.println();
        }
    }
    //TriangleBottomRight mit drei For-Schleifen
    static void printTriangleBottomRight(char c, int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    //TriangleBottomRight mit zwei For-Schleifen und einer if-condition
    static void printTriangleBottomRight2(char c, int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size ; j++) {
                if (j < size - i) System.out.print(" ");
                else System.out.print(c);
            }
            System.out.println();
        }
    }

}
