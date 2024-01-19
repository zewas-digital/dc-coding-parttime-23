package claudia.week17_Zoo;

import java.util.HashMap;

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


    // Eine HashMap speichert Schlüssel-Wert-Paare,
        // deren Datentypen wir definieren können
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Wert hinzufügen
        hashMap.put("erster Schlüssel", 120);
        hashMap.put("zweiter Schlüssel", 300);

        // Wert lesen
        System.out.println(
                hashMap.get("erster Schlüssel")
 */
//Hashmap mit Name des Futters und benötigten Einheiten

    private String name;
    private String einheit;
    private double preisProEinheit;
    public static final double STANDARD_PREIS_IN_EURO_PRO_KILO_GRAS = 0.20;
    public static final double STANDARD_PREIS_IN_EURO_PRO_KILO_FROESCHE = 2.3;
    public static final double STANDARD_PREIS_IN_EURO_PRO_KILO_MAEUSE = 1.7;
    public static final double STANDARD_PREIS_IN_EURO_PRO_TONNE_KRILL = 12.44;


    public Futter(String name, String einheit, double preisProEinheit) {
        this.name = name;
        this.einheit = einheit;
        this.preisProEinheit = preisProEinheit;

    }



    public String getName() {
        return name;
    }

    public String getEinheit() {
        return einheit;
    }

    public double getPreisProEinheit() {
        return preisProEinheit;
    }
}
