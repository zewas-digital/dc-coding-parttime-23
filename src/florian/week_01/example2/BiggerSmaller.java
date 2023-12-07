package solutions.florian.week1.example2;

/*
Schreiben Sie ein Programm, das eine Variable definiert ausgibt, ob die Zahl größer, kleiner oder gleich,
als die Zahl 10 ist. Verwende dazu Verzweigungen von if, if else und else.

Die Zahl wird wieder mit Scanner und nextInt() eingelesen.
 */

public class BiggerSmaller {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;

        if(i < j) {
            System.out.println("Kleiner");
        } else if(i > j) {
            System.out.println("Größer");
        } else {
            System.out.println("Gleichgroß");
        }



    }

}
