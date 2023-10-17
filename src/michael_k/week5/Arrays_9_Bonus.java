package michael_k.week5;

/*
Bonusaufgabe: 15 verschiedene Sortieralgorithmen
Implementiere 3 unterschiedliche Algorithmen deiner Wahl auf folgendem Video:

https://www.youtube.com/watch?v=kPRA0W1kECg
Den Pseudo-Code der Algorithmen findest du unter:

https://panthema.net/2013/sound-of-sorting/SoS-CheatSheet.pdf
 */

import java.util.Arrays;
import java.util.Random;

public class Arrays_9_Bonus {

    public static void main(String[] args) {


        int[] array = genarateRandomArray ( 5 );

        System.out.println ( Arrays.toString ( array ) );
        System.out.println ( Arrays.toString ( bubbleSortminmax ( array, array.length ) ));
        System.out.println (  Arrays.toString ( gnomesort ( array, array.length ) ));


    }


  //static int[] quicksort(int array, );
    static int[] gnomesort(int[] array, int length){

        int[] sortArray =new int[length];

        for (int i = 0; i < length; i++) {
            sortArray[i] = array[i];
        }
        int x;
        int y;
        int i=1;

        do {

            if(sortArray[i] >=sortArray[i-1]){
                i++;
            }else{
                x = sortArray[i];
                y = sortArray[i-1];

                sortArray[i] = y;
                sortArray[i-1] = x;
                if (i >1){i--;}
            }

        } while( i<length);


        return sortArray;
    }
    static int[] bubbleSortminmax(int[] array, int length){

        int[] arraySort= new int[length];
        int x;
        int y;
        int counter=0;

        for (int i = 0; i < length; i++) {
            arraySort[i] = array[i];
        }

        while(counter != length-1){
            counter =0;
            for (int i = 0; i <length-1 ; i++) {

                if (arraySort[i] > arraySort[i+1]){
                    x = arraySort[i];
                    y = arraySort[i+1];

                    arraySort[i] = y;
                    arraySort[i+1] = x;
                }else{ counter++;}
            }

        }

        return arraySort;
    }
    static int[] genarateRandomArray( int length){

        int[] array = new int[length];
        Random randomnumber = new Random();

        for (int i = 0; i <length; i++) {
            int value =randomnumber.nextInt ( 100 );
            array[i] = value +1;
        }

        return array;
    }

}
