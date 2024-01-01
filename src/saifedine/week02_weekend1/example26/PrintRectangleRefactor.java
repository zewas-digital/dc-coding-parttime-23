/*
Bisher haben wir beispielsweise die Größe eines Rechtecks direkt im Code definiert.
Jetzt soll das Beispiel so abgeändert werden, dass die Größe des Rechtecks von der Console eingelesen wird.
Wiederhole das Refactoring für einige andere Beispiele.
*/

package saifedine.week02_weekend1.example26;

import java.util.Scanner;

public class PrintRectangleRefactor {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Breite des Rechtecks an: ");
        int breite = eingabe.nextInt();
        System.out.println("Die Breite ist: " + breite);
        System.out.println();
        System.out.println("Bitte geben Sie die Höhe des Rechtecks an: ");
        int hoehe = eingabe.nextInt();
        System.out.println("Die Höhe ist: " + hoehe);

        printRectangle(breite, hoehe);
        System.out.println();

        printEmptyRectangle(breite, hoehe);
        System.out.println();
    }

    public static void printRectangle (int breite, int hoehe){

        char zeichen = 'x';

        for (int i = 0; i < hoehe; i++) {
            System.out.println();
            for (int j = 0; j < breite; j++) {
                System.out.print(zeichen);
            }
        }
        System.out.println();
    }

    private static void printEmptyRectangle(int breite, int hoehe) {

        char zeichen = 'x';

        for (int i = 0; i < breite; i++) {
            System.out.print(zeichen);
        }
        System.out.println();
        for (int j = 0; j < hoehe - 2; j++) {
            for (int i = 0; i < breite; i++) {
                if (i == 0){
                    System.out.print(zeichen);
                }
                else if (i > 0 && i < breite - 1) {
                    System.out.print(" ");
                }
                else {
                    System.out.println(zeichen);
                }
            }
        }
        for (int i = 0; i < breite; i++) {
            System.out.print(zeichen);
        }
    }
}