package Matthias.week12_FileStreams;

import data.Texts;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Stream_0_BufferedReader {

    public static void main(String[] args) {
        getSimpleText();
    }

    public static void getSimpleText() {
        java.io.BufferedReader reader = null;
        try {
            reader = new java.io.BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                            )
                    )
            );

            String input;
            int lineNumber = 1;
            while ((input = reader.readLine()) != null) {
                System.out.println("Zeile " + lineNumber + ": " + input);

                lineNumber++;
            }

        } catch (IOException exc) {
            throw new RuntimeException(exc);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}