package judith.week10_strings;

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
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben sie ein Wort ein ");
       String word = scan.nextLine();

        System.out.println("Eingawert " + word);

        char[] zeichen = word.toCharArray();

        for (int i = 0; i < word.length() ; i++) {
            for (int j = 0; j <word.length() ; j++) {

              //  temp = word[j];
             //   word[j] = word[i];
              //  word[i] = temp;
            }
           System.out.println(word);


//funktioniert gleich wie bei Bullelsort INT Aufgabe 08
            // oder siehe Claudias Beispiel
            // oder Matthias
        }




    }




}