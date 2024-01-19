package claudia.week17_Zoo;

/*
Aufgabe: Zoo
1/ Erstelle eine Main Klasse, die zuständig ist für
+ die Initialisierung des Zoos und aller seiner Bestandteile

2/ Erstelle eine Zoo Klasse mit Name und Gründungsjahr

3/ Erstelle eine Gehege Klasse mit Name der als Beschreibung des Geheges dient.

4/ Erweitere deinen Zoo, sodass Gehege dynamisch hinzugefügt und entfernt werden können.

5/ Erweitere dein Programm um eine Funktion, die die Struktur des Zoos ausgibt.
Der erwartete Ausdruck sieht folgendermaßen aus:

├── Zoo: Tiergarten Dornbirn, gegründet 2022
│   ├── Gehege: Alpenwiese
│   ├── Gehege: Ried
│   ├── Gehege: Terrarium (warm)

 */

import claudia.week17_Zoo.Tiere.*;

public class Objekt_6_Zoo {
    public static void main(String[] args) {
        Zoo meinZoo = new Zoo("Premiumzoo Dornbirn", 2024);
        System.out.println("\nNeuer Zoo erstellt:\n" + meinZoo);

        Gehege alpenwiese = new Gehege(10234, "Alpenwiese", meinZoo.getListeDerGehege());
        Gehege ried = new Gehege(373, "Ried", meinZoo.getListeDerGehege());
        Gehege terrariumWarm = new Gehege(80, "Terrarium (warm)", meinZoo.getListeDerGehege());

        Futter gras = new Futter("Gras und Kräuter", "kg", 0.2);
        Futter frosch = new Futter("Frösche", "kg", 1.7);
        Futter maus = new Futter("Mäuse", "kg", 12.6);
        Futter krill = new Futter("Krill", "t", 3.45);

        meinZoo.printStructure(meinZoo.getListeDerGehege());

        System.out.println("\nNeues Tier: ");
        Landtiere Storch1 = new Storch("Adebar1", frosch, 1, ried.getListeDerTiere());
        System.out.println(Storch1);
        Storch1.feed();

        Landtiere storch2 = new Storch("Adebar2", frosch, 0.5, ried.getListeDerTiere());

        Landtiere murmel1 =  new Murmeltier("Murmel1", gras, 0.78, alpenwiese.getListeDerTiere());

        Landtiere boa1 = new Schlange("Boa1", maus, 2.2, terrariumWarm.getListeDerTiere());
        Landtiere boa2 = new Schlange("Boa2", maus, 5.1, terrariumWarm.getListeDerTiere());
        Landtiere boa3 = new Schlange("Boa3", maus,0.1, terrariumWarm.getListeDerTiere());

        Gehege aquarium = new Gehege(2000000, "Aquarium", meinZoo.getListeDerGehege());
        Wassertiere wal1 = new Wal("Wal1", krill, 23.5465, aquarium.getListeDerTiere());

        meinZoo.printStructure(meinZoo.getListeDerGehege());

        System.out.println("\nGehege " + ried.getName() + " entfernen:");
        meinZoo.gehegeLoeschen(ried, meinZoo.getListeDerGehege());
        meinZoo.printStructure(meinZoo.getListeDerGehege());
        System.out.println("\nGehege wieder hinzufügen! ");
        meinZoo.gehegeHinzufuegen(ried, meinZoo.getListeDerGehege());

        meinZoo.alleFuettern();

        System.out.println("\nAnzahl der Tiere im Aquarium: " + aquarium.anzahlDerTiere());
        System.out.println("Anzahl der Tiere im Ried: " + ried.anzahlDerTiere());

        System.out.println("\nListe aller Tiere: " + meinZoo.listeAllerTiere());//TODO nur die Namen!
        System.out.println("\nKrill kostet pro Tonne " + krill.getPreisProEinheit() + " €.");
    }



}