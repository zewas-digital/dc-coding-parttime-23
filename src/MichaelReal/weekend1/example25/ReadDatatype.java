/*
Schreibe ein Programm, mit dem du die verschiedenen Datentypen (int, long, double, float, String und char) von der Console einließt und in eine Variable speicherst.

Eine Übersicht der primitiven Datentypen findest du hier: https://de.wikibooks.org/wiki/Java_Standard:_Primitive_Datentypen
*/

package MichaelReal.weekend1.example25;

import java.util.Arrays;
import java.util.Scanner;

public class ReadDatatype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Gib einen int wert ein");
        int intvar = scanner.nextInt();

        System.out.print("Gib einen long wert ein");
        long longvar = scanner.nextLong();

        System.out.print("Gib einen double wert ein");
        double doublevar = scanner.nextDouble();

        System.out.print("Gib einen float wert ein");
        float floatvar = scanner.nextFloat();

        scanner.nextLine();

        System.out.print("Gib einen String wert ein");
        String stringvar = scanner.next();

        System.out.println("Alle eingegebenen Werte");
        System.out.println("int: " + intvar);
        System.out.println("long: " + longvar);
        System.out.println("double: " + doublevar);
        System.out.println("float: " + floatvar);
        System.out.println("String: " + stringvar);

        scanner.close();


    }
}
