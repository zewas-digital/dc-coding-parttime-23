/*
Lass die KlaPuStri Rechnungen C4 bis C8 auf Seite 10 vom Computer ausrechnen und gib jeweils das Ergebnis auf der Console aus.
Hier ist das Übungsblatt: https://docplayer.org/12412235-Ab-1-punkt-strich-klammer-rechnung-1.html
Vergleiche die Ergebnisse mit anderen Kursteilnehmenden.
 */

package solutions.judith.weekend1.example19;

public class KlaPuStri {

    public static void main(String[] args) {

        double result =((2+(0.5)) - (1+(2.0/3.0))*(6.0/9.0)) / (1.02/2.0);
        System.out.println(result);

        double result2 =((4+(1.0/2.0))+(2+(1.0/4.0))*(0.75 +(1.0/4.0)-(3.0/6.0)*(2.0/3.0)+((4.0/3.0)-(2.0/5.0)*(10.0*6.0))));
        System.out.println(result2);

        double result3 =((1 + (5.0/6.0))+((5.0/9.0)+(1+(3.0/7.0))*(14.0/15.0))-(2+(1.0/3.0)));
        System.out.println(result3);

        double result4 =(((6.0/5.0)/ (2.0/5.0) + ((3.0/10.0)+ (3.0/4.0)*(2.0/6.0))) - (1.0/5.0));
        System.out.println(result4);

        double result5 =((((2.0/7.0)/(4.0/7.0)+(1.0/4.0)) * (2.0/3.0)- (10.0/3.0)) + (3.0/5.0) / (9.0/10.0));
        System.out.println(result5);

    }
}
