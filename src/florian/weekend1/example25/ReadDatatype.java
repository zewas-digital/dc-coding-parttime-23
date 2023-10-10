/*
Schreibe ein Programm, mit dem du die verschiedenen Datentypen (int, long, double, float, String und char) von der Console einließt und in eine Variable speicherst.

Eine Übersicht der primitiven Datentypen findest du hier: https://de.wikibooks.org/wiki/Java_Standard:_Primitive_Datentypen
*/

package solutions.florian.weekend1.example25;

import java.util.Scanner;

public class ReadDatatype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gib deinen Namen ein:");
        String name = scanner.next();

        System.out.println("Bitte gib dein Alter ein");
        int alter = scanner.nextInt();

        System.out.println("Gib eine Zahl ein: ");
        long nummer= scanner.nextLong();

        System.out.println("Gib eine 2 Stellige Kommazahl ein: ");
        float nummer2 = scanner.nextFloat();

        System.out.println("Gib eine 4 Stellige Kommazahl ein: ");
        double nummer3 = scanner.nextDouble();
    }
}
