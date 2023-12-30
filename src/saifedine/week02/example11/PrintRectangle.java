package saifedine.week02.example11;

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

// for, for
// Methode: printRect('x', 10, 3);

public class PrintRectangle {

    public static void main(String[] args) {

        char zeichen = 'x';
        int breite = 10;
        int hoehe = 3;

        printRect('x', 10, 3);
    }

    public static void printRect(char zeichen,int breite,int hoehe){

        for (int i = 0; i < hoehe; i++) {
            for (int j = 0; j < breite; j++) {
                System.out.print(zeichen);
            }
            System.out.println();
        }
    }
}
