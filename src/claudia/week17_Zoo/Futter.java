package claudia.week17_Zoo;

public class Futter {
    /*
Bonusaufgabe: Tierfutter
Erweitere dein Zooprogramm mit Futter-Bedarfsanalyse.

+ Erstelle eine Klasse für Futter mit einen Namen, Einheit und Einheitspreis.
+ Jedes Tier hat einen Futterbedarf, die beinhaltet das Futter und eine Menge
+ Erstelle eine Statistik, was der Futterbedarf von Zoo ist, und wie viel die Tagesversorgung sich kostet.
Für diese Aufgabe kann man HashMap gut brauchen.

Beispielausgabe der Statistik:
=======================
27 kg         Fleisch             :   126,90 €
38 kg         Heu                 :    13,30 €
30 g          Tubiflex            :     4,50 €
=======================
Total Daily cost: 144,70 €
 */
//Hashmap mit Name des Futters und benötigten Einheiten

    private String nameInEinheit;
    public static final double PREIS_IN_EURO_GRAS = 0.20;
    public static final double PREIS_IN_EURO_FROESCHE = 2.3;
    public static final double PREIS_IN_EURO_MAEUSE = 1.7;
    public static final double PREIS_IN_EURO_KRILL = 0.44;
    public Futter(String nameInEinheit){
        this.nameInEinheit = nameInEinheit;
    }
}
