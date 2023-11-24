package saifedine.week11_strings;

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

    // Ausgabe Kopfzeile
    // Ermittlung der Array length
    // jeden array index auslesen z.B. index (0) --> Testausgabe
    // neu zusammensetzen z.B. index (0) --> wie?
    // da verschiedene Datentypen, kann kein neuer Array zusammengesetzt werden, daher foreach mit Trennzeichen
    // Simon: https://stackoverflow.com/questions/15215326/how-can-i-create-table-using-ascii-in-a-console
    // Claudia: printf --> https://relativemeister.com/tutorial/

    public static void main(String[] args) {

                /*
        // Ausgabe Kopfzeile
        System.out.println("firstname, " + "lastName, " + "age, " + "place, " + "distanceFromCapital");

        // Ermittlung der Array length
        //System.out.println(firstName.length);

        for (String s : firstName) {
            System.out.println(s);
        }

        for (int i = 0; i < firstName.length; i++) {
            System.out.println(firstName[i] + " | " + lastName[i] + " | " + age[i] + " | " + place[i] + " | " + distanceFromCapital[i]);
        }
    }
    */

        int minLength = 18;

        String[] headline = {"Vorname", "Nachname", "Alter", "Ort", "km bis Wien"};

        for (String s : headline) {
            System.out.print(s);
        }


    }

}
