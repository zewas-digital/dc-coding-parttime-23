package Simonsway.Week18;

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

import java.util.HashMap;

public class Objekt_8_FutterBonus {
    public static void main(String[] args) {

        // Zoo erstellen
        Zoo tierGartenDornbirn = new Zoo("Tier Garten Dornbirn", "2021");

       // Gehege erstellen
        tierGartenDornbirn.gehegeArrayList.add(new Gehege("Alpenwiese"));
        tierGartenDornbirn.gehegeArrayList.add(new Gehege("Südhang"));
        tierGartenDornbirn.gehegeArrayList.add(new Gehege("Norhang"));

        // Tiere erstellen
        tierGartenDornbirn.gehegeArrayList.get(0).tiereArrayList.add(new Tiere("Hirsch1", "Wildtiere", Futterlager.futterArten.HEU, 10 ));
        tierGartenDornbirn.gehegeArrayList.get(0).tiereArrayList.add(new Tiere("Reh1", "Wildtiere", Futterlager.futterArten.FISCH, 8 ));
        tierGartenDornbirn.gehegeArrayList.get(1).tiereArrayList.add(new Tiere("Fish1", "Wassertiere", Futterlager.futterArten.FISCH, 2 ));


        // Ausgabe Zoo

        //tierGartenDornbirn.zooDisplayOutputV1();


    }
}
