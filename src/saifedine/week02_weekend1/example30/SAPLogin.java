/*
Vorbild für diese Aufgabe ist der SAP Login Screen. Hier abrufbar: https://help.sap.com/doc/63bd20104af84112973ad59590645513/800.01/en-US/loio33261650a00040ca8ee7b8bdcbb8ffda_LowRes.png

Es sollen Werte für die drei Felder "Client", "User" und "Password" von der Console eingelesen werden.

Beim Client Wert soll geprüft werden, ob es sich hierbei um eine Zahl handelt, die zwischen 0 und 999 liegt.

In unserer SAP-Version gibt es genau einen Nutzer. Den "Admin" mit dem Passwort "1234".
Es soll geprüft werden, ob die Werte für Benutzername und Passwort jenen des einzigen Nutzers entsprechen.

Wenn alle drei Werte vorhanden sind und den oben definierten Kriterien entsprechen, soll die Meldung
"Login erfolgreich! Viel Spaß mit der heutigen [S]ammlung [A]n [P]roblemen!" ausgegeben werden.
 */

package saifedine.week02_weekend1.example30;

import java.util.Scanner;

public class SAPLogin {
    public static void main(String[] args) {

        int intClient = -1;
        String stringBenutzer = "";
        int intPasswort = 0;

        Scanner eingabe = new Scanner(System.in);

        while(intClient < 0 || intClient > 999){
            System.out.println("Geben Sie die Clientnummer ein: ");
            intClient = eingabe.nextInt();

            System.out.println();

            if (intClient < 0 || intClient > 999) {
                System.out.println("Login nicht erfolgreich, bitte versuchen Sie es nochmal.");
            }
        }
        System.out.println("Clientnummer: " + intClient);

        while (!stringBenutzer.equals("Admin")){
            System.out.println("Geben Sie den Benutzer ein: ");
            stringBenutzer = eingabe.next();

            System.out.println();
            if (!stringBenutzer.equals("Admin")){
                System.out.println("Login nicht erfolgreich, bitte versuchen Sie es nochmal.");
            }
        }
        System.out.println("Benutzer: " + stringBenutzer);

        while (intPasswort != 1234){
            System.out.println("Geben Sie das Passwort ein: ");
            intPasswort = eingabe.nextInt();

            System.out.println();
            if (intPasswort != 1234) {
                System.out.println("Login nicht erfolgreich, bitte versuchen Sie es nochmal.");
            }
        }
        System.out.println("Passwort: " + intPasswort);

        System.out.println("Login erfolgreich! Viel Spaß mit SAP");
    }
}