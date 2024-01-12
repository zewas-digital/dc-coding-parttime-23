package michael_k.week17;

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

public class Objekt_6_Zoo {

    public static void main(String[] args) {

        Zoo zoo = new Zoo ( "Tiergarten Dornbirn", 2024 );

        zoo.gehegeHinzufuegen("Alpenwiese");
        zoo.gehegeHinzufuegen("Ried");
        zoo.gehegeHinzufuegen("Terrarium (warm)");

        System.out.println (zoo.printoverview () );

    }

}