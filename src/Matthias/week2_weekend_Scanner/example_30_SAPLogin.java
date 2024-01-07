/*
Vorbild für diese Aufgabe ist der SAP Login Screen. Hier abrufbar: https://help.sap.com/doc/63bd20104af84112973ad59590645513/800.01/en-US/loio33261650a00040ca8ee7b8bdcbb8ffda_LowRes.png

Es sollen Werte für die drei Felder "Client", "User" und "Password" von der Console eingelesen werden.

Beim Client Wert soll geprüft werden, ob es sich hierbei um eine Zahl handelt, die zwischen 0 und 999 liegt.

In unserer SAP-Version gibt es genau einen Nutzer. Den "Admin" mit dem Passwort "1234".
Es soll geprüft werden, ob die Werte für Benutzername und Passwort jenen des einzigen Nutzers entsprechen.

Wenn alle drei Werte vorhanden sind und den oben definierten Kriterien entsprechen, soll die Meldung
"Login erfolgreich! Viel Spaß mit der heutigen [S]ammlung [A]n [P]roblemen!" ausgegeben werden.
 */

package Matthias.week2_weekend_Scanner;

import java.util.Scanner;

public class example_30_SAPLogin {
    static String getUser(String adminname){
        String nameSting;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie den Usernamen ein:");
        nameSting = scanner.next();
        if (!nameSting.equals( adminname)) {
            System.out.println("Es kann sich nur der Admin einloggen, versuchen Sie es erneut!");
            System.exit(0);
        }
        return nameSting;
    }
    static int getPasswort(int adminkey){
        int intNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie das Passwort ein: ");
        intNumber = scanner.nextInt();
        if (intNumber != adminkey) {
            System.out.println("Sie haben das Falsche Passwort eingegeben versuchen Sie es erneut!");
            System.exit(0);
        }
        return intNumber;
    }
    static int getclient(int minClientnumber, int maxClientnumber){
        int intNumber=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie das Clientnummer ein: ");
        intNumber = scanner.nextInt();
        if (intNumber >= maxClientnumber || intNumber <= minClientnumber) {
            System.out.println("Sie haben die Clientanzahl überschritten oder unterschritten ");
            System.exit(0);
        }
        return intNumber;
    }
    public static void main(String[] args) {
        //Variabeln definieren
        int minCliennumber=0;
        int maxClientnumber=999;
        String adminuser= "Admin";
        int adminkey=1234;


        int client      = getclient(minCliennumber,maxClientnumber);
        String username =  getUser(adminuser);
        int passwort    =  getPasswort(adminkey);


    System.out.println("Login erfolgreich! Viel Spaß mit der heutigen [S]ammlung [A]n [P]roblemen!\" ausgegeben werden");
    }
}
