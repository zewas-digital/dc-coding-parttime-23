package solutions.michael_k.week3.example35;

import java.util.Random;
import java.util.Scanner;

/*
Erstelle ein Spiel, welche der Spieler fordert heraus eine Zahl zwischen 0 und 9999 zu erraten.

Ablauf:

    Der Computer denkt sich eine Zahl aus.

Code-Zeile:
Random rand = new Random();
int value = rand.nextInt(10000);

    Der Benutzer muss durch Konsole eine Zahl eingeben
    Das Spiel antwortet
        So viele Ziffern sind korrekt und auf dem richtigen Platz
        So viele Ziffern sind vorhanden, aber stehen auf dem falschen Platz


Ausgabe:
( Der Computer hat die Zahl: 1234 )
Der Spieler wählt die 2354
Die Antwort lautet: 1 Ziffer ist korrekt, weitere 2 Ziffern sind vorhanden

Das Spiel endet, wenn:

    der Spieler die richtige Zahl erraten hat
    der Spieler hat nach 20 Versuchen immer noch kein Erfolg
 */
public class Game {

    public static void main(String[] args){

        char[] nummern = new char[4];                               // hier wird ein 1D-array erstellt mit 4 stellen


        while(true) {

            Scanner inputKonsole = new Scanner(System.in);
            Random zufall = new Random ();

            int zufallszahl = zufall.nextInt (10000 );
            int Eingabe;

            System.out.println (nummern);
            System.out.println ("Lass uns ein Spiel spielen, tippe tippe eine 4-stellige Zahl ein" );
            System.out.println ( );
            Eingabe = inputKonsole.nextInt ();



            for (int i = 0; i < 4; i++) {                           //hier wird der 1D-Array befüllt mit den einzelnen
                nummern[i] = (zufallszahl+"").charAt ( i );         //Nummern der Zufallszahl
            }

            for (int i = 0; i < nummern.length; i++) {              //Hier werden einzelne Nummer aus bem Array in
                System.out.println (nummern[i] );                   //die Konsole geschrieben
            }


        //    int x1,x2,x3,x4 = Zahlzerlegung ( zufallszahl );
            char x1 = (zufallszahl+"").charAt ( 0 );
            char x2 = (zufallszahl+"").charAt ( 1 );
            char x3 = (zufallszahl+"").charAt ( 2 );
            char x4 = (zufallszahl+"").charAt ( 3 );
        }

    }


}



//boolean jjjj = false;
//int kkk = jjjj ? 1:0;
//System.out.println (kkk );