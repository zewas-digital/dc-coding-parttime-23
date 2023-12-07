package Alpi.week12_FileStreams;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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

    static String ressourceFileLink = "txt/iostream.txt";
    static String relativeFileLink = "./src/alpi/week12_FileStreams/iostream.txt";

    public static void main(String[] args) {
        // Schreibe Log bei Exception
        int[] numbers = new int[10];
        try {
            numbers[12] = 12;
        }catch (Exception ec){
            // TODO schreibe log-eintrag mit der geworfenen Exception
        }

        try {
            printFileInputStream();
        }
        catch (Exception exception){



            writeToFile("neuer Text " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
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


    static void writeToFile(String content) {
        File f = new File(relativeFileLink);
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);

            ps.println(content);
            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Datei wurde nicht gefunden.");
        } finally {
            System.out.println("+--- wrote file successfully");
        }
    }


    public static void log(int severity, String message) {

        /*
        severity=1  --> ERROR
        severity=2  --> WARNING
        severity=3  --> INFO
         */

        switch (severity){
            case 1:
        }

    }
}

