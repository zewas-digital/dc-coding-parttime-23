package Matthias.week12_FileStreams;

        import java.io.*;
        import java.text.SimpleDateFormat;
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
    //Einfügen des relativen Links:
    static String relativeFileLink = "./src/Matthias/week12_FileStreams/iostream.txt";
    public static void main(String[] args) {

        // Schreibe Log bei Exception
        int[] numbers = new int[10];
        try {
            numbers[12] = 12;
        }catch (Exception ec){

            log( 1, "Fehler" );
            log( 2, "Keine passende Aufgabe gefunden" );
            log( 3, "Guten Morgen" );

        }
    }
    public static void log(int severity, String message) {
        String TextLogErrorSer1= "Error: ";
        String TextLogErrorSer2= "Warning: ";
        String TextLogErrorSer3= "Info: ";
        switch ( severity ) {
            case 1:
                writeToFile(  new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss " ).format( new Date( ) ) + TextLogErrorSer1 +message);
                break;
            case 2:
                writeToFile(   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss " ).format( new Date( ) )+ TextLogErrorSer2 + message);
                break;
            case 3:
                writeToFile(  new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss " ).format( new Date( ) ) + TextLogErrorSer3 + message);
                break;
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
}
