package Matthias.week18_Zoo.Zoo4_Personal;

/*
Aufgabe: Pfleger
Erweitere dein Zooprogramm um Tierpfleger.

Erstelle eine Klasse Pfleger mit einem Namen und mit einer dynamischen Liste von Gehegen,
wofür der Pfleger zuständig ist. Erweitere die Klasse Zoo, dass die eine Liste der Pfleger beinhaltet.

Erweitere den Struktur-Ausdruck um die neu eingeführten Pfleger.
 */

public class Objekt_9_Pfleger {
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
        Futterbedarf Menge1=new Futterbedarf( 3 );
        Tiere WILD =new Tiere( "Rijska", "Kuh" , Futter.Futtersorten.Fisch,Menge1);
        Tiere VOGEL =new Tiere( "Garmond", "Kuh", Futter.Futtersorten.Heu,Menge1 );
        gehege1.addNewAnimal(  WILD);
        gehege1.addNewAnimal(  VOGEL);
        zoo1.printFormated();
        zoo1.printFutterbedarfsliteZoo();
    }
}
