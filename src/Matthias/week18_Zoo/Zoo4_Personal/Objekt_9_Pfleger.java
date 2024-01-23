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

        // Zoo erstellen
        Zoo zoo1= new Zoo( "Tiergarten Dornbirn", 2022 );

        //Pfleger erstellen
        Pfleger pflegerSafi= new Pfleger( "Safi" );
        Pfleger pflegerClaudi= new Pfleger( "Claudi" );

        //Pfleger Zoos zuweisen
        zoo1.neuerPfleger( pflegerSafi );
        zoo1.neuerPfleger( pflegerClaudi);

        //Gehege
        Gehege wildwiese=zoo1.addGehege("Ried" );
        Gehege wuestenlandschaft=zoo1.addGehege( "Terrarium (warm)" );
        Gehege blubberBecken=zoo1.addGehege( "Terrarium (warm)" );

        //Plegern ihre Verantwortung mit Validierung hinzufügen

        zoo1.verantwortlichFuerGehege( pflegerSafi,wildwiese );
        zoo1.verantwortlichFuerGehege( pflegerSafi,wuestenlandschaft);
        zoo1.verantwortlichFuerGehege( pflegerClaudi,blubberBecken );


        zoo1.printFormated();

        Futterbedarf Menge1=new Futterbedarf( 3 );

        Tier Kuh=wildwiese.addNewAnimal( "Garmond", "Kuh", Futter.Futtersorten.Heu,Menge1);
        Tier Fisch= wildwiese.addNewAnimal( "Rijska", "Hai" , Futter.Futtersorten.Fisch,Menge1);

        zoo1.printFormated();
        zoo1.printFutterbedarfsliteZoo();
    }
}
