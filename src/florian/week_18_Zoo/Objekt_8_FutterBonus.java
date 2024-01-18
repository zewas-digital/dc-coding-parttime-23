package florian.week_18_Zoo;

/*
Bonusaufgabe: Tierfutter
Erweitere dein Zooprogramm mit Futter-Bedarfsanalyse.

+ Erstelle eine Klasse für Futter mit einen Namen, Einheit und Einheitspreis.
+ Jedes Tier hat einen Futterbedarf, die beinhaltet das Futter und eine Menge
+ Erstelle eine Statistik, was der Futterbedarf von Zoo ist, und wie viel die Tagesversorgung sich kostet.
Für diese Aufgabe kann man HashMap gut brauchen.
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
                hashMap.get("erster Schlüssel")
        );
    }
}
