package Matthias.week2.example9;

/*
Erstellen Sie eine Methode mit dem Namen "printChars". Diese Methode besitzt zwei Übergabeparameter und kein Rückgabeparameter.
Die zwei Übergabeparameter sind ein char und ein Integer.
Diese Funktion soll eine bestimmte Anzahl von dem Zeichen char in einer Zeile ausgeben.

Der Aufruf der Funktion soll so ausschauen:
printChars('x', 10);

Die Ausgabe dazu soll wie folgt ausschauen:
xxxxxxxxxx


 */

public class Methods {

    //Definition der Methode
    static void printChars(char cZeichen, int iAnzahl){ // static = Eigenschaft der Methode; void Rückgabewert, welcher erwartet wird; alles in der Methode sind die Übergabeparameter
        //System.out.println("Zeile:");
        for (int i= 1 ;i <= iAnzahl  ; i++) {
                //System.out.print(" Werte: " + " " + i);
                System.out.print(cZeichen);

        }
    }
    //Start des Programmes
    public static void main(String[] args) {
        //Definition von Variabeln
        char cVersuchszeichen ='a';
        int iAnzahlWiederholung=10;
        //Programm Start

        printChars(cVersuchszeichen,iAnzahlWiederholung);


        //Ende des Programmes
    }


}
