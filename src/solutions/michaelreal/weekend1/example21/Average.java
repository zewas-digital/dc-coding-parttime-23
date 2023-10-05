/*
Erstelle ein Programm, das den Durschnittswert für alle Zahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.michaelreal.weekend1.example21;

import java.util.Scanner;

public class Average {
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

        int sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
            count++;

        }

        double durchschnitt = (double) sum / count;

        System.out.println("Durchschnittswert für den Intervall von " + start + " bis " + end + ": " + durchschnitt);
    }
}
