/*
Erstelle ein Programm, das den Durschnittswert für alle Zahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package Matthias.week2_weekend_Scanner;

import java.util.stream.IntStream;
import java.util.*;

public class example_21_Average {

    static void avarage(int zahl1, int zahl2){
        double summe = 0;
        double anzahl = 0;
        for (int i = zahl1; i < zahl2; i++) {
            summe = summe + i;
            anzahl = anzahl + 1;

        }
        System.out.println(summe/anzahl);
    }

    public static void main(String[] args) {


        int zahl1= 10;
        int zahl2= 20;

        avarage(zahl1,zahl2);

        IntStream intStream = IntStream.of(15, 13, 45, 18, 89, 70, 76, 56);
        OptionalDouble res = intStream.average();
        System.out.println("Mittelwert: ");
        if (res.isPresent()) {
            System.out.println(res.getAsDouble());
             } else {
            System.out.println("Nichts");
            }
        }



    }



