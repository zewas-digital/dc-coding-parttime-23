package volkan.week17_zoo;

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

        Zoo tiergartenDornbirn = new Zoo("Tiergarten Dornbirn", 2022);
        //System.out.println(TiergartenDornbirn);

        // Gehege anlegen
        Gehege alpenwiese = new Gehege("Alpenwiese");
        Gehege ried = new Gehege("Ried");
        Gehege terrarium = new Gehege("Terrarium");

        // Gehege dem Zoo zuordnen
        tiergartenDornbirn.addGehege(alpenwiese);
        tiergartenDornbirn.addGehege(ried);
        tiergartenDornbirn.addGehege(terrarium);

        // Testausgabe Zoo Struktur mit Gehege
        tiergartenDornbirn.zooStrukturGehege();


        //Anlage Tiere
       Tiere hirsch1 = new Tiere("Olaf", "Wild");
       Tiere reh1  = new Tiere("Berta" , "Wild");

       Tiere hase1 = new Tiere("Klopfer" , "Nagetier");
       Tiere hase2 = new Tiere("Doris", "Nagetier");

       Tiere schlange1 = new Tiere("Danger Noodle", "Reptil");
       Tiere schlange2 = new Tiere("Kaa" , "Reptil");
       Tiere schlange3 = new Tiere("Würgi", "Reptil");


       //Tiere dem Gehege zuordnen
        alpenwiese.addTiere(hirsch1);
        alpenwiese.addTiere(reh1);

        ried.addTiere(hase1);
        ried.addTiere(hase2);

        terrarium.addTiere(schlange1);
        terrarium.addTiere(schlange2);
        terrarium.addTiere(schlange3);

        tiergartenDornbirn.zooStrukturGegeheTiere();

    }

}