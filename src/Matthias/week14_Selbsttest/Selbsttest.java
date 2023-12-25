package Matthias.week14_Selbsttest;

public class Selbsttest {
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
        PrintRowStipple(symbol, 3);

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
        PrintStippleL( symbol,3 );
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
                System.out.print( "J:" + (j +1)+ " " + "__" + symbol );
            }
        }
    }

    //Methode 5: Druckt einen Buchstaben in einer row, so oft wie die Anzahl(amount), welche vorgegeben ist
    public static void PrintRowStipple (String symbol, int amount ) {
        {
            for (int i = 0; i < amount; i++) {
                    System.out.println( "Zeilen"+i+ ":"+ "i:"+(i +1 )+" "+ symbol +"\n");

            }
        }
    }

    //Methode 6: Methode 4 & 5 Zusammengefast
    public static void PrintStippleL(String symbol, int amount){
        PrintLineStipple( symbol,amount );
        System.out.println(  );
        PrintRowStipple( symbol,amount );
    }
}

