package solutions.Simon.example7;

/*
Erstellen Sie ein Programm, wo sie beide bereits gelernten Schleifen verwenden. Also eine For Schleife und eine
While Schleife. Das Programm soll von 10 bis inklusive -10 zählen. Verwende auch bei der While Loop eine Abbruchkondition
ohne break.

 */

public class LoopMinus {
    public static void main(String[] args) {
        int i =10;
        while (i>=-10) {
            System.out.println(i);
            i--;
        }

        for (int j = 10; j >=-10 ; j--) {
            System.out.println(j);
        }

    }
}