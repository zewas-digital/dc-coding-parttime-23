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

public class PrintEmptySquare {


    public static void main(String[] args) {

        printEmptySquare('x', 10);
        System.out.println();
        System.out.println();
        printEmptySquare('A', 3);
    }

    static void printEmptySquare(char value, int size) {

        for (int i = 0; i < size; i++) {
            System.out.print(value);
        }
        System.out.println();

        for (int i = 0; i < size - 2 ; i++) {
            for (int j = 0; j < size; j++) {

                if (j == 0){
                    System.out.print(value);
                } else if (j == size - 1) {
                    System.out.print(value);
                }
                else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            System.out.print(value);
        }
    }
}