package claudia.week18_Zoo;
import claudia.week17_Zoo.*;
import claudia.week17_Zoo.Tiere.*;

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

import java.util.HashMap;

public class Objekt_8_FutterBonus {
    public static void main(String[] args) {


        Zoo meinNeuerZoo = new Zoo("Neuer Zoo", 2023);
        Zoo.erstelleStandardZoo(meinNeuerZoo);
        HashMap<Futter, Double> futterTabelle = meinNeuerZoo.erstelleFutterTabelle();
/*
        for (Gehege g : meinNeuerZoo.getListeDerGehege()) {
            for (Tiere t : g.getListeDerTiere()) {
                //Falls aktuelles Futter noch nicht im Hashmap, hinzufügen mit Futtermenge des aktuellen Tiers t
                if (!futterStatistik.containsKey(t.getFutter()))
                    futterStatistik.put(t.getFutter(), t.getMengeInEinheit());
                    //Falls bereits enthalten, addiere Futtermenge des aktuellen Tiers dazu
                else futterStatistik.put(t.getFutter(), futterStatistik.get(t.getFutter()) + t.getMengeInEinheit());
            }
        }*/

        meinNeuerZoo.erstelleFutterstatistik(futterTabelle);

        double[] preisliste = {1.2, 3.0, 23.78, 7.2};
        Zoo nocheinZoo = new Zoo("noch ein Zoo", 1978, preisliste);
        Zoo.erstelleStandardZooMitPreisliste(nocheinZoo, preisliste);
        futterTabelle = nocheinZoo.erstelleFutterTabelle();
        nocheinZoo.erstelleFutterstatistik(futterTabelle);


    }
}



