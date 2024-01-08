package saifedine.week01.example5;

/*
Schreibe ein Programm das im Bereich von 1-100 Zahlen die durch zwei und/oder durch drei teilbar sind ausgeben.
Beende die Schleife, wenn 20 Zahlen ausgegeben wurden dann mit der break; Anweisung.

 */

// for oder while von 1-100
// if Modulo 2 else if Modulo 3 sout
// count 20 --> break

public class LoopControl {

    public static void main(String[] args) {

        // Option 1: Fori
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println("Option 1: " + i);
                count++;
            }
            else if (i % 3 == 0) {
                System.out.println("Option 1: " + i);
                count++;
            }
            if (count == 20){
                break;
            }
        }

        System.out.println();

        // Option 2: While
        int zahl = 1;
        int counter = 0;

        while (zahl <= 100){
            zahl++;

            if (zahl % 2 == 0){
                System.out.println("Option 2: " + zahl);
                counter++;
            }
            else if (zahl % 3 == 0) {
                System.out.println("Option 2: " + zahl);
                counter++;
            }
            if (counter == 20){
                break;
            }
        }
    }
}