package Matthias.week10_arrays;

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

    public static Scanner scanner = new Scanner( System.in );
    public static void main( String[] args ) {
        System.out.println( " Willkommen zum Reverseprogramm " );
        String Wort = scanner.nextLine();
        char[] charArray= Wort.toCharArray();
        printcharArray(  charArray);
        printreversecharArray(charArray);
    }
    //Methode 1:
    static public void printcharArray (char[] array){
        for (char swap:array)
             {
                 System.out.print(swap);
             }
    }
    //Methode 2:
    static public void printreversecharArray(char[] array){
        System.out.println(  );
        for (int i = array.length-1;  i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}