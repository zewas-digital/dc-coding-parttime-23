/*
Vorbild für diese Aufgabe ist der SAP Login Screen. Hier abrufbar: https://help.sap.com/doc/63bd20104af84112973ad59590645513/800.01/en-US/loio33261650a00040ca8ee7b8bdcbb8ffda_LowRes.png

Es sollen Werte für die drei Felder "Client", "User" und "Password" von der Console eingelesen werden.

Beim Client Wert soll geprüft werden, ob es sich hierbei um eine Zahl handelt, die zwischen 0 und 999 liegt.

In unserer SAP-Version gibt es genau einen Nutzer. Den "Admin" mit dem Passwort "1234".
Es soll geprüft werden, ob die Werte für Benutzername und Passwort jenen des einzigen Nutzers entsprechen.

Wenn alle drei Werte vorhanden sind und den oben definierten Kriterien entsprechen, soll die Meldung
"Login erfolgreich! Viel Spaß mit der heutigen [S]ammlung [A]n [P]roblemen!" ausgegeben werden.
 */

package solutions.michael_k.weekend1.example30;
import java.util.Scanner;
public class SAPLogin {
    public static void main(String[] args) {
        boolean Userabfrage = false;
        boolean Clientabfrage = false;
        boolean Passwortabfrage = false;



        Scanner inputKonsole = new Scanner ( System.in );

        System.out.println ("Login-Daten eingeben:" );
        System.out.println ( );

        System.out.println ("Client:" );
        int client = inputKonsole.nextInt ();

        System.out.println ("User:" );
        String User = inputKonsole.next ();

        System.out.println ("Passwort:" );
        String Passwort = inputKonsole.next ();

        if(client >= 0 && client <=999){ Clientabfrage=true;}
        Userabfrage = User.equals("Admin");
        Passwortabfrage = Passwort.equals("1234");
        if(Clientabfrage && Userabfrage && Passwortabfrage){
            System.out.println ("Login ist erfolgreich" );}
            else{System.out.println ("Login fehlgeschlagen" );}
    }
}