package Matthias.week4;

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


import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class example_37_LustigeSieben {
    static int total = 10; //Kontostand; Initialwert = 10
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;

        System.out.println("Lass uns Spielen!");
        System.out.println("=========================================");
        System.out.println("=========================================");
        while ( again ){
            //Vorbereitung:
                //1.Schritt: Spielfeld auslegen

            //Spiel:
                //1. Schritt: Einzahlen der Wette
            int UserBid=readBid();
                //2. Schritt: GlücksZahl des Benutzers abfragen
            int UserBetNumber=readBet();
                //3. Schritt: der Bankier Würfelt mit zweimal
            int [] rolledNumbers= rollDice();
            int rolledNumber= rolledNumbers[0]+rolledNumbers[1];
            System.out.println("Die Würfel sind gefallen: " + rolledNumbers[0] + " + " + rolledNumbers[1] + " = " + rolledNumber );
            if (playRound( rolledNumber,UserBetNumber,UserBid ) == false) {
                again=false;
            } else if ( playAgain( ) == false ) {
                again=false;
            }
        }
    }
    // Methode 1: liest den Einsatz von der Nutzerin ein und liefert ihn als Ergebnis zurück.
    // Der Einsatz wird dabei innerhalb der Methode vom Kontostand der Nutzerin abgezogen
    public static int readBid(){
        Scanner Scanner = new Scanner( System.in );
        // User Abgfrage: Einsatz
        System.out.print("Bitte um Ihren Einsatz: " );
        int UserDeposit= Scanner.nextInt(); //negativer Einsatz wird nicht Überprüft!
        // User Ausgabe des Einsatzes und des aktuellen Kontostandes unter abzug des Einsatzes
        total=total-UserDeposit;
        System.out.println("Einsatz: "+ UserDeposit +", Kontostand: " +total);
      return UserDeposit;
    }

    //Methode 2: würfelt mit einem Würfel und liefert eine zufällige Zahl von 1 bis 6
    public static int[] rollDice(){
        Random rand = new Random();
        int [] rolledNumber= new int[]{rand.nextInt(1, 7),rand.nextInt(1, 7)};
        return rolledNumber;
    }
    // Methode 3: liest die Zahl auf die der Benutzer setzt (von 2 bis 12) ein und liefert sie als Ergebnis zurück
    public static int readBet(){
        Scanner scanner=new Scanner( System.in );
        System.out.print("Setzen Sie auf eine Zahl zwischen 2 und 12: " );
        int UserBetNumber= scanner.nextInt( );
        return UserBetNumber;
    }
    //Methode 4: berechnet den Gewinn auf Basis der geratenen Zahl, gewürfelten Zahl und gesetzten Summe.
    // Die Funktion liefert -1 bei falschen Parameterwerten.
    public static int calculateWin(int dice, int bet, int bid) {
        //Kaskadierung der Überprüfung, der Übergebenenwerte
        // 1. Überprüfung, ob die gewettet Zahl im Bereich der zu würfelden Zahlen ist Menge {2-12}
        if ((bet<2||bet >12)) {
            //System.out.print("Error 1: CalculateWin : Bitte geben Sie eine Zahl von 2-12 ein, um eine Wette abzugeben!");
            return -1; // ErrorCode Minu
        }
        //Kaskadierung der Überprüfungen, der Spielregeln
        // 1. Überprüfung, ob die Gewürftelte Zahl eine 7 ist. -> Folge 3-fache Auszahlung
        if (bet == dice && bet == 7) {
            System.out.println("Bank hat gewürfelt: " + dice);
            return 3 * bid;
        }
        // 2. Überprüfung, ob die Gewürftelte Zahl die gewürfelte Zahl des Bankies ist. -> Folge 2-fache Auszahlung
        else if (bet == dice) {
            System.out.println("Bank hat gewürfelt: " + dice);
            return 2 * bid;
        }
        // 3. Überprüfung, ob die gewürfelte Zahl der ersten Reihe der Tafel entspricht UND die gewettete Zahl dem ersten Reihe der Tafel entspricht
        // -> wenn ja bekommt der Spieler die Wette einsatz einmal zurück
        else if ((bet == 2 || bet == 4 || bet == 6 || bet == 9 || bet == 11) && (dice == 2 || dice == 4 || dice == 6 || dice == 9 || dice == 11)) {
            System.out.println("Bank hat gewürfelt: " + dice);
            return bid;
        }
        // 3. Überprüfung, ob die gewürfelte Zahl der zweiten Reihe der Tafel entspricht UND die gewettete Zahl dem zweiten Reihe der Tafel entspricht
        // -> wenn ja bekommt der Spieler die Wette einsatz einmal zurück
        else if ((bet == 3 || bet == 5 || bet == 8 || bet == 10 || bet == 12) && (dice == 3 || dice == 5 || dice == 8 || dice == 10 || dice == 12)) {
            System.out.println("Bank hat gewürfelt: " + dice);
            return bid;

        } else {
            //Sonst bekommt er nichts gut geschrieben ! Verlust des Geldes an die Bank!
            System.out.println("Bank hat gewürfelt: " + dice);
            return 0;
        }
    }
    // Methode 5: fragt die Nutzerin, ob weitergespielt werden soll.
    // Im Fall, dass weitergespielt werden soll, gibt die Methode true zurück, ansonsten false.
    // Falls der Kontostand der Nutzerin bereits -100 € oder weniger beträgt, wird automatisch false zurückgegeben.
    public static boolean playAgain() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Wollen Sie weiterspielen (j/n):" );
        char jORn=scanner.next().charAt( 0 );
        if ( total<=-100) {
            System.out.println("Sie können unter: "+total+" nicht Weiterspielen aufwiedersehen!" );
            return false;
        }else if ( jORn =='j') {
            return true;
        }else if(jORn =='n'){
            return false;
        } else {
            System.out.println("Eingabe ist ungültig. Bitte geben Sie 'j' für ja oder 'n' für nein ein.");
            return false;
        }
    }
    //Methode 6: übernimmt unter Verwendung der Methode calculateWin(int, int, int) das Spielen einer Runde auf Basis der
    //gegebenen Parameter. Dies umfasst neben dem Aufruf der Methode calculateWin(int, int, int) auch die Änderung
    //des Kontostandes der Nutzerin auf Basis des Spielergebnisses, sowie die Ausgabe des Spielergebnisses auf der Kommandozeile.
    static boolean playRound(int dice, int bet, int bid){
        int winORLose=calculateWin( dice,bet,bid );
        if ( winORLose==-1 ){
            System.out.print("Error 1: CalculateWin : Bitte geben Sie eine Zahl von 2-12 ein, um eine Wette abzugeben!");
            return false;
        }else {
            total = total + winORLose;
            System.out.println("Dein Gewinn beträgt: " + winORLose);
            System.out.println("Neuer Kontostand: " + total);
            return true;
        }
    }
}
