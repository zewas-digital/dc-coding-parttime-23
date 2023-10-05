package solutions.volkan.testler;

import java.util.Scanner;

public class Einlesen1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Geben Sie Ihre Name ein...");
        String name = scan1.next();
        int alter = scan1.nextInt();
        System.out.println("Name: " + name + " Alter: " + alter);
    }
}
