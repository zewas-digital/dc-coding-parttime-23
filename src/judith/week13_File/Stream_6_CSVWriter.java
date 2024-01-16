package judith.week13_File;

/*
Aufgabe: Write CSV-File

Füge die Werte aus den einzelnen Arrays in einzelne Datensätze zusammen
und schreibe die Datensätze im CSV-Format in eine neue Datei (in dein aktuelles Package).

Verwende als Separator (Trennzeichen) ;
Schreibe auch eine Titelzeile
 */

import java.io.FileWriter;
import java.io.IOException;

public class Stream_6_CSVWriter {
    static String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
    static String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
    static int[] age = {40, 78, 5, 18, 81};
    static String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
    static float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

    public static void main(String[] args) {

        FileWriter writer = null;
        try {
            writer = new FileWriter("src/Simonsway/Week13/files/temp.csv");

            writer.append("First Name,Last Name,Age,Place,Distance From Capital\n");

            for (int i = 0; i < firstName.length; i++) {
                writer.append(firstName[i]).append(",")
                        .append(lastName[i])
                        .append(",")
                        .append(String.valueOf(age[i]))
                        .append(",")
                        .append(place[i])
                        .append(",")
                        .append(String.format("%.2f", distanceFromCapital[i]));

                writer.append("\n");
            }

            System.out.println("File Write Successful");

        } catch (IOException exc) {
            throw new RuntimeException(exc);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}