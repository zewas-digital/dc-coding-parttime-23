/*
Schreibe ein Programm, mit dem du die verschiedenen Datentypen (int, long, double, float, String und char) von der Console einließt und in eine Variable speicherst.

Eine Übersicht der primitiven Datentypen findest du hier: https://de.wikibooks.org/wiki/Java_Standard:_Primitive_Datentypen
*/

package solutions.eslem.example25;

import java.util.Scanner;

public class ReadDatatype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("gib eine Ganzzahl (int) ein: ");
        int Value = scanner.nextInt();

        System.out.println("gib eine lange Ganzzahl (long) ein: ");
        long longValue = scanner.nextLong();

        System.out.println("gib eine Kommazahl (double) ein: ");
        double doubleValue = scanner.nextDouble();

        System.out.println("gib eine Fließkommazahl (float) ein: ");
        float floatValue = scanner.nextFloat();

        scanner.nextLine();

        System.out.println("gib einen Text (String) ein:");
        String stringValue = scanner.nextLine();

        System.out.println("gib einen Zeichen (char) ein: ");
        char charValue = scanner.nextLine().charAt(0);
    }
}
