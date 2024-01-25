package saifedine.week17_objects;

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

        Zoo tiergartenDornbirn = new Zoo("Tiergarten Dornbirn",2022);
        //System.out.println(tiergartenDornbirn);

        //Gehege alpenwiese = new Gehege("Alpenwiese");
        //System.out.println(alpenwiese);

        Gehege alpenwiese = new Gehege("Alpenwiese");
        Gehege ried = new Gehege("Ried");
        Gehege terrarium = new Gehege("Terrarium (warm)");
        Gehege hugo = new Gehege("Hugo");

        tiergartenDornbirn.addGehege(alpenwiese);
        tiergartenDornbirn.addGehege(ried);
        tiergartenDornbirn.addGehege(terrarium);
        tiergartenDornbirn.addGehege(hugo);

        System.out.println("getgehegeArrayList(): " + tiergartenDornbirn.getgehegeArrayList() + "\n");

        tiergartenDornbirn.zooStruktur();

        tiergartenDornbirn.removeGehege(hugo);

        tiergartenDornbirn.zooStruktur();

    }

}