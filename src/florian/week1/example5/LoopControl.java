package solutions.florian.week1.example5;

/*
Schreibe ein Programm das im Bereich von 1-100 Zahlen die durch zwei und durch drei teilbar sind ausgeben.
Beende die Schleife, wenn 20 Zahlen ausgegeben wurden dann mit der break; Anweisung.

 */

import java.sql.SQLOutput;

public class LoopControl {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;

        while (i <= 100){

            if (i % 2 == 0) {
                System.out.println(i);
                j++;
            }else if (i % 3 == 0) {
                System.out.println(i);
                j++;
            }if (j == 20){
                break;
            }
            i++;
        }

    }
}
