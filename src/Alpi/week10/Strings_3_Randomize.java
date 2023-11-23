package Alpi.week10;

/*
Aufgabe: Randomize
Es soll ein Wort über die Kommandozeile eingelesen werden,
dieses die Buchstaben des Wortes sollen zufällig vertauscht werden und anschließend ausgegeben werden. Verwende hierfür text.toCharArray() für das Aufsplitten, erstelle ein neues char[], befülle es zufällig mit den Buchstaben des Wortes, füge es mittels new String(charArray) zusammen und gib es aus.

Ausgabe

Willkommen zum Zufallsshuffle Programm
>>>Hallo
lolHa
 */



import java.util.Random;
import java.util.Scanner;

public class Strings_3_Randomize {

    public static void main(String[] args) {
        System.out.println("Willkommen zum Zufallsshuffle Programm");

        // Scanner erstellen, um Eingabe von der Kommandozeile zu lesen
        Scanner scanner = new Scanner(System.in);

        // Wort von der Kommandozeile einlesen
        System.out.print("Wort eingeben: ");
        String word = scanner.nextLine();

        // Das Wort in ein Array von Buchstaben umwandeln
        char[] letters = word.toCharArray();

        // Ein neues Array erstellen, das die gleiche Länge hat
        char[] newLetters = new char[letters.length];

        // Die Buchstaben in das neue Array in zufälliger Reihenfolge kopieren
        for (int i = 0; i < letters.length; i++) {
            int index = new Random().nextInt(letters.length);
            newLetters[i] = letters[index];
        }

        // Das neue Array in einen String konvertieren und ausgeben
        System.out.println(new String(newLetters));
    }
}
