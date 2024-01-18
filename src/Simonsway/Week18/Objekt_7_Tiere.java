package Simonsway.Week18;

/*
Aufgabe: Tiere
Erweitere dein Zooprogramm mit Tiere.

+ Erstelle eine Tier-Klasse mit einem Namen und einer Gattung

+ Erweitere die Gehege, um Tiere dynamisch hinzufügen und entfernen zu können.

+ Erweitere den Struktur-Ausdruck von Zoo, dass es auch die Tiere ausdrückt.

├── Zoo: Tiergarten Dornbirn, gegründet 2022
│   ├── Gehege: Alpenwiese
│       ├── Rijska, Kuh
│   ├── Gehege: Ried
│       ├── Garmond, Storh
│       ├── Hugo, Storh
│       ├── Idaxis, Storh
│   ├── Gehege: Terrarium (warm)
│       ├── (leer)
 */

import java.util.HashMap;

public class Objekt_7_Tiere {

    public static void main(String[] args) {

        // Create Zoo
        Zoo zooTierGartenDornbirn = new Zoo("Tiergarten Dornbirn ", "2023");
        Zoo zooTierGartenBregenz = new Zoo("Tiergarten Bregenz ", "2021");

        // Create Gehege
        Gehege alpenLuft = new Gehege("Alpen Luft");
        Gehege suedhang = new Gehege("Südhang");

        // Add Gehege to Zoo
        zooTierGartenDornbirn.addGehege(alpenLuft);
        zooTierGartenBregenz.addGehege(suedhang);

        // Create Tiere
        Tiere hirsch = new Tiere("Hirsch", "Wildtiere");
        Tiere reh = new Tiere("Reh", "Wildtiere");

        // Add Tiere to Gehege
        alpenLuft.addTiere(hirsch);
        suedhang.addTiere(reh);

        // Add Futter
        Futter haferKorn = new Futter("Haferkorn", "KG", 0.12F);
        Futter mehl = new Futter("Haferkorn", "Gramm", 0.40F);

        // Add Futter to Tiere
        hirsch.addFutter(haferKorn);

        // Display Output
        zooTierGartenDornbirn.zooDisplayOutput();
        zooTierGartenBregenz.zooDisplayOutput();

    }

}