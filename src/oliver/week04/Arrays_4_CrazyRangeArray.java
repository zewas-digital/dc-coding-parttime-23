package oliver.week04;

/*
Aufgabe: Random Number Array Crazy Range
Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
 */
import java.util.Arrays;
import java.util.Random;
public class Arrays_4_CrazyRangeArray {
    public static void main(String[] args) {

        Random rand = new Random();
        int anzahlZahlen = 50;

        for (int i = 0; i <anzahlZahlen ; i++) {
            int randomValue = rand.nextInt(100) -50;
            System.out.println(randomValue);
        }
    }
}
