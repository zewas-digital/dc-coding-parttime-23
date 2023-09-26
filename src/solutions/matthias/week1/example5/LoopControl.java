package solutions.matthias.week1.example5;

/*
Schreibe ein Programm das im Bereich von 1-100 Zahlen die durch zwei und durch drei teilbar sind ausgeben.
Beende die Schleife, wenn 20 Zahlen ausgegeben wurden dann mit der break; Anweisung.

 */

public class LoopControl {
    public static void main(String[] args) {
        int iSchleifenEnde= 20;
        int zeahler=0;
        for (int i = 1; i <= 100; i++) {


            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
                zeahler++;
            }
            if (zeahler==iSchleifenEnde) {
                System.out.println("Zählerstand= " + zeahler);
              break;
            }


        }
    }
}

