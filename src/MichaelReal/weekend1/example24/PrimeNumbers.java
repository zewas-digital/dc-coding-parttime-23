/*
Erstelle ein Programm, dass als Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package MichaelReal.weekend1.example24;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbers {
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

        System.out.println("Primzahlen im Intervall von " + start + " bis " + end + ":");
        for (int nummer = start; nummer <= end; nummer++) {
            if (istprim(nummer)) {
                System.out.print(nummer + " ");
            }
        }
    }

    public static boolean istprim(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
    return true;
    }
}
