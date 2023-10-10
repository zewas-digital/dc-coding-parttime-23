/*
Erstelle ein Programm, das den Durchschnittswert für alle Zahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.claudia.weekend1.example21;

public class Average {
    public static void main(String[] args) {

        System.out.print("Durchschnitt der Zahlen von 1 bis 4: ");
        System.out.println(average(1, 4));

        System.out.print("Durchschnitt der Zahlen von 1 bis 10: ");
        System.out.println(average(1, 10));

        System.out.print("Durchschnitt der Zahlen von 10 bis 1000: ");
        System.out.println(average(10, 1000));

    }

    static double average(int number1, int number2) {
        double summe = 0;
        double anzahl = 0;

        for (int i = number1; i <= number2; i++) {
            summe = summe + i;
            anzahl++;
        }

        return (summe / anzahl);
    }
}