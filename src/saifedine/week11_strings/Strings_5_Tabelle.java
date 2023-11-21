package saifedine.week11_strings;

/*
Aufgabe: Daten tabellarisch darstellen
Erstelle einen schönen tabellarischen Ausgabe aus den folgenden Arrays:

Denke daran, dass eine Tabelle eine Kopfzeile und Trennzeichen haben kann.
 */

public class Strings_5_Tabelle {
    String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
    String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
    int[] age = {40, 78, 5, 18, 81};
    String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
    float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

    // Ausgabe Kopfzeile
    // Ermittlung der Array length
    // jeden array index auslesen z.B. index (0) --> Testausgabe
    // neu zusammensetzen z.B. index (0) --> wie?
    // da verschiedene Datentypen, kann kein neuer Array zusammengesetzt werden, daher foreach mit Trennzeichen

    public static void main(String[] args) {

        System.out.println("firstname, " + "lastName, " + "age, " + "place, " + "distanceFromCapital");




    }
}
