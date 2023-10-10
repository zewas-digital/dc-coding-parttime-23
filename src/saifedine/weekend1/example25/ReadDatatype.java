/*
Schreibe ein Programm, mit dem du die verschiedenen Datentypen (int, long, double, float, String und char - ohne char) von der Console einließt und in eine Variable speicherst.

Eine Übersicht der primitiven Datentypen findest du hier: https://de.wikibooks.org/wiki/Java_Standard:_Primitive_Datentypen
*/

package solutions.saifedine.weekend1.example25;

import java.util.Scanner;

public class ReadDatatype {
    public static void main(String[] args) {

        /*
        https://codegree.de/java-datentypen-der-grosse-guide/
         */

        Scanner Eingabe = new Scanner(System.in);

        System.out.println("Gib bitte eine - Java int: Ganze Zahlen in Java - ein: ");
        int intValue = Eingabe.nextInt();

        System.out.println("Gib bitte eine - Java Long: Sehr große Ganzzahlen - ein: ");
        long longValue = Eingabe.nextLong();

        System.out.println("Gib bitte eine - Kommazahlen II: Java double - ein: ");
        double doubleValue = Eingabe.nextDouble();

        System.out.println("Gib bitte eine - Kommazahlen I: Java float - ein: ");
        float floatValue = Eingabe.nextFloat();

        System.out.println("Gib bitte eine - Java String: Zeichenkette wie Wörter oder Sätze - ein: ");
        String stringValue = Eingabe.next();

        System.out.println("Eingelesene Werte:");
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("double: " + doubleValue);
        System.out.println("float: " + floatValue);
        System.out.println("String: " + stringValue);

    }
}
