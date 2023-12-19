package michael_k.week11;

/*
Aufgabe 1: -------------------
Ersetze im String

"Heute wird ein guter Tag! Heute wird ein noch besserer Tag! Heute wird ein spitzen guter Tag!"

+ wird durch war und ist und gib ihn aus.


Aufgabe 2: -------------------
Lösche im String

"Heute wird ein guter Tag! Heute wird ein noch besserer Tag! Heute wird ein spitzen guter Tag!"

+ Jeden Kleinbuchstaben und gib ihn aus
+ Jeden Großbuchstaben und gib ihn aus
+ Jedes Leerzeichen und gib ihn aus
+ Jedes Ausrufezeichen ! und gib ihn aus


Aufgabe 3: -------------------
Lösche im String

"749813247132984712039487123049871204398712039487"

+ Alle Zahlen von 0 bis 9 und gib ihn aus
+ Alle Zahlen von 1 bis 9 und gib ihn aus
+ Alle Zahlen von 2 bis 4 und gib ihn aus
+ Alle Zahlen von 1 bis 3 und 6 bis 9 und gib ihn aus
 */

public class Strings_8_ReplaceAll {
    static String text = "Heute wird ein guter Tag! Heute wird ein noch besserer Tag! Heute wird ein spitzen guter Tag!";

    public static void main(String[] args) {


        String numbers = "749813247132984712039487123049871204398712039487";
        System.out.println("numbers ohne 0-9: "+ numbers.replaceAll("[0-9]", ""));
        System.out.println("numbers ohne 1-9: "+ numbers.replaceAll("[1-9]", ""));
        System.out.println("numbers ohne 2-4: "+ numbers.replaceAll("[2-4]", ""));
        System.out.println("numbers ohne 1-3: "+ numbers.replaceAll("[1-3]", ""));
        System.out.println ( );

        String text1;
        String text2;
        System.out.println (text );
        System.out.println (text1 =text.replaceAll("wird", "war"));
        System.out.println (text2 = text.replaceAll("wird", "ist"));
        System.out.println ( );

        String text3;
        System.out.println ( text3 = text.replaceAll("[a-z]", ""));
        System.out.println ( text3 = text.replaceAll("[A-Z]", ""));
        System.out.println ( text3 = text.replaceAll(" ", ""));
        System.out.println ( text3 = text.replaceAll("!", ""));

    }

}
