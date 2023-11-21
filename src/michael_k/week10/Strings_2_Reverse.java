package michael_k.week10;

import java.util.Arrays;
import java.util.Scanner;

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
public class Strings_2_Reverse {

    public static void main(String[] args) {


        Scanner inputKonsole = new Scanner ( System.in );
        boolean stop= true;

        while(stop) {
            String input = inputKonsole.next ( );
            if(input.equals ( "stop" )){
                break;
            }
            change ( input );

        }

    }
    static void change (String input){

        char[] array = input.toCharArray();
        char[] arrayChanged = new char[array.length];
        String output;
        int j = array.length-1;

        for (int i = 0; i < array.length; i++) {
                arrayChanged[j] = array[i];
            j--;
        }
        output = new String(arrayChanged);

        System.out.println ( output);

    }
}