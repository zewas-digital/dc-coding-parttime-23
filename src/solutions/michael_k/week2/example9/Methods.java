package solutions.michael_k.week2.example9;

/*
Erstellen Sie eine Methode mit dem Namen "printChars". Diese Methode besitzt zwei Übergabeparameter und kein Rückgabeparameter.
Die zwei Übergabeparameter sind ein char und ein Integer.
Diese Funktion soll eine bestimmte Anzahl von dem Zeichen char in einer Zeile ausgeben.

Der Aufruf der Funktion soll so ausschauen:
printChars('x', 10);

Die Ausgabe dazu soll wie folgt ausschauen:
xxxxxxxxxx


 */

import java.security.cert.X509Certificate;

public class Methods {
    public static void main(String[] args){

                printchars('X',10);
    }
    static void printchars( char buchstabe, int anzahl) {
        for (int i = 0;  i< anzahl ; i++) {
            System.out.print(buchstabe);
        }
    }

}
