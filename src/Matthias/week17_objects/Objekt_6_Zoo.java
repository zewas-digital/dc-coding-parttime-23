package Matthias.week17_objects;

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
    public static void main( String[] args ) {
        Zoo zoo1= new Zoo( "Tiergarten Dornbirn", 2022 );
        Gehege gehege1=new Gehege( "Alpenwiese" );
        Gehege gehege2=new Gehege( "Ried" );
        Gehege gehege3=new Gehege( "Terrarium (warm)" );
        //ArrayList<Zoo> zoos = new ArrayList<>( );
        zoo1.addGehege( gehege1 );
        zoo1.addGehege( gehege2 );
        zoo1.addGehege( gehege3 );
        zoo1.printFormated();
        zoo1.removeGehege(gehege1);
        zoo1.printFormated();
        zoo1.addGehege( gehege1);
        zoo1.printFormated();



    }
}