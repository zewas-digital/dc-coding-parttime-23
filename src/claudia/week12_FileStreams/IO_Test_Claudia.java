package claudia.week12_FileStreams;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IO_Test_Claudia {

   static String relativeFileLink = "./src/claudia/week12_FileStreams/io-test.txt";

    public static void main(String[] args) {
        //File f = new File(relativeFileLink);
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Schreibe die nächsten 10 Summen ins File! Fibonaccizahlen, wenn mit leerem File gestartet...");

        int number1 = 0;
        int number2 = 1;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            try {
                FileInputStream fis = new FileInputStream(relativeFileLink);
                Scanner sc = new Scanner(fis);

                while (sc.hasNextInt()) {
                    //TODO: falls was anderes als INT vorkommt, bleibt Algorithmus davor stecken
                    //d.h. number2 ist immer das letzte INT vor der Unterbrechung
                    number1 = number2;
                    number2 = sc.nextInt();
                }
                sum = number1 + number2;
                writeFile(sum);

            } catch (FileNotFoundException e) {
                System.out.println("Datei nicht gefunden!");
            } catch (InputMismatchException e) {
                System.out.println("Kein weiteres int!");
            }
        }
    }

    static void writeFile(int content) {
        File f = new File(relativeFileLink);
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);
            ps.println(content);
            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Datei wurde nicht gefunden.");
        } finally {
            //System.out.println("+--- wrote file successfully");
        }
    }


    static void readFile() {
        try {
            FileInputStream fis = new FileInputStream(relativeFileLink);
            Scanner sc = new Scanner(fis);

            while (sc.hasNextInt()) {
                int number = sc.nextInt();
                System.out.println(number);
            }
            sc.close();
        } catch (SecurityException e) {
            System.out.println("Kein Zugriff auf die Datei.");
        } catch (FileNotFoundException fnf) {
            System.out.println("Datei wurde nicht gefunden.");
        }
    }
}
