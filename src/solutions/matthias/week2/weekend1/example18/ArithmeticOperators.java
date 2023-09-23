/*
Schreibe ein Programm, mit dem du die gängisten arithmetischen Operatoren ausprobierst!
Diese sind: +, -, *, /, ++, -- und Math.pow(a, b) für Potenzen.

Gib den Rechenweg sowie das Ergebnis auf der Console aus.
Hier ist die Übersicht aller Operatoren: https://de.wikibooks.org/wiki/Java_Standard:_Operatoren
 */

package solutions.matthias.week2.weekend1.example18;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //Deklaration der Variabeln
        int zahl1=3, zahl2=5;
        System.out.println(zahl1 +" ^ " + zahl2 + " = " + Math.pow(zahl1, zahl2));  // Potenzieren
        System.out.println(zahl1 +" % " + zahl2 + " = " + zahl1 % zahl2);           // Modula
        System.out.println(zahl1 +" - " + zahl2 + " = " + (zahl1 - zahl2));         // Minus,Subtrahieren
        System.out.println(zahl1 +" + " + zahl2 + " = " + (zahl1 + zahl2));         // Plus, Addieren
        System.out.println(zahl1 +" / " + zahl2 + " = " + (zahl2 / zahl1));         // Dividieren

        // häufig Verwendete Operatoren in Schleifen und Auswirkungen im Code

        System.out.println("Zahl 1 = "+ zahl1 );
        System.out.println("Zahl 1 = Zahl 1 ++ :" + zahl1 ++);
        System.out.println("Zahl 1 = " + zahl1);

        System.out.println("Zahl 1 = "+ zahl1 );
        System.out.println("Zahl 1 =  ++ Zahl 1 :" + ++zahl1 );
        System.out.println("Zahl 1 = " + zahl1);

        System.out.println("Zahl 1 = "+ zahl1 );
        System.out.println("Zahl 1 =  Zahl 1 -- :" + zahl1-- );
        System.out.println("Zahl 1 = " + zahl1);

        System.out.println("Zahl 1 = "+ zahl1 );
        System.out.println("Zahl 1 =  -- Zahl 1 :" + --zahl1 );
        System.out.println("Zahl 1 = " + zahl1);

        for (int i = 0; i < 10; ++i) {
            System.out.println("Ausgabe ++i :" + "i =" +i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Ausgabe i ++ :" + "i =" +i);
        }
        for (int i = 10; i > 0; i--) {
            System.out.println("Ausgabe i-- :" + "i =" +i);
        }
        for (int i = 10; i > 0; --i) {
            System.out.println("Ausgabe --i :" + "i =" +i);
        }

        // Vergleichsoperatoren
        System.out.println("Zahl 1: " +zahl1);
        System.out.println("Zahl 2: " + zahl2);
        System.out.println("Vergleich =  == " +     (zahl1 == zahl2) );
        System.out.println("Vergleich =  != " +     (zahl1 != zahl2) );
        System.out.println("Vergleich =  >  "  +    (zahl1 > zahl2) );
        System.out.println("Vergleich =  <  "  +    (zahl1 < zahl2) );
        System.out.println("Vergleich =  >=  "  +   (zahl1 >= zahl2));
        System.out.println("Vergleich =  <=  "  +   (zahl1 <= zahl2));

        //Boolsche Operatoren
        System.out.println("Zahl 1: " +zahl1);
        System.out.println("Zahl 2: " + zahl2);
        System.out.println("Vergleich =  ! " +     (zahl1 == zahl2) );
        System.out.println("Vergleich =  != " +     (zahl1 != zahl2) );

    }
}
