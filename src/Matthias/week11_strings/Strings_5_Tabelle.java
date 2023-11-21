package Matthias.week11_strings;

/*
Aufgabe: Daten tabellarisch darstellen
Erstelle einen schönen tabellarischen Ausgabe aus den folgenden Arrays:

Denke daran, dass eine Tabelle eine Kopfzeile und Trennzeichen haben kann.
 */

import java.util.Arrays;

public class Strings_5_Tabelle {
    String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
    String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
    int[] age = {40, 78, 5, 18, 81};
    String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
    float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

    public static void main( String[] args ) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        //Programmablauf
        //1. Umwandeln der verschiednenen Datentypen in einen float to String
        // Tipp: https://stackoverflow.com/questions/30760438/simple-and-clean-java-float-to-string-conversion
        //2. Ausgabe der ProgrammZeile
        //

        int arraylenth=firstName.length;
        // Programm Start: Benutzer Ausgabe
        System.out.println( "Programm Start" );

        System.out.println( "Tabelle:" );
        System.out.println( "Spalte"+":"+ "Firstname" +" Lastname " + " Age "+" Place "+" Distance ");
        String[] Array1 = new String[age.length];
        String[] Array2 = new String[distanceFromCapital.length];
        // Aufruf der int to String-> Methode 1
        Array1=intToString( age );
        // Aufruf der float to String-> Methode 2
        Array2=floatToString( distanceFromCapital );
        // floatToString( distanceFromCapital);

        for (int i = 0; i < arraylenth; i++) {
            System.out.println(
                    "Zeile"+":"+" "
                    + Array1[i]+" "
                    + place[i]+" "
                    + Array2[i]+" "
                    + place[i]+" "
                    +distanceFromCapital[i]);

        }


            System.out.printf( "Zeile"+":"+" "
                    + Arrays.toString( Array1 ) + " "
                    + Arrays.toString( place ) + " "
                    + Arrays.toString( Array2 ) + " "
                    + Arrays.toString( place ) + " "
                    + Arrays.toString( distanceFromCapital ));




    }
    //Methode 1: int to String
    public static String[] intToString (int[] intArray){
        String[] Array = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            Array[i]=Integer.toString(intArray[i]);
        }
        return Array;
    }
    //Methode 2: Float Array in einen STING Array Umwandeln und Rückgeben
    public static String[] floatToString (float[] floatArray){
        String[] Array = new String[floatArray.length];
        for (int i = 0; i < floatArray.length; i++) {

            Array[i]=Float.toString(floatArray[i]);
        }
        return Array;
    }

}
