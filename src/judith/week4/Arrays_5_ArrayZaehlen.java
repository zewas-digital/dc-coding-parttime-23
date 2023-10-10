package judith.week4;

/*
Aufgabe: Random Number Array Zählen
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */

import java.util.Random;

public class Arrays_5_ArrayZaehlen {
    public static void main(String[] args) {
        Random random = new Random();
        int zzahl = random.nextInt(1,100);
        if (zzahl >=30){
            System.out.println(zzahl);
        }
        else {
            System.out.println("Zahl ist kleiner als 30");
        }

    }
}
