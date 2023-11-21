package claudia.week11_strings;

/*
Aufgabe: Daten tabellarisch darstellen
Erstelle einen schönen tabellarischen Ausgabe aus den folgenden Arrays:

Denke daran, dass eine Tabelle eine Kopfzeile und Trennzeichen haben kann.
 */

public class Strings_5_Tabelle {
    static String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
    static String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
    static int[] age = {40, 78, 5, 18, 81};
    static String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
    static float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

    public static void main(String[] args) {

        int number = firstName.length;

        System.out.printf("\n\n%-20s %-20s %5s %5s %-20s %10s%n", "Vorname", "Nachname", "Alter","\t", "Wohnort", "Entfernung");
        System.out.println("_________________________________________________________________________________________________");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-20s %-20s %5d %5s %-20s %10.2f%n", firstName[i], lastName[i], age[i], "\t", place[i], distanceFromCapital[i]);

        }
    }
}
