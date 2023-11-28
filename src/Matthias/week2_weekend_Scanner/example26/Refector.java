package Matthias.week2_weekend_Scanner.example26;

import java.util.Scanner;

public class Refector {
    //Methode 1: Druck ein Rechteck
    static void printEmptySquare(char buchstabe, int seitenlänge) {
        for (int i = 0; i < seitenlänge; i++) {
            System.out.print("Zeile: " + i + " ");

            for (int j = 0; j < seitenlänge; j++) {

                if (i == seitenlänge - 1) {
                    System.out.print(buchstabe);
                } else if (i == 0) {
                    System.out.print(buchstabe);
                } else if (j == seitenlänge - 1) {
                    System.out.print(buchstabe);
                } else if (j == 0) {
                    System.out.print(buchstabe);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    //Methode 2: Holt sich die Zahl vom Benutzer
    static int getInt() {
        int intNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie eine ganze Zahl ein:");
        intNumber = scanner.nextInt();
        return intNumber;
    }

    public static void main(String[] args) {

        //Variablen vom Benutzer Abfragen
        int intNumber1 = getInt();
        int intNumber2 = getInt();

        //Drucken der Rechtecke:
        printEmptySquare('x', intNumber1);
        printEmptySquare('A', intNumber2);
    }
 }

