package MichaelReal.week2.example11;

/*
Erstellen Sie eine Methode mit dem Namen "printRect". Diese Methode besitzt drei Übergabeparameter und kein Rückgabeparameter.
Die zwei Übergabeparameter sind zum einen ein char und einen Integer.
Diese Funktion soll ein Rechteck der eingegebenen Buchstaben ausgeben. Die Länge und die Höhe sind auch angegeben.

Der Aufruf der Funktion soll so ausschauen:
printRect('x', 10, 3);

Die Ausgabe dazu soll wie folgt ausschauen:
xxxxxxxxxx
xxxxxxxxxx
xxxxxxxxxx
 */

public class PrintRectangleJeremias {
    public static void main(String[] args) {
        printRect('x', 10, 3);
    }
    static void printRect(char value, int size, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
