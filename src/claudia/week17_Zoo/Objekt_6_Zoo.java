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

    }


}