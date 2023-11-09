package eslem.week04;

/*
Aufgabe: Random Number Array Zählen
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */
import java.util.Random;
public class Arrays_5_ArrayZaehlen {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(1, 100);

        if (randomNumber > 30) {
            System.out.println(randomNumber);
        } else {
            System.out.println("die Zahl ist kleiner als 30");
        }
    }
}
