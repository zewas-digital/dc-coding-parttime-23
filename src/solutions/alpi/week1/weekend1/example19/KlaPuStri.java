/*
Lass die KlaPuStri Rechnungen C4 bis C8 auf Seite 10 vom Computer ausrechnen und gib jeweils das Ergebnis auf der Console aus.
Hier ist das Übungsblatt: https://docplayer.org/12412235-Ab-1-punkt-strich-klammer-rechnung-1.html
Vergleiche die Ergebnisse mit anderen Kursteilnehmenden.
 */

package solutions.alpi.week1.weekend1.example19;

public class KlaPuStri {
    public static void main(String[] args) {

        double ergebnis1;
        double ergebnisc4;
        double ergebnisc5;
        double ergebnisc6;
        double ergebnisc7;
        double ergebnisc8;


       // ergebnis1 = (3.0/4.0 - 5.0/6.0 / 15.0 /12.0);
        //System.out.println(ergebnis1);

        ergebnisc4 = (((2.0 + (1.0/2.0)) - (1.0 + (2.0/3.0))) * (6.0/9.0)) / (1.0/2.0);
        System.out.println(ergebnisc4);

        ergebnisc5 = (4.0 + (1.0/2.0)) + (2.0 + (1.0/4.0)) * (0.75 + (1.0/4.0) - (3.0/6.0) * (2.0/3.0) + ((4.0/3.0) - (2.0/5.0) * (10.0/6.0)) );
        System.out.println(ergebnisc5);

        ergebnisc6 = (1.0+(5.0/6.0) +((5.0/9.0) + 1.0 +(3.0+7.0) * (14.0/15.0)) - 2.0 +(1.0/3.0)) ;
        System.out.println(ergebnisc6);

        ergebnisc7 = (((6.0/5.0) / (2.0/5.0) + ( 3.0/10.0 + 3.0/4.0 *2.0/6.0)) - (1.0/5.0));
        System.out.println(ergebnisc7);

        ergebnisc8 = (((2.0/7.0)/(4.0/7.0)+(1.0/4.0)) * (2.0/3.0) - (10.0/3.0)) + (3.0/5.0) / (9.0/10.0);
        System.out.println(ergebnisc8);






    }
}
