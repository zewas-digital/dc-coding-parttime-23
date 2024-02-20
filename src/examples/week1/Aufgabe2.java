package examples.week1;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        //Ebene 1
        int ebene1 = 10;
        int sum;
        int ebene2;
        for (int i = 0; i < 20; i++) {
            //Ebene 2
            ebene2 = 100;
            if(i < 4) {
                //Ebene 3
                int ebene3 = 200;
                sum = ebene3 + ebene2 + ebene1;
            }

        }
        int ebene5 = 100;
        int summe = summeberechnen(4, 4, ebene5);
        System.out.println("Summe: " + summe);
    }

    static int summeberechnen(int nummer1, int nummer2, int ebene5) {

        return nummer1 + nummer2 + ebene5;
    }
}
