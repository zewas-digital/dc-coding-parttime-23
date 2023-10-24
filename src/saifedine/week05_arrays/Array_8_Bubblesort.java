package saifedine.week05_arrays;

/*
Erstelle ein int[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus. Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden. Der Aufruf und die Ausgabe erfolgt in der main Methode.

    Sortiere der Größe nach aufsteigend (Ascending)
    Sortiere der Größe nach absteigend (Descending)

Erklärung Bubblesort: https://www.youtube.com/watch?v=qtXb0QnOceY
 */

/*
von Judith
https://youtu.be/m4pw9KoT2A4?si=70VjtPW5_mIgnO7B
 */



import java.util.Arrays;

public class Array_8_Bubblesort {

    // array
    // random oder fixe Zahlen
    // sout
    // Methode (Ascending) - aufsteigend
    // Methode (Descending) - absteigend

    // Aufruf (Ascending)
    // fori (i)
    // fori (j)
    // if (number [i] < number [i +1]
    // yes: do nothing
    // no: exchange

    public static void main(String[] args) {

        /*
        int [] myArray = new int[5];

        myArray[0] = 17;
        myArray[1] = 5;
        myArray[2] = 23;
        myArray[3] = 7;
        myArray[4] = 13;
         */

        //Schreibform von array mit fixe Zahlen von Judith, statt wie oben geschieben (/* - */)
        int[] myArray = {17, 5, 23, 7, 13};

        int[] numbers = Array_7_MinMaxAvg.getZufallsZahlen();

        myArray = numbers;

        // array ausgeben
        System.out.println(Arrays.toString(myArray));

        System.out.println("/////////////////////////////");

        int [] auf = Aufsteigend(myArray);

        System.out.println("/////////////////////////////");

        int [] ab = Absteigend(myArray);

    }

    static int[] Aufsteigend(int[] myArray) {

        int exchange = 0;

        for (int i = 0; i < myArray.length - 1; i++) {

            System.out.println(i + ". Duchlauf");

            for (int j = 0; j < myArray.length - 1 - i; j++) {

                if (myArray[j] > myArray[j + 1]) {

                    // exchange
                    exchange = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = exchange;
                }
                // nachvollziehen der einzelnen Veränderungen
                System.out.println("Ergebnis nach Vergleich " + j + "  " + Arrays.toString(myArray));
            }
        }


        //finales Ergebnis wird an die Methode übergeben
        return myArray;
    }

    static int[] Absteigend(int[] myArray){

        int exchange = 0;

        for (int i = 0; i < myArray.length - 1; i++) {

            for (int j = 0; j < myArray.length - 1 - i; j++) {

                if ( myArray[j] < myArray[j + 1]){

                     exchange = myArray[j];
                     myArray[j] = myArray[j + 1];
                     myArray[j + 1] = exchange;

                }

            }
            System.out.println(Arrays.toString(myArray));
        }
        return myArray;

    }

}

