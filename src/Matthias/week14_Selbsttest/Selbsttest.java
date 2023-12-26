package Matthias.week14_Selbsttest;

import java.util.Random;
import java.util.Scanner;

public class Selbsttest {

    public static Random rand = new Random( );

    public static Scanner scanner = new Scanner( System.in );

    public static void main( String[] args ) {
        // Schleifen *******************
        // Aufgabe 1 -------------------
        /* Zähle in einer for-Schleife rückwärts von 10 bis inklusive 0 und gib jede Zahl aus.
         * Ausgabe:
            10 9 8 7 6 5 4 3 2 1 0
         */
        System.out.print( "\nAufgabe 1:" );
        downCounter( 10 );
        upCounter( 10 );
        // Aufgabe 2 -------------------
        /* Zähle in einer for-Schleife von -30 bis inklusive 30 und gib jede Zahl aus die ohne Rest durch 3 teilbar ist.
         * Ausgabe:
            -30
            -27
            -24
            ...
            24
            27
            30
         */
        System.out.print( "\nAufgabe 2:\n" );
        printFromTo( -30, 30 );
        // Aufgabe 3 -------------------
        /* Zähle mit Hilfe einer while-Schleife und einer separaten Zählvariable von 0 bis inklusive 10 und
         * gib die Zahlen aus. Wenn die Zahl größer als 5 ist mach 2 Zeilenumbrüche.
         * Ausgabe
         */
        System.out.print( "\nAufgabe 3:\n" );
        printWithWhile( 10 );

        // Methoden ********************
        // Aufgabe 4 -------------------
        /* Erstelle eine Methode welche einen string und einen int Parameter erhält.
         * Der angegebene string soll so oft wie beim int angegeben, in einer Zeile wiederholt ausgegeben
         * und mit einem Whitespace getrennt werden.
         *
         * Initialisiere Variablen für deine Parameter und gib diese dann der Methode weiter,
         * damit du deine Methoden wieder verwenden kannst.
         *
         * Aufruf:

         * Ausgabe:
         */
        System.out.print( "\nAufgabe 4:\n" );
        String symbol = "X";
        int amount = 10;
        PrintLineStipple( symbol, amount );

        // Aufgabe 5 -------------------
        /* Erstelle eine Methode welche einen string und einen int Parmeter erhält.
         * Der angegebene string soll so oft wie beim int angegeben in einer eigenen Zeile wiederholt werden.
         * Trenne die Zeilen zusätzlich durch ein Linebreak.
         * Aufruf:
        string symbol = "X";
        int amount = 3;
        PrintRowStipple(symbol, amount);
                 * Ausgabe:
        X

        X

        X
         */
        System.out.print( "\nAufgabe 5:\n" );
        PrintRowStipple( symbol, 3 );

        // Aufgabe 6 -------------------
        /* Erstelle eine Methode welche einen string und einen int Parameter erhält.
         * Nun sollen mit diesen beiden Parametern die beiden Methoden aus den vorhergehenden Aufgaben aufgerufen werden.
         * Die Methoden aus den vorhergehenden Aufgaben sollen nicht neu geschrieben werden.
         *
         * Aufruf:
string symbol = "X";
int amount = 3;
PrintStippleL(symbol, amount);
        * Ausgabe:
X X X
X

X

X
         */
        System.out.print( "\nAufgabe 6:\n" );
        PrintStippleL( symbol, 3 );
        // Input ***********************
        // Aufgabe 7 -------------------
        /* Lies einen string vom Benutzer ein und einen int.
         * Die Zahl besagt wie oft der string ausgegeben werden soll.
         * Wird ein leerer string oder ein ungültiger int eingegeben, so soll die Eingabe erneut erfolgen.
         * Erstelle eine Methode ReadString() und ReadNumber().
         * Eingabe:
Bitte geben Sie einen Text ein:
>> Heute wird ein guter Tag
Wie oft soll der Text ausgegeben werden:
>> 3
         * Ausgabe:
Heute wird ein guter Tag
Heute wird ein guter Tag
Heute wird ein guter Tag
         */
        System.out.print( "\nAufgabe 7:\n" );
        //ReadString liest den String und Überprüft ihn und gibt in zurück, wenn er den check Krieterien enspricht
        String ValidedString = ReadString( );
        //ReadNumber liest den int und Überprüft ihn und gibt in zurück, wenn er den check Krieterien enspricht
        int ValidedInt = ReadNumber( );
        //Druck Methode
        print( ValidedInt, ValidedString );

        // Arrays **********************
        int[] arr = new int[]{0, 1, 23, 5, 12, 4, 4, 2, 5, 2, 10};
        int[] arr2 = new int[]{123, 19471, 1, 4, 15715, 15, 1, 5, 15, 1, -10, -100};
        int[] arr3 = new int[]{478199, 7812973, 12387123, 12, 3, 123, 12, 3, 1, 3, 1, 3, 1, 8, 9, 15, 1, 5, 1, 5, 1, 5, 15, 1, 5, 0};

        // Aufgabe 8 -------------------
        /* Erstelle eine Methode die ein int[] als Parameter erhält und das erste und letzte Element
         * zu einem string zusammenfügt und zurückgibt. Verwende dazu die Beispielarrays in der Klasse
         * und gib das Ergebnis für alle 3 Arrays aus.
         * Aufruf:
PrintFirstAndLast(arr);
         * Ausgabe:
First: 0, Last: 10
         *
         */
        System.out.print( "\nAufgabe 8:\n" );
        String RückgabeArr = PrintFirstAndLast( arr );
        System.out.println( "Rückgabe Arr: " + RückgabeArr );
        String RückgabeArr2 = PrintFirstAndLast( arr2 );
        System.out.println( "Rückgabe Arr2: " + RückgabeArr2 );
        String RückgabeArr3 = PrintFirstAndLast( arr3 );
        System.out.println( "Rückgabe Arr3: " + RückgabeArr3 );

        // Aufgabe 9 -------------------
        /* Ertelle jeweils eine Methode für Minimum (min), Maximum (max), und Durchschnitt (avg),
         * welche den jeweiligen Wert für ein int[] berechnet und zurückgeben kann.
         * + Teste alle Methoden in der Start Methode mit allen gegebenen int[] der Klasse.
         * + Erstelle eine Print Methode die einen string und einen int bekommt.
         * Beispiel Aufruf:
PrintMyResult("Minimum",GetMin(arr));
         * Beispiel Ausgabe:
Minimum: 0
         * Beispiel Aufruf
PrintMyResult("Maximum",GetMax(arr));
         * Beispiel Ausgabe
Maximum: 23
         */
        System.out.print( "\nAufgabe 8:\n" );
        PrintMyResult( "Minimum", GetMin( arr ) );
        PrintMyResult( "Maximum", GetMax( arr ) );
        PrintMyResult( "Avarage", getAvg( arr ) );

        // Aufgabe 10 ------------------
        /* Erstelle eine Methode welche einen int als Parameter nimmt.
         * Diese Methode soll ein int[] erstellen und das int[] mit den Zahlen von 0 bis inklusive
         * der angegebenen Zahl befüllen und dann zurückgeben. Teste diese Methode in der Start Methode
         * und gib das Array auf verschiede Arten aus
         * (for-Schleife, foreach-Schleife und Console.WriteLine("[{0}]", string.Join(", ", arr)))
         * Aufruf:
int[] arr = fillArr(10);
//Ausgabe arr
         * Ausgabe:
0 1 2 3 4 5 6 7 8 9 10
         */

        // String **********************
        String text = "Heute der 19.10.2021 wird ein sehr guter Tag. Zwar gibt es sowas wie einen Test, den 14 Leute schreiben, aber das ist doch egal!";

        // Aufgabe 11 ------------------
        /* Ersetze mit Hilfe von regulären Ausdrücken folgendes aus dem in der Klasse gegebenen string. Folgende Aufzählung ist als Ganzes zu betrachten.
         * + a bis c durch X
         * + f bis z durch Y
         * + 1 bis 5 durch a
         * + 4 bis 9 durch b
         * und gib den string, bei dem alles ersetzt wurde, aus.
         * Ausgabe:
HeYYe deY ab.a0.a0aa YYYd eYY YeYY YYYeY TXY. ZYXY YYXY eY YYYXY YYe eYYeY TeYY, deY aa LeYYe YXYYeYXeY, XXeY dXY YYY dYXY eYXY!
         */

        // Aufgabe 12 ------------------
        /* Erstelle einen regulären Ausdruck der folgendem Sachverhalt entspricht und
         * prüfe diesen in der Start Methode.
         * Die Punkte gehören alle zum gleichen regulären Ausdruck und sollen nacheinander zutreffen:
1. Drei oder mehr Kleinbuchstaben
2. Eine Zahl größer als 0
3. Zwei Zahlen
4. Ein oder mehr Großbuchstaben
         *
Aufruf          Console.WriteLine(Regex.IsMatch("abc100A", regex));          Ausgabe          true

Aufruf          Console.WriteLine(Regex.IsMatch("Abc100A", regex));          Ausgabe          true

Aufruf          Console.WriteLine(Regex.IsMatch("luke010A", regex));          Ausgabe          true

Aufruf          Console.WriteLine(Regex.IsMatch("test101ABCDE", regex));          Ausgabe          true

Aufruf          Console.WriteLine(Regex.IsMatch("test1ABCDE", regex));          Ausgabe          true
         */

        // Kalender ********************
        // Aufgabe 13 ------------------
        /* Gib mit Hilfe der Calendar Api den Wochentag des aktuellen Tages inklusive Datum aus.
         * Ausgabe:
        DI 19.10.2021
         */
    }


    // Methode 1: downCounter
    public static void downCounter( int zahl ) {
        System.out.println( "Schleife Zählt von:" + zahl + "abwärts mit dem Wert: -1" );
        for (int i = zahl; i >= 0; i--) {
            System.out.print( zahl-- + "," );
        }
        System.out.println( );// Abstandhalter

        System.out.println( "Variante 2: " );

        int countToVar = zahl;// Input Var speichern -> logische herangehensweise einfacher
        for (int i = 0; i < countToVar + 1; i++) {
            System.out.print( zahl - i + " " );
        }
    }

    // Methode 2: upCounter
    public static void upCounter( int zahl ) {
        //Variante 1:
        System.out.println( "Schleife Zählt von 0 bis: " + zahl + "aufwärts zählt mit dem Wert: +1" );
        for (int i = 0; i <= zahl; i++) {
            System.out.print( i + " " );
        }
        System.out.println( );//Abstandhalter

        System.out.println( "Variante 2: " );

        System.out.println( "Schleife Zählt von 0 bis: " + zahl + "aufwärts zählt mit dem Wert: +1" );
        //Variante 2:
        int countToVar = zahl;// Input Var speichern -> logische herangehensweise einfacher

        for (int i = countToVar; i >= 0; i--) {
            System.out.print( zahl - i + " " );
        }
        System.out.println( );//Abstandhalter
    }

    // Methode 2: upCounter
    public static void printFromTo( int begin, int end ) {
        int StoreInputVar = begin;
        for (int i = begin; i <= end; i++) {
            System.out.print( StoreInputVar++ + "," );
        }

        System.out.println( "\n Variante 2: " );

        for (int i = begin; i <= end; i++) {
            if ( i % 3 == 0 ) {
                System.out.print( i + "," );
            }

        }
    }

    //Methode 3: upCounter with while
    public static void printWithWhile( int zahl ) {
        int localStorageValue = 0;
        while ( localStorageValue <= zahl ) {
            if ( localStorageValue > 5 ) {
                System.out.print( "\n \n" + localStorageValue++ );
            } else {
                System.out.print( localStorageValue++ + "," );
            }

        }
    }

    //Methode 4: Druckt einen Buchstaben in einer Line, so oft wie die Anzahl(amount), welche vorgegeben ist
    public static void PrintLineStipple( String symbol, int amount ) {
        {
            for (int j = 0; j < amount; j++) {
                System.out.print( "J:" + (j + 1) + " " + "__" + symbol );
            }
        }
    }

    //Methode 5: Druckt einen Buchstaben in einer row, so oft wie die Anzahl(amount), welche vorgegeben ist
    public static void PrintRowStipple( String symbol, int amount ) {
        {
            for (int i = 0; i < amount; i++) {
                System.out.println( "Zeilen" + i + ":" + "i:" + (i + 1) + " " + symbol + "\n" );

            }
        }
    }

    //Methode 6: Methode 4 & 5 Zusammengefast
    public static void PrintStippleL( String symbol, int amount ) {
        PrintLineStipple( symbol, amount );
        System.out.println( );
        PrintRowStipple( symbol, amount );
    }

    //Methode 7: Liest einen String ein und Überprüft ihn auf seine Gültigkeit
    public static String ReadString() {
        System.out.print( "Bitte geben Sie einen Text ein: " );
        //Hinweis: https://codegym.cc/de/groups/posts/de.666.java-uberprufen-sie-ob-string-null-leer-oder-leer-ist
        while ( true ) {
            String InputStreamString = scanner.next( );
            if ( InputStreamString != null ) {
                System.out.println( "Eingabe Erfolgreich geprüft!" );
                return InputStreamString;
            } else {
                System.out.println( "Eingabe Falsch!" );
            }
        }
    }

    //Methode 8: Liest einen String ein und Überprüft ihn auf seine Gültigkeit
    public static int ReadNumber() {
        System.out.println( "Wie oft soll der Text ausgegeben werden: " );
        while ( true ) {
            try {
                // Gibt den eingelesenen Int zurück und
                return scanner.nextInt( );
            } catch (Exception InputMismatchException) {
                // Code, der ausgeführt wird, wenn eine Ausnahme geworfen wird
                System.out.println( "Die Eingabe war kein Int! Geben Sie eine Ganzezahl ein!" );
                // Erklärung siehe: https://www.java-forum.org/thema/bedeutung-von-xxx-nextline.175453/
                //Löscht Line Space vom InputStream und setzt den Zeiger in eine neue Zeile
                scanner.nextLine( );
            }
        }
    }

    //Methode 9: Print Methode zum Drucken von Methode 7 und 8
    public static void print( int numberOfPrintsOfInputString, String Input ) {
        for (int i = 0; i < numberOfPrintsOfInputString; i++) {
            System.out.println( "Print Nr.:" + (i + 1) + ":" + Input );
        }
    }

    //Methode 10: Gibt den letzen und ersten Eintrag im Array zrück
    public static String PrintFirstAndLast( int[] arr ) {
        String StoreageNumber0 = null;
        String StoreageNumberofLastElement = null;
        for (int i = 0; i < arr.length; i++) {
            if ( i == 0 ) {
                StoreageNumber0 = Integer.toString( arr[i] );
            }
            if ( i == arr.length - 1 ) {
                StoreageNumberofLastElement = Integer.toString( arr[i] );
            }
        }
        return StoreageNumber0 + "," + StoreageNumberofLastElement;
    }

    //Methode 11: Print Methods for Mathods 12, 13,14
    public static void PrintMyResult(String Wort, int iZahl) {
        System.out.println( Wort + iZahl );
    }
    public static void PrintMyResult(String Wort, double dZahl) {
        System.out.println( Wort + dZahl );
    }

    //Methode 12: Search MinValue in an Int Array
    public static int GetMin( int[] Array ){
     int StorageMinValue=0;
        for (int intZahlInhaltArray : Array) {
            if ( intZahlInhaltArray < StorageMinValue ) {
                StorageMinValue = intZahlInhaltArray;
            }
        }
        return StorageMinValue;
    }

    //Methode 13: Search an MaxValue in an Int Array
    public static int GetMax( int[] Array ){
        int StorageMaxValue=0;
        for (int intZahlInhaltArray : Array) {
            if ( intZahlInhaltArray > StorageMaxValue ) {
                StorageMaxValue = intZahlInhaltArray;
            }
        }
        return StorageMaxValue;
    }

    //Methode 14: Calculate AvarageValue from an Int Array
    public static double getAvg( int[] Array ){
        int StorageMaxValue=0;
        for (int intZahlInhaltArray : Array) {
          StorageMaxValue=StorageMaxValue+intZahlInhaltArray;

        }
       return ((double) StorageMaxValue /Array.length);
    }

}

