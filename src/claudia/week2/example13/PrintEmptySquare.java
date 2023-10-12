package solutions.claudia.week2.example13;


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
        printEmptySquare('A', 3);
    }
    static void printEmptySquare(char c, int size){
        //erste Zeile
        for (int i = 0; i < size; i++) {
            System.out.print(c);
        }
        System.out.println();
        //Mittelteil
        for (int i = 1; i < size-1; i++) {
            System.out.print(c);
            for (int j = 1; j < size-1; j++) {
                System.out.print(" ");
            }
            System.out.print(c);
            System.out.println();
        }
        //letzte Zeile
        for (int i = 0; i < size; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
