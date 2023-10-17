package judith.week5;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        printHello();
        printHello();

        String text = "Hello *2";
        print(text);
        System.out.println("main text: "+ text);

        print("text");

        int sum = addition(2,2);
        System.out.println(sum);

        // Referenzierung auf Array-Objekt
        int[] myArray = new int[2];
        myArray[0] = 0;
        myArray[1] = 1;

        int[] copiedArray = myArray;
        changeArray(myArray);

        copiedArray[1] = 30;

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(copiedArray));
    }

    static void changeArray(int[] myArray) {
        myArray[0] = 10;
        myArray[1] = 20;
    }

    static void printHello() {
        String suffix = "*";
        System.out.println("Hello "+ suffix);
    }

    static void print(String text) {
        text = text +" x3";
        System.out.println(text);
    }

    static int addition(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("Ergebnis: "+ sum);

        return sum;
    }
}