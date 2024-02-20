package solutions.jeremias.week1.example2;

/*
Schreiben Sie ein Programm, das eine Variable definiert ausgibt, ob die Zahl größer, kleiner oder gleich,
als die Zahl 10 ist. Verwende dazu Verzweigungen von if, if else und else.

 */

public class BiggerSmaller {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i%2 == 0) {
                System.out.println(i);

            }
            else if(i%3 == 0) {
                System.out.println(i);
            }



        }
    }

}
