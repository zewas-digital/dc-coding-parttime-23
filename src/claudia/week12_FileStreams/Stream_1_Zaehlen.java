package claudia.week12_FileStreams;

/*
Aufgabe: Wörter und Buchstaben zählen
Lies das File mit Hilfe des BufferedReader.

1/ Erstelle eine Methode, welche die Anzahl der Wörter ausgibt. Die Anzahl muss nicht exakt sein.

2/ Erstelle eine Methode, welche nur einen bestimmten Buchstaben des Texts zählt,
welcher als Parameter mitgegeben wird.

3/ Bonus: Frage den Anwender, welches Wort gezählt werden soll
und führe das Zählen über eine Methode aus.

 */

import data.Texts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Stream_1_Zaehlen {
    public static void main(String[] args) {
        // 2: Zeichen zählen
        System.out.println("Anzahl Zeichen M: "+ countCharacter('M'));
        System.out.println("Anzahl Zeichen a: "+ countCharacter('a'));

        System.out.println("Anzahl Leerzeichen: "+ (countCharacter(' ')+1));
    }

    static int countCharacter(char character) {
        int count = 0;
        int charInt = (int)character;

        try {
            BufferedReader reader = openStream("txt/simpleText.txt");

            // Einzelnes Zeichen lesen
            int readCharInt;
            while ((readCharInt = reader.read()) > -1) {
                // Zeichen vergleichen
                if (charInt == readCharInt)
                    count++;
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("IOExeption");
        } finally {
            System.out.println("Lesevorgang abgeschlossen.");
        }

        return count;
    }

    static BufferedReader openStream(String fileLink) throws RuntimeException {
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream(fileLink)
                            )
                    )
            );
            return reader;

        } catch (Exception exc) {
            throw new RuntimeException(exc);
        }
    }
}
