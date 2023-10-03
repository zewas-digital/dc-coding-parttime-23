package solutions.michael_k.week3.example35;

import java.sql.SQLOutput;
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

        Scanner inputKonsole = new Scanner(System.in);
        Random zufall = new Random ();

        String zufallszahl = zufall.nextInt (9999 )+"" ;
        while (zufallszahl.length () < 4){
            zufallszahl = "0" + zufallszahl;
        }


        char x1=0, x2 =0, x3=0, x4 =0;

        x1 = zufallszahl.charAt ( 0 );            // Hier wird die Zufallszahl in ihre einzelnen Zahlen
        x2 = zufallszahl.charAt ( 1 );            // zerlegt. Es wird mit der Zahl ein String erstellt
        x3 = zufallszahl.charAt ( 2 );            // und mit .charAt (0), den Char an der bestimmten stelle
        x4 = zufallszahl.charAt ( 3 );            // heraus genommen.


        int i =1;
        System.out.println ("Lass uns ein Spiel spielen, tippe eine 4-stellige Zahl ein" );

        while(i <=20) {

            System.out.println ("Runde "+i);
            System.out.println ( );

            String Eingabe = inputKonsole.nextInt ()+"";
            while (Eingabe.length () < 4){
                Eingabe = "0" + Eingabe;
            }

            //System.out.println (zufallszahl );
            //System.out.println (Eingabe );

            char y1 = Eingabe.charAt ( 0 );
            char y2 = Eingabe.charAt ( 1 );
            char y3 = Eingabe.charAt ( 2 );
            char y4 = Eingabe.charAt ( 3 );

            boolean xy1 = x1==y1;       int z11 = xy1 ? 1:0;
            boolean xy2 = x2==y2;       int z22 = xy2 ? 1:0;
            boolean xy3 = x3==y3;       int z33 = xy3 ? 1:0;
            boolean xy4 = x4==y4;       int z44 = xy4 ? 1:0;

            int z1234 = z11+z22+z33+z44;

            boolean x1y2=false, x1y3=false, x1y4=false, x2y1=false, x2y3=false, x2y4=false,
                    x3y1=false, x3y2=false, x3y4=false, x4y1=false, x4y2=false, x4y3=false;

            if( !xy1 && !xy2 )                                      {x1y2 = x1 == y2;}      int z12 = x1y2 ? 1:0;
            if( !xy1 && !xy3 && !x1y2 )                             {x1y3 = x1 == y3;}      int z13 = x1y3 ? 1:0;
            if( !xy1 && !xy4 && !x1y2 && !x1y3)                     {x1y4 = x1 == y4;}      int z14 = x1y4 ? 1:0;

            if( !xy2 && !xy1 )                                      {x2y1 = x2 == y1;}      int z21 = x2y1 ? 1:0;
            if( !xy2 && !xy3 && !x2y1 && !x1y3)                     {x2y3 = x2 == y3;}      int z23 = x2y3 ? 1:0;
            if( !xy2 && !xy4 && !x2y1 && !x2y3 && !x1y4)            {x2y4 = x2 == y4;}      int z24 = x2y4 ? 1:0;

            if( !xy3 && !xy1 && !x2y1)                              {x3y1 = x3 == y1;}      int z31 = x3y1 ? 1:0;
            if( !xy3 && !xy2 && !x1y2 && !x3y1)                     {x3y2 = x3 == y2;}      int z32 = x3y2 ? 1:0;
            if( !xy3 && !xy4 && !x1y4 && !x2y4 && !x3y1 && !x3y2)   {x3y4 = x3 == y4;}      int z34 = x3y4 ? 1:0;

            if( !xy4 && !xy1 && !x2y1 && !x3y1)                     {x4y1 = x4 == y1;}      int z41 = x4y1 ? 1:0;
            if( !xy4 && !xy2 && !x1y2 && !x3y2 && !x4y1)            {x4y2 = x4 == y2;}      int z42 = x4y2 ? 1:0;
            if( !xy4 && !xy3 && !x1y3 && !x2y3 && !x4y1 && !x4y2)   {x4y3 = x4 == y3;}      int z43 = x4y3 ? 1:0;

            int z4321 = z12 + z13 + z14 + z21 + z23 + z24 + z31 + z32 + z34 + z41 + z42 + z43;

            if (z1234 == 4){
                System.out.println ("Gratuliere du hast es geschafft" );
                i=21;
            }
            else {
                System.out.println ( z1234 + " Ziffern sind korrekt und auf dem richtigen Platz" );
                System.out.println ( z4321 + " Ziffern sind vorhanden, aber stehen auf dem falschen Platz" );
            }

            i++;


        }

    }

}

/*
if( !xy1 && !xy2 ){x1y2 = x1 == y2;}      int z12 = x1y2 ? 1:0;
            if( !xy1 && !xy3 ){x1y3 = x1 == y3;}      int z13 = x1y3 ? 1:0;
            if( !xy1 && !xy4 ){x1y4 = x1 == y4;}      int z14 = x1y4 ? 1:0;

            if( !xy2 && !xy1 ){x2y1 = x2 == y1;}      int z21 = x2y1 ? 1:0;
            if( !xy2 && !xy3 ){x2y3 = x2 == y3;}      int z23 = x2y3 ? 1:0;
            if( !xy2 && !xy4 ){x2y4 = x2 == y4;}      int z24 = x2y4 ? 1:0;

            if( !xy3 && !xy1 ){x3y1 = x3 == y1;}      int z31 = x3y1 ? 1:0;
            if( !xy3 && !xy2 ){x3y2 = x3 == y2;}      int z32 = x3y2 ? 1:0;
            if( !xy3 && !xy4 ){x3y4 = x3 == y4;}      int z34 = x3y4 ? 1:0;

            if( !xy4 && !xy1 ){x4y1 = x4 == y1;}      int z41 = x4y1 ? 1:0;
            if( !xy4 && !xy2 ){x4y2 = x4 == y2;}      int z42 = x4y2 ? 1:0;
            if( !xy4 && !xy3 ){x4y3 = x4 == y3;}      int z43 = x4y3 ? 1:0;

*/

/*
   char[] nummern = new char[4];                               // hier wird ein 1D-array erstellt mit 4 stellen

 for (int i = 0; i < 4; i++) {                           //hier wird der 1D-Array befüllt mit den einzelnen
        nummern[i] = (zufallszahl+"").charAt ( i );         //Nummern der Zufallszahl
        }

        for (int i = 0; i < nummern.length; i++) {              //Hier werden einzelne Nummer aus bem Array in
        System.out.println (nummern[i] );                   //die Konsole geschrieben
        }
*/
//boolean jjjj = false;
//int kkk = jjjj ? 1:0;
//System.out.println (kkk );