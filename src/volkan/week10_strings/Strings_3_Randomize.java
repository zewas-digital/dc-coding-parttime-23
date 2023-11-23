package volkan.week10_strings;

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
    public static Scanner scanner = new Scanner( System.in );
    public static void main( String[] args ) {
        System.out.println( " Willkommen zum Reverseprogramm " );
        String Wort = scanner.nextLine();
        char[] charArray= Wort.toCharArray();
        printcharArray(  charArray);
        printreversecharArray(charArray);
    }

    private static void printcharArray(char[] charArray) {
    }

    static public void printreversecharArray(char[] array){
        System.out.println(  );
        for (int i = array.length-1;  i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
