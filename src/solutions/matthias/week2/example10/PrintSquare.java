package solutions.matthias.week2.example10;
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
    //Definition der Methode
    static void printsquare(char cZeichen, int iAnzahl){ // static = Eigenschaft der Methode; void Rückgabewert, welcher erwartet wird; alles in der Methode sind die Übergabeparameter
        //System.out.println("Zeile:");

        for (int i= 1 ;i <= iAnzahl  ; i++) {

            //System.out.print(" Werte: " + i) " ";

            for (int j = 1; j <= iAnzahl; j++) {
                System.out.print(cZeichen);
            }
            System.out.println();
        }
    }
    //Start des Programmes
    public static void main(String[] args) {
        //Definition von Variabeln
        char cVersuchszeichen ='a';
        int iAnzahlWiederholung=10;
        //Programm Start

        printsquare(cVersuchszeichen,iAnzahlWiederholung);


        //Ende des Programmes
    }
}
