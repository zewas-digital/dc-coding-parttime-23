package claudia.week8_arrays;
/*
Wenn wir die Zahlen Diagonal lesen, bekommen wir die Koeffizienten von (a+b)^n

Zum Beispiel:

(a+b)2 = a2 + 2ab + b2

(a+b)3 = a3 + 3a2b + 3ab2 + b3

Frage den Anwender, welche Formular er braucht, und gib die konkrete Formel in der Konsole aus. Verwende ^ für die Darstellung des Exponenten.

 */

import java.util.Arrays;
import java.util.Scanner;

public class Array_13_Binomial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zeige binomische Formel (a + b) ^ n = ???");
        System.out.print("Wie groß soll n sein? Bitte eingeben: ");

        int exponent = sc.nextInt();
        int size = exponent + 1;
        int[][] pascal = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else if (i > 0) {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }
        int[] binomi = pascal[size - 1];
        //System.out.println(Arrays.toString(binomi));

        System.out.println("Hier ist Deine Formel: ");
        if (exponent == 0) System.out.println("(a + b) ^ 0 = 1");

        else {
            System.out.print("(a + b) ^ " + exponent + " = ");

            for (int i = exponent; i >= 0; i--) {
                if (binomi[size - 1 - i] != 1) System.out.print(binomi[size - 1 - i] + " * ");
                if (i != 0) System.out.print("a");
                if (i != 0 && i != 1) System.out.print(" ^ " + i);
                if (i != 0 && exponent - i != 0) System.out.print(" * ");
                if (exponent - i != 0) System.out.print("b");
                if (exponent - i != 0 && exponent - i != 1) System.out.print(" ^ " + (exponent - i));
                if (i > 0) System.out.print(" + ");
            }
        }
    }
}
