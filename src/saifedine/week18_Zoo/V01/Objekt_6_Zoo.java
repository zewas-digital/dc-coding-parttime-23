package saifedine.week18_Zoo.V01;

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

        // Anlage Instanz Zoo
        Zoo tiergartenDornbirn = new Zoo("Tiergarten Dornbirn",2022);

        // Anlage Instanzen Gehege
        Gehege ried = new Gehege("Ried");
        Gehege terrarium = new Gehege("Terrarium (warm)");
        Gehege hugo = new Gehege("Hugo");

        // Gehegezuordnung zum Zoo
        tiergartenDornbirn.addGehege(ried);
        tiergartenDornbirn.addGehege(terrarium);
        tiergartenDornbirn.addGehege(hugo);

        System.out.println("getgehegeArrayList(): " + tiergartenDornbirn.getgehegeArrayList() + "\n");

        tiergartenDornbirn.zooStrukturGehege();

        // Gehege hugo aus Zoo entfernen
        tiergartenDornbirn.removeGehege(hugo);

        tiergartenDornbirn.zooStrukturGehege();

        // Anlage Instanzen Tiere mit alten Konstruktor
        Tiere schlange1reptil = new Tiere("Schlange","Reptil");
        Tiere barbara = new Tiere("Barbara", "Säugetier");

        // Tierzuordnung zum Gehege
        terrarium.addTiere(schlange1reptil);
        terrarium.addTiere(barbara);

        System.out.println("\nAnzeige der Tiere im Terrarium: " + "\n" + terrarium.gettierArrayList());

        tiergartenDornbirn.zooStrukturGehegeTiere();

        // Tier barbara aus Gehe entfernen
        terrarium.removeTiere(barbara);

        tiergartenDornbirn.zooStrukturGehegeTiere();

        // Anlage Instanzen Futter und gleichzeitige Eintragung der Futter in FutterLagerListe (siehe Klasse Futter)
        // Hinweis: obwohl die Variablen von den Futterobjekten nicht verwendet werden, werden diese Instanzen gebraucht
        Futter heu = new Futter(Futter.FutterArt.HEU, Futter.FutterEinheit.KG,0.16F);
        Futter maus = new Futter(Futter.FutterArt.MAUS, Futter.FutterEinheit.STK,2.50F);
        Futter wildfutter = new Futter(Futter.FutterArt.GETREIDE, Futter.FutterEinheit.KG,3F);
        Futter salat = new Futter(Futter.FutterArt.SALAT, Futter.FutterEinheit.KG,1.49F);

        // Anlage Instanzen Tiere mit neuen Konstruktor
        Tiere hirsch1wild = new Tiere("Hirsch1", "Wild", Futter.FutterArt.HEU,12);
        Tiere hirsch2wild = new Tiere("Hirsch2","Wild", Futter.FutterArt.HEU,18);
        Tiere reh1wild = new Tiere("Reh", "Wild", Futter.FutterArt.GETREIDE,9);
        Tiere schlidkroete1reptil = new Tiere("Schildkröte","Reptil", Futter.FutterArt.SALAT,3);
        Tiere schlange2reptil = new Tiere("Danger Noodle", "Reptil", Futter.FutterArt.MAUS,2);

        // Tierzuordnung zum Gehege
        ried.addTiere(hirsch1wild);
        ried.addTiere(hirsch2wild);
        ried.addTiere(reh1wild);
        terrarium.addTiere(schlidkroete1reptil);
        terrarium.addTiere(schlange2reptil);

        // da diese Tierobjekt mit dem alten Konstruktor angelegt wurde, hatte es kein Futter und Bedarf - deshalb hier manuell hinzugefügt
        schlange1reptil.setFutterArt(Futter.FutterArt.MAUS);
        schlange1reptil.setFutterBedarf(1);

        tiergartenDornbirn.zooStrukturGehegeTiere();

        System.out.println("\nFutterbedarf pro Tier: ");

        tiergartenDornbirn.kalkulationBedarf();

        tiergartenDornbirn.kalkulationBedarfPreis();

        System.out.println("\nFutterlagerliste: " + Futter.FutterLagerListe);
    }
}