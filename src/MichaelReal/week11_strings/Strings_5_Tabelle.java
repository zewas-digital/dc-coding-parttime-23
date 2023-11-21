package MichaelReal.week11_strings;

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

    // Kopfzeile
        System.out.printf("%-20s %-20s %-5s %-20s %-20s%n", "Vorname", "Nachname", "Alter", "Ort", "Entfernung von Hauptstadt");
    // Trennzeichen
        System.out.println("-------------------------------------------------------------------------");

    // Datenzeilen
        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("%-20s %-20s %-5d %-20s %-20.4f%n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }
    }
}



