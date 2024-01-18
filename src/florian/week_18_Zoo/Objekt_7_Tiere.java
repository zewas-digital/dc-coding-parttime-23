package florian.week_18_Zoo;

/*
Aufgabe: Tiere
Erweitere dein Zooprogramm mit Tiere.

+ Erstelle eine Tier-Klasse mit einem Namen und einer Gattung

+ Erweitere die Gehege, um Tiere dynamisch hinzufügen und entfernen zu können.

+ Erweitere den Struktur-Ausdruck von Zoo, dass es auch die Tiere ausdrückt.

├── Zoo: Tiergarten Dornbirn, gegründet 2022
│   ├── Gehege: Alpenwiese
│       ├── Rijska, Kuh
│   ├── Gehege: Ried
│       ├── Garmond, Storh
│       ├── Hugo, Storh
│       ├── Idaxis, Storh
│   ├── Gehege: Terrarium (warm)
│       ├── (leer)
 */

import florian.week_17_Zoo.Gehege;
import florian.week_17_Zoo.Tiere;
import florian.week_17_Zoo.Zoo;

public class Objekt_7_Tiere {
    public static void main(String[] args) {
        Tiere tiere = new Tiere("", "");

        Gehege gehege = new Gehege("", tiere);

        Zoo schoenbrunn = new Zoo("Schönbrunn", 1752, gehege, tiere);

        System.out.println(schoenbrunn);

        schoenbrunn.gehegeArrayList.add("Säugetiere");
        schoenbrunn.gehegeArrayList.add("Reptilien");
        schoenbrunn.gehegeArrayList.add("Alpenwiese");
        schoenbrunn.gehegeArrayList.remove("Alpenwiese");
        schoenbrunn.gehegeArrayList.add("Aquarium");

        schoenbrunn.gehege.addTiere(new Tiere("Löwe, ","Paul"));

        schoenbrunn.formatGehege();








    }

}