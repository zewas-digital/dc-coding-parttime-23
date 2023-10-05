package judith.week04;

/*
Aufgabe: Number Array
Erstelle ein int[] mit der Dimension von Benutzerangabe und befülle mit 1, 2, 3, usw.
//Benutzer Abfrage = 5 = [1,2,3,4,5]

Erstelle ein zweites int[] und befülle mit Zahlen entsprechend der Größe ..., 3, 2, 1.
 */


import java.util.Arrays;
import java.util.Scanner;
public class Arrays_1_NumberArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte geben sie die gewünschte Dimension ein");
        int eingabe = scan.nextInt();

        int[] dimension = new int[eingabe];


        for (int i = 0; i < eingabe; i++) {
            dimension [i] = i + 1;
        }
        System.out.println(Arrays.toString(dimension));
        for (int i = eingabe; i >=1 ; i--) {
            dimension [eingabe-i] = i;

        }
        System.out.println(Arrays.toString(dimension));







    }


}