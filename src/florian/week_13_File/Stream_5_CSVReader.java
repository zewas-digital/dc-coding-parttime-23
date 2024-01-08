package florian.week_13_File;

/*
Aufgabe: Read and Display
-----------------
Lies die CSV Datei ein und speichere diese in einem String.
Zerlege den String zuerst nach Zeilen, dann nach Spalten und erstelle somit ein String[][],
ein zweidimensionales Array.

Gib nun mit Hilfe des String[][], die Daten schön formatiert aus.
 */

import data.Texts;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;


public class Stream_5_CSVReader {

    public static void main(String[] args) {

        BufferedReader reader;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")
                            )
                    )
            );

            String input;
            int rows = 0;
            int colcount = 0;
            while ((input = reader.readLine()) != null) {
                // System.out.println("Zeile " + lineNumber + ": " + input);

                rows++;
                String[] array1d = input.split(",");
                colcount = array1d.length;

            }

            String[][] array2d = new String[rows][colcount];
            try {
                reader = new BufferedReader(
                        new InputStreamReader(
                                Objects.requireNonNull(
                                        Texts.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")
                                )
                        )
                );

                int rowindex = 0;

                while ((input = reader.readLine()) != null) {
                   array2d[rowindex++] = input.split(",");
                }

                for (String[] zeilen : array2d) {
                    System.out.printf("| %-35s | %-35s| %-17s| %-15s| %-15s|%12s |%10s |%12s |%12s |%12s |%10s |%14s |%12s |%13s |\n",
                    zeilen[0],zeilen[1],zeilen[2],zeilen[3],zeilen[4],zeilen[5],zeilen[6],zeilen[7],zeilen[8],zeilen[9],zeilen[10],zeilen[11],zeilen[12],zeilen[13]);

                }



            } catch (Exception e) {
                throw new RuntimeException(e);
            }


            reader.close();

        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }

    }

}