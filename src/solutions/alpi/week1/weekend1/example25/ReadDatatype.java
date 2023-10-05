/*
Schreibe ein Programm, mit dem du die verschiedenen Datentypen (int, long, double, float, String und char) von der Console einließt und in eine Variable speicherst.

Eine Übersicht der primitiven Datentypen findest du hier: https://de.wikibooks.org/wiki/Java_Standard:_Primitive_Datentypen
*/

package solutions.alpi.week1.weekend1.example25;

import java.util.Scanner;

public class ReadDatatype {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("a1 Gib eine Ganzzahl (int) ein:  ");
                int intValue = scanner.nextInt();

                System.out.print("a2 Gib eine lange Ganzzahl (long) ein: ");
                long longValue = scanner.nextLong();

                System.out.print("a3 Gib eine Fließkommazahl (double) ein: ");
                double doubleValue = scanner.nextDouble();

                System.out.print("a4 Gib eine Fließkommazahl (float) ein: " );
                float floatValue = scanner.nextFloat();

                scanner.nextLine();

                System.out.print("a5 Gib einen Text (String) ein: ");
                String stringValue = scanner.nextLine();

                System.out.print("a6 Gib ein Zeichen (char) ein: ");
                char charValue = scanner.nextLine().charAt (0);



                System.out.println("Eingelesene Werte:");
                System.out.println("int: " + intValue);
                System.out.println("long: " + longValue);
                System.out.println("double: " + doubleValue);
                System.out.println("float: " + floatValue);
                System.out.println("String: " + stringValue);
                System.out.println("char: " + charValue);





            }
        }




