package eslem.week10;

/*
Aufgabe: Reverse
Es soll ein Wort über die Kommandozeile eingelesen werden,
dieses Wort soll umgedreht und anschließend ausgegeben werden.

Verwende hierfür text.toCharArray() für das Aufsplitten und new String(charArray) zum Zusammenfügen.

Ausgabe
Willkommen zum Reverseprogramm
>>>Hallo
ollaH

 */
import java.util.Arrays;
import java.util.Scanner;
public class Strings_2_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen zum Reverseprogramm!");

        System.out.println("Geben Sie ein Wort ein:");
        String Userinput = scanner.next();

        char[] charArray = Userinput.toCharArray();
        new String(charArray);
        char temp;

        for (int i = 0; i < charArray.length-1; i++) {
            for (int j = 0; j < charArray.length-1-i; j++) {
                 temp = charArray[j];
                charArray[j] = charArray[j+1];
                charArray[j+1] = temp;
            }
        }
        System.out.println(charArray);
    }
}