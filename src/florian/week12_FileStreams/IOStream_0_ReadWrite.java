package florian.week12_FileStreams;

import data.Texts;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class IOStream_0_ReadWrite {
    static String ressourceFileLink = "txt/iostream.txt";
    static String relativeFileLink = "./src/oliver/week12_FileStreams/iostream.txt";

    public static void main(String[] args) {
        printFileWithInputStream();
        printFileInputStream();

        writeToFile("neuer Text " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        printFileInputStream();

        System.out.println("+--- end");
    }

    static void printFileWithInputStream() {
        System.out.println("+--- read file " + ressourceFileLink + " with InputStream " + "–".repeat(20));
        try {
            InputStream inputStream = Objects.requireNonNull(
                    Texts.class.getClassLoader().getResourceAsStream(ressourceFileLink)
            );
            Scanner sc = new Scanner(inputStream);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println("| " + line);
            }
        } catch (Exception e) {
            System.out.println("Fehler beim Laden der Datei." + e);
            e.printStackTrace();
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
}