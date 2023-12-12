package eslem.week12;

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

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Stream_2_FileLog {
    static String logFileLink = "./src/eslem/week12/log-errors.txt";
    static String[] severityText = {"", "ERROR", "WARNING", "INFO"};

    public static void main(String[] args) {
        //schreibe Log bei Exception
        int[] numbers = new int[10];
        try {
            numbers[12] = 12;
        } catch (Exception ec) {
            //schreibe log-eintrag mit der geworfenen Exception
            log(1, ec.getMessage(), ec);
        }
         try {
             FileInputStream fis = new FileInputStream("./src.filedoesnotexist.txt");
         } catch (FileNotFoundException ec) {
             log(2, "Datei wurde nicht gefunden!" + ec.getMessage(), ec);
         }
         log(3, "Stream_2Filelog.main wurde erfolgreich ausgeführt!");
    }

    static void log(int severity, String message) {
        File F = new File(logFileLink);
        String prefix = "---" + severityText[severity] + " " + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()) + "---";

        try {
            FileOutputStream Fos = new FileOutputStream(F, true);
            PrintStream Ps = new PrintStream(Fos);

            Ps.println(prefix);
            Ps.println(message);
            Ps.close();
        } catch (Exception ec) {
            System.out.println("Fehler in der Datei!" + ec.getMessage());
        }
    }
    static void log(int severity, String message, Exception ec) {
        log(severity, message + "\n" + Arrays.toString(ec.getStackTrace()));
    }
}