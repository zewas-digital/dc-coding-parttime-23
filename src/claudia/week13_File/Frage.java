package claudia.week13_File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

//TODO Wo wird hier das physische .csv-File angelegt?
public class Frage {
    public static void main(String[] args) {

        File file = new File("./src/claudia/week13_File/frage.csv");
        writeToFile(file, "abc");
    }

    static void writeToFile(File file, String content) {

        try {
            FileOutputStream fos = new FileOutputStream(file, true);
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

