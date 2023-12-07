/*
Bisher haben wir beispielsweise die Größe eines Rechtecks direkt im Code definiert.
Jetzt soll das Beispiel so abgeändert werden, dass die Größe des Rechtecks von der Console eingelesen wird.
Wiederhole das Refactoring für einige andere Beispiele.
*/


package solutions.florian.weekend1.example26;

import java.util.Scanner;

public class Refactor {
    public static void main(String[] args) {
        // Beispiel 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein:");
        int size = scanner. nextInt();
        printSquare('x',size);

        //Beispiel 2
        System.out.println("Gib eine Zahl ein:");
        int scannerlength = scanner.nextInt();
        System.out.println("Gib eine weitere Zahl ein");
        int scannerwidth = scanner.nextInt();
        printRect('x',scannerlength,scannerwidth);
    }
    static void printSquare(char value, int scanner) {
        for (int i = 0; i < scanner; i++) {
            for (int j = 0; j < scanner; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    static void printRect(char value,int scannerlenght,int scannerwidth ) {
        for (int i = 0; i < scannerlenght; i++) {
            for (int j = 0; j < scannerwidth; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}