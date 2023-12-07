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

                // Header
                System.out.printf("%-40s%-40s%-18s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                        "Region", "Country", "Item Type", "Sales Channel", "Order Priority", "Order Date", "Order ID", "Ship Date",
                        "Units Sold", "Unit Price", "Unit Cost", "Total Revenue", "Total Cost", "Total Profit");




                    // Daten aus der Datei lesen und formatieren
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        String[] data = line.split(",");
                        System.out.printf("%-40s%-40s%-18s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                                data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8],
                                data[9], data[10], data[11], data[12], data[13]);
                    }

                // Scanner schließen
                scanner.close();
            } catch (FileNotFoundException e) {
                System.err.println("Die Datei konnte nicht gefunden werden: " + e.getMessage());
            }
        }
    }




