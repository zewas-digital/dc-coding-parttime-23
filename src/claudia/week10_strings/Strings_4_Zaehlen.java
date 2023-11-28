package claudia.week10_strings;

/*
Aufgabe: Buchstaben zählen
In der folgenden Aufgabe sollen alle Buchstaben und Zeichen eines Texts gezählt werden.
Den Text erhältst du vom Package data: data.Texts.getSimpleText().

Um die einzelnen Buchstaben und Zeichen zu zählen soll ein int[] verwendet werden.
Der entsprechende char kann für das Array als Index verwendet werden.
Gib am Schluss die Anzahl der einzelnen Zeichen (zb. A,a,ä,.) aus.

Ausgabe

A: 10
B: 20
C: 1
...
 */

//ASCII 0 bis 255

/*
        //convert String to Array of chars
        char[] letters = word.toCharArray();

        //convert Array of chars to String
        String drow = new String(srettel);
        */


import claudia.BasicFunctions;

public class Strings_4_Zaehlen {
    public static void main(String[] args) {

        String text = data.Texts.getSimpleText();

        System.out.println("komische Buchstaben: " + (char) 322 + ", " + (char) 8224 + ", " + (char) 8222 + ", " + (char) 8220);
        //TODO Vorher größten Index ermitteln, der benötigt wird?
        // TODO Array dynamisch verlängern im Catch?: int newlength = array1.length + 1; char[] array2 = Arrays.copyOf(array1, newlength); bzw. um
        //TODO andere Idee: 2-D-Array mit [ascii, anzahl]?
        //TODO andere Idee: schon überprüfte chars an ein String anhängen und jedes Mal überprüfen, ob char vorkommt (wenn ja -> nicht mehr prüfen); direkte Ausgabe; Länge vom String = Anzahl verschiedener Zeichen
        //TODO String-Methode contains()
        int[] lettersAscii = new int[255];

        for (int i = 0; i < text.length(); i++) {
            char buchstabe = text.charAt(i);
            int buchstabeAscii = (int) buchstabe;

            if (buchstabeAscii > 255) System.out.println("Achtung " + buchstabe + " Ascii " + buchstabeAscii);;

            /*if (lettersAscii[buchstabeAscii] == 0) {
                int anzahl = countOfChar(text, buchstabe);
                lettersAscii[buchstabeAscii] = countOfChar(text, buchstabe);
            }*/
            //TODO Werden Buchstaben nur einmal getestet oder bei jedem Auftreten?
            //TODO wenn keine Umwandlung in Ascii, sollte es funktionieren, auch die komischen Zeichen zu vergleichen
            //TODO ggf. auf ERgebnisarray verzichten, stattdessen direkte Ausgabe

            try {
                lettersAscii[buchstabeAscii] = countOfChar(text, buchstabe);
            } catch (Exception e){
                System.out.println("Hier geht's schief! " + buchstabe + " ASCII: " + buchstabeAscii);
                System.out.println(e);
                System.out.println("Index: " + i);
            }


        }
       // System.out.println("Max " + max);

        for (int i = 0; i < 256; i++) {
            if (lettersAscii[i] != 0) {
                System.out.print("Anz. " + (char) i + ": " + lettersAscii[i]+"\t\t\t");
            }


            if (i % 4 == 0) System.out.println();
        }

       // BasicFunctions.print1DArray(lettersAscii);
}
        //char char1 = 'A';
        //int counter = 0;

        /*System.out.println("So viele A's: " + counter + "ASCII-Code: " + (int) char1);
        int zahl = (int) char1;
        lettersAscii[zahl] = counter;
        //lettersAscii[int('A')] = counter;
        // text
        // sout: countOfChar('M')
        // sout: countOfChar('a')
        // sout: countOfChar('r')
        // sout: countOfChar('i')*/

    static int countOfChar(String text, char letter) {
        char[] letters = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (letters[i] == letter) counter++;
        }
        return counter;
    }
}
