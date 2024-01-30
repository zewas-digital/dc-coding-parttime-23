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

        Zoo zooDornbirn = new Zoo ( "Tiergarten Dornbirn", 2024 );
        Zoo zooFeldkirch = new Zoo ( "Tiergarten Feldkirch", 2021 );

        Pfleger pflegerHektor = new Pfleger ( "Hektor", "Gazelle" );
        Pfleger pflegerCharlie = new Pfleger ( "Charlie", "Huhn" );
        Pfleger pflegerAnna = new Pfleger ( "Anna", "Pinguin" );
        Pfleger pflegerCarlo = new Pfleger ( "Carlo", "Robe" );
        Pfleger pflegerLena = new Pfleger ( "Lena", "Robe" );


        zooDornbirn.pflegerZuordnen ( pflegerHektor );
        zooDornbirn.pflegerZuordnen ( pflegerCharlie );
        zooFeldkirch.pflegerZuordnen ( pflegerAnna );
        zooFeldkirch.pflegerZuordnen ( pflegerCarlo );
        zooFeldkirch.pflegerZuordnen ( pflegerLena );
        //zooDornbirn.pflegerAbziehen ( pflegerCharlie );


        zooDornbirn.gehegeHinzufuegen("Alpenwiese" );
        zooDornbirn.gehegeHinzufuegen("Ried" );
        zooDornbirn.gehegeHinzufuegen("Terrarium (warm)" );
        zooFeldkirch.gehegeHinzufuegen ( "Antaktika" );
        zooFeldkirch.gehegeHinzufuegen ( "Savane" );


        zooDornbirn.gehegeZuordnen ( "Alpenwiese",pflegerHektor );
        zooDornbirn.gehegeZuordnen ( "Ried",pflegerHektor );
        zooDornbirn.gehegeZuordnen ( "Terrarium (warm)",pflegerCharlie );
        zooDornbirn.gehegeZuordnen ( "Ried",pflegerCharlie );

        zooFeldkirch.gehegeZuordnen ( "Antaktika",pflegerAnna );
        zooFeldkirch.gehegeZuordnen ( "Savane",pflegerCarlo );


        zooDornbirn.tierHinzufuegen ( "Alpenwiese", "Gazelle", "Heu", 5, 10, 4 );
        zooDornbirn.tierHinzufuegen ( "Alpenwiese", "Schaf", "Heu", 4, 10, 5 );
        zooDornbirn.tierHinzufuegen ( "Alpenwiese", "Schaf", "Heu", 4, 10, 5 );
        zooDornbirn.tierHinzufuegen ( "Alpenwiese", "Huhn", "Mais", 1, 5, 1 );
        zooDornbirn.tierHinzufuegen ( "Ried", "Huhn", "Mais", 1,5,1 );
        zooDornbirn.tierHinzufuegen ( "Ried", "Huhn", "Mais", 1,5,1 );
        zooDornbirn.tierHinzufuegen ( "Terrarium (warm)", "Camellion", "Insekten", 1, 3, 2 );
        zooDornbirn.tierHinzufuegen ( "Ried", "Schaf", "Heu", 4, 10, 4 );

        zooFeldkirch.tierHinzufuegen ( "Savane", "Wasserbüffel", "Heu", 9, 40, 8 );
        zooFeldkirch.tierHinzufuegen ( "Savane", "Löwe", "Fleisch", 3, 25, 12 );
        zooFeldkirch.tierHinzufuegen ( "Antaktika", "Pinguin", "Fisch", 1, 6, 3 );
        zooFeldkirch.tierHinzufuegen ( "Antaktika", "Robe", "Fisch", 2, 8, 4 );

        System.out.println (zooDornbirn.printuebersicht () );
        System.out.println (zooFeldkirch.printuebersicht () );
        //zooDornbirn.tierEntfernen ( 2, 2 );

        while(true) {
            zooDornbirn.kontrollgang ( );
            //zooFeldkirch.kontrollgang ( );
        }







    }

}