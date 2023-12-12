package michael_k.week12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
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
        int[] numbers = new int[10];
        try {
            numbers[12] = 12;
        }catch (Exception ec){
            System.out.println (ec );
            log(1, "Array Index exestiert nicht");
        }
    }
    public static void log(int severity, String message) {

        //stack trace

        File f = new File("./src/michael_k/week12/logfile.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);

            ps.println(message +"  /  "+ new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date ()));
            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Datei wurde nicht gefunden.");
        } finally {
            System.out.println("+--- wrote file successfully");
        }
    }
}
