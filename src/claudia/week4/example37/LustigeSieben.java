package claudia.week4.example37;

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


import java.util.Random;
import java.util.Scanner;

public class LustigeSieben {
    static int total = 10; //Kontostand; Initialwert = 10
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;

        System.out.println("Lass uns Spielen!");
        System.out.println("=========================================");
        System.out.println("=========================================");
        while (again) {
            playRound(rollTwoDices(), readBet(), readBid());
            again = playAgain();
        }
    }

    static int rollDice(){
        //Würfelt mit einem Würfel
        Random rand = new Random();
        return rand.nextInt(1, 7);
    }
    static int rollTwoDices(){
        return rollDice() + rollDice();
    }
    static boolean playAgain() {
        //fragt die Nutzerin, ob weitergespielt werden soll.
        // Im Fall, dass weitergespielt werden soll, gibt die Methode true zurück, ansonsten false.
        // Falls der Kontostand der Nutzerin bereits -100 € oder weniger beträgt, wird automatisch false zurückgegeben.
        char choice;
        if (total <= -100) {
            System.out.println("Du darfst nicht mehr spielen, Kontostand " + total);
            return false;
        }
        System.out.print("Noch mal spielen? N für Nein, alles andere für Ja: ");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.next().charAt(0);
        System.out.println("**************************************************");
        return choice != 'N';
    }
    static int readBid(){
        //liest den Einsatz von der Nutzerin ein und liefert ihn als Ergebnis zurück.
        // Der Einsatz wird dabei innerhalb der Methode vom Kontostand der Nutzerin abgezogen
        int bid;
        System.out.println("Dein Kontostand beträgt: " + total);
        System.out.print("Wie hoch ist Dein Einsatz? ");
        Scanner scanner = new Scanner(System.in);
        bid = scanner.nextInt();
        total = total - bid;
        System.out.println("Neuer Kontostand: " + total);
        return bid;
    }
    static int readBet(){
        //liest die Zahl, auf die der Benutzer setzt (von 2 bis 12) ein und liefert sie als Ergebnis zurück
        int bet;
        System.out.print("Auf welche Zahl setzt Du (zwischen 2 und 12)? ");
        Scanner scanner = new Scanner(System.in);
        bet = scanner.nextInt();
        return bet;
    }
    static int calculateWin(int dice, int bet, int bid) {
        //berechnet den Gewinn auf Basis der geratenen Zahl, gewürfelten Zahl und gesetzten Summe. Die Funktion liefert -1 bei falschen Parameterwerten
        //TODO (noch kein Abfangen ungültiger Parameterwerte!).

        if (bet == dice && bet == 7) {
            System.out.println("Bank hat gewürfelt: " + dice);
            return 3 * bid;
        } else if (bet == dice) {
            System.out.println("Bank hat gewürfelt: " + dice);
            return 2 * bid;
        } else if ((bet == 2 || bet == 4 || bet == 6 || bet == 9 || bet == 11) && (dice == 2 || dice == 4 || dice == 6 || dice == 9 || dice == 11)) {
            System.out.println("Bank hat gewürfelt: " + dice);
            return bid;
        } else if ((bet == 3 || bet == 5 || bet == 8 || bet == 10 || bet == 12) && (dice == 3 || dice == 5 || dice == 8 || dice == 10 || dice == 12)) {
            System.out.println("Bank hat gewürfelt: " + dice);
            return bid;
        } else {
            System.out.println("Bank hat gewürfelt: " + dice);
            return 0;
        }
        //return -1;
    }
    static void playRound(int dice, int bet, int bid) {
        //übernimmt unter Verwendung der Methode calculateWin(int, int, int) das Spielen einer Runde auf Basis
        // der gegebenen Parameter. Dies umfasst neben dem Aufruf der Methode calculateWin(int, int, int) auch
        // die Änderung des Kontostandes der Nutzerin auf Basis des Spielergebnisses,
        // sowie die Ausgabe des Spielergebnisses auf der Kommandozeile.
        int win = calculateWin(dice, bet, bid);
        total = total + win;
        System.out.println("Dein Gewinn beträgt: " + win);
        System.out.println("Neuer Kontostand: " + total);
    }
}


