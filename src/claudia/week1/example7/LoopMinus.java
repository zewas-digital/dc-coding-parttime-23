package solutions.claudia.week1.example7;

/*
Erstellen Sie ein Programm, wo sie beide bereits gelernten Schleifen verwenden. Also eine For Schleife und eine
While Schleife. Das Programm soll von 10 bis inklusive -10 zählen. Verwende auch bei der While Loop eine Abbruchkondition
ohne break.

 */

public class LoopMinus {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("erste Variante: For-Schleife:");
        for (int i = 10; i >= -10 ; i--) {
            System.out.print(i + " ");
        }
        ////////////////////////////////////////////////////
        System.out.println();
        System.out.println("zweite Variante: While-Schleife:");
        int i = 10;
        while(i >= -10){
            System.out.print(i + " ");
            i--;
        }
    }
}
