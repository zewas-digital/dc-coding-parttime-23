package florian.week_17_Zoo;

/*
Aufgabe: Zoo
1/ Erstelle eine Main Klasse, die zuständig ist für
+ die Initialisierung des Zoos und aller seiner Bestandteile: Erledigt

2/ Erstelle eine Zoo Klasse mit Name und Gründungsjahr : Erledigt

3/ Erstelle eine Gehege Klasse mit Name der als Beschreibung des Geheges dient. Erledigt

4/ Erweitere deinen Zoo, sodass Gehege dynamisch hinzugefügt und entfernt werden können. Erledigt

5/ Erweitere dein Programm um eine Funktion, die die Struktur des Zoos ausgibt. Erledigt
Der erwartete Ausdruck sieht folgendermaßen aus:

├── Zoo: Tiergarten Dornbirn, gegründet 2022
│   ├── Gehege: Alpenwiese
│   ├── Gehege: Ried
│   ├── Gehege: Terrarium (warm)

 */



public class Objekt_6_Zoo {
    public static void main(String[] args) {

        String haken = "├──";
        String haken2 = "│   ├──";
        Zoo tierpark = new Zoo("Doppelmayerzoo", 1980);

        // Gehege erstellen

        // Gehege alpen = new Gehege("Alpen");
        // tierpark.gehegeArrayList.add(alpen);
        tierpark.gehegeArrayList.add(new Gehege("Alpen"));
        tierpark.gehegeArrayList.add(new Gehege("Savanne"));
        tierpark.gehegeArrayList.add(new Gehege("Tropen"));


        System.out.println(haken + " Zoo: " + tierpark.name + ", gegründet " + tierpark.gruendungsjahr);
        for (Gehege s : tierpark.gehegeArrayList) {
            System.out.println(haken2 + " Gehege: " + s.bezeichnung);

        }
    }

}