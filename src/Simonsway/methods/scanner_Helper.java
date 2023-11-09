package Simonsway.methods;

import java.util.Scanner;

public class scanner_Helper {

    public static int scannerHelperInt (String message){

        Scanner scanner = new Scanner(System.in);

        int input = 0;

        try{
            input = scanner.nextInt();
        }
        catch (Exception exception){
            System.out.println(message);
        }
        return input;
    }
}
