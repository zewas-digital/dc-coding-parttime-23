package judith.week5;

/*
Erstelle ein int[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus. Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden. Der Aufruf und die Ausgabe erfolgt in der main Methode.

    Sortiere der Größe nach aufsteigend (Ascending)
    Sortiere der Größe nach absteigend (Descending)

Erklärung Bubblesort: https://www.youtube.com/watch?v=qtXb0QnOceY
 */


import java.util.Arrays;

// es werden zwei Schleifen benötigt die äußere läuft solange wie die größe des Arrays ist (-1) / 5 Werte vorhanden - läuft 4 mal durch (Länge > 1; i = i+1)
// for (int i =0; i< array.length; i++) die innere ist eig. genau gleich weil sie auch so oft durchlaufen muss
// die innere Schleife sollte die Werte vergleichen und sortieren
public class Array_8_Bubblesort {
    // x Anzahl Durchläufe
        // für jeden Durchlauf alle Spalten vergleichen
   // for (int i =0; i< array.length - 1 ; i++
            // wenn kleiner dann austauschen
                // if (array[j] > arr[j+1]{
                        //tauschen
                 //}

    //https://falconbyte.net/blog-java-bubblesort.php

    //nach durchlauf kontrollausgabe array
        public static void main(String[] args) {

            int[] array = {24, 7, 12, 25, 64};

            int[] temp = bubbleSort(array);
            System.out.println(Arrays.toString(temp));

        }

    public static int[] bubbleSort (int[] array) {
       int sortiert;
        for (int i = 0; i < array.length - 1 ; i++) {       // Anzahl der Durchläufe
            System.out.println(" Durchlauf i: " + i);
            for (int j = 0; j < array.length  -1 - i  ; j++) { // für jeden Durchlauf alle Spalten vergleichen /-i deshalb das er die letzte Stelle im Array ignoriert weil diese ja schon sortiert ist. Somit wird es natürlich auch schneller
                if (array[j] > array[j + 1]) {
                    //Werte tauschen
                    sortiert = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = sortiert;
                }
                System.out.println(Arrays.toString(array));
            }

        }
    return array;
    }
// von groß nach klein sortierung noch ergänzen


}
