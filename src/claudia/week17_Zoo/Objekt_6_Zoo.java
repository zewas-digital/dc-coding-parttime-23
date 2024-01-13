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

public class Objekt_6_Zoo {
    public static void main(String[] args) {
        Zoo meinZoo = new Zoo("Premiumzoo Dornbirn", 2024);
        System.out.println("\nNeuer Zoo erstellt:\n" + meinZoo);

        Gehege Alpenwiese = new Gehege(10234, "Alpenwiese");
        Gehege Ried = new Gehege(373, "Ried");
        Gehege TerrariumWarm = new Gehege(80, "Terrarium (warm)");

        meinZoo.gehegeHinzufuegen(Alpenwiese);
        meinZoo.gehegeHinzufuegen(Ried);
        meinZoo.gehegeHinzufuegen(TerrariumWarm);

        meinZoo.printStructure();

        System.out.println("\nNeues Tier: ");
        Tier Storch1 = new Storch ("Adebar1", 1);
        System.out.println(Storch1);
        Storch1.feed();
        System.out.println("Hinzufügen zu Gehege " + Ried.getName());
        Ried.tierHinzufuegen(Storch1);
        Ried.tierHinzufuegen(new Storch("Adebar2", 0.5));

        Alpenwiese.tierHinzufuegen(new Murmeltier("Murmel1", 0.78));

        TerrariumWarm.tierHinzufuegen(new Schlange("Boa1", 2.2));
        TerrariumWarm.tierHinzufuegen(new Schlange("Boa2", 5.1));
        TerrariumWarm.tierHinzufuegen(new Schlange("Boa3", 0.1));

        meinZoo.printStructure();

        System.out.println("\nGehege " + Ried.getName() + " entfernen:");
        meinZoo.gehegeLoeschen(Ried);
        meinZoo.printStructure();
        System.out.println("\nGehege wieder hinzufügen! ");
        meinZoo.gehegeHinzufuegen(Ried);

        meinZoo.alleFuettern();
    }



}