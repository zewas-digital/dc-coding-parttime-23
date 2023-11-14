/*
Vorbild für diese Aufgabe ist der SAP Login Screen. Hier abrufbar: https://help.sap.com/doc/63bd20104af84112973ad59590645513/800.01/en-US/loio33261650a00040ca8ee7b8bdcbb8ffda_LowRes.png

Es sollen Werte für die drei Felder "Client", "User" und "Password" von der Console eingelesen werden.

Beim Client Wert soll geprüft werden, ob es sich hierbei um eine Zahl handelt, die zwischen 0 und 999 liegt.

In unserer SAP-Version gibt es genau einen Nutzer. Den "Admin" mit dem Passwort "1234".
Es soll geprüft werden, ob die Werte für Benutzername und Passwort jenen des einzigen Nutzers entsprechen.

Wenn alle drei Werte vorhanden sind und den oben definierten Kriterien entsprechen, soll die Meldung
"Login erfolgreich! Viel Spaß mit der heutigen [S]ammlung [A]n [P]roblemen!" ausgegeben werden.
 */

package solutions.eslem.example30;

import java.util.Scanner;

public class SAPLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Client:");
        int Client = scanner.nextInt();

        System.out.println("Username:");
        String User = scanner.next();

        System.out.println("Password:");
        long Password = scanner.nextLong();

        if (Client >= 0 || Client < 999) {
            System.out.println("Login erfolgreich! Viel Spaß mit der heutigen [S]ammlung [A]n [P]roblemen!");
        } else {
            System.out.println("Login fehlgeschlagen!");
        }
        if (User.equals("Admin")) {
            System.out.println("Login erfolgreich! Viel Spaß mit der heutigen [S]ammlung [A]n [P]roblemen!");
        } else {
            System.out.println("Login fehlgeschlagen!");
        }
        if (Password == 1234) {
            System.out.println("Login erfolgreich! Viel Spaß mit der heutigen [S]ammlung [A]n [P]roblemen!");
        } else {
            System.out.println("Login fehlgeschlagen!");
        }
        }
    }



