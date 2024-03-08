package marcelsimma.week22.exceptions;

/*
Eine Datei mit dem namen Array.txt wird eingelesen.
Jede Zeile in der Datei enthält einen Wert, der als int in eine ArrayList abgespeichert wird.
Anschließend werden die ersten 10 Werte im Array auf der Konsole ausgegeben.
Da es passieren kann, dass das Array kürzer als 10 ist, soll ein Exception Handling mit try, catch und final bei der Ausgabe angewendet werden.
 */

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        try (
                FileReader fr = new FileReader("Array.txt");
                BufferedReader br = new BufferedReader(fr)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                int value = Integer.parseInt(line.trim());
                arrayList.add(value);
            }
        } catch (Exception e) {
            System.err.println("Fehler beim Lesen der Datei: ");
            System.err.println(e.getMessage());
            return; // Programm beenden, da nicht weitergearbeitet werden kann);
        } finally {
            // Hier könnten aufräumende Aktionen erfolgen, falls nötig
            System.out.println("hallo");

        }


        // Erste 10 Werte ausgeben mit Exception Handling
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(arrayList.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Das Array ist kürzer als 10 Elemente.");
        }


        error3();


    }


    public static void error3()  {
        error2();
    }

    public static void error2()  {
        try {
            error();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static void error() throws Throwable {
        throw new CustomException("Dies ist ein bewusster Fehler");
    }
}