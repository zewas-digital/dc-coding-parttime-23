package volkan.week14_Selbsttest;

public class Selbsttest_4 {
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
    public static void main(String[] args) {
        String symbol = "X";
        int amount = 10;
        PrintLineStipple(symbol,amount);
    }

    public static void PrintLineStipple(String symbol, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(" "+ symbol);
        }
        System.out.println();
    }
}
