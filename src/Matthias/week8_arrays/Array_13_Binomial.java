package Matthias.week8_arrays;

/*
Wenn wir die Zahlen Diagonal lesen, bekommen wir die Koeffizienten von (a+b)^n

Zum Beispiel:

(a+b)2 = a2 + 2ab + b2

(a+b)3 = a3 + 3a2b + 3ab2 + b3

Frage den Anwender, welche Formular er braucht, und gib die konkrete Formel in der Konsole aus. Verwende ^ für die Darstellung des Exponenten.

 */

//Class import
import Matthias.week100_UsefullMethods.UserInput;

import java.util.Random;
import java.util.Scanner;

public class Array_13_Binomial {
    //Methoden Aufruf:
        //rand aus der Klasse Random
    public static Random rand = new Random( );
        //scanner aus der Klasse Random
    public static Scanner scanner = new Scanner( System.in );
        //eigene public Klasse
    public static UserInput userInput= new UserInput();

    //Start Main Programm
    public static void main( String[] args ) {
        String userInformation= "Sie können zwischen zwei Binomialen wählen: (a+b)2 -> Zahl:2 Eingeben; (a+b)3: ";
        userInput.programmStart(userInformation);
        int number=scanner.nextInt();
        switch ( number ) {
            case 2 -> {
                System.out.println( " (a+b)^2 = a^2 + 2ab + b^2" );
            }
            case 3 -> {
                System.out.println( " (a+b)^3 = a^3 + 3a^2 * b + 3a*b^2 + b^3" );
            }
        }
        userInput.programmEnde();

    }
}

