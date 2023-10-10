package solutions.saifedine.weekend1.example26;

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


/*
Bisher haben wir beispielsweise die Größe eines Rechtecks direkt im Code definiert.
Jetzt soll das Beispiel so abgeändert werden, dass die Größe des Rechtecks von der Console eingelesen wird.
Wiederhole das Refactoring für einige andere Beispiele.
*/

import java.util.Scanner;

public class PrintRectangleRefactor {
    public static void main(String[] args) {

        Scanner Eingabe = new Scanner(System.in);
        char value = 'x';

        System.out.println("Gib die Breite ein: ");
        int intBreite = Eingabe.nextInt();
        System.out.println("Gib die Höhe ein: ");
        int intHoehe = Eingabe.nextInt();

        for (int i = 0; i < intHoehe; i++) {
            for (int j = 0; j < intBreite; j++) {
                System.out.print(value);
            }
            System.out.println();
    }

        }
    }

