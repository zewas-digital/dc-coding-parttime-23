package solutions.volkan.testler;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        //Klasse
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eintippen....");
        double zahl = scan.nextDouble();
        System.out.println("Ihre Zahl lautet: " + zahl);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Geben Sie Ihren Namen ein: ");
        String zeichenkette = scan2.next();
        System.out.println("Bitte geben Sie Ihr Alter ein: ");
        int alter = scan2.nextInt();

        System.out.println("Ihr Name: " + zeichenkette +  "Ihr Alter: " + alter);



    }
}
