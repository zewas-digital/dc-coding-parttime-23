package claudia.week12_FileStreams;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
Aufgabe: Erstelle eine Klasse für Log-Einträge
Der Logger schreibt fortlaufend in eine Datei. Es wird nicht überschrieben.

Verwende den Methoden-Parameter severity (Schweregrad)

   severity=1  --> ERROR
   severity=2  --> WARNING
   severity=3  --> INFO

Ergebnis:
   2023-11-30 19:30:34 INFO: Guten Morgen!
   2023-11-30 19:31:01 WARNING: Kein passende Aufgabe gefunden
   ...
*/
public class Stream_2_FileLog {

    static String relativeFileLink = "./src/claudia/week12_FileStreams/iostream.txt";
    public static void main(String[] args) {
        System.out.println("Datei am Anfang: ");
        printFileInputStream();

       log(1, "Test - großes Problem!");
       log(2, "Test - Achtung!");
       log(3, "Test - alles in Ordnung.");

        // Schreibe Log bei Exception
        int[] numbers = new int[10];
        try {
            numbers[12] = 12;
        }catch (Exception e){
            log(1, "echtes Problem " + e.toString());
        }

        System.out.println("Datei am Ende: ");
        printFileInputStream();
    }
    public static void log(int severity, String message) {

        File f = new File(relativeFileLink);
        String text;

        text = switch ( severity ) {
            case 1 -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " ERROR: ";
            case 2 -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " WARNING: ";
            case 3 -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " INFO: ";
            default -> "";
        };

        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);
            ps.println(text + message);
            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Datei wurde nicht gefunden.");
        } finally {
            System.out.println("+--- wrote file successfully");
        }
    }

    static void printFileInputStream() {
        System.out.println("+--- read file " + relativeFileLink + " with FileInputStream " + "–".repeat(20));

        try {
            FileInputStream fis = new FileInputStream(relativeFileLink);
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println("| " + line);
            }
            sc.close();
        } catch (SecurityException e) {
            System.out.println("Kein Zugriff auf die Datei.");
        } catch (FileNotFoundException fnf) {
            System.out.println("Datei wurde nicht gefunden.");
        }
    }

}
