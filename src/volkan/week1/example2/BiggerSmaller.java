package volkan.week1.example2;

/*
Schreiben Sie ein Programm, das eine Variable definiert ausgibt, ob die Zahl größer, kleiner oder gleich,
als die Zahl 10 ist. Verwende dazu Verzweigungen von if, if else und else.

Die Zahl wird wieder mit Scanner und nextInt() eingelesen.
 */

import java.util.Scanner;

public class BiggerSmaller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl = 11;

        System.out.print("Gib ein Zahl ein: ");
        if (zahl < scanner.nextInt()) {
            System.out.println("Größer");
        }
            else if (zahl > scanner.nextInt()) {
                System.out.println("Kleiner");
            }

    }
}

