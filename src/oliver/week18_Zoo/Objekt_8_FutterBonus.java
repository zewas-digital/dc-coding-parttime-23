package oliver.week18_Zoo;

/*
Bonusaufgabe: Tierfutter
Erweitere dein Zooprogramm mit Futter-Bedarfsanalyse.

+ Erstelle eine Klasse für Futter mit einen Namen, Einheit und Einheitspreis.
+ Jedes Tier hat einen Futterbedarf, die beinhaltet das Futter und eine Menge
+ Erstelle eine Statistik, was der Futterbedarf von Zoo ist, und wie viel die Tagesversorgung kostet.
Für diese Aufgabe kann man HashMap gut brauchen.

Beispielausgabe der Statistik:
=======================
27 kg         Fleisch             :   126,90 €
38 kg         Heu                 :    13,30 €
30 g          Tubiflex            :     4,50 €
=======================
Total Daily cost: 144,70 €
 */

import java.util.HashMap;

public class Objekt_8_FutterBonus {
    public static void main(String[] args) {

        // Eine HashMap speichert Schlüssel-Wert-Paare,
        // dessen Datentypen wir definieren können
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Wert hinzufügen
        hashMap.put("erster Schlüssel", 120);
        hashMap.put("zweiter Schlüssel", 300);

        // Wert lesen
        System.out.println(
                "Erster Schlüssel in Hashmap: "+
                hashMap.get("zweiter Schlüssel")
        );
        // --------------------------


        // Zoo ----------------------
        Zoo tierpark = new Zoo("Tierpark");

        // Gehege
        Gehege waldrand = tierpark.neuesGehege("Waldrand");
        Gehege weide = tierpark.neuesGehege("Weide");

        System.out.println(tierpark.gehege.size() +" - "+ tierpark.gehege.toArray().length);
        System.out.println(tierpark.gehege.get(1).bezeichnung);

        // Futter
        Futter heu = new Futter("Heu", "kg", 2);
        Futter fleisch = new Futter("Fleisch", "kg", 12);
        // Futter kann auch in den Zoo
        tierpark.futterHinzufuegen(heu, 2.2);
        System.out.println(
                "Heu Standardpreis: "+ heu.getPreisProEinheit() +
                        " Zoo-Preis: "+ tierpark.getFutterpreis(heu));

        // Tiere
        Tier rehKiez = waldrand.tierHinzufuegen("rehKiez", heu, 2);
        Tier rehBock = waldrand.tierHinzufuegen("rehBock", heu, 5);
        Tier luchs = weide.tierHinzufuegen("Luchs", fleisch, 1);

        System.out.println(luchs.getFutter().getName());

        // Drucke berechneten Futterbedarf
        tierpark.druckeFutterStatistik();
    }
}
