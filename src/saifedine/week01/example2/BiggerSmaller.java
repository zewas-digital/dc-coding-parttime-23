package saifedine.week01.example2;

/*
Schreiben Sie ein Programm, das eine Variable definiert ausgibt, ob die Zahl größer, kleiner oder gleich,
als die Zahl 10 ist. Verwende dazu Verzweigungen von if, if else und else.

Die Zahl wird wieder mit Scanner und nextInt() eingelesen.
 */

public class BiggerSmaller {

    public static void main(String[] args) {

        int zahl = 10;

        if (zahl > 10){
            System.out.println(zahl + " ist größer als 10");
        }
        else if (zahl < 10) {
            System.out.println(zahl + " ist kleiner als 10");
        }
        else {
            System.out.println(zahl + " ist gleich 10");
        }
    }
}


