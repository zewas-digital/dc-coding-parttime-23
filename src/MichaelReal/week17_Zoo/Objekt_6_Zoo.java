package MichaelReal.week17_Zoo;

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

import java.util.ArrayList;
import java.util.List;
/*
public class Objekt_6_Zoo extends Zoo {

    public Objekt_6_Zoo(String name, int gruendungsjahr) {
        super(name, gruendungsjahr);
    }

    public static void main(String[] args) {
        Zoo ersterZoo = new Zoo("Erster Zoo", 2024) {
        };

        Gehege loewenParadies = new Gehege("Löwen Paradies", "Savanne");
        Tier tina = new Tier("Tina", "Löwe", "Lammkeule");
        Tier alfred = new Tier("Alfred", "Löwe", "Grosse Lammkeule");

        Gehege faultiere = new Gehege("Faultiere", "Amazonas");
        Tier manni = new Tier("Manni", "Faultier", "Beeren");
        Tier olga = new Tier("Olga", "Faultier", "Rüben");

        Gehege vogelParadies = new Gehege("Vogel Paradies", "Biotop");
        Tier helga = new Tier("Helga", "Papagei", "Nüsse");
        Tier peter = new Tier("Peter", "Papagei", "Körner");

        // Gehege zu Zoo hinzufügen
        ersterZoo.addGehege(loewenParadies);
        ersterZoo.addGehege(faultiere);
        ersterZoo.addGehege(vogelParadies);

        // Tiere zu Gehegen hinzufügen
        ersterZoo.addTierToGehege(tina, loewenParadies);
        ersterZoo.addTierToGehege(alfred, loewenParadies);
        ersterZoo.addTierToGehege(manni, faultiere);
        ersterZoo.addTierToGehege(olga, faultiere);
        ersterZoo.addTierToGehege(helga, vogelParadies);
        ersterZoo.addTierToGehege(peter, vogelParadies);

        // Ausgabe des Zoos
        System.out.println(ersterZoo);

        // Ausgabe eines Geheges
        System.out.println(loewenParadies);

        // Ausgabe eines Tier
        System.out.println(tina);

        // Alle Papageien auflisten
        System.out.println("Alle Papageien:");
        List<Tier> allePapageien = new ArrayList<>();
        for (Gehege gehege : ersterZoo.getGehegeList()) {
            for (Tier tier : gehege.getTiere()) {
                if (tier.getArt().equals("Papagei")) {
                    allePapageien.add(tier);
                }
            }
        }
        for (Tier papagei : allePapageien) {
            System.out.println(papagei.getName());
        }

        // Futter ändern
        tina.setFutter("Rindfleisch");

        // Gehege Habitat ändern
        loewenParadies.setHabitat("Wüste");

        // Ein bestimmtes Gehege auflisten
        System.out.println("Tiere im Gehege 'Faultiere':");
        List<Tier> tiereInFaultiereGehege = ersterZoo.getTiereInGehege(faultiere);
        if (tiereInFaultiereGehege != null) {
            for (Tier tier : tiereInFaultiereGehege) {
                System.out.println(tier.getName());
            }
        }
    }
}*/