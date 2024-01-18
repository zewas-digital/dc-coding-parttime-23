package judith.week14_Selbsttest;

import java.sql.SQLOutput;

public class AufgabenMethoden {


    // Methoden ********************
    // Aufgabe 4 -------------------
        /* Erstelle eine Methode welche einen string und einen int Parameter erhält.
         * Der angegebene string soll so oft wie beim int angegeben, in einer Zeile wiederholt ausgegeben
         * und mit einem Whitespace getrennt werden.
         *
         * Initialisiere Variablen für deine Parameter und gib diese dann der Methode weiter,
         * damit du deine Methoden wieder verwenden kannst.
         *
         * Aufruf:
string symbol = "X";
int amount = 10;
PrintLineStipple(symbol, amount);
         * Ausgabe:
X X X X X X X X X X
         */

    // Aufgabe 5 -------------------
        /* Erstelle eine Methode welche einen string und einen int Parmeter erhält.
         * Der angegebene string soll so oft wie beim int angegeben in einer eigenen Zeile wiederholt werden.
         * Trenne die Zeilen zusätzlich durch ein Linebreak.
         * Aufruf:
string symbol = "X";
int amount = 3;
PrintRowStipple(symbol, amount);
         * Ausgabe:
X

X

X
         */

    // Aufgabe 6 -------------------
        /* Erstelle eine Methode welche einen string und einen int Parameter erhält.
         * Nun sollen mit diesen beiden Parametern die beiden Methoden aus den vorhergehenden Aufgaben aufgerufen werden.
         * Die Methoden aus den vorhergehenden Aufgaben sollen nicht neu geschrieben werden.
         *
         * Aufruf:
string symbol = "X";
int amount = 3;
PrintStippleL(symbol, amount);
        * Ausgabe:
X X X
X

X

X
         */


    public static void main(String[] args) {

        System.out.println("Aufgabe 4 ");
        String symbol = "X";
        int amount = 10;
        Aufgabe4(symbol, amount);


        System.out.println("Aufgabe 5 ");
        String symbol1 = "X";
        int amount1 = 3;
        Aufgabe5(symbol1, amount1);

        System.out.println("Aufgabe 6 ");
        String symbol3 = "X";
        int amount3 = 3;
        Aufgabe6 (symbol3, amount3);


    }
    public static void Aufgabe4(String symbol, int amount){
        for (int i = 0; i < amount ; i++) {
            System.out.print(symbol);
            if(i<amount - 1){
                System.out.print(" ");
            };

        }
       // Diese Zeile if (i < amount - 1) überprüft, ob der aktuelle Index i kleiner ist als die Anzahl der Wiederholungen
       // minus eins (amount - 1). Die Bedingung wird verwendet, um sicherzustellen, dass nach dem letzten Symbol
       // kein Leerzeichen mehr eingefügt wird.
        System.out.println("\n");
    }

    public static void Aufgabe5(String symbol, int amount) {
        for (int i = 0; i < amount ; i++) {
            System.out.print(symbol);
            if(i<amount - 1){
                System.out.println( " " + "\n");
            }
        }
        System.out.println("\n");
    }


public static void Aufgabe6(String symbol, int amount){
        Aufgabe4(symbol, amount);
    System.out.println();
         Aufgabe5(symbol, amount);

}





}


