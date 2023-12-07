package solutions.florian.week2.example12;
/*
Erstellen Sie vier Methoden welche ein Dreieck mit variabler Größe und mit angegebenem Zeichen ausgibt.
Die Methode hat 2 Übergabeparameter und keinen Rückgabeparameter. Für jede Methode soll es eine andere Ausrichtung geben.

 */

public class PrintTriangle {

    public static void main(String[] args) {
        printTriangleBottomLeft('x', 4);
        printTriangleTopLeft('x', 5);
        printTriangleTopRight('x', 5);
        printTriangleBottomRight('x', 5);
    }
    static void printTriangleBottomLeft(char value, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    static void printTriangleTopLeft (char value, int size) {
        for (int i = size; i > 0; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }
    static void printTriangleTopRight(char value, int size){
        for (int i = size; i > 0; i--) {
            for (int l = 0; l < size - i; l++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }
    static void printTriangleBottomRight(char value, int size){
        for (int i = 0; i < size; i++) {
            for (int l = 1; l < size - i; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(value);
            }
            System.out.println();
        }
    }
}

