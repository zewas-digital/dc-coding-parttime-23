package claudia.week12_FileStreams;

import data.Texts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class week12_BufferedReader {

    public static void main(String[] args) {
        getSimpleText();
    }

    public static void getSimpleText() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.tx")
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
        }
        catch(NullPointerException e){
            System.out.println("\nKann das File nicht finden!");
        }

        finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("\nFile geschlossen!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}