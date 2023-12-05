package solutions.Simon.example5;

/*
Schreibe ein Programm das im Bereich von 1-100 Zahlen die durch zwei und/oder durch drei teilbar sind ausgeben.
Beende die Schleife, wenn 20 Zahlen ausgegeben wurden dann mit der break; Anweisung.

 */

public class LoopControl {
    public static void main(String[] args) {
        int anzahl = 0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                System.out.println(i);
                anzahl++;
            }
            else if (i%3==0){
                System.out.println(i);
                anzahl++;
            }
            if(anzahl==20) {
                break;
            }

        }

    }


}