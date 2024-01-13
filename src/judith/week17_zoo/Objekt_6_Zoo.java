package judith.week17_zoo;

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

import claudia.week17_Zoo.Tier;

import java.util.ArrayList;

public class Objekt_6_Zoo {

    public static void main(String[] args) {

        Zoo TiergartenDornbirn = new Zoo("Tiergarten Dornbirn",2022 );
        System.out.println(TiergartenDornbirn);

        /*
        Zoo TiergartenBregenz = new Zoo();
        TiergartenBregenz.setName("Tiergarten Bregenz");
        TiergartenBregenz.setGruendungsJahr(2000);
        System.out.println(TiergartenBregenz);
         */

        Gehege alpenwiese = new Gehege("Alpenwiese");
        System.out.println(alpenwiese);



    }
}