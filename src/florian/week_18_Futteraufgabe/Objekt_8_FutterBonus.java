package florian.week_18_Futteraufgabe;

/*
Bonusaufgabe: Tierfutter
Erweitere dein Zooprogramm mit Futter-Bedarfsanalyse.

+ Erstelle eine Klasse für Futter mit einen Namen, Einheit und Einheitspreis. Erledigt
+ Jedes Tier hat einen Futterbedarf, die beinhaltet das Futter und eine Menge Erledigt
+ Erstelle eine Statistik, was der Futterbedarf von Zoo ist, und wie viel die Tagesversorgung dich kostet.
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
    public static <gehege> void main(String[] args) {
       /*
        // Eine HashMap speichert Schlüssel-Wert-Paare,
        // dessen Datentypen wir definieren können
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Wert hinzufügen
        hashMap.put("erster Schlüssel", 120);
        hashMap.put("zweiter Schlüssel", 300);

        // Wert lesen
        System.out.println(
                hashMap.get("erster Schlüssel")

        );*/


        String haken = "├──";
        String haken2 = "│   ├──";
        String haken3 = "│       ├──";
        float totalDailycost= 0;

        HashMap<Futterlager.futterarten, Float> result = new HashMap<>();

        // Zoo erstellen
        Zoo tierpark = new Zoo("Doppelmayerzoo", 1980);

        Futterlager futterlager = new Futterlager();

        // Gehege erstellen
        // Gehege alpen = new Gehege("Alpen");---------------------------
        // tierpark.gehegeArrayList.add(alpen);
        tierpark.gehegeArrayList.add(new Gehege("Alpen"));
        tierpark.gehegeArrayList.add(new Gehege("Savanne"));
        tierpark.gehegeArrayList.add(new Gehege("Tropen"));
        //----------------------------------------------------------------


        // Tiere erstellen---------------------------------------------------------------------------------------------------------------------
        tierpark.gehegeArrayList.get(0).tiereImGehege.add(new Tiere("Maxi", "Wildschwein", Futterlager.futterarten.HEU, 5));
        tierpark.gehegeArrayList.get(0).tiereImGehege.add(new Tiere("Hugo", "Bär", Futterlager.futterarten.FISCH, 15));
        tierpark.gehegeArrayList.get(1).tiereImGehege.add(new Tiere("Maxiking", "Löwe", Futterlager.futterarten.FISCH, 10));
        //--------------------------------------------------------------------------------------------------------------------------------------

        //Gehege löschen-----------------------------------------------
        // tierpark.gehegeArrayList.get(0).tiereImGehege.remove(1);
        //-------------------------------------------------------------
        // Ausgabe des Zoos---------------------------------------------------------------------------------------------------
        System.out.println("Start der Ausgabe");
        System.out.println(haken + " Zoo: " + tierpark.name + ", gegründet " + tierpark.gruendungsjahr);
        for (Gehege s : tierpark.gehegeArrayList) {
            System.out.println(haken2 + " Gehege: " + s.bezeichnung);
            for (Tiere t : s.tiereImGehege) {
                System.out.println(haken3 + "Name: " + t.Name + ", Gattung: " + t.Gattung + ", Futter: " + futterlager.lagerliste.get(t.futter).bezeichnung);
            }
        }
        //-------------------------------------------------------------------------------------------------------------------------

        // Überprüfung und Hinzufügen des Futters und der Futtermenge
        for (Gehege g : tierpark.gehegeArrayList) {
            for (Tiere t : g.tiereImGehege) {
                if (result.get(t.futter) != null) {
                    result.replace(t.futter, t.menge + result.get(t.futter));
                } else {
                    result.put(t.futter, t.menge);
                }
            }
        }

        System.out.println();

        // Ausrechnen des Tagesbedarfs
        for (Futterlager.futterarten f : result.keySet()) {

            System.out.println(result.get(f) + futterlager.lagerliste.get(f).einheit + "         " + f + "             :   " +
                    result.get(f) * futterlager.lagerliste.get(f).preis + " €");

            totalDailycost += result.get(f) * futterlager.lagerliste.get(f).preis;
        }

        System.out.println("=======================" +"\n" + "Total Cost: " + totalDailycost);

    }


}
