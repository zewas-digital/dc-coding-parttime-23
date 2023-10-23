package judith.week5;


/*Bonusaufgabe: 15 verschiedene Sortieralgorithmen
Implementiere 3 unterschiedliche Algorithmen deiner Wahl auf folgendem Video:

https://www.youtube.com/watch?v=kPRA0W1kECg
Den Pseudo-Code der Algorithmen findest du unter:

https://panthema.net/2013/sound-of-sorting/SoS-CheatSheet.pdf
 */

import java.util.Arrays;

public class Arrays_9_Bonus {

    public static void main(String[] args) {


        int[] elements = {7,24 , 12, 25, 64, 150 , 846 , 453 , 786 ,};
       int[] sortiert = sort(elements);

        System.out.println("InsertionSort");
        System.out.println(Arrays.toString(elements));


        int[] sortiertTwo = Gnomesort(elements);
        System.out.println("Gomesort ");
        System.out.println(Arrays.toString(sortiertTwo));
    }
 //insertionSort
       static int[] sort ( int[] elements){

            for (int i = 1; i < elements.length; i++) {

                int elementToSort = elements[i];

                // Move element to the left until it's at the right position
                int j = i;

                while (j > 0 && elementToSort < elements[j - 1]) {
                    elements[j] = elements[j - 1];
                    j--;
                }
                elements[j] = elementToSort;
            }
           // System.out.println("Aufgabe - Insertion Sort:");

           // System.out.println("Ergebnis: " + Arrays.toString(elements));

            return elements;
        }
        //



    static int[] Gnomesort ( int[] elements){
       // int index = 1; // index = i
        for (int i = 1; i < elements.length; ){
            if(elements[i - 1] <= elements[i]){
                i++;
            }
            else {
                int temp = elements[i];
                elements[i] = elements[i-1];
                elements[i - 1] = temp;
                i --;
                if (i == 0){
                    i = 1;
                }
            }

            //index = i;

        }

        return elements;
}
}



