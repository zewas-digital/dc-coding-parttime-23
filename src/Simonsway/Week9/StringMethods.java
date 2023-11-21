package Simonsway.Week9;

public class StringMethods {

    public static void printLine(int length) {
        String character = "–";

        try {
            System.out.println(character.repeat(length));
        } catch (Exception exception) {
            // do nothing
        }
    }
}
