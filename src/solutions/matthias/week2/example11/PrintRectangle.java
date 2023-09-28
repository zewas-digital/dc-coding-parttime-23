package solutions.matthias.week2.example11;

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

public class PrintRectangle {
    //Definition der Methode
    static void printRect(char cZeichen, int ibreite, int ilaenge){ // static = Eigenschaft der Methode; void Rückgabewert, welcher erwartet wird; alles in der Methode sind die Übergabeparameter


        for (int i= 1 ;i <= ilaenge  ; i++) {
            System.out.print("Länge:" + i);


            for (int j = 1; j <= ibreite; j++) {
                System.out.print(cZeichen);
            }
            System.out.println();
        }
    }
    //Start des Programmes
    public static void main(String[] args) {
        //Definition von Variabeln
        char cVersuchszeichen ='a';
        int iRecheckbreite=10;
        int iRechtecklänge=12;
        //Programm Start

        printRect(cVersuchszeichen,iRecheckbreite,iRechtecklänge);


        //Ende des Programmes
    }
}
