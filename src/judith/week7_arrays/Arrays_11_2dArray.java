package judith.week7_arrays;

/*
Aufgabe: 2D-Array

Erstelle ein Zwei-Dimension-Array int[][] und befülle es mit Zufallszahlen von 0 bis 100.
Frage dazu die Längen der Dimensionen vom Anwender ab.
Gib die Summe pro Zeile oder pro Spalte aus.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays_11_2dArray {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);


        System.out.print("Wieviele Zeilen soll dein 2d Array haben? ");
        int heigth = scan.nextInt();

        System.out.println("Wieviele Spalten soll dein 2d Array haben?");
        int width = scan.nextInt();

        int[][] numbers = new int [heigth][width];
       int sum = 0;

        for (int i = 0; i < heigth; i++) {

            for (int j = 0; j < width ; j++) {
                numbers [i][j] = random.nextInt(1,100);

            }

            System.out.println(Arrays.toString(numbers[i]));



        }

        for (int i = 0; i < heigth ; i++) {
            for (int j = 0; j < width ; j++) {
                sum = sum + numbers[i][j];
                System.out.println("Summer der Zeile " + i + " " + "Summe "  + sum);


            }

        }


    }



}