package saifedine.week11_strings.oliver;

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
    static int minLength = 18;

    public static void main(String[] args) {

        // Kopfzeile befüllen
        String[] headline = {"Vorname", "Nachname", "Alter", "Ort", "km bis Wien"};

        // Kopfzeile ausdrucken
        printRow(headline);

        printDivider(headline.length);

        for (int i = 0; i < headline.length; i++) {
            String[] row = {
                    firstName[i],
                    lastName[i],
                    Integer.toString(age[i]),
                    place[i],
                    Float.toString(distanceFromCapital[i])
            };

            printRow(row);
        }
    }

    // Ausdruck Zeilen mit Foreach und Übergabe an printCell-Methode
    public static void printRow(String[] row) {
        for (String content : row) {
            printCell(content);
        }
        System.out.println();
    }

    private static void printCell(String content) {
        printCell(content, "|");
    }

    private static void printCell(String content, String divider) {
        int contentLength = content.length();

        System.out.print(" " + content + " ".repeat(minLength - contentLength) + divider);
    }


    // Ausdruck der Rahmenlinie unter Kopfzeile
    // cell entspricht headline.length = 5
    //
    public static void printDivider(int cells) {
        for (int i = 0; i < cells; i++) {
            printCell("-".repeat(minLength), "+");
        }
        System.out.println();
    }




}
