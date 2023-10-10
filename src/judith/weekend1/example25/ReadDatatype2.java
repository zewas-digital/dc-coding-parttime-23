package solutions.judith.weekend1.example25;

import java.util.Scanner;

public class ReadDatatype2 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Das zweite Wort ist der Scanner Name kann ich frei wählen

        System.out.println("Bitte Tippe eine Zahl ein: ");
        int zahl1 = scan.nextInt(); // Hier sage ich zuerst dem scanner ob es ein int oder long etc ist, danch die variable
        System.out.println("Deine Zahl ist: " + zahl1);

        System.out.println("Bitte trage eine long ein: ");
        long long1 = scan.nextLong();
        System.out.println("Dein Long ist: " + long1);

        System.out.println("Bitte trage einen double ein: ");
        double double1 = scan.nextDouble();
        System.out.println("Dein Double ist: " +double1);

        System.out.println("Bitte trage dein float ein:");
        float float1 = scan.nextFloat();
        System.out.println("Dein Float ist: " + float1);

        System.out.println("Bitte trage dein String ein: ");
        String string1 = scan.next();
        System.out.println("Dein String ist: " + string1);


    }
}
