package Matthias.week2;
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

public class example_13_PrintEmptySquare {

    static void printEmptySquare(char buchstabe, int seitenlänge){

        for (int i = 0; i < seitenlänge  ; i++) {
            System.out.print("Zeile: " + i +" ");

            for (int j = 0; j < seitenlänge ; j++) {

                if (i == seitenlänge-1) {
                    System.out.print(buchstabe);
                }else if (i == 0) {
                    System.out.print(buchstabe);
                } else if (j==seitenlänge-1) {
                    System.out.print(buchstabe);
                }else if (j==0) {
                    System.out.print(buchstabe);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        printEmptySquare('x', 10);
        printEmptySquare('A', 3);
    }

}
