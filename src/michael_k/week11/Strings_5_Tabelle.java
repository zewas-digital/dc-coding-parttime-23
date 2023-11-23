package michael_k.week11;

/*
Aufgabe: Daten tabellarisch darstellen
Erstelle einen schönen tabellarischen Ausgabe aus den folgenden Arrays:

Denke daran, dass eine Tabelle eine Kopfzeile und Trennzeichen haben kann.
 */

import java.util.Arrays;

public class Strings_5_Tabelle {
    static String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
    static String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
    static int[] age = {40, 78, 5, 18, 81};
    static String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
    static float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
    static String[] header = {"Vormanme", "Nachname", "Alter", "Wohnort", " Entfernung zur Hauptstadt"};

    public static void main(String[] args) {

        String[][] tabelle = new String[firstName.length+1][6];

        //for (int i = 0; i <100; i++) {
        //    System.out.print ( "_");
        //}
        
        fillTable ( tabelle );
        int columnWidth1= columnSize ( tabelle, 0 );
        int columnWidth2= columnSize ( tabelle, 1 );
        int columnWidth3= columnSize ( tabelle, 2 );
        int columnWidth4= columnSize ( tabelle, 3 );
        int columnWidth5= columnSize ( tabelle, 4 );
        int columnWidth6= columnSize ( tabelle, 5 );
        printTable ( tabelle, columnWidth1, columnWidth2, columnWidth3, columnWidth4, columnWidth5, columnWidth6 );
    }

    static void fillTable(String[][] tabelle){
        //Tabelle mit Daten befüllen
        tabelle[0][0]= "";
        int k =0;
        for (int j = 1; j < tabelle[0].length ; j++) {
            tabelle[0][j] = header[k];
            k++;
        }
        k =1;
        for (int j = 1; j < tabelle[0].length ; j++) {
            tabelle[j][0] = "Person"+k;
            k++;
        }
        k=0;
        for (int j = 1; j < tabelle[0].length ; j++) {
            tabelle[j][1] = firstName[k];
            k++;
        }
        k =0;
        for (int j = 1; j < tabelle[0].length ; j++) {
            tabelle[j][2] = lastName[k];
            k++;
        }
        k =0;
        for (int j = 1; j < tabelle[0].length ; j++) {
            tabelle[j][3] = String.valueOf ( age[k] );
            k++;
        }
        k =0;
        for (int j = 1; j < tabelle[0].length ; j++) {
            tabelle[j][4] = place[k];
            k++;
        }
        k =0;
        for (int j = 1; j < tabelle[0].length ; j++) {
            tabelle[j][5] = String.valueOf ( distanceFromCapital[k] );
            k++;
        }


    }
    static int columnSize( String[][] tabelle, int column){
        int size = tabelle[0][column].length ();

        for (int i = 0; i < tabelle.length-1; i++) {
            if(size < tabelle[i+1][column].length()){
                size = tabelle[i+1][column].length();
            }
        }

        return size+2;
    }
    static void printTable(String[][] tabelle, int columnWidth1,int columnWidth2,int columnWidth3,int columnWidth4,int columnWidth5,int columnWidth6){

        int tableWidth = columnWidth1 + columnWidth2 + columnWidth3 + columnWidth4 + columnWidth5 + columnWidth6 + tabelle[0].length +1;
        int columnwidth[] = { columnWidth1, columnWidth2, columnWidth3, columnWidth4, columnWidth5, columnWidth6 };

        for (int i = 0; i < tableWidth; i++) {
            System.out.print ("_" );
        }
        System.out.println ( );

        // Header
        System.out.print ( "|" );
        for (int i = 0; i < tabelle[0].length; i++) {
            System.out.print ( tabelle[0][i] );

            for (int j = 0; j < columnwidth[i]-tabelle[0][i].length (); j++) {
                System.out.print (" " );
            }
            System.out.print ("|" );
        }
        System.out.println ( );
        for (int i = 0; i < tableWidth; i++) {
            System.out.print ("_" );
        }
        System.out.println ( );

        // Zeile 1
        System.out.print ( "|" );
        for (int i = 0; i < tabelle[0].length; i++) {
            System.out.print ( tabelle[1][i] );

            for (int j = 0; j < columnwidth[i]-tabelle[1][i].length (); j++) {
                System.out.print (" " );
            }
            System.out.print ("|" );
        }
        System.out.println ( );

        // Zeile 2
        System.out.print ( "|" );
        for (int i = 0; i < tabelle[0].length; i++) {
            System.out.print ( tabelle[2][i] );

            for (int j = 0; j < columnwidth[i]-tabelle[2][i].length (); j++) {
                System.out.print (" " );
            }
            System.out.print ("|" );
        }
        System.out.println ( );


        // Zeile 3
        System.out.print ( "|" );
        for (int i = 0; i < tabelle[0].length; i++) {
            System.out.print ( tabelle[3][i] );

            for (int j = 0; j < columnwidth[i]-tabelle[3][i].length (); j++) {
                System.out.print (" " );
            }
            System.out.print ("|" );
        }
        System.out.println ( );


        // Zeile 4
        System.out.print ( "|" );
        for (int i = 0; i < tabelle[0].length; i++) {
            System.out.print ( tabelle[4][i] );

            for (int j = 0; j < columnwidth[i]-tabelle[4][i].length (); j++) {
                System.out.print (" " );
            }
            System.out.print ("|" );
        }
        System.out.println ( );

        // Zeile 5
        System.out.print ( "|" );
        for (int i = 0; i < tabelle[0].length; i++) {
            System.out.print ( tabelle[5][i] );

            for (int j = 0; j < columnwidth[i]-tabelle[5][i].length (); j++) {
                System.out.print (" " );
            }
            System.out.print ("|" );
        }
        System.out.println ( );

    }
}
