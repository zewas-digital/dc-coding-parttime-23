package solutions.matthias.week1.example2;

/*
Schreiben Sie ein Programm, das eine Variable definiert ausgibt, ob die Zahl größer, kleiner oder gleich,
als die Zahl 10 ist. Verwende dazu Verzweigungen von if, if else und else.

Die Zahl wird wieder mit Scanner und nextInt() eingelesen.
 */

public class BiggerSmaller {
    public static void main(String[] args) {

        /*Veriablen definiert*/
        int iVergleichszahl = 10;

        int iEingabezahl =9;

        /*Programmstart*/
        if (iEingabezahl > iVergleichszahl ) {
            System.out.println("Größer als 10");
        } else if(iEingabezahl < iVergleichszahl) {
            System.out.println("KLeiner als 10");
        } else{
            System.out.println("Gleichgroß wie 10");
        }
    }
}
