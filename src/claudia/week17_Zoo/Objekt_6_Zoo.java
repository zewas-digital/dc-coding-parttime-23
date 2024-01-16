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

        Gehege Alpenwiese = new Gehege(10234, "Alpenwiese", meinZoo.getListeDerGehege());
        Gehege Ried = new Gehege(373, "Ried", meinZoo.getListeDerGehege());
        Gehege TerrariumWarm = new Gehege(80, "Terrarium (warm)", meinZoo.getListeDerGehege());

        meinZoo.printStructure(meinZoo.getListeDerGehege());

        System.out.println("\nNeues Tier: ");
        Landtiere Storch1 = new Storch("Adebar1", 1, Ried.getListeDerTiere());
        System.out.println(Storch1);
        Storch1.feed();

        Landtiere Storch2 = new Storch("Adebar2", 0.5, Ried.getListeDerTiere());

        Landtiere Murmel1 =  new Murmeltier("Murmel1", 0.78, Alpenwiese.getListeDerTiere());

        Landtiere Boa1 = new Schlange("Boa1", 2.2, TerrariumWarm.getListeDerTiere());
        Landtiere Boa2 = new Schlange("Boa2", 5.1, TerrariumWarm.getListeDerTiere());
        Landtiere Boa3 = new Schlange("Boa3", 0.1, TerrariumWarm.getListeDerTiere());

        Gehege Aquarium = new Gehege(2000000, "Aquarium", meinZoo.getListeDerGehege());
        //Wassertiere Wal1 = new Wal("Wal1", 235465, Aquarium.getListeDerTiere());

        meinZoo.printStructure(meinZoo.getListeDerGehege());

        System.out.println("\nGehege " + Ried.getName() + " entfernen:");
        meinZoo.gehegeLoeschen(Ried, meinZoo.getListeDerGehege());
        meinZoo.printStructure(meinZoo.getListeDerGehege());
        System.out.println("\nGehege wieder hinzufügen! ");
        meinZoo.gehegeHinzufuegen(Ried, meinZoo.getListeDerGehege());

        meinZoo.alleFuettern();

        System.out.println("\nAnzahl der Tiere im Aquarium: " + Aquarium.anzahlDerTiere());
        System.out.println("Anzahl der Tiere im Ried: " + Ried.anzahlDerTiere());

        System.out.println("\nListe aller Tiere: " + meinZoo.listeAllerTiere());//TODO nur die Namen!
        System.out.println("\nKrill kostet pro Kilo " + Futter.PREIS_IN_EURO_KRILL + " €.");
    }



}