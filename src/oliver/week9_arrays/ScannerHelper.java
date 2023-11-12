package oliver.week9_arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerHelper {
    public static int readNumber(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                return sc.nextInt();
            } catch (Exception exception) {
                System.out.println("Das ist keine gültige Zahl. Exception:"+ exception.toString());
                sc.nextLine();
            }
        }
    }
}