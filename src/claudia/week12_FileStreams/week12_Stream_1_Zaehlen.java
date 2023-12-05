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

import claudia.BasicFunctions;
import data.Texts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

public class week12_Stream_1_Zaehlen {

    public static void main(String[] args) {

        System.out.println("\nBuchstaben zählen mit read(), d.h. einzelne char's einlesen: ");
        System.out.println("Anzahl Buchstabe \"a\": " + countLetter('a'));
        System.out.println("Anzahl Buchstabe \"A\": " + countLetter('A'));
        System.out.println("Anzahl Buchstabe \"ł\": " + countLetter('ł'));
        System.out.println("Anzahl Zeichen \"*\": " + countLetter('*'));

        System.out.println("\nWörter korrekt zählen mit equals statt Split-Trick: ");
        System.out.println("Anzahl Wort \"Marie\": " + countWord("Marie"));
        System.out.println("Anzahl Wort \"und\": " + countWord("und"));

        int choice = 1;
        while (choice != 0) {
            choice = BasicFunctions.readInt("\nWähle Aufgabe! \n1 = Anzahl Wörter, 2 = Anzahl bestimmter Buchstabe, 3 = Anzahl bestimmtes Wort - oder 0 = ABBRECHEN: ");
            countingEverything(choice);
        }
    }

    public static int countingEverything(int choice) {
        BufferedReader reader = null;
        int counter = 0;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                            )
                    )
            );

            String input;

                switch(choice){
                    case 1:
                        System.out.println("\nAufgabe 1, Wörter zählen: ");
                        while ((input = reader.readLine()) != null) {
                            counter = counter + input.split(" ").length - 1;
                        } //ziehe Zeilenumbruch ab!
                        System.out.println("Anzahl Wörter im Text: " + counter);
                        break;
                    case 2:
                        System.out.println("\nAufgabe 2, einen Buchstaben zählen.");
                        char letter = BasicFunctions.readChar("Welcher Buchstabe soll gezählt werden? Bitte eingeben! ");
                        while ((input = reader.readLine()) != null) {
                            counter = counter + input.split(String.valueOf(letter)).length - 1;
                        } //Anzahl letter = Anzahl der Lücken = Anzanl der Abschnitte - 1
                        System.out.println("Anzahl des Buchstaben " + letter + " im Text: " + counter);
                        break;
                    case 3:
                        System.out.println("\nAufgabe 3, eine Zeichenkette zählen.");
                        System.out.print("Welches Zeichenkette soll gezählt werden? Bitte eingeben! ");
                        Scanner sc = new Scanner(System.in);
                        String word = sc.next();
                        while ((input = reader.readLine()) != null) {
                            counter = counter + input.split(String.valueOf(word)).length - 1;
                        } //Anzahl word = Anzahl der Lücken = Anzanl der Abschnitte - 1
                        System.out.println("Anzahl der Zeichenkette \"" + word + "\" im Text: " + counter);
                        break;
                    default:
                        break;
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
        return counter;
    }


    //////////Einzelne Methoden /////////////////////////
    public static int countWord(String word) {
        BufferedReader reader = null;
        int counter = 0;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                            )
                    )
            );

            String input;

            while ((input = reader.readLine()) != null) {
                String[] wordsInLine = input.split(" ");
                for (String elem : wordsInLine
                ) {
                    if (elem.equals(word)) counter++;
                }
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
        return counter;
    }
    public static int countLetter(char letter) {
        BufferedReader reader = null;
        int counter = 0;
        int input;
        int letterAscii = (int) letter;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                            )
                    )
            );

            while ((input = reader.read()) != -1) {
                if (input == letterAscii) counter++;
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
        return counter;
    }
    public static int countWords() {
        BufferedReader reader = null;
        int counter = 0;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                            )
                    )
            );

            String input;

            while ((input = reader.readLine()) != null) {
                counter = counter + input.split(" ").length - 1; //ziehe Zeilenumbruch ab!
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
        return counter;
    }

}