package claudia.week11_strings;

public class Strings_8_ReplaceAll {
    static String text = "Heute wird ein guter Tag! Heute wird ein noch besserer Tag! Heute wird ein spitzen guter Tag!";

    public static void main(String[] args) {
        /*Aufgabe 1: Ersetze im String
        "Heute wird ein guter Tag! Heute wird ein noch besserer Tag! Heute wird ein spitzen guter Tag!"
        "wird" durch "war und ist" und gib ihn aus.
        */
        System.out.println("\n\nUrsprünglicher Text: " + text);
        System.out.println("\nAufgabe 1: " + text.replaceAll("wird", "war und ist"));

        /*
        Aufgabe 2: Lösche im String
        "Heute wird ein guter Tag! Heute wird ein noch besserer Tag! Heute wird ein spitzen guter Tag!"
        + Jeden Kleinbuchstaben und gib ihn aus
        + Jeden Großbuchstaben und gib ihn aus
        + Jedes Leerzeichen und gib ihn aus
        + Jedes Ausrufezeichen ! und gib ihn aus
        */

        System.out.println("\nAufgabe 2: Lösche jeden Kleinbuchstaben: ");
        System.out.println(text.replaceAll("[a-z]",""));
        System.out.println("\nAufgabe 2: Lösche jeden Großbuchstaben: ");
        System.out.println(text.replaceAll("[A-Z]",""));
        System.out.println("\nAufgabe 2: Lösche jedes Leerzeichen: ");
        System.out.println(text.replaceAll(" ",""));
        System.out.println("\nAufgabe 2: Lösche jedes Ausrufezeichen: ");
        System.out.println(text.replaceAll("!",""));

        /*
        Aufgabe 3: -------------------
        Lösche im String

        "749813247132984712039487123049871204398712039487"

        + Alle Zahlen von 0 bis 9 und gib ihn aus
        + Alle Zahlen von 1 bis 9 und gib ihn aus
        + Alle Zahlen von 2 bis 4 und gib ihn aus
        + Alle Zahlen von 1 bis 3 und 6 bis 9 und gib ihn aus
        */

        System.out.println("\nAufgabe 3 - String aus Zahlen, Original: ");
        String numbers = "749813247132984712039487123049871204398712039487";
        System.out.println(numbers);
        System.out.println("\nAufgabe 3: Lösche alle Zahlen von 0 bis 9 (Haha!):");
        System.out.print("Ergebnis: ");
        System.out.println(numbers.replaceAll("[0-9]",""));
        System.out.println("\nAufgabe 3: Lösche alle Zahlen von 1 bis 9:");
        System.out.println(numbers.replaceAll("[1-9]",""));
        System.out.println("\nAufgabe 3: Lösche alle Zahlen von 2 bis 4:");
        System.out.println(numbers.replaceAll("[2-4]",""));
        System.out.println("\nAufgabe 3: Lösche alle Zahlen von 1 bis 3 und 6 bis 9:");
        System.out.println(numbers.replaceAll("[1-3[6-9]]",""));

    }

}
