package solutions.michael_k.week1.example2;

/*
Schreiben Sie ein Programm, das eine Variable definiert ausgibt, ob die Zahl größer, kleiner oder gleich,
als die Zahl 10 ist. Verwende dazu Verzweigungen von if, if else und else.

 */

public class BiggerSmaller {
    public static void main(String[] args) {

        int Zahl1 = 3;
        int Zahl2 = 2;

        if (Zahl1 < Zahl2) {
            System.out.println("kleiner");
        } else if (Zahl1 > Zahl2) {
            System.out.println("größer");
        } else {
            System.out.println("Gleichgroß");
        }
    }
}


