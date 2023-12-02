package claudia.week12_FileStreams;

import java.io.*;
import java.util.Scanner;

public class IO_Test_Claudia {

   static String relativeFileLink = "./src/claudia/week12_FileStreams/io-test.txt";

    public static void main(String[] args) {

        System.out.println("\n" + "* - ".repeat(20) + "*");
        writeFile(2);
        readFile();
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
