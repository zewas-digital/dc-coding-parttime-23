package MichaelReal.week13_File;

/*
Aufgabe: Read and Display
-----------------
****** wie Stream_5_CSVReader:
Lies die CSV Datei ein und speichere diese in einem String.
Zerlege den String zuerst nach Zeilen, dann nach Spalten und erstelle somit ein String[][],
ein zweidimensionales Array.

Gib nun mit Hilfe des String[][], die Daten schön formatiert aus.

****** Bonus:
+ eruiere die jeweils notwendige/optimale Spaltenbreite und benutze sie für die Ausgabe
+ formatiere die Spalten je nach Datentyp
+ Frage den User nach welcher Spalte sortiert werden soll und sortiere die Ausgabe
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Stream_5_CSVReader_Bonus {
        public static void main(String[] args) {
            String dateipfad = "./resources/csv/sales_100.csv";
            int zeilen = 0;
            int spalten = 0;
            int[] maxBreiten = null;

            try (BufferedReader br = new BufferedReader(new FileReader(dateipfad))) {
                String zeile;
                while ((zeile = br.readLine()) != null) {
                    zeilen++;
                    String[] werte = zeile.split(",");
                    if (spalten == 0) {
                        spalten = werte.length;
                        maxBreiten = new int[spalten];
                    }
                    for (int i = 0; i < werte.length; i++) {
                        maxBreiten[i] = Math.max(maxBreiten[i], werte[i].length());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            String[][] daten = new String[zeilen][spalten];

            try (BufferedReader br = new BufferedReader(new FileReader(dateipfad))) {
                String zeile;
                int zeilenIndex = 0;
                while ((zeile = br.readLine()) != null) {
                    daten[zeilenIndex++] = zeile.split(",");
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben Sie den Index der Spalte ein, nach der sortiert werden soll (0-13):\n" +
                    "0=Region\n" +
                    "1=Country\n" +
                    "2=Item Type\n" +
                    "3=Sales Channel\n" +
                    "4=Order Priority\n" +
                    "5=Order Date\n" +
                    "6=Order ID\n" +
                    "7=Ship Date\n" +
                    "8=Units Sold\n" +
                    "9=Unit Price\n" +
                    "10=Unit Cost\n" +
                    "11=Total Revenue\n" +
                    "12=Total Cost\n" +
                    "13=Total Profit");
            //Region,Country,Item Type,Sales Channel,Order Priority,Order Date,Order ID,Ship Date,Units Sold,Unit Price,Unit Cost,Total Revenue,Total Cost,Total Profit

            int sortierSpalte = scanner.nextInt();
            if (sortierSpalte >= spalten) {
                System.out.println("Ungültiger Spaltenindex.😖😖😖😖😖😖😖😖😖😖😖😖😖😖TRY AGAIN!!!!!!!!!");
                return;
            }

            Arrays.sort(daten, Comparator.comparing(row -> row[sortierSpalte]));

            System.out.println("Sortierung nach Spalte: " + sortierSpalte);

            for (String[] zeile : daten) {
                for (int i = 0; i < zeile.length; i++) {
                    String formatiert = formatiereZelleninhalt(zeile[i]);
                    System.out.printf("🤓%-" + maxBreiten[i] + "s ", formatiert);
                }
                System.out.println();
            }
        }

        private static String formatiereZelleninhalt(String zelleninhalt) {
            try {
                Integer.parseInt(zelleninhalt);
                return String.format("%d", Integer.parseInt(zelleninhalt));
            } catch (NumberFormatException nfe) {
                try {
                    Double.parseDouble(zelleninhalt);
                    return String.format("%.2f", Double.parseDouble(zelleninhalt));
                } catch (NumberFormatException nfe2) {
                    return zelleninhalt;
                }
            }
        }
    }










/////////////////////////////////////////////////////////////////////////////////////////////////






  /*  public static void main(String[] args) {
        String text = "Australia";
        String integerText = "9925";
        String doubleText = "255.28";

        String testText = doubleText;

        try {
            Integer.parseInt(text);
            System.out.println("Der String "+ testText +" ist ein Integer.");

        } catch (NumberFormatException nfe) {
            try {
                Double.parseDouble(testText);
                System.out.println("Der String "+ testText +" ist ein Double.");
            } catch (NumberFormatException nfe2) {
                System.out.println("Der String ist ein Text, Datum, etc.");
            }
        }
    }
}*/