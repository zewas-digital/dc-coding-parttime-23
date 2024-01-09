package saifedine.week04.example37;

/*
Lustige Sieben

Schreiben Sie ein Java-Programm für das Würfelspiel lustige Sieben mit dem ein Spieler gegen die Bank spielen kann.

Der Spieler setzt einen Einsatz auf eine beliebige Zahl auf einer Tafel (siehe unterhalb). Der Bankier würfelt mit zwei Würfeln und zählt die Augen zusammen.
Bei gleicher Zahl erhält der Spieler den doppelten und bei einer auf einer Längsseite der Spieltafel stehenden Zahl den einfachen Einsatz zurück.
Ansonsten gewinnt die Bank. Fallen also zB. acht Augen, so bekommt man bei gesetzter Zahl
acht den Einsatz doppelt, bei gesetzter Zahl 3, 5, 10 oder 12 den Einsatz einfach zurück, während man bei 7, 2, 4, 6, 9, 11 den Einsatz verliert.
Wenn die Zahl 7 (Refait) gesetzt wurde und fällt, dann zahlt die Bank den Einsatz dreifach zurück.

              7
            2	3
            4	5
            6	8
            9	10
           11	12


Beispieldialog:

Lass uns Spielen!
=========================================
=========================================

Bitte um Ihren Einsatz: 10
Einsatz: 10 EUR, Kontostand: -10 EUR
Setzen Sie auf eine Zahl zwischen 2 und 12: 5
Die Wuerfel sind gefallen: 5 + 3 = 8
Sie haben gewonnen und bekommen 10 EUR
Ihr neuer Kontostand lautet 0 EUR
Wollen Sie weiterspielen (j/n)? j
-----------------------------------------
Bitte um Ihren Einsatz: 10
Einsatz: 10 EUR, Kontostand: -10 EUR
Setzen Sie auf eine Zahl zwischen 2 und 12: 5
Die Wuerfel sind gefallen: 4 + 1 = 5
Sie haben gewonnen und bekommen 20 EUR
Ihr neuer Kontostand lautet 10 EUR
Wollen Sie weiterspielen (j/n)? j
-----------------------------------------
Bitte um Ihren Einsatz: 1000
Einsatz: 1000 EUR, Kontostand: -990 EUR
Setzen Sie auf eine Zahl zwischen 2 und 12: 5
Die Wuerfel sind gefallen: 4 + 3 = 7
Oje! Sie haben Ihren Einsatz in Hoehe von 1000 EUR verloren
Ihr neuer Kontostand lautet -990 EUR
-----------------------------------------
Ihr Gesamtgewinn/-verlust: -990 EUR




Schreiben Sie mindestens die folgenden Funktionen bzw. Methoden und rufen Sie diese in der main-Methode auf, um einen Beispieldialog wie oben erzeugen zu können:

    static int readBid() liest den Einsatz von der Nutzerin ein und liefert ihn als Ergebnis zurück. Der Einsatz wird dabei innerhalb der Methode vom Kontostand der Nutzerin abgezogen
    static int rollDice() würfelt mit einem Würfel und liefert eine zufällige Zahl von 1 bis 6
    static int readBet() liest die Zahl auf die der Benutzer setzt (von 2 bis 12) ein und liefert sie als Ergebnis zurück
    static int calculateWin(int dice, int bet, int bid) berechnet den Gewinn auf Basis der geratenen Zahl, gewürfelten Zahl und gesetzten Summe. Die Funktion liefert -1 bei falschen Parameterwerten.
    static boolean playAgain() fragt die Nutzerin, ob weitergespielt werden soll. Im Fall, dass weitergespielt werden soll, gibt die Methode true zurück, ansonsten false. Falls der Kontostand der Nutzerin bereits -100 € oder weniger beträgt, wird automatisch false zurückgegeben.
    static void playRound(int dice, int bet, int bid) übernimmt unter Verwendung der Methode calculateWin(int, int, int) das Spielen einer Runde auf Basis der gegebenen Parameter. Dies umfasst neben dem Aufruf der Methode calculateWin(int, int, int) auch die Änderung des Kontostandes der Nutzerin auf Basis des Spielergebnisses, sowie die Ausgabe des Spielergebnisses auf der Kommandozeile.

Hinweis: um von mehreren Methoden aus auf den Kontostand zugreifen bzw. diesen verändern zu können, sollen Sie eine statische Variable int total verwenden.
 */

// Todo
// berechnet den Gewinn auf Basis der geratenen Zahl, gewürfelten Zahl und gesetzten Summe = calculateWin
// Kontostand übertragen


import java.util.Random;
import java.util.Scanner;

public class LustigeSieben {

    static int total = 0;

    public static void main(String[] args) {

        boolean again = true;

        while (again) {

            System.out.println("Lass uns Spielen!");
            System.out.println("=========================================");
            System.out.println("=========================================");
            System.out.println();

            int bid = readBid();

            int bet = readBet();

            int dice = rollTwoDice();

            playRound(dice,bet,bid);

            again = playAgain();
        }
    }

    // liest den Einsatz von der Nutzerin ein und liefert ihn als Ergebnis zurück. Der Einsatz wird dabei innerhalb der Methode vom Kontostand der Nutzerin abgezogen
    static int readBid(){

        System.out.print("Bitte um Ihren Einsatz: ");
        Scanner eingabe = new Scanner(System.in);
        int einsatz = eingabe.nextInt();

        total =- einsatz;
        System.out.println("Einsatz: " + einsatz + " EUR, Kontostand: " + total + " EUR");
        return einsatz;
    }

    // liest die Zahl, auf die der Benutzer setzt (von 2 bis 12) ein und liefert sie als Ergebnis zurück
    static int readBet(){

        int zahlEinsatz = 0;

        Scanner eingabe = new Scanner(System.in);
        while (zahlEinsatz < 2 || zahlEinsatz > 12){
            System.out.print("Setzen Sie auf eine Zahl zwischen 2 und 12: ");
            zahlEinsatz = eingabe.nextInt();
        }
        return zahlEinsatz;
    }

    // würfelt mit einem Würfel und liefert eine zufällige Zahl von 1 bis 6
    static int rollDice(){

        Random zufall = new Random();
        int wuerfel = zufall.nextInt(1,6);
        return wuerfel;
    }

    static int rollTwoDice(){

        int wuerfel1 = rollDice();
        int wuerfel2 = rollDice();
        int dice = wuerfel1 + wuerfel2;
        System.out.println("Die Wuerfel sind gefallen: " + wuerfel1 + " + " + wuerfel2 + " = " + dice);
        return dice;
    }

    // berechnet den Gewinn auf Basis der geratenen Zahl, gewürfelten Zahl und gesetzten Summe. Die Funktion liefert -1 bei falschen Parameterwerten.
    // siehe Fallbeispiel, wieso ursprüngliche Lösung nicht funktioniert hat! package saifedine.week04; Arrays_0_Array

    static int calculateWin(int dice, int bet, int bid){

        int [] left = {2,4,6,9,11};
        int [] right = {3,5,8,10,12};

        int win = 0;

        if (bet == 7 && dice == 7){
            win = bid * 3;
            System.out.println("Ausgabe 1: " + win);
            return win;
        }
        else if (bet == dice && dice != 7){
            win = bid * 2;
            System.out.println("Ausgabe 2: " + win);
            return win;
        }

        else if (bet != dice) {

            for (int i = 0; i < left.length; i++) {
                if (bet == left[i]){
                    win = bid;
                    System.out.println("Ausgabe 3: " + win);
                    return win;
                }

                if (bet == right[i]) {
                    win = bid;
                    System.out.println("Ausgabe 4: " + win);
                    return win;
                }

                if (bet != left[i] && bet != right[i]) {
                    win = bid * (-1);
                    System.out.println("Ausgabe 5: " + win);
                    return win;
                }
            }
        }
        System.out.println("Ausgabe Ende: " + win);
        return win;
    }

    // fragt die Nutzerin, ob weitergespielt werden soll. Im Fall, dass weitergespielt werden soll, gibt die Methode true zurück, ansonsten false.
    // Falls der Kontostand der Nutzerin bereits -100 € oder weniger beträgt, wird automatisch false zurückgegeben.
    static boolean playAgain(){

        char choice = ' ';
        boolean again = true;

        if (total <= -100){
            System.out.println("Sie dürfen nicht spielen, Ihr Kontostand ist bereits -100 € oder weniger! Kontostand: " + total);
            return false;
        }
        while (choice != 'j' && choice != 'n'){
            Scanner eingabe = new Scanner(System.in);
            System.out.println("Beenden (j/n)? ");

            choice = eingabe.next().charAt(0);
        }
        if (choice == 'j'){
            return false;
        } else {
            return true;
        }
    }

    // übernimmt unter Verwendung der Methode calculateWin(int, int, int) das Spielen einer Runde auf Basis der gegebenen Parameter.
    // Dies umfasst neben dem Aufruf der Methode calculateWin(int, int, int) auch die Änderung des Kontostandes der Nutzerin auf Basis des Spielergebnisses,
    // sowie die Ausgabe des Spielergebnisses auf der Kommandozeile.
    static void playRound(int dice, int bet, int bid){

        int win = 0;

        win = calculateWin(dice, bet, bid);

        if (win < 0){
            System.out.println("Oje! Sie haben Ihren Einsatz in Hoehe von " + bid + " EUR verloren");
        }
        else if (win > 0){
            System.out.println("Sie haben gewonnen und bekommen " + bid + " EUR");
        }
        else {
            System.out.println("Sie haben nichts verloren und nichts gewonnen!");
        }

        total = total + win;

        System.out.println("Ihr neuer Kontostand lautet " + total);
    }
}
