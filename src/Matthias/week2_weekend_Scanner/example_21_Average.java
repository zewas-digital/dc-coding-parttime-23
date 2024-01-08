/*
Erstelle ein Programm, das den Durschnittswert für alle Zahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package Matthias.week2_weekend_Scanner;

import java.util.stream.IntStream;
import java.util.*;

public class example_21_Average {



    public static void main(String[] args) {

        // deklaration der Variabeln
        int zahl1 = 10;
        int zahl2 = 20;

        System.out.println( "Mittelwert: " );
        avarage( zahl1, zahl2 );

        System.out.println( "Mittelwert Ausgabe als Stream: " );
        IntStream intStream = IntStream.of( 15, 13, 45, 18, 89, 70, 76, 56 );
        OptionalDouble res = intStream.average( );
        if ( res.isPresent( ) ) {
            System.out.println( res.getAsDouble( ) );
        } else {
            System.out.println( "Nichts" );
        }
    }
    // Methode 1: Berechnung der Summe der Digits
    static void avarage(int zahl1, int zahl2){
        double summe = 0;
        double anzahl = 0;
        for (int i = zahl1; i < zahl2; i++) {
            summe = summe + i;
            anzahl = anzahl + 1;

        }
        System.out.println(summe/anzahl);
    }
    }



