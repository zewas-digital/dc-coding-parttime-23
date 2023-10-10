package solutions.claudia.week1.example5;

/*
Schreibe ein Programm das im Bereich von 1-100 Zahlen die durch zwei oder durch drei (oder beides!) teilbar sind ausgeben.
Beende die Schleife, wenn 20 Zahlen ausgegeben wurden dann mit der break; Anweisung.

 */

public class LoopControl {
    public static void main(String[] args) {
        int anzahl = 0;
        for (int i = 0; i <= 100; i++) {

            if (i%2 == 0){
                System.out.println(i);
                anzahl++;
            }
            else if (i%3 == 0){
                System.out.println(i);
                anzahl++;
            }
            if (anzahl == 20){
                break;
            }
        }
        System.out.println("Anzahl der Zahlen = " + anzahl);


    //Zahlen, die durch 2 und 3 teilbar sind:


       /* System.out.println();
        System.out.println(" Zahlen unter 100, die durch 2 UND durch 3 teilbar sind:");

        for (int i = 1; i <= 100 ; i++) {

            if ((i%3 == 0) && (i%2 == 0)){
                anzahl++;
                System.out.print(i + " ");
            }
            if (anzahl == 20){
                break;
            }
        }
        System.out.println();
        System.out.println("Anzahl bis Abbruch = " +anzahl);

        //Zahlen, die durch 2 oder 3 teilbar sind:
        anzahl = 0;

        System.out.println(" Zahlen unter 100, die durch 2 UND/ODER durch 3 teilbar sind:");

        for (int i = 1; i <= 100 ; i++) {

            if ((i%3 == 0) || (i%2 == 0)){
                anzahl++;
                System.out.print(i + " ");
            }
            if (anzahl == 20){
                break;
            }
        }
        System.out.println();
        System.out.println("Anzahl bis Abbruch = " +anzahl);*/

    }
}
