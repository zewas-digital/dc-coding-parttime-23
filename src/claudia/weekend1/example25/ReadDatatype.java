/*
Schreibe ein Programm, mit dem du die verschiedenen Datentypen (int, long, double, float, String und char) von der Console einliest und in eine Variable speicherst.

Eine Übersicht der primitiven Datentypen findest du hier: https://de.wikibooks.org/wiki/Java_Standard:_Primitive_Datentypen
*/

package claudia.weekend1.example25;

import java.util.Scanner;
public class ReadDatatype {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib Int ein: ");
        int zahl1 = scanner.nextInt();
        System.out.print("Gib noch eine ganze Zahl ein: ");
        long zahl2 = scanner.nextLong();
        System.out.print("Gib rationale Zahl ein: ");
        float zahl3 = scanner.nextFloat();
        System.out.print("Gib noch eine rationale Zahl ein: ");
        double zahl4 = scanner.nextDouble();
        System.out.print("Jetzt einen Text: ");
        String text = scanner.next();
        System.out.print("Und ein einzelnes Zeichen: ");
        char zeichen = scanner.next().charAt(0);

        System.out.println("Hier Deine Daten: " + zahl1 + " " + zahl2 + " " + zahl3 + " " + zahl4 + " " + text + " " + zeichen);

    }
}
