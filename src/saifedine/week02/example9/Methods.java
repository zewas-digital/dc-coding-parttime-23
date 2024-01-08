package saifedine.week02.example9;

/*
Erstellen Sie eine Methode mit dem Namen "printChars". Diese Methode besitzt zwei Übergabeparameter und kein Rückgabeparameter.
Die zwei Übergabeparameter sind ein char und ein Integer.
Diese Funktion soll eine bestimmte Anzahl von dem Zeichen char in einer Zeile ausgeben.

Der Aufruf der Funktion soll so ausschauen:
printChars('x', 10);

Die Ausgabe dazu soll wie folgt ausschauen:
xxxxxxxxxx
 */

// for
// Methode: printChars('x', 10)

public class Methods {

    public static void main(String[] args) {

        int anzahl = 10;
        char zeichen = 'x';

       printChars(zeichen,anzahl);
    }

    public static void printChars(char zeichen,int anzahl){
        for (int i = 0; i < anzahl; i++) {
            System.out.print(zeichen);
        }
    }
}