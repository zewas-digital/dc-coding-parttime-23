package solutions.claudia.week1.example2;

/*
Schreiben Sie ein Programm, das eine Variable definiert ausgibt, ob die Zahl größer, kleiner oder gleich,
als die Zahl 10 ist. Verwende dazu Verzweigungen von if, if else und else.

Die Zahl wird wieder mit Scanner und nextInt() eingelesen.
 */

public class BiggerSmaller {
    public static void main(String[] args) {

        int number = 10;

        if (number > 10) {
            System.out.println("Zahl " + number + " ist größer als 10.");}
            else if (number < 10){
                System.out.println("Zahl " + number + " ist kleiner als 10.");
            }
            else System.out.println("Zahlen sind beide gleich 10.");
        }

    }

