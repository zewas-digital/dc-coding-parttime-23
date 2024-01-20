package Matthias.week18_Zoo.Zoo1;

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
│       ├── Garmond, Storch
│       ├── Hugo, Storh
│       ├── Idaxis, Storch
│   ├── Gehege: Terrarium (warm)
│       ├── (leer)
 */

public class Objekt_7_Tiere {
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
        Futterbedarf Menge1=new Futterbedarf( 2 );
        Futter Futter1 =new Futter( "Fleisch", "kg",0.5 );
        Futter Futter2 =new Futter( "Fisch", "kg",0.5 );
        Tiere Tier1 =new Tiere( "Rijska", "Kuh" ,Futter1,Menge1);
        Tiere Tier2 =new Tiere( "Garmond", "Kuh",Futter2,Menge1 );
        gehege1.addNewAnimal(  Tier1);
        gehege1.addNewAnimal(  Tier2);
        zoo1.printFormated();
    }

}