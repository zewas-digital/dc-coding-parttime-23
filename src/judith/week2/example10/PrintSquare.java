package solutions.judith.week2.example10;
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
    public static void main(String[] args) {
        printSquare('x', 10);
    }

        static void printSquare ( char c, int size){
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size ; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }

        }
    }
