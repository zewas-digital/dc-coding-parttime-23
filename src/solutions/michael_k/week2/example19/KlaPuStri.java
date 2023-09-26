/*
Lass die KlaPuStri Rechnungen C4 bis C8 auf Seite 10 vom Computer ausrechnen und gib jeweils das Ergebnis auf der Console aus.
Hier ist das Übungsblatt: https://docplayer.org/12412235-Ab-1-punkt-strich-klammer-rechnung-1.html
Vergleiche die Ergebnisse mit anderen Kursteilnehmenden.
 */

package solutions.michael_k.week2.example19;

public class KlaPuStri {
    public static void main(String[] args) {

        double ergebnis1;
        double ergebnis2;
        double ergebnis3;
        double ergebnis4;
        double ergebnis5;

        ergebnis1 = ( ((2.0+(1.0/2.0))-(1+(2.0/3.0))) *(6.0/9.0) )/0.5;
        System.out.println("C4=" + ergebnis1);

        ergebnis2 =( 4.5+2.25 * (0.75 +0.25-0.5*(2.0/3.0)+((4.0/3.0)-(2.0/5.0)*(10.0/6.0) )));
        System.out.println("C5="+ ergebnis2);

        ergebnis3 =(1.0+(5.0/6.0))+(  (5.0/9.0)+(1.0+(3.0/7.0))*(14.0/15.0)  )-(2.0+(1.0/3.0));
        System.out.println("C6="+ ergebnis3);

        ergebnis4 =(  (6.0/5.0)/(2.0/5.0)+((3.0/10.0)+(3.0/4.0)*(2.0/6.0)) )-(1.0/5.0);
        System.out.println("C7="+ ergebnis4);

        ergebnis5 =(  ((2.0/7.0)/(4.0/7.0)+(1.0/4.0))*(2.0/3.0)-(10.0/3.0))+(3.0/5.0)/(9.0/10.0);
        System.out.println("C8="+ ergebnis5);

    }
}
