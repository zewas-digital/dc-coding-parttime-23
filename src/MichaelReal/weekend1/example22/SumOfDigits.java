/*
Dieses Programm soll die Ziffernsumme für jede Zahl innerhalb bestimmten Intervalls bilden und jeweils auf der Console ausgeben.
 */

package solutions.michaelreal.weekend1.example22;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib den Startwert des Intervalls ein");
        int start = scanner.nextInt();

        System.out.print("Gib den Endwert des Intervalls ein");
        int end = scanner.nextInt();

        scanner.close();

        if (start > end) {
            System.out.println("Ungültig. Der Startwert sollte kleiner sein als der Endwert");
            return;
        }

        System.out.println("Ziffersumme für den Intervall von " + start + " bis " + end + ":");

        for (int nummer = start; nummer <= end; nummer++) {
            int ziffernsumme = berechneziffernsumme(nummer);
            System.out.println("ziffernsumme von " + nummer + " : " + berechneziffernsumme(nummer));

        }
    }

    public static int berechneziffernsumme(int nummer) {
        int sum = 0;
        while (nummer != 0) {
            sum += nummer % 10;
            nummer /= 10;

        }
        return sum;
    }
}
