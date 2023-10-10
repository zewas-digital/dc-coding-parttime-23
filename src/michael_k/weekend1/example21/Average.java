/*
Erstelle ein Programm, das den Durschnittswert für alle Zahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.michael_k.weekend1.example21;

public class Average {
    public static void main(String[] args) {

        double result = average(9,20);
        System.out.println(result);
    }

    static double average ( double wert1, double wert2){
        double xwert = wert1;
        double summe= 0;
        double zahlenanzahl=0;

        for (int i = 0; i < wert2-wert1+1; i++) {
            for (int j = 0; j <1; j++) {
                summe = summe+xwert;
            }
            xwert++;
            zahlenanzahl=i+1;
        }

        return summe=summe/zahlenanzahl;
    }
}
