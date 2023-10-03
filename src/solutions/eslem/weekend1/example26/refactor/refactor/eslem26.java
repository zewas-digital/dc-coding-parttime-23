/*
Bisher haben wir beispielsweise die Größe eines Rechtecks direkt im Code definiert.
Jetzt soll das Beispiel so abgeändert werden, dass die Größe des Rechtecks von der Console eingelesen wird.
Wiederhole das Refactoring für einige andere Beispiele.
*/


package solutions.eslem.weekend1.example26.refactor.refactor;

import java.util.Scanner;

public class eslem26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("gib eine Nummer (int) ein: ");
        int Value = scanner.nextInt();
        printRect('x', Value, Value);
    }

        static void printRect ( char value, int size, int length){
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(value);
                }
                System.out.println();
            }
        }
    }

