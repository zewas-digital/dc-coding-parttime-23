package solutions.saifedine.week1.example5;

/*
Schreibe ein Programm das im Bereich von 1-100 Zahlen die durch zwei und/oder durch drei teilbar sind ausgeben.
Beende die Schleife, wenn 20 Zahlen ausgegeben wurden dann mit der break; Anweisung.

 */

public class LoopControl {
    public static void main(String[] args) {
        int anzahlschleifen = 0;
        int i = 1;

        while (i <= 100) {
            i++;

            if (i % 2 == 0)
            anzahlschleifen ++;
        }
    }
}