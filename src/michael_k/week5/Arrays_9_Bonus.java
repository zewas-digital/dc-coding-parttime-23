package michael_k.week5;

/*
Bonusaufgabe: 15 verschiedene Sortieralgorithmen
Implementiere 3 unterschiedliche Algorithmen deiner Wahl auf folgendem Video:

https://www.youtube.com/watch?v=kPRA0W1kECg
Den Pseudo-Code der Algorithmen findest du unter:

https://panthema.net/2013/sound-of-sorting/SoS-CheatSheet.pdf
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class Arrays_9_Bonus {

    public static void main(String[] args) {


        int[] array = genarateRandomArray ( 8 );

        System.out.println ( Arrays.toString ( array ) );
        //System.out.println ( Arrays.toString ( bubbleSortminmax ( array, array.length ) ));
        //System.out.println (  Arrays.toString ( gnomesort ( array, array.length ) ));
        System.out.println ( radixsort ( array, array.length ));


    }


    static ArrayList<Integer> radixsort(int[] array, int length){

        ArrayList<Integer> sortArray = new ArrayList<>();
        // array in eine list kopieren
        for (int i = 0; i < array.length; i++) {
            sortArray.add( array[i] );
        }

        ArrayList<Integer> list0 = new ArrayList<> ( );
        ArrayList<Integer> list1 = new ArrayList<> ( );
        ArrayList<Integer> list2 = new ArrayList<> ( );
        ArrayList<Integer> list3 = new ArrayList<> ( );
        ArrayList<Integer> list4 = new ArrayList<> ( );
        ArrayList<Integer> list5 = new ArrayList<> ( );
        ArrayList<Integer> list6 = new ArrayList<> ( );
        ArrayList<Integer> list7 = new ArrayList<> ( );
        ArrayList<Integer> list8 = new ArrayList<> ( );
        ArrayList<Integer> list9 = new ArrayList<> ( );

        for (int i = 1; i < 4; i++) {

            for (int j = 0; j < length; j++) {

                int x = zifferVonStelle ( sortArray.get (j), i );

                if (x == 0) {list0.add ( sortArray.get (j) );}
                if (x == 1) {list1.add ( sortArray.get (j) );}
                if (x == 2) {list2.add ( sortArray.get (j) );}
                if (x == 3) {list3.add ( sortArray.get (j) );}
                if (x == 4) {list4.add ( sortArray.get (j) );}
                if (x == 5) {list5.add ( sortArray.get (j) );}
                if (x == 6) {list6.add ( sortArray.get (j) );}
                if (x == 7) {list7.add ( sortArray.get (j) );}
                if (x == 8) {list8.add ( sortArray.get (j) );}
                if (x == 9) {list9.add ( sortArray.get (j) );}
            }

            sortArray.clear ( );
            sortArray.addAll ( list0 );
            sortArray.addAll ( list1 );
            sortArray.addAll ( list2 );
            sortArray.addAll ( list3 );
            sortArray.addAll ( list4 );
            sortArray.addAll ( list5 );
            sortArray.addAll ( list6 );
            sortArray.addAll ( list7 );
            sortArray.addAll ( list8 );
            sortArray.addAll ( list9 );
            list0.clear ();
            list1.clear ();
            list2.clear ();
            list3.clear ();
            list4.clear ();
            list5.clear ();
            list6.clear ();
            list7.clear ();
            list8.clear ();
            list9.clear ();

        }



        return sortArray;
    }
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

        for (int i = 0; i < length -1; i++) {

            for (int j = 0; j <length - i - 1 ; j++) {

                if (arraySort[j] > arraySort[j+1]){
                    x = arraySort[j];
                    y = arraySort[j+1];

                    arraySort[j] = y;
                    arraySort[j+1] = x;
                }

            }

        }

        return arraySort;
    }
    static int[] genarateRandomArray( int length){

        int[] array = new int[length];
        Random randomnumber = new Random();

        for (int i = 0; i <length; i++) {
            int value =randomnumber.nextInt ( 101,1000 );
            array[i] = value +1;
        }

        return array;
    }
    static int zifferVonStelle (int value, int stelle){
        int ziffer =0;

        for (int i = 1; i < stelle; i++) {
            value = value / 10;
        }

        ziffer = value % 10;

        return ziffer;
    }
}
