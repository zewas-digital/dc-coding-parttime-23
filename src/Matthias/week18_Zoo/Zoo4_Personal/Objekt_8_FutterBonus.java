package Matthias.week18_Zoo.Zoo4_Personal;

/*
Bonusaufgabe: Tierfutter
Erweitere dein Zooprogramm mit Futter-Bedarfsanalyse.

+ Erstelle eine Klasse für Futter mit einen Namen, Einheit und Einheitspreis.
+ Jedes Tier hat einen Futterbedarf, die beinhaltet das Futter und eine Menge
+ Erstelle eine Statistik, was der Futterbedarf von Zoo ist, und wie viel die Tagesversorgung sich kostet.
Für diese Aufgabe kann man HashMap gut brauchen.


Beispielausgabe der Statistik:
=======================
27 kg         Fleisch             :   126,90 €
38 kg         Heu                 :    13,30 €
30 g          Tubiflex            :     4,50 €
=======================
Total Daily cost: 144,70 €
 */

public class Objekt_8_FutterBonus {
    public static void main(String[] args) {
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
