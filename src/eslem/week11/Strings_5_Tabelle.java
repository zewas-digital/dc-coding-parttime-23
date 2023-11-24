package eslem.week11;

/*
Aufgabe: Daten tabellarisch darstellen
Erstelle einen schönen tabellarischen Ausgabe aus den folgenden Arrays:

Denke daran, dass eine Tabelle eine Kopfzeile und Trennzeichen haben kann.
 */

public class Strings_5_Tabelle {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};

        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};

        int[] age = {40, 78, 5, 18, 81};

        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};

        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};


        String leftAlignFormat = "| %-15s | %-15s | %-5d | %-15s | %-15.2f |%n";

        String heading1 = "NAME";
        String heading2 = "SURNAME";
        String heading3 = "AGE";
        String heading4 = "CITY";
        String heading5 = "CAPITAL";

        System.out.println("|-------------------------------------------------------------------------------|");
        System.out.printf("| %-15s | %-15s | %-5s | %-15s | %-15s |%n",heading1, heading2, heading3, heading4,heading5);
        System.out.println("|-------------------------------------------------------------------------------|");


        for (int i = 0; i < firstName.length; i++) {
            System.out.printf(leftAlignFormat, firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }
        System.out.println("|-------------------------------------------------------------------------------|");
    }
}
