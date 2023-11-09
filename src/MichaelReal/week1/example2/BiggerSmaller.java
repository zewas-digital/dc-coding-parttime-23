package MichaelReal.week1.example2;

/*
Schreiben Sie ein Programm, das eine Variable definiert ausgibt, ob die Zahl größer, kleiner oder gleich,
als die Zahl 10 ist. Verwende dazu Verzweigungen von if, if else und else.

 */

public class BiggerSmaller {
    public static void main(String[] args){

        int number1 = 15;
        int number2 = 10;

        if (number1 < number2) {
            System.out.println("Ist kleiner");
        } else if (number1 > number2){
            System.out.println("Ist grösser");
        } else {
            System.out.println("gleichgross");
        }
    }
}

