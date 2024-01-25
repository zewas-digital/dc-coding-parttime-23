package michael_k.week13;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Selbsttest {
    public static void main(String[] args) {
        // Schleifen *******************
        // Aufgabe 1 -------------------
        /* Zähle in einer for-Schleife rückwärts von 10 bis inklusive 0 und gib jede Zahl aus.
         * Ausgabe:
            10 9 8 7 6 5 4 3 2 1 0
         */
        System.out.println ( "Aufgabe 1: " );
        for (int i = 10; i > -1; i--) {
            System.out.print ( " " + i );
        }
        System.out.println ( );
        System.out.println ( );
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
        System.out.println ( "Aufgabe 2:" );
        for (int i = -30; i < 31; i++) {
            if (i % 3 == 0) {
                System.out.print ( " " + i );
            }
        }
        System.out.println ( );
        System.out.println ( );
        // Aufgabe 3 -------------------
        /* Zähle mit Hilfe einer while-Schleife und einer separaten Zählvariable von 0 bis inklusive 10 und
         * gib die Zahlen aus. Wenn die Zahl größer als 5 ist mach 2 Zeilenumbrüche.
         * Ausgabe
0
1
2
3
4
5
6

7

8

9

10
         */
        System.out.println ( "Aufgabe 3:" );
        for (int i = 0; i < 11; i++) {

            if (i < 6) {
                System.out.println ( i );
            } else {
                System.out.println ( i );
                System.out.println ( );
            }
        }

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
string symbol = "X";
int amount = 10;
PrintLineStipple(symbol, amount);
         * Ausgabe:
X X X X X X X X X X
         */
        System.out.println ( "Aufgabe 4:" );

        String str1 = "Hi!";
        int amount1 = 6;

        Aufgabe4 ( str1, amount1 );
        System.out.println ( );

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

        System.out.println ( "Aufgabe 5:" );

        String str2 = "Hi!";
        int amount2 = 3;

        Aufgabe5 ( str2, amount2 );

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

        System.out.println ( "Aufgabe 6:" );

        String str3 = "Hi!";
        int amount3 = 3;

        Aufgabe4 ( str3, amount3 );
        System.out.println ( );
        Aufgabe5 ( str3, amount3 );
        System.out.println ( );

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

        System.out.println ( "Aufgabe 7:" );
        int amount = Aufgabe7Int ( );
        String input = Aufgabe7String ( );

        for (int i = 0; i < amount; i++) {
            System.out.println ( input );
        }
        System.out.println ( );
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
        System.out.println ( "Aufgabe 8:" );

        Aufgabe8 ( arr );
        Aufgabe8 ( arr2 );
        Aufgabe8 ( arr3 );
        System.out.println ( );
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
        System.out.println ("Aufgabe 9:" );
        System.out.println ( );
        Aufgabe9Print ( "Minimum",Aufgabe9getMin ( arr ) );
        Aufgabe9Print ( "Maximum",Aufgabe9getMax ( arr2 ) );
        Aufgabe9Print ( "Durchschnitt",Aufgabe9getAvg ( arr3 ) );

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
        System.out.println ( );
        System.out.println ("Aufgabe 10:" );
        System.out.println ( );
        
        Scanner inputKonsole = new Scanner ( System.in );
        System.out.println ( "Wie lang soll des Array sein:" );
        int input2 = inputKonsole.nextInt ( );

        int[] arr10 = Aufgabe10FillArray (input2);

        for (int i = 0; i < input2+1; i++) {
            System.out.print (arr10[i]+" " );
        }
        System.out.println ( );
        for (int value: arr10) {
            System.out.print ( value +" ");
        }
        System.out.println ( );
        String[] StringArray= new String[arr10.length];

        //Hilfe: https://javabeginners.de/String/int_zu_String.php
        for (int i = 0; i < arr10.length; i++) {
            StringArray[i]=Integer.toString( arr10[i]);
        }
        System.out.println(String.join( " ",StringArray));

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

        System.out.println ( );
        System.out.println ("Aufgabe 11:" );
        System.out.println ( );

        String text1 = text;
        text1= text1.replaceAll("[a-c]", "X");
        text1= text1.replaceAll("[f-z]", "Y");
        text1= text1.replaceAll("[1-5]", "a");
        text1= text1.replaceAll("[6-9]", "b");
        System.out.println (text1);

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
        System.out.println ( );
        System.out.println ("Aufgabe 12:" );
        System.out.println ( );

        String Regex="^[a-z]{3,}[1-9][0-9]{2}[A-Z]+$";
        String[] strings = new String[]{"abc100A","Abc100A","luke010A","test101ABCDE","test1ABCDE"};
        for (String string : strings) {
            System.out.println ( string + ": " + string.matches( Regex ));
        }
        //System.out.println( "abc100A".matches("^[a-z]{3,}[1-9][0-9]{2}[A-Z]+$" ) );
        // Kalender ********************
        // Aufgabe 13 ------------------
        /* Gib mit Hilfe der Calendar Api den Wochentag des aktuellen Tages inklusive Datum aus.
         * Ausgabe:
DI 19.10.2021
         */
        System.out.println ( );
        System.out.println ("Aufgabe 13:" );
        System.out.println ( );

        Calendar cal = Calendar.getInstance ();

        SimpleDateFormat today = new SimpleDateFormat ( "EE dd.MM.yyyy" );
        System.out.println ( today.format ( cal.getTime ( ) ) );


    }

    static void Aufgabe4(String str, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print ( str + " " );
        }
    }

    static void Aufgabe5(String str, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println ( str + "\n" );
        }
    }

    static String Aufgabe7String() {
        Scanner inputKonsole = new Scanner ( System.in );
        System.out.println ( "Bitte geben Sie einen Text ein:" );
        String input = inputKonsole.nextLine ( );
        return input;
    }

    static int Aufgabe7Int() {
        Scanner inputKonsole = new Scanner ( System.in );
        System.out.println ( "Wie oft soll der Text ausgegeben werden:" );
        int input = inputKonsole.nextInt ( );
        return input;
    }

    static void Aufgabe8(int[] arr) {
        int firstValue = arr[0];
        int lastValue = arr[arr.length - 1];

        System.out.println ( "First: " + firstValue + ", " + "Last: " + lastValue );
    }

    static void Aufgabe9Print(String metode, int value) {
        System.out.println ( metode + ": " + value );
    }

    static int Aufgabe9getMin(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x > arr[i]) {
                x = arr[i];
            }
        }
        return x;
    }
    static int Aufgabe9getMax(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x < arr[i]) {
                x = arr[i];
            }
        }
        return x;
    }
    static int Aufgabe9getAvg(int[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            x= x+arr[i];
        }

        return x/ arr.length;
    }
    static int[] Aufgabe10FillArray(int sice){

        int[] arr = new int[sice+1];
        for (int i = 0; i < sice+1; i++) {
            arr[i] = i;
        }
        return arr;
    }

}
