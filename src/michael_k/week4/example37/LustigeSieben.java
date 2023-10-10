package michael_k.week4.example37;

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
    static void playRound(int dice, int bet, int bid) übernimmt unter Verwendung der Methode calculateWin(int, int, int) das Spielen einer Runde auf Basis der gegebenen Parameter.
    Dies umfasst neben dem Aufruf der Methode calculateWin(int, int, int) auch die Änderung des Kontostandes der Nutzerin auf Basis des Spielergebnisses, sowie die Ausgabe des Spielergebnisses auf der Kommandozeile.

Hinweis: um von mehreren Methoden aus auf den Kontostand zugreifen bzw. diesen verändern zu können, sollen Sie eine statische Variable int total verwenden.
 */


import java.util.Random;
import java.util.Scanner;

public class LustigeSieben {
static Scanner inputKonsole = new Scanner ( System.in );
static int kontostand =0;
static int gewinnVerlust=0;
    public static void main(String[] args) {

        int einsatz;
        int dice1;
        int dice2;
        int gewinnzahl;
        int wette;
        String weiter;
        boolean abbrechen = true;

        while( kontostand > -1000 && abbrechen ) {
            System.out.print ( "Bitte um Ihren Einsatz: " );
            einsatz = readBid ( );
            System.out.println ( "Einsatz: " + einsatz + " EUR, Kontostand: " + kontostand + " EUR" );
            dice1 = rollDice ( );
            dice2 = rollDice ( );
            gewinnzahl = dice1 + dice2;
            System.out.print ( "Setzen sie auf eine Zahl zwischen 2 - 12: " );
            wette = readBet ( );
            System.out.println ( "Die Würfel sind gefallen: " + dice1 + " + " + dice2 + " = " + gewinnzahl );
            gewinnVerlust = calculateWin ( gewinnzahl, wette, einsatz );
            if (gewinnVerlust < 0) {
                System.out.println ( "Oje sie haben den Einsatz von in Höhe von " + gewinnVerlust + " EUR verloren" );
            } else {
                System.out.println ( "Sie haben gewonnen und bekommen " + gewinnVerlust + " EUR" );
                kontostand = kontostand + gewinnVerlust;
            }
            System.out.println ( "Ihr neuer Kontostand lautet: " + kontostand + " EUR" );
            System.out.print ( "Wollen sie weiterspielen (j/n)?" );
            for (int i = 0; i <1; ) {
            weiter = inputKonsole.next ();
                System.out.println ("------------------------------------------------------" );
                if( weiter.equals ( "j" )){
                    abbrechen=true;
                    i++;
                }else if( weiter.equals ( "n" )){
                    abbrechen= false;
                    i++;
                }else{
                    System.out.println ("Eingabe ungültig" );
                    System.out.print ( "Wollen sie weiterspielen (j/n)?" );
                }
            }
        }

    }

    static int readBid( ){

        int einsatz = inputKonsole.nextInt ();
        kontostand = kontostand - einsatz;
        return einsatz;
    }

    static int rollDice(){
        Random zufallszahl = new Random ();
        int dice = zufallszahl.nextInt (5)+1;
        return dice;
    }

    static int readBet(){
        int wette = inputKonsole.nextInt ();
        return wette;
    }

    static int calculateWin(int gewinnzahl, int wette, int einsatz){
        gewinnVerlust =0;
        if( gewinnzahl>1  && gewinnzahl<13  &&  wette>1  &&  wette<13  &&  einsatz>0 ){

            if (7 == gewinnzahl && 7 == wette) {
                gewinnVerlust = einsatz * 3;
            } else if (wette == gewinnzahl) {
                gewinnVerlust = einsatz * 2;
            } else if (gewinnzahl == 3 || gewinnzahl == 5 || gewinnzahl == 8 || gewinnzahl == 10 || gewinnzahl == 12) {
                if (wette == 3 || wette == 5 || wette == 8 || wette == 10 || wette == 12) {
                    gewinnVerlust = einsatz;
                }
            } else if (gewinnzahl == 2 || gewinnzahl == 4 || gewinnzahl == 6 || gewinnzahl == 9 || gewinnzahl == 11) {
                if (wette == 2 || wette == 4 || wette == 6 || wette == 9 || wette == 11) {
                    gewinnVerlust = einsatz;
                }
            } else {
                gewinnVerlust = 0;
            }
        }else{gewinnVerlust=-1;}

        return gewinnVerlust;
    }
/*
    static boolean playAgain(){
        String abfrage = inputKonsole.next ();
        boolean weiterEnde=true;
        if(kontostand >-100 && abfrage == "j"){ weiterEnde = true;
        }else {weiterEnde=false;}

        return weiterEnde;
    }

    static void playRound(int 2xwürfel, int wette, int einsatz){

    }
*/

}
