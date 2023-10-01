package solutions.judith.weekend1.example26;
/*
Bisher haben wir beispielsweise die Größe eines Rechtecks direkt im Code definiert.
Jetzt soll das Beispiel so abgeändert werden, dass die Größe des Rechtecks von der Console eingelesen wird.
Wiederhole das Refactoring für einige andere Beispiele.
*/

import java.sql.SQLOutput;

import java.util.Scanner;

import java.util.Scanner;
public class Refactor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte Trage die horizontale Reihe ein: ");
        int horizontale = scan.nextInt();

        System.out.println("Bitte Trage die vertikale ein: ");
        int vertikale = scan.nextInt();


        for (int i = 0; i < horizontale; i++) {
            for (int j = 0; j < vertikale; j++) {
                System.out.print("x");
            }
            System.out.println();


        }
    }
}