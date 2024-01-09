package saifedine.week02.example10;
/*
Erstellen Sie eine Methode mit dem Namen "printSquare". Diese Methode besitzt zwei Übergabeparameter und kein Rückgabeparameter.
Die zwei Übergabeparameter sind ein char und ein Integer.
Diese Funktion soll eine bestimmte Anzahl von dem Zeichen char in einem Quadrat ausgeben.

Der Aufruf der Funktion soll so ausschauen:
printSquare('x', 10);

Die Ausgabe dazu soll wie folgt ausschauen:
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
 */

// for, for
// Methode: printChars('x', 10)

public class PrintSquare {

    public static void main(String[] args) {

        printSquare1('x',10);
        System.out.println();
        System.out.println("---------------");
        printSquare2('x', 10);
    }

    public static void printSquare1(char zeichen,int anzahl){

        // Option 1:
        for (int i = 0; i < anzahl; i++) {
            System.out.println();
            for (int j = 0; j < anzahl; j++) {
                System.out.print(zeichen);
            }
        }
    }

    public static void printSquare2(char zeichen, int anzahl){

        // Option 2:
        for (int i = 0; i < anzahl; i++) {
            for (int j = 0; j < anzahl; j++) {
                System.out.print(zeichen);
            }
            System.out.println();
        }
    }
}
