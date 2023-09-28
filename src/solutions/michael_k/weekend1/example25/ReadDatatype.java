/*
Schreibe ein Programm, mit dem du die verschiedenen Datentypen (int, long, double, float, String und char) von der Console einließt und in eine Variable speicherst.

Eine Übersicht der primitiven Datentypen findest du hier: https://de.wikibooks.org/wiki/Java_Standard:_Primitive_Datentypen
*/

package solutions.michael_k.weekend1.example25;
import java.util.Scanner;
public class ReadDatatype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib einen int-Wert ein:");
        int wert1 = scanner.nextInt();
        System.out.println("Eingabe: "+wert1);

        System.out.println("Gib einen long-Wert ein:");
        long wert2 = scanner.nextLong();
        System.out.println("Eingabe: "+wert2);

        System.out.println("Gib einen double-Wert ein:");
        double wert3 = scanner.nextDouble();
        System.out.println("Eingabe: "+wert3);

        System.out.println("Gib einen float-Wert ein:");
        float wert4 = scanner.nextFloat();
        System.out.println("Eingabe: "+wert4);

        System.out.println("Gib einen String-Wert ein:");
        String wert5 = scanner.next();
        System.out.println("Eingabe: "+wert5);

        System.out.println("Gib einen Int-Wert ein:");
        char wert6 = scanner.next().charAt(0);
        System.out.println("Eingabe: "+wert6);


    }
}
