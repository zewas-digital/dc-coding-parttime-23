/*
Erstelle ein Programm, das den Durschnittswert für alle Zahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package saifedine.week02_weekend1.example21;

public class Average {
    public static void main(String[] args) {

        System.out.print("Durchschnitt der Zahlen von 1 bis 4: ");
        System.out.println(average(1, 4));

        System.out.println();

        System.out.print("Durchschnitt der Zahlen von 10 bis 20: ");
        System.out.println(average(10, 20));

        System.out.println();

        average(10,20);

    }

    static int average(int startWert, int endWert){

            int summe = 0;
            int anzahl = 0;

            for (int i = startWert; i <= endWert ; i++) {
                anzahl ++;
                summe = summe + i;
                //System.out.println("fori: " + i + ", anzahl: " + anzahl + ", summe: " + summe);
            }
            System.out.println("summe / anzahl = Ergebnis: " + summe / anzahl);
            return (summe / anzahl);
    }
}

