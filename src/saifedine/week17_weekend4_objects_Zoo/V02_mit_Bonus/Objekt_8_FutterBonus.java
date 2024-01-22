package saifedine.week17_weekend4_objects_Zoo.V02_mit_Bonus;

/*
Bonusaufgabe: Tierfutter
Erweitere dein Zooprogramm mit Futter-Bedarfsanalyse.

+ Erstelle eine Klasse für Futter mit einen Namen, Einheit und Einheitspreis.
+ Jedes Tier hat einen Futterbedarf, die beinhaltet das Futter und eine Menge
+ Erstelle eine Statistik, was der Futterbedarf von Zoo ist, und wie viel die Tagesversorgung dich kostet.
Für diese Aufgabe kann man HashMap gut brauchen.
 */

public class Objekt_8_FutterBonus {

    public static void main(String[] args) {





        Futter wildfutter = new Futter("Heu", "kg", 0.16F);

        Tiere hirsch2wild = new Tiere("Hirsch2","Wild",wildfutter,18);

        System.out.println(wildfutter);

        System.out.println(hirsch2wild);

    }
}
