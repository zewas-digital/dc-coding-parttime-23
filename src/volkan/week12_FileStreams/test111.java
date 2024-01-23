package volkan.week12_FileStreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test111 {

    private static final String FILENAME = "iostream.txt";

    public static void main(String[] args) {
        // Schreibe Log bei Exception
        int[] numbers = new int[10];
        try {
            numbers[12] = 12;
        } catch (Exception e) {
            log(1, "Index out of bounds: " + e.getMessage());
        }
    }

    public static void log(int severity, String message) {
        // Datei öffnen
        File file = new File(FILENAME);
        FileWriter writer = null;
        try {
            writer = new FileWriter(file, true);
        } catch (IOException e) {
            System.err.println("Konnte Log-Datei nicht öffnen: " + e.getMessage());
            return;
        }

        // Log-Eintrag schreiben
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String logEntry = sdf.format(date) + " " + severityToString(severity) + ": " + message;
        try {
            writer.write(logEntry + "\n");
        } catch (IOException e) {
            System.err.println("Konnte Log-Eintrag nicht schreiben: " + e.getMessage());
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                // ignorieren
            }
        }
    }

    private static String severityToString(int severity) {
        switch (severity) {
            case 1:
                return "ERROR";
            case 2:
                return "WARNING";
            case 3:
                return "INFO";
            default:
                return "UNKNOWN";
        }
    }
}
