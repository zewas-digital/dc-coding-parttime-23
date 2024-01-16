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

public class Objekt_6_Zoo extends Zoo {
    public Objekt_6_Zoo(String name, int gruendungsjahr) {
        super(name, gruendungsjahr);
    }

    @Override
    public void printAdditionalInfo() {
        System.out.println("Weitere Informationen über den Objekt_6_Zoo.");
    }

    public static void main(String[] args) {
        Objekt_6_Zoo zoo = new Objekt_6_Zoo("Objekt_6_Zoo", 2022);

        zoo.addGehege("Alpenwiese");
        zoo.addGehege("Ried");
        zoo.addGehege("Terrarium (warm)");

        Futter heu = new Futter("Heu");
        Futter fischfutter = new Futter("Fischfutter");
        Futter insekten = new Futter("Insekten");

        Tier hase = new Tier("Hase", heu);
        Tier reh = new Tier("Reh", heu);
        Tier fisch = new Tier("Fisch", fischfutter);
        Tier schmetterling = new Tier("Schmetterling", insekten);

        zoo.assignTierToGehege("Alpenwiese", hase);
        zoo.assignTierToGehege("Alpenwiese", reh);
        zoo.assignTierToGehege("Ried", fisch);
        zoo.assignTierToGehege("Terrarium (warm)", schmetterling);

        zoo.printZooStructureWithTiere();

        Futter karotten = new Futter("Karotten");
        zoo.changeTierFutter("Alpenwiese", "Hase", karotten);

        zoo.printZooStructureWithTiere();

        zoo.removeTierFromGehege("Ried", "Fisch");

        zoo.printZooStructureWithTiere();
    }
}