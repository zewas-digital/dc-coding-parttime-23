package saifedine.week06_arrays;

/*
Bonusaufgabe: 15 verschiedene Sortieralgorithmen
Implementiere 3 unterschiedliche Algorithmen deiner Wahl auf folgendem Video:

https://www.youtube.com/watch?v=kPRA0W1kECg
Den Pseudo-Code der Algorithmen findest du unter:

https://panthema.net/2013/sound-of-sorting/SoS-CheatSheet.pdf = Pseudo Code
 */

import saifedine.week05_arrays.Array_7_MinMaxAvg;
import java.util.Arrays;

public class Arrays_9_Bonus_gnomeSort_Aufgabe02 {

    //gnomeSort
    //https://sibiwiki.de/wiki/index.php?title=Gnomesort

    public static void main(String[] args) {


        int[] elements = Array_7_MinMaxAvg.getZufallsZahlen();
        int[] sortiert = Gnomesort(elements);

        //Gnomesort gnome = new Gnomesort();
        //gnome.Gnomesort(elements);
        //System.out.print(Arrays.toString(elements));
    }


    static int[] Gnomesort(int[] elements) {
        for (int index = 1; index < elements.length;) {
            if (elements[index - 1] <= elements[index]) {
                index++;
            } else {
                int hilfs = elements[index];
                elements[index] = elements[index - 1];
                elements[index - 1] = hilfs;
                index--;
                if (index == 0) {
                    index = 1;
                }
            }
        }
        System.out.println("Aufgabe - Gnome Sort:");

        System.out.println("Ergebnis: " + Arrays.toString(elements));

        return elements;
    }

}
