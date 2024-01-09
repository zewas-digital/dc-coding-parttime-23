package saifedine.week02.example13;

/*
Erstellen Sie eine Methode welche ein Quader mit variabler Größe und mit angegebenem Zeichen ausgibt. Der Quader soll innerhalb leer sein.

Diese Methode soll mit zwei verschiedenen Aufrufen getestet werden.
Aufruf:
printEmptySquare('x', 10);

Ausgabe:
xxxxxxxxxx
x        x
x        x
x        x
x        x
x        x
x        x
x        x
x        x
xxxxxxxxxx

Aufruf:
printEmptySquare('A', 3);

Ausgabe:
AAA
A A
AAA

 */

// Methode: printEmptySquare('x', 10) & printEmptySquare('A', 3);

public class PrintEmptySquare {

    public static void main(String[] args) {

        printEmptySquare('x', 10);
        System.out.println();
        printEmptySquare('A', 3);
    }

    public static void printEmptySquare(char zeichen, int hoehe){

        // 1. Zeile
        for (int i = 0; i < hoehe; i++) {
            System.out.print(zeichen);
        }
        System.out.println();
        // alle Zeilen nach der 1. Zeile und vor der letzten Zeile
        for (int i = 0; i < hoehe - 2; i++) {
            for (int j = 0; j < hoehe; j++) {
                if (j == 0) {
                    System.out.print(zeichen);
                } else if (j == hoehe - 1) {
                    System.out.print(zeichen);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // letzte Zeile
        for (int i = 0; i < hoehe; i++) {
            System.out.print(zeichen);
        }
    }
}