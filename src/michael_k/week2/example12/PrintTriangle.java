package solutions.michael_k.week2.example12;
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
    public static void main(String[] args){

        printobenlinks('X',4);
        System.out.println();
        printuntenlinks('X',4);
        System.out.println();
        printuntenrechts('X',4);
        System.out.println();
        printobenrechts('X',4);
    }
    static void printobenlinks( char buchstabe, int größe) {
        int k = größe;
        for (int i = 0; i <größe; i++) {
            k--;
            for ( int j = 0;  j<=k ; j++) {
                System.out.print(buchstabe);
            }
            System.out.println();
        }
    }

    static void printuntenlinks( char buchstabe, int größe) {
        int k = -1;
        for (int i = 0; i <größe; i++) {
            k++;
            for ( int j = 0;  j<=k ; j++) {
                System.out.print(buchstabe);
            }

            System.out.println();
        }
    }
    static void printuntenrechts( char buchstabe, int größe) {
        int l = 0;
        int m = größe;

        for (int i = 0; i <größe; i++) {

            for (int k = größe-1; k!=l; k--) {
                System.out.print(" ");
            }
            for (int j = größe+1; j != m; j--) {
                System.out.print(buchstabe);
            }
            System.out.println();
            l++;
            m--;
        }
    }
    static void printobenrechts( char buchstabe, int größe) {
        int l = größe;
        int m = 0;

        for (int i = 0; i <=größe; i++) {

            for (int k = größe; k!=l; k--) {
                System.out.print(" ");
            }
            for (int j = größe; j != m; j--) {
                System.out.print(buchstabe);
            }

            System.out.println();
            l--;
            m++;
        }
    }

}
