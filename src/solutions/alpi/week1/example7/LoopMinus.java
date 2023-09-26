package solutions.alpi.week1.example7;

/*
Erstellen Sie ein Programm, wo sie beide bereits gelernten Schleifen verwenden. Also eine For Schleife und eine
While Schleife. Das Programm soll von 10 bis inklusive -10 zählen. Verwende auch bei der While Loop eine Abbruchkondition
ohne break.

 */

public class LoopMinus {
    public static void main(String[] args) {
        for (int i = 10; i >= -10 ; i--) {


            System.out.println(i);

        } int i = 10;
        while (i >= -10){

            System.out.println(i);
            i--;
        }
    }
}
