package Alpi.week18_Zoo;

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

import Alpi.week18_Zoo.Gehege;
import Alpi.week18_Zoo.Zoo;

public class Objekt_7_Tiere {

    public static void main(String[] args) {

        String haken = "├──";
        String haken2 = "│   ├──";
        String haken3 = "│       ├──";

        // Zoo erstellen
        Zoo tierpark = new Zoo("Doppelmayerzoo", 1980);

        // Gehege erstellen
        // Gehege alpen = new Gehege("Alpen");---------------------------
        // tierpark.gehegeArrayList.add(alpen);
        tierpark.gehegeArrayList.add(new Gehege("Alpen"));
        tierpark.gehegeArrayList.add(new Gehege("Savanne"));
        tierpark.gehegeArrayList.add(new Gehege("Tropen"));
        //----------------------------------------------------------------


        // Tiere erstellen---------------------------------------------------------------------------------------------------------------------
        tierpark.gehegeArrayList.get(0).tiereImGehege.add(new Tiere("Maxi", "Wildschwein", new Futter("Heu", 5)));
        tierpark.gehegeArrayList.get(0).tiereImGehege.add(new Tiere("Hugo", "Bär", new Futter("Fisch", 15)));
        tierpark.gehegeArrayList.get(1).tiereImGehege.add(new Tiere("Maxiking", "Löwe", new Futter("Fisch", 10)));
        //--------------------------------------------------------------------------------------------------------------------------------------


        //Gehege löschen-----------------------------------------------
        tierpark.gehegeArrayList.get(0).tiereImGehege.remove(1);
        //-------------------------------------------------------------


        // Ausgabe des Zoos---------------------------------------------------------------------------------------------------
        System.out.println("Start der Ausgabe");
        System.out.println(haken + " Zoo: " + tierpark.name + ", gegründet " + tierpark.gruendungsjahr);
        for (Gehege s : tierpark.gehegeArrayList){
            System.out.println(haken2 + " Gehege: " + s.bezeichnung );
            for (Tiere t : s.tiereImGehege){
                System.out.println(haken3 + "Name: " + t.Name + ", Gattung: "+ t.Gattung + "; Futter: " + t.futter.name);
            }
        }
        //-------------------------------------------------------------------------------------------------------------------------



        /*



        // Zoo erstellen
        Zoo TiergartenFeldkirch = new Zoo("├──  Tiergarten Feldkirch " + ", " ,1985);
        Gehege montes = new Gehege("│   ├── Montes");


        Zoo TiergartenHohenems = new Zoo("Tiergarten Hohenems ", 2022);

        // Gehege erstellen

        Gehege Affen = new Gehege("Affen");
        Gehege Katzen = new Gehege("Katzen");

        // Tiere erstellen
        Tiere Affe = new Tiere("Affe ", "Orangutan" );
        Tiere Tiger = new Tiere ("Tiger ", "Katze");

        // Tiere in Gehegen hinzufügen
        montes.addTiere(Tiger);
        Affen.addTiere(Affe);

        montes.removeTiere(Tiger);
        Affen.removeTiere(Affe);

        //

        Futter heu = new Futter("heu", "kg", 2);

        /*
        System.out.println(Tiger.addFutter().toString());
         */


    }

}