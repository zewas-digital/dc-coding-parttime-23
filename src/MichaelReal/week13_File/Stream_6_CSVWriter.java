package MichaelReal.week13_File;

/*
Aufgabe: Write CSV-File

Füge die Werte aus den einzelnen Arrays in einzelne Datensätze zusammen
und schreibe die Datensätze im CSV-Format in eine neue Datei (in dein aktuelles Package).

Verwende als Separator (Trennzeichen) ;
Schreibe auch eine Titelzeile
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Stream_6_CSVWriter {
    static String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
    static String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
    static int[] age = {40, 78, 5, 18, 81};
    static String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
    static float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

    static String relativeFileLink = "./src/MichaelReal/week13_File/writerData.csv";


    public static void main(String[] args) {

                StringBuilder sb = new StringBuilder();
                sb.append("Vorname🍑;Nachname;Alter;Ort;Entfernung\n");
                for (int i = 0; i < firstName.length; i++) {
                    sb.append(firstName[i]).append(';')
                            .append(lastName[i]).append(';')
                            .append(age[i]).append(';')
                            .append(place[i]).append(';')
                            .append(distanceFromCapital[i]).append('\n');
                }
                writeToFile(sb.toString());
            }

            static void writeToFile(String content) {
                File f = new File(relativeFileLink);
                try {
                    FileOutputStream fos = new FileOutputStream(f, false); // ändern zu true um NICHT zu überschreiben
                    PrintStream ps = new PrintStream(fos);
                    ps.print(content);
                    ps.close();
                } catch (FileNotFoundException fnfe) {
                    System.out.println("Datei wurde nicht gefunden.");
                } finally {
                    System.out.println("+--- wrote file successfully");
                }
            }
        }




