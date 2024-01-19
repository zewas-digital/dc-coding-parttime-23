package Simonsway.Week17;

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

        //Zoo Setup
        Zoo zoo1 = new Zoo();
        zoo1.Zoo("Tiergarten Dornbirn", 2022);

        Zoo zoo2 = new Zoo();
        zoo2.Zoo("Tiergarten Bregenz", 2023);

        //Gehege Setup
        Gehege gehege1 = new Gehege("Alpenwiese");
        zoo1.setGehege(gehege1);
        Gehege gehege2 = new Gehege("Ried");
        zoo1.setGehege(gehege2);
        Gehege gehege3 = new Gehege("Terrarium");
        zoo1.setGehege(gehege3);
        Gehege gehege4 = new Gehege("Aquarium");
        zoo2.setGehege(gehege4);

        //Tier Setup
        Tiere tier1 = new Tiere("Hase", "Säugetier");


        System.out.println(zoo1.getName() + ", " + "gegründet " + zoo1.getYear());
        zoo1.getGehege();
        System.out.println(zoo2.getName() + ", " + "gegründet " + zoo2.getYear());
        zoo2.getGehege();
    }

}