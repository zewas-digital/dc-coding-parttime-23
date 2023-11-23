package claudia.week11_strings;

/*
Aufgabe: Daten tabellarisch darstellen
Erstelle einen schönen tabellarischen Ausgabe aus den folgenden Arrays:

Denke daran, dass eine Tabelle eine Kopfzeile und Trennzeichen haben kann.
 */

import claudia.BasicFunctions;

public class Strings_5_Tabelle {
    static String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
    static String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
    static int[] age = {40, 78, 5, 18, 81};
    static String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
    static float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

    public static void main(String[] args) {
        //change Arrays of int and float to String-Arrays:
        String[] distanceFromCapitalString = new String[distanceFromCapital.length];
        String[] ageString = new String[age.length];

        for (int i = 0; i < distanceFromCapital.length; i++) {
            distanceFromCapitalString[i] = String.format("%.2f", distanceFromCapital[i]);
            ageString[i] = String.format("%d", age[i]);
        }

        //how many lines does table need? -> length of any of the given arrays
        int numberOfLines = firstName.length;

        //Array of maximum lengths of elements to be printed:
        int[] maxLengthOfElement = new int[5];
        //minimum length is length of caption:
        maxLengthOfElement[0] = 7; //length of "Vorname"
        maxLengthOfElement[1] = 8; //length of "Nachname"
        maxLengthOfElement[2] = 5; //length of "Alter"
        maxLengthOfElement[3] = 7; //length of "Wohnort"
        maxLengthOfElement[4] = 10;//length of "Entfernung"

        //find longest element of each array and write it to maxLengthOfElement:
        for (int i = 0; i < 5; i++) {
            if (firstName[i].length() > maxLengthOfElement[0]) maxLengthOfElement[0] = firstName[i].length();
            if (lastName[i].length() > maxLengthOfElement[1]) maxLengthOfElement[1] = lastName[i].length();
            if (ageString[i].length() > maxLengthOfElement[2]) maxLengthOfElement[2] = ageString[i].length();
            if (place[i].length() > maxLengthOfElement[3]) maxLengthOfElement[3] = place[i].length();
            if (distanceFromCapitalString[i].length() > maxLengthOfElement[4]) maxLengthOfElement[4] = distanceFromCapitalString[i].length();
        }
        //set width of Column to maximum + 1
        int widthOfColumn = 0;
        for (int i = 0; i < 5; i++) {
            if (maxLengthOfElement[i] > widthOfColumn) widthOfColumn = maxLengthOfElement[i];
        }
        widthOfColumn += 4;
        System.out.println();
        System.out.println("SELBSTGEMACHT: ");
        BasicFunctions.printDashes(5 * widthOfColumn);
        System.out.print("\nVorname");
        BasicFunctions.printBlanks(widthOfColumn - "Vorname".length());
        System.out.print("| Nachname");
        BasicFunctions.printBlanks(widthOfColumn - "Nachname".length());
        System.out.print("| Alter");
        BasicFunctions.printBlanks(widthOfColumn - "Alter".length());
        System.out.print("| Wohnort");
        BasicFunctions.printBlanks(widthOfColumn - "Wohnort".length());
        System.out.print("| Entfernung");
        BasicFunctions.printBlanks(widthOfColumn - "Entfernung".length());
        System.out.println();
        BasicFunctions.printDashes(5 * widthOfColumn);
        System.out.println();

        for (int i = 0; i < numberOfLines; i++) {
            System.out.print(firstName[i]);
            BasicFunctions.printBlanks(widthOfColumn - firstName[i].length());
            System.out.print("| " + lastName[i]);
            BasicFunctions.printBlanks(widthOfColumn - lastName[i].length());
            System.out.print("| " + ageString[i]);
            BasicFunctions.printBlanks(widthOfColumn - ageString[i].length());
            System.out.print("| " + place[i]);
            BasicFunctions.printBlanks(widthOfColumn - place[i].length());
            System.out.print("| " + distanceFromCapitalString[i]);
            BasicFunctions.printBlanks(widthOfColumn - distanceFromCapitalString[i].length());
            System.out.println();
        }
        BasicFunctions.printDashes(5 * widthOfColumn);


        System.out.println("\n\nMIT PRINTF():");
        System.out.println("_________________________________________________________________________________________________");
        System.out.printf("%-20s | %-20s | %5s %5s | %-20s | %10s%n", "Vorname", "Nachname", "Alter","\t", "Wohnort", "Entfernung");
        System.out.println("_________________________________________________________________________________________________");

        for (int i = 0; i < numberOfLines; i++) {
            System.out.printf("%-20s | %-20s | %5d  %5s | %-20s | %10.2f%n", firstName[i], lastName[i], age[i], "\t", place[i], distanceFromCapital[i]);
        }
        System.out.println("_________________________________________________________________________________________________");
    }
}
