package judith.week14_Selbsttest;

public class AufgabenSchleifen {
    // Schleifen *******************



    public static void main(String[] args) {

        // Aufgabe 1 -------------------
        /* Zähle in einer for-Schleife rückwärts von 10 bis inklusive 0 und gib jede Zahl aus.
         * Ausgabe:
            10 9 8 7 6 5 4 3 2 1 0
         */

        for (int i = 10; i >= 0; i--) {
            System.out.println("Aufgabe 1: " + i);
            
        }
        // Aufgabe 2 -------------------
        /* Zähle in einer for-Schleife von -30 bis inklusive 30 und gib jede Zahl aus die ohne Rest durch 3 teilbar ist.
         * Ausgabe:
            -30
            -27
            -24
            ...
            24
            27
            30
         */

        for (int i = -30; i <=30 ; i++) {
            if(i % 3 == 0){
                System.out.println("Aufgabe 2: " +i);

            }
        }

        // Aufgabe 3 -------------------
        /* Zähle mit Hilfe einer while-Schleife und einer separaten Zählvariable von 0 bis inklusive 10 und
         * gib die Zahlen aus. Wenn die Zahl größer als 5 ist mach 2 Zeilenumbrüche.
         * Ausgabe
0
1
2
3
4
5
6

7

8

9

10
         */

        int i=0;
        while (i<=10){
            i++;
            if (i <= 5){
                System.out.println(i);
            }
            else {
                System.out.println(i +"\n");
            }

        }








        
    }
}
