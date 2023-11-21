package oliver.week10_strings;

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

    public static Scanner scanner = new Scanner( System.in );
    public static Random rand = new Random( );

    public static void main( String[] args ) {
        System.out.println( " Willkommen zum Reverseprogramm " );
        String Wort = scanner.nextLine();

        char[] charArray= Wort.toCharArray();

        randomarray(charArray);
        randomarray(charArray);
        randomarray(charArray);
        randomarray(charArray);
    }
    static public void randomarray( char[] array ) {
        int randomIndex = rand.nextInt( 0, array.length );
        char[] result = new char[array.length];

        System.out.println("\nstarte-------\n");
        for (int i = 0; i < array.length; i++) {
            //System.out.println(i+ ":"+ String.valueOf(result[randomIndex]) +"+"+ (int)result[randomIndex]);

            while ((int)result[randomIndex] != 0) {
                randomIndex = rand.nextInt( 0, array.length );
                // System.out.println("new randIndex:"+ randomIndex);
            }

            result[randomIndex] = array[i];
        }

        // Ausgabe: For-Schleife gibt den Random Array aus
        for (int i = 0; i < array.length; i++) {
            System.out.print( result[i] );
        }
    }
}
