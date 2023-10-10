package solutions.michael_k.week2.example10;
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

public class PrintSquare {
    public static void main(String[] args){

        printsquare('X',3);
    }
    static void printsquare( char buchstabe, int anzahl) {
        for (int i = 0; i <anzahl; i++) {
            for ( int j = 0;  j< anzahl ; j++) {
                System.out.print(buchstabe);
            }
            System.out.println();
        }

    }
}
