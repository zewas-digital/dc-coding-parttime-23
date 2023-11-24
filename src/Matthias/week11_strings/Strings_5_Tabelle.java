package Matthias.week11_strings;

/*
Aufgabe: Daten tabellarisch darstellen
Erstelle einen schönen tabellarischen Ausgabe aus den folgenden Arrays:

Denke daran, dass eine Tabelle eine Kopfzeile und Trennzeichen haben kann.
 */

import java.util.Arrays;

public class Strings_5_Tabelle {

    static int minLength = 18;

    public static void main( String[] args ) {
        String[] headline = {"Vorname", "Nachname", "Alter", "Ort", "km bis Wien"};
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
        printrow( headline );;
        printDivider(headline.length);
        // Aufruf der int to String-> Methode 1
        String[] Array1=intToString( age );
        // Aufruf der float to String-> Methode 2
        String[] Array2=floatToString( distanceFromCapital );
        // floatToString( distanceFromCapital);
        for (int i = 0; i < arraylenth; i++) {
            String[] row = {
                    firstName[i],
                    lastName[i],
                    Array1[i],
                    place[i],
                    Array2[i],


            };
            printrow( row );
        }

        System.out.println( "Weg 2: " );
            System.out.printf( "Zeile"+":"+" "
                    + Arrays.toString( firstName ) + " "
                    + Arrays.toString( lastName)  + " "
                    + Arrays.toString( Array1 ) + " "
                    + Arrays.toString( place )  + " "
                    + Arrays.toString( distanceFromCapital ));

            System.out.println( "Weg 3: " );
                    printrow( firstName  );
                    printrow( lastName) ;
                    printrow( Array1 ) ;
                    printrow( place ) ;
                    printrow(Array2);


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
    public static void printrow( String[] Array){
        for (String Wort:Array) {
            printCell( Wort );
        }
        System.out.println();
    }
    private static void printCell(String content) {
        printCell(content, "|");
    }
    private static void printCell(String content, String divider) {
        int contentLength = content.length();

        System.out.print(" " + content + " ".repeat(minLength - contentLength) + divider);
    }
    public static void printDivider(int cells) {
        for (int i = 0; i < cells; i++) {
            printCell("-".repeat(minLength), "+");
        }
        System.out.println();
    }
}
