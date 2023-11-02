/*
Programmiere einen Bankomaten.
Der Kunde kann zwischen den Funktionen
1. Einzahlen
2. Auszahlen
3. Kontostand anzeigen
4. Beenden
wählen.

Mit der Funktion "Einzahlen" kann die Kundschaft einen bestimmten von der Console eingelesenen Betrag auf das Bankkonto einzahlen.
Anschließend wird der neue Kontostand angezeigt.

Mit der Funktion "Auszahlen" kann die Kundschaft einen bestimmten von der Console eingelesenen Betrag vom Bankkonto abheben.
Anschließend wird der neue Kontostand angezeigt.

Mit der Funktion "Kontostand anzeigen" wird der aktuelle Kontostand angezeigt.

Das Programm wird erst beendet, wann die Kundschaft die Funktion "Beenden" aufruft.

 */

package claudia.weekend1.example32;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        float saldo = 0;
        char auswahl = 'x';
        Scanner scanner = new Scanner(System.in);
        while (auswahl != 'B') {
            System.out.print("E für Einzahlen, A für Auszahlen, K für Kontostand, B für Beenden! ");
            auswahl = scanner.next().charAt(0);

            if (auswahl == 'E') saldo = einzahlen(saldo);
            if (auswahl == 'A') saldo = auszahlen(saldo);
            if (auswahl == 'K') kontostand(saldo);
        }
    }

   static float einzahlen(float saldo){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wieviel einzahlen? ");
        float betrag = scanner.nextFloat();
        if (betrag < 0) {
            System.out.println("Haha, wird nicht ausgeführt!");
            printSaldo(saldo);
            return saldo;
        }
        saldo = saldo + betrag;
        printSaldo(saldo);
        return saldo;
   }
    static float auszahlen(float saldo){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wieviel auszahlen? ");
        float betrag = scanner.nextFloat();
        if (betrag > saldo){
            System.out.println("Nicht so viel Geld auf dem Konto! Auszahlung wird nicht ausgeführt.");
            printSaldo(saldo);
            return saldo;
        }
        saldo = saldo - betrag;
        printSaldo(saldo);
        return saldo;
    }
    static void kontostand(float saldo) {
        printSaldo(saldo);

    }
    static void printSaldo(float saldo){
        System.out.println("aktueller Saldo " + saldo);
    }


}
