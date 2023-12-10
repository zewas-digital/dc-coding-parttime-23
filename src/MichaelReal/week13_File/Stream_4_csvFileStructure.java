package MichaelReal.week13_File;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Stream_4_csvFileStructure {


    public static void main(String[] args) {
        // Dateipfad zur Verkaufsdaten-Datei
        String filePath = "./resources/csv/sales_100.csv";

        try {
            // Scanner für die Datei
            Scanner scanner = new Scanner(new File(filePath));

            // Überprüfen, ob die Datei nicht leer ist
            if (scanner.hasNextLine()) {
                // Zeilenumbruch am Anfang überspringen
                scanner.nextLine();

                System.out.println("|" + "-".repeat(294) + "|");


                // Header
                System.out.printf("🤓 %-40s| %-40s| %-18s| %-15s| 🦄 %-15s| %-15s| %-15s| %-15s| %-15s| 🍀 %-15s| %-15s| %-15s| %-15s| %-15s| \n",
                        "REGION", "COUNTRY", "ITEM TYP", "SALES CHANNEL", "ORDER PRIORITY", "ORDER DATE", "ORDER ID", "SHIP DATE",
                        "UNITS SOLD", "UNIT PRICE", "UNIT COST", "TOTAL REVENUE", "TOTAL COST", "TOTAL PROFIT");

                System.out.println("|" + "-".repeat(294) + "|");


                // Daten aus der Datei lesen und formatieren
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] data = line.split(",");
                    System.out.printf("🤓 %-40s| %-40s| %-18s| %-15s| 🦄 %-15s| %-15s| %-15s| %-15s| %-15s| 🍀 %-15s| %-15s| %-15s| %-15s| %-15s| \n",
                            data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8],
                            data[9], data[10], data[11], data[12], data[13]);

                    System.out.println("|" + "-".repeat(294) + "|");

                }
                }


                scanner.close();

            } catch(FileNotFoundException e){
                System.err.println("Die Datei konnte nicht gefunden werden: " + e.getMessage());
            }
        }
    }





