package saifedine.week12_FileStreams.oliver;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
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
    static String logFileLink = "./src/oliver/week12_FileStreams/log-errors.txt";
    static String[] severityTexts = {"", "ERROR", "WARNING", "INFO"};

    public static void main(String[] args) {
        // Schreibe Fehler bei Exception
        int[] numbers = new int[10];
        try {
            numbers[12] = 12;
        } catch (Exception e) {
            log(1, e.getMessage(), e);
        }

        // Schreibe Warnung bei nicht vorhandener Datei
        try {
            FileInputStream fis = new FileInputStream("./src/filedoesnotexist.txt");
        } catch (FileNotFoundException e) {
            log(2, "Datei wurde nicht gefunden: "+ e.getMessage(), e);
        }

        // Schreibe Info über Abschluss des Scripts
        log(3, "Stream_2_FileLog.main wurde erfolgreich ausgeführt.");
    }

    public static void log(int severity, String message) {
        File f = new File(logFileLink);
        String prefix =
                "+----- "+ severityTexts[severity] +
                " " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) +
                "–".repeat(12);

        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);

            ps.println(prefix);
            ps.println(message);
            ps.close();

        } catch (Exception e) {
            System.out.println("Fehler beim Schreiben in die Datei: " + e.getMessage());
        }
    }

    public static void log(int severity, String message, Exception e) {
        log(severity, message +"\n"+ Arrays.toString(e.getStackTrace()));
    }
}













