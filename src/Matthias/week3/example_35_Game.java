package Matthias.week3;

import java.util.Random;
import java.util.Scanner;

/*
Erstelle ein Spiel, welche der Spieler fordert heraus eine Zahl zwischen 0 und 9999 zu erraten.

Ablauf:

    Der Computer denkt sich eine Zahl aus.

Code-Zeile:
Random rand = new Random();
int value = rand.nextInt(10000);

    Der Benutzer muss durch Konsole eine Zahl eingeben
    Das Spiel antwortet
        So viele Ziffern sind korrekt und auf dem richtigen Platz
        So viele Ziffern sind vorhanden, aber stehen auf dem falschen Platz


Ausgabe:
( Der Computer hat die Zahl: 1234 )
Der Spieler wählt die 2354
Die Antwort lautet: 1 Ziffer ist korrekt, weitere 2 Ziffern sind vorhanden

Das Spiel endet, wenn:

    der Spieler die richtige Zahl erraten hat
    der Spieler hat nach 20 Versuchen immer noch kein Erfolg
 */
public class example_35_Game {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        int iMinValue=0,iMaxValue=9999;
        /*/Variabeln
        //Programm Ablauf
        //1. UserStory-> Programm Beschreibung

        //2. Erzeugen der RandomZahl und Rückgabe ins Programm

        //3. Eingabe der Zahl durch den UserInput

        //4. Prüfung der Zahlen

        //5. Ausgabe der Auswertung
        */
            int computerNumber = createRandomNumber(iMinValue,iMaxValue);
            System.out.println( computerNumber );
            userInfo();
            int attempts = 0;
            while (attempts < 20) {
                int userNumber = scanner.nextInt();
                if (userNumber == computerNumber) {
                    System.out.println("Herzlichen Glückwunsch! Sie haben die richtige Zahl erraten.");
                    break;
                } else {
                    String computerNumberString = String.valueOf(computerNumber);  //Die generierte Zahl in einen String umwandel
                    String userNumberString = String.valueOf(userNumber); // Die eingegebene Zahl in einen String umwandeln

                    int correctDigitsAndPosition = 0; // Zähler für korrekte Ziffern an der richtigen Position initialisieren
                    int correctDigitsOnly = 0; //Zähler für korrekte Ziffern an falscher Position initialisieren

                    for (int i = 0; i < userNumberString.length(); i++) {


                            if ( computerNumberString.charAt( i ) == userNumberString.charAt( i ) ) { // Jede Ziffer der beiden Zahlen vergleichen
                                correctDigitsAndPosition++; // Wenn die Ziffern an der gleichen Position übereinstimmen, den entsprechenden Zähler erhöhen
                            }
                            if (  !(computerNumberString.charAt( i ) == userNumberString.charAt( i ))) {
                                if ( computerNumberString.contains( String.valueOf( userNumberString.charAt( i ) ) ) ) {
                                    correctDigitsOnly++;
                                }
                            }
                    }
                    /*
                    Diese Schleife durchläuft die vier Ziffern der beiden Zahlen. Für jede Ziffer wird geprüft, ob sie an der gleichen Position übereinstimmen.
                    Wenn dies der Fall ist, wird der Zähler correctDigitsAndPosition erhöht.
                    Andernfalls wird geprüft, ob die Ziffer in der anderen Zahl vorkommt. Wenn dies der Fall ist, wird der Zähler correctDigitsOnly erhöht.

                     */

                    System.out.println("Die Antwort lautet: " + correctDigitsAndPosition + " Ziffern sind korrekt und auf dem richtigen Platz, weitere " + correctDigitsOnly + " Ziffern sind vorhanden.");
                }

                attempts++;
            }

            if (attempts == 20) {
                System.out.println("Das Spiel ist vorbei. Sie haben nach 20 Versuchen immer noch kein Erfolg.");
            }

            scanner.close();
        }
    //Methode 1:
    public static void userInfo(){
        System.out.println("Willkommen im Glückspiel!\nErraten Sie eine Zahl von 0-9999:" );
    }
    public static int createRandomNumber(int iMinValue, int iMaxValue){
        Random RZahl=new Random(  );
        int iRandomNumber=RZahl.nextInt( iMinValue,iMaxValue+1);
        return iRandomNumber;
    }
}
