package eslem.week10;

/*
Aufgabe: Randomize
Es soll ein Wort über die Kommandozeile eingelesen werden,
dieses die Buchstaben des Wortes sollen zufällig vertauscht werden und anschließend ausgegeben werden. Verwende hierfür text.toCharArray() für das Aufsplitten, erstelle ein neues char[], befülle es zufällig mit den Buchstaben des Wortes, füge es mittels new String(charArray) zusammen und gib es aus.

Ausgabe

Willkommen zum Zufallsshuffle Programm
>>>Hallo
lolHa
 */

import java.util.Scanner;

public class Strings_3_Randomize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen zum Zufallsshuffle Programm!");

        System.out.println("Geben Sie ein Wort ein:");
        String Userinput = scanner.next();

        char[] charArray = Userinput.toCharArray();
        new String(charArray);
        char temp;

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
        }
        System.out.println(charArray);
    }
}


