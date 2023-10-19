package solutions.Simon.example37;

/*
Lustige Sieben

Schreiben Sie ein Java-Programm für das Würfelspiel lustige Sieben mit dem ein Spieler gegen die Bank spielen kann.

Der Spieler setzt einen Einsatz auf eine beliebige Zahl auf einer Tafel (siehe unterhalb). Der Bankier würfelt mit zwei Würfeln und zählt die Augen zusammen.
Bei gleicher Zahl erhält der Spieler den doppelten und bei einer auf einer Längsseite der Spieltafel stehenden Zahl den einfachen Einsatz zurück.
Ansonsten gewinnt die Bank. Fallen also zB. acht Augen, so bekommt man bei gesetzter Zahl
acht den Einsatz doppelt, bei gesetzter Zahl 3, 5, 10 oder 12 den Einsatz einfach zurück, während man bei 7, 2, 4, 6, 9, 11 den Einsatz verliert.
Wenn die Zahl 7 (Refait) gesetzt wurde und fällt, dann zahlt die Bank den Einsatz dreifach zurück.

              7
            2   3
            4   5
            6   8
            9   10
           11   12


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

import java.util.Random;
import java.util.Scanner;
public class LustigeSieben {

    static int total = 0; // Wurde noch nie erklärt wirklich, könnte auch hier den Scanner global definieren
    public static void main(String[] args) {

        int bid = readBid(); // Was der User als Einsatz gibt
        int bet = readBet(); // Was der User vor dem Würfeln als Zahl setzt


        System.out.println("Würfel 1");
        int dice1 = rollDice();
        System.out.println("Würfel 2");
        int dice2 = rollDice();
        int dicesum = dice1 + dice2; // Die Summe der zwei Würfel
        System.out.println("Würfel Ergebniss " + dicesum);


        // Alles schon probiert, für mich wäre logisch das dice1 und dice2 auch in der Methode behandelt werden sollte das ich auf dei dicesum komme.
        // Dann schaut es aber so aus als ob ich zwichen den methoden nicht auf die variablen der anderen Methoden zugreifen kann.
        // Ween ich das richtig verstehe muss es so gemacht werden weil ich so die methode rollDice zweimal aufrufen kann.

        int win = calculateWin(dicesum, bet, bid);

        if (win == -1){
            System.out.println("Leider haben sie ihren Einsatz verloren");
            total = total - bid;
        }
        else {
            total = total + win;
            System.out.println("Sie jhaben " + win + " EUR gewonnen");
        }
        System.out.println("Ihr neuer Kontostsand lautet " + total + " EUR");

    }

    ///////////////////////////////////////////

    static int readBid(){
        System.out.println("Bitte geben Sie ihren Einsatz ein");
        Scanner scan = new Scanner(System.in);
        int bid = scan.nextInt();
        System.out.println("Einsatz " + bid + " Kontostand " + (total - bid) );
        return bid;
    }

    ///////////////////////////////////////////

    static int rollDice(){
        Random rand = new Random();
        int randomValue = rand.nextInt(1, 6);
        System.out.println(randomValue);
        return randomValue;
    }

    ///////////////////////////////////////////

    static int readBet(){
        System.out.println("Bitte setzen sie auf eine Zahl zwischen 2 und 12");
        Scanner scan = new Scanner(System.in);
        int betChoice = scan.nextInt();
        if (betChoice >=.2 || betChoice <=12){
            System.out.println("Danke für den Einsatz");
        }
        else {
            System.out.println("Bitte geben sie eine Zahl zwischen 2 und 12 ein");
        }
        return betChoice;
    }

    ///////////////////////////////////////////

    static int calculateWin(int dice, int bet, int bid){
        if (dice == 7 && bet == 7) {
            return bid * 3;
        } else if ((dice == 3 || dice == 5 || dice == 8 || dice == 10 || dice == 12 || dice == 2 || dice == 4 || dice == 6 || dice == 9 || dice == 11) && bet == dice) {
            return bid * 2;
        } else if ((dice == 3 || dice == 5 || dice == 8 || dice == 10 || dice == 12 || dice == 2 || dice == 4 || dice == 6 || dice == 9 || dice == 11)) {
            return bid;
        } else {
            return -1;
        }
    }

    ///////////////////////////////////////////

    static boolean playAgain(){
        char playAgain;
        System.out.println("Wollen sie weiterspieln (j/n)");
        Scanner scan = new Scanner(System.in);
        playAgain = scan.next().charAt (0);
        if (playAgain == 'j' || playAgain == 'n'){
        }
        return true;
    }
    ///////////////////////////////////////////
}

