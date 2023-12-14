package michael_k.week12;

import data.Texts;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
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
    public static void main(String[] args) {
        // Schreibe Log bei Exception
        int[] numbers = new int[10];
        try {
            numbers[12] = 12;
        }catch (Exception ec){
            System.out.println (ec );
            ec.printStackTrace();
            log(1, "Array Index exestiert nicht");
        }

        try {
            InputStream inputStream = Objects.requireNonNull(
                    Texts.class.getClassLoader().getResourceAsStream(".txt/test.txt")
            );
            Scanner sc = new Scanner(inputStream);

            sc.hasNextLine();
            String line = sc.nextLine();
            System.out.println(line);

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            log(2, "Datei nicht gefunden");
        }
    }
    public static void log(int severity, String message) {
        String errorcode = null;

        switch (severity){
            case 1:
                errorcode ="Error   :";
                break;
            case 2:
                errorcode ="Warning :";
                break;
            case 3:
                errorcode ="Info    :";
        }

        File f = new File("./src/michael_k/week12/logfile.txt");
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);

            ps.println( errorcode + new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss").format(new Date ())+" / "+message );
            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Datei wurde nicht gefunden.");
        } finally {
            System.out.println("+--- wrote file successfully");
        }
    }
}
