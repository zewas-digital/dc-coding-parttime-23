package Simonsway.Week4;

/*
Aufgabe: Random Number Array Zählen

1.Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

2. Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */
import java.util.Random;
import java.util.Arrays;

public class Arrays_5_ArrayZaehlen {
    public static void main(String[] args) {
        int arrayLength = 10; //Hier lege ich fest wieviel plätze mein Array haben soll.
        Random random = new Random(); //Hier starte ich die Random Funktion mit dem Namen random
        int [] randomArray = new int[arrayLength]; //Hier starte ich ein Array mit dem name randomArray und gebe am schluss an wie lange sein soll mit arrayLength welches oben definiert wurde.

        for (int i = 0; i < arrayLength ; i++) { //So lange i=0 kleiner ist als arrayLenght mach die schleife somt 10 mal
            int randomValue = random.nextInt(1, 100); //hier packen wir zufallszahlen von 1 bis 100 in die Variable randomValue
            randomArray[i] = randomValue; //hier holen wir uns das array von oben und sagen solange wir kleiner sind als i fülle es mit den zufallszahlen von randomvValue
        }
        System.out.println("Array mit Zufallaszahlen von 1 - 100");
        System.out.println(Arrays.toString(randomArray));
        System.out.println();

        System.out.println("Größer als 30 ");
        for (int value : randomArray){
            if (value > 30){
                System.out.println(value);
            }
        }
    }
}
