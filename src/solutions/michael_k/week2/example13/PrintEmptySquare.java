package solutions.michael_k.week2.example13;


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
    public static void main(String[] args){

        printRect('X',4);
    }
    static void printRect( char buchstabe, int größe) {
        for (int i = 1; i <=größe; i++) {
            System.out.print(buchstabe);
        }
        System.out.println();
        for (int i = 2; i <größe; i++) {
            System.out.print(buchstabe);
            for (int j = 2; j <größe; j++) {
                System.out.print(" ");
            }
            System.out.print(buchstabe);
            System.out.println();
        }
        for (int i = 1; i <=größe; i++) {
            System.out.print(buchstabe);
        }
    }
}
