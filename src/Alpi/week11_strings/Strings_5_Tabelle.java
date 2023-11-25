package Alpi.week11_strings;

/*
Aufgabe: Daten tabellarisch darstellen
Erstelle einen schönen tabellarischen Ausgabe aus den folgenden Arrays:

Denke daran, dass eine Tabelle eine Kopfzeile und Trennzeichen haben kann.
 */




import java.util.Arrays;

public class Strings_5_Tabelle {

    public static void main(String[] args) {
        // Die Daten in Arrays speichern
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};


        // Die Kopfzeile der Tabelle erstellen
        System.out.format("+-----------------+-----------------+-------+-----------------+-----------------+%n");
        System.out.format("| Vorname         | Nachname        | Alter | Stadt          | Entf. v. Hauptst.|%n");
        System.out.format("+-----------------+-----------------+-------+-----------------+-----------------+%n");

        // Die Daten der Tabelle ausgeben
        for (int i = 0; i < firstName.length; i++) {


            System.out.printf("| %-15s | %15s | %-5d | %-15s | %-15.2f |%n",
                    firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }
    }
}

