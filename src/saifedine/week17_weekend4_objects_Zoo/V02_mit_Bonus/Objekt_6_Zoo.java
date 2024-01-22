package saifedine.week17_weekend4_objects_Zoo.V02_mit_Bonus;

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

        //Gehege alpenwiese = new Gehege("Alpenwiese");
        Gehege ried = new Gehege("Ried");
        Gehege terrarium = new Gehege("Terrarium (warm)");
        Gehege hugo = new Gehege("Hugo");

        //tiergartenDornbirn.addGehege(alpenwiese);
        tiergartenDornbirn.addGehege(ried);
        tiergartenDornbirn.addGehege(terrarium);
        tiergartenDornbirn.addGehege(hugo);

        System.out.println("getgehegeArrayList(): " + tiergartenDornbirn.getgehegeArrayList() + "\n");

        tiergartenDornbirn.zooStrukturGehege();

        tiergartenDornbirn.removeGehege(hugo);

        tiergartenDornbirn.zooStrukturGehege();

        //Tiere hirsch1wild = new Tiere("Hirsch", "Wild");

        //Tiere reh1wild = new Tiere("Reh", "Wild");
        Tiere schlange1reptil = new Tiere("Schlange","Reptil");
        //Tiere schlidkroete1reptil = new Tiere("Schildkröte","Reptil");
        Tiere barbara = new Tiere("Barbara", "Säugetier");


        //System.out.println(hirsch1wild);

        //ried.addTiere(hirsch1wild);
        //ried.addTiere(reh1wild);
        terrarium.addTiere(schlange1reptil);
        //terrarium.addTiere(schlidkroete1reptil);
        terrarium.addTiere(barbara);

        tiergartenDornbirn.zooStrukturGehege();

        System.out.println("\n" + ried.gettierArrayList());

        tiergartenDornbirn.zooStrukturGehegeTiere();

        terrarium.removeTiere(barbara);

        tiergartenDornbirn.zooStrukturGehegeTiere();

        Futter heu = new Futter("Heu","kg", 0.16F);
        Futter mauese = new Futter("Maus", "Stück", 2.50F);

        Futter wildfutter = new Futter("Heu", "kg", 0.16F);

        Tiere hirsch1wild = new Tiere("Hirsch", "Wild",wildfutter,12);
        Tiere hirsch2wild = new Tiere("Hirsch2","Wild",wildfutter,18);
        Tiere reh1wild = new Tiere("Reh", "Wild",wildfutter,9);
        Tiere schlidkroete1reptil = new Tiere("Schildkröte","Reptil",mauese,3);

        ried.addTiere(hirsch1wild);
        ried.addTiere(hirsch2wild);
        ried.addTiere(reh1wild);
        terrarium.addTiere(schlidkroete1reptil);

        //Tiere schlange1reptil = new Tiere("Schlange", "Reptil", mauese,1);

        schlange1reptil.futter = mauese;
        schlange1reptil.setFutterBedarf(1);

        tiergartenDornbirn.zooStrukturGehegeTiere();

        System.out.println("----> " + schlange1reptil.getFutterBedarf());

        System.out.println(wildfutter);

        System.out.println(hirsch2wild);

        //tiergartenDornbirn.futterPreisListe.forEach();

        tiergartenDornbirn.kalkulationBedarf();

        tiergartenDornbirn.kalkulationBedarfPreis();

    }

}