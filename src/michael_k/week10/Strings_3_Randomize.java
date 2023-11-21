package michael_k.week10;

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
        Scanner inputKonsole = new Scanner ( System.in );
        boolean stop= true;

        while(stop) {
            String input = inputKonsole.next ( );
            if(input.equals ( "stop" )){
                break;
            }
            randomChange ( input );
        }
    }

    static void randomChange(String input){

        Random randomnumber = new Random ();

        char[] array = input.toCharArray();
        char[] arrayRandomChanged = new char[array.length];
        String output;
        int r;
        boolean serchFreeIndex = true;

        for (int i = 0; i < array.length; i++) {
            r = randomnumber.nextInt ( array.length);
            serchFreeIndex = true;

            while(serchFreeIndex) {
                if (arrayRandomChanged[r] == 0) {
                    arrayRandomChanged[r] = array[i];
                    serchFreeIndex = false;
                } else {
                    if (r == array.length - 1) {
                        r = 0;
                    } else {
                        r++;
                    }
                }
            }
        }

        output = new String(arrayRandomChanged);

        System.out.println ( output );
    }

}
