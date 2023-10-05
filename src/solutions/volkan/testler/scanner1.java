package solutions.volkan.testler;

import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        char geschlecht = scanner.nextLine().charAt(0);
        int age = scanner.nextInt();
        long mobilenummer = scanner.nextLong();

        System.out.println("Name: " + name);
        System.out.println("Geschlecht: " + geschlecht);
        System.out.println("Alter: " + age);
        System.out.println("Mobile Nummer: " + mobilenummer);
    }
}
