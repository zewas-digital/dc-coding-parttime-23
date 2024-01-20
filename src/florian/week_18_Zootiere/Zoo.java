package florian.week_18_Zootiere;

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

public class Zoo {


    public String name;

    public int gruendungsjahr;

    public ArrayList <Gehege> gehegeArrayList;

    public Zoo(String name, int gruendungsjahr) {

        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        this.gehegeArrayList  = new ArrayList<>();

        System.out.println("Zoo: " + this.name + "Gegründet: " + this.gruendungsjahr);
    }


}





