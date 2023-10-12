package solutions.claudia.week2.example9;

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

    public static void main(String[] args) {
        printChars('x',5);
        printChars('*', 10);
    }

    static void printChars(char c, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
