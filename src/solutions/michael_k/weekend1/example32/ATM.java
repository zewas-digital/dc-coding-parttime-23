/*
Programmiere einen Bankomaten.
Der Kunde kann zwischen den Funktionen
1. Einzahlen
2. Auszahlen
3. Kontostand anzeigen
4. Beenden
wählen.

Mit der Funktion "Einzahlen" kann die Kundschaft einen bestimmten von der Console eingelesenen Betrag auf das Bankkonto einzahlen.
Anschließend wird der neue Kontostand angezeigt.

Mit der Funktion "Auszahlen" kann die Kundschaft einen bestimmten von der Console eingelesenen Betrag vom Bankkonto abheben.
Anschließend wird der neue Kontostand angezeigt.

Mit der Funktion "Kontostand anzeigen" wird der aktuelle Kontostand angezeigt.

Das Programm wird erst beendet, wann die Kundschaft die Funktion "Beenden" aufruft.

 */

package solutions.michael_k.weekend1.example32;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        double Kontostand=0;

        while (true) {

            Scanner inputKonsole = new Scanner ( System.in );

            System.out.println ("Funktion wählen:" );
            System.out.println ("    1. Einzahlen" );
            System.out.println ("    2. Auszahlen" );
            System.out.println ("    3. Kontostand anzeigen" );
            System.out.println ("    4. Beenden" );

            int Funktion = inputKonsole.nextInt ();
            if (Funktion>4){
                System.out.println ( "Eingabe ungültig");
            } else if(Funktion==1){
                System.out.println ("Geben sie den Betrag ein denn sie einzahlen wollen: ");
                double Eingabe = inputKonsole.nextDouble ();
                Kontostand = Kontostand +Eingabe;
                System.out.println ("Ihr Kontostand ist: "+Kontostand +" €");
            } else if(Funktion==2){
                System.out.println ("Geben sie den Betrag ein denn sie Auszahlen wollen: ");
                double Eingabe = inputKonsole.nextDouble ();
                Kontostand = Kontostand -Eingabe;
                System.out.println ("Ihr Kontostand ist: "+Kontostand +" €");
            }else if(Funktion==3){
                System.out.println ( "Ihr Kontostand ist: "+Kontostand +" €");
            }else if(Funktion==4) {
                System.out.println ( "Vielen Dank, auf Wiedersehen" );
                break;
            }


        }
    }
}
