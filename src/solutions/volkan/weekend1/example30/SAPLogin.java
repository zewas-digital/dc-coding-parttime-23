/*
Vorbild für diese Aufgabe ist der SAP Login Screen. Hier abrufbar: https://help.sap.com/doc/63bd20104af84112973ad59590645513/800.01/en-US/loio33261650a00040ca8ee7b8bdcbb8ffda_LowRes.png

Es sollen Werte für die drei Felder "Client", "User" und "Password" von der Console eingelesen werden.

Beim Client Wert soll geprüft werden, ob es sich hierbei um eine Zahl handelt, die zwischen 0 und 999 liegt.

In unserer SAP-Version gibt es genau einen Nutzer. Den "Admin" mit dem Passwort "1234".
Es soll geprüft werden, ob die Werte für Benutzername und Passwort jenen des einzigen Nutzers entsprechen.

Wenn alle drei Werte vorhanden sind und den oben definierten Kriterien entsprechen, soll die Meldung
"Login erfolgreich! Viel Spaß mit der heutigen [S]ammlung [A]n [P]roblemen!" ausgegeben werden.
 */

package solutions.volkan.weekend1.example30;

import java.util.Scanner;

public class SAPLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe des Client-Werts und Überprüfung
        System.out.print("Client: ");
        int client = scanner.nextInt();
        if (client < 0 || client > 999) {
            System.out.println("Ungültiger Client-Wert. Der Client muss zwischen 0 und 999 liegen.");
            return;
        }

        // Eingabe des Benutzernamens und Überprüfung
        System.out.print("User: ");
        String user = scanner.next();

        // Eingabe des Passworts und Überprüfung
        System.out.print("Password: ");
        String password = scanner.next();

        // Überprüfung von Benutzername und Passwort
        if (user.equals("Admin") && password.equals("1234")) {
            System.out.println("Login erfolgreich! Viel Spaß mit der heutigen [S]ammlung [A]n [P]roblemen!");
        } else {
            System.out.println("Login fehlgeschlagen. Benutzername oder Passwort ungültig.");
        }

        // Scanner schließen
        scanner.close();
    }
}