package examples.week2.example10;
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
public class PrintSquareJeremias {
    public static void main(String[] args) {
        printSquare('x', 10);
    }
    static void printSquare(char value, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
