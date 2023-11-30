package MichaelReal.week12_FileStreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Aufgabe: Erstelle eine Klasse für Log-Einträge
Der Logger schreibt fortlaufend in eine Datei. Es wird nicht überschrieben.

Verwende den Methoden-Paramter severity (Schweregrad)

   severity=1  --> ERROR
   severity=2  --> WARNING
   severity=3  --> INFO

Ergebnis:
   2023-11-30 19:30:34 INFO: Guten Morgen!
   2023-11-30 19:31:01 WARNING: Kein passende Aufgabe gefunden
   ...
*/
public class Stream_2_FileLog {
    public static void main(String[] args) {
        // Schreibe Log bei Exception
        int[] numbers = new int[13];
        try {
            numbers[12] = 12;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Hier könnten Maßnahmen ergriffen oder eine Log-Nachricht erstellt werden, um die Exception zu protokollieren.
            e.printStackTrace(); // Gibt die Fehlermeldung und den Stacktrace aus.
        }
    }

    public static void log(int severity, String message) {
        try {
            FileWriter fileWriter = new FileWriter("logfile.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String severityString = getSeverityString(severity);

            String logEntry = String.format("%s %s: %s", timestamp, severityString, message);
            printWriter.println(logEntry);

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getSeverityString(int severity) {
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