package solutions.Simon.example26;

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


import java.util.Scanner;
public class PrintRectangleRefactor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte Trage die horizontale Reihe ein: ");
        int horizontale = scan.nextInt();

        System.out.println("Bitte Trage die vertikale ein: ");
        int vertikale = scan.nextInt();


        for (int i = 0; i <= horizontale; i++) {
            for (int j = 0; j <= vertikale; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}