package claudia.week14_Selbsttest;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Selbsttest {
    public static void main(String[] args) {

        // Schleifen *******************
        // Aufgabe 1 -------------------
        /* Zähle in einer for-Schleife rückwärts von 10 bis inklusive 0 und gib jede Zahl aus.
         * Ausgabe:
            10 9 8 7 6 5 4 3 2 1 0
         */
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Aufgabe 1: ");
        for (int i = 10; i >= 0 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n" + "* - ".repeat(20) + "*");
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
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Aufgabe 2: ");
        System.out.println("entgegen der Aufgabenstellung Ausgabe in einer Zeile statt spaltenweise!");
        for (int i = -30; i <= 30 ; i++) {
            if (i % 3 == 0) System.out.print(i + " ");
        }
        System.out.println("\n" + "* - ".repeat(20) + "*");
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
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Aufgabe 3: ");
        int i = 0;
        while (i <= 10){
            if (i <= 5) System.out.println(i);
            else System.out.println(i + "\n");
            i++;
        }
        System.out.println("\n" + "* - ".repeat(20) + "*");

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
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Aufgabe 4: ");
        aufgabe4_5("X", 10, 4);
        aufgabe4_5("*:)", 15, 4);
        System.out.println("\n" + "* - ".repeat(20) + "*");

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
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Aufgabe 5: ");
        aufgabe4_5("X", 3, 5);
        aufgabe4_5("*:)", 5, 5);
        System.out.println("\n" + "* - ".repeat(20) + "*");
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
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Aufgabe 6: ");
        aufgabe6("X", 3);
        System.out.println("\n" + "* - ".repeat(20) + "*");
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
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Aufgabe 7: ");

        String text2 = aufgabe7_readString("Bitte gib Deinen Text ein: ");

        int anzahl = 0;
        while (anzahl <= 0) {
            anzahl = aufgabe7_readInt("Wie oft soll der Text geschrieben werden? Ganze, positive Zahl! ");
        }

        for (int j = 0; j < anzahl; j++) {
            System.out.println(text2);
        }


        System.out.println("\n" + "* - ".repeat(20) + "*");
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
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Aufgabe 8: ");

        aufgabe8(arr);
        aufgabe8(arr2);
        aufgabe8(arr3);

        System.out.println("\n" + "* - ".repeat(20) + "*");
        // Aufgabe 9 -------------------
        /* Erstelle jeweils eine Methode für Minimum (min), Maximum (max), und Durchschnitt (avg),
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
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Aufgabe 9: ");
        System.out.println("Printmethode etwas anders definiert als vorgegeben "+
                "\n-> nicht sinnvoll, ein Int zu übergeben, wenn Durchschnitt berechnet wird!");

        System.out.println("Minimum 1: " + aufgabe9_min(arr));
        System.out.println("Minimum 2: " + aufgabe9_min(arr2));
        System.out.println("Minimum 3: " + aufgabe9_min(arr3));
        System.out.println("Maximum 1: " + aufgabe9_max(arr));
        System.out.println("Maximum 2: " + aufgabe9_max(arr2));
        System.out.println("Maximum 3: " + aufgabe9_max(arr3));
        System.out.println("Durchschnitt 1: " + aufgabe9_avg(arr));
        System.out.println("Durchschnitt 2: " + aufgabe9_avg(arr2));
        System.out.println("Durchschnitt 3: " + aufgabe9_avg(arr3));
        aufgabe9_printMyResult("Minimum", aufgabe9_min(arr));
        aufgabe9_printMyResult("Maximum", aufgabe9_max(arr2));
        aufgabe9_printMyResult("Durchschnitt", aufgabe9_avg(arr3));

        System.out.println("\n" + "* - ".repeat(20) + "*");
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
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Aufgabe 10: ");

        int[] vec = aufgabe10(10);

        for (int j = 0; j < vec.length; j++) {
            System.out.print(vec[j] + " ");
        }
        System.out.println();
        for (int elem : vec) {
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(vec));

        System.out.println("\n" + "* - ".repeat(20) + "*");


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
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Aufgabe 11: ");

        String text = "Heute der 19.10.2021 wird ein sehr guter Tag. Zwar gibt es sowas wie einen Test, den 14 Leute schreiben, aber das ist doch egal!";
        text = text.replaceAll("[a-c]","X");
        text = text.replaceAll("[f-z]","Y");
        text = text.replaceAll("[1-5]","a");
        text = text.replaceAll("[4-9]","b");
        System.out.println(text);

        System.out.println("\n" + "* - ".repeat(20) + "*");
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
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Aufgabe 12: ");

        System.out.println("Aufgabenstellung wie folgt interpretiert:" +
                "\nPrüfe, ob der gegebene Ausdruck diesem Schema entspricht:" +
                "\nzuerst kommen drei oder mehr Kleinbuchstaben" +
                "\ndann eine Ziffer zwischen 1 und 9" +
                "\ndann zwei beliebige Ziffern" +
                "\ndanach mindestens ein Großbuchstabe");

        String regex = "^[a-z]{3,}[1-9][0-9]{2}[A-Z]+";

        System.out.println("abc100A".matches(regex));
        System.out.println("Abc100A".matches(regex));
        System.out.println("luke010A".matches(regex));
        System.out.println("test101ABCDE".matches(regex));
        System.out.println("test1ABCDE".matches(regex));

        System.out.println("\n" + "* - ".repeat(20) + "*");
        // Kalender ********************
        // Aufgabe 13 ------------------
        /* Gib mit Hilfe der Calendar Api den Wochentag des aktuellen Tages inklusive Datum aus.
         * Ausgabe:
DI 19.10.2021
         */
        System.out.println("\n" + "* - ".repeat(20) + "*");
        System.out.println("Aufgabe 13: ");

        Calendar today = Calendar.getInstance(); //Kalenderobjekt mit aktuellem Datum "heute"
        SimpleDateFormat todayFormatted = new SimpleDateFormat("E, dd.MM.yyyy");
        System.out.println(todayFormatted.format(today.getTime()));

        System.out.println("\n" + "* - ".repeat(20) + "*");
    }

    static void aufgabe4_5 (String symbol, int amount, int aufgabe){
        String separator;
        if (aufgabe == 4) separator = " ";
        else separator = "\n\n";
        System.out.println();
        for (int i = 0; i < amount; i++){
            System.out.print(symbol + separator);
        }

    }
    static void aufgabe6 (String symbol, int amount){
        aufgabe4_5(symbol, amount, 4);
        aufgabe4_5(symbol, amount, 5);
    }
    public static void aufgabe8(int[] vector){
        System.out.println("First: " + vector[0] + ", Last: " + vector[vector.length - 1]);
    }
    public static int[] aufgabe10(int n){
        int[] temp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            temp[i] = i;
        }
        return temp;
    }
    public static String aufgabe7_readString(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static int aufgabe7_readInt(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        int number = 0;
        try {
            number = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Das war keine ganze Zahl!");
        }
        return number;
    }
    public static int aufgabe9_min(int[] vector) {
        int min = vector[0];
        for (int elem : vector) {
            if (elem < min) min = elem;
        }
        return min;
    }
    public static int aufgabe9_max(int[] vector) {
        int max = vector[0];
        for (int elem : vector) {
            if (elem > max) max = elem;
        }
        return max;
    }
    public static double aufgabe9_avg(int[] vector) {
        int sum = 0;
        double avg = 0;
        for (int elem : vector) {
            sum = sum + elem;
        }
        avg = (double) sum / vector.length;
        return avg;
    }
    public static void aufgabe9_printMyResult(String which, double n){
        System.out.printf("%-20s : %10.2f%n", which, n);

    }
}
