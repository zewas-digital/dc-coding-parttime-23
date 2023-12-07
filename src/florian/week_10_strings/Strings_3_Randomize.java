package florian.week_10_strings;

/*
Aufgabe: Randomize
Es soll ein Wort über die Kommandozeile eingelesen werden,
die Buchstaben des Wortes sollen zufällig vertauscht werden und anschließend ausgegeben werden. Verwende hierfür text.toCharArray() für das Aufsplitten, erstelle ein neues char[],
befülle es zufällig mit den Buchstaben des Wortes, füge es mittels new String(charArray) zusammen und gib es aus.

Ausgabe

Willkommen zum Zufallsshuffle Programm
>>>Hallo
lolHa
 */

import java.util.Scanner;

public class Strings_3_Randomize {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Willkommen beim Zufallsshuffleprogramm: ");
        System.out.println("Bitte gib ein Wort ein: ");
        String text = userinput.next();
        char [] charachterArray = text.toCharArray();
        new String (charachterArray);
        char sortieren;



    }
}
