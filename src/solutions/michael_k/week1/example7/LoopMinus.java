package solutions.michael_k.week1.example7;

/*
Erstellen Sie ein Programm, wo sie beide bereits gelernten Schleifen verwenden. Also eine For Schleife und eine
While Schleife. Das Programm soll von 10 bis inklusive -10 zählen. Verwende auch bei der While Loop eine Abbruchkondition
ohne break.

 */

public class LoopMinus {

    public static void main(String[] args) {
        int j =10;

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        while(j>=-10){
            System.out.println(j);
            j--;
        }
    }
}

