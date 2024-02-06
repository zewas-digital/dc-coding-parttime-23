package claudia.week18_neuerZoo;

import claudia.BasicFunctions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Direktor extends Pfleger{


    public Direktor(String name, ArrayList<Pfleger> ListeDerPfleger, ArrayList<Gehege> ListeAllerGehege, boolean abfrage) {
        super(name, ListeDerPfleger, ListeAllerGehege, false);
        //lösche Direktor aus der Pflegerliste:
        ListeDerPfleger.remove(this);
    }

    public void buy(Lagerhaus lagerhaus, Lagerhaus.Futterarten futterart){
        HashMap<Lagerhaus.Futterarten, Double> stocklist = lagerhaus.getStockListAllFeeds();
        double stockActual = stocklist.get(futterart);
        double stockMax = 1000.0; //TODO flexibilisieren!
        String einheit = lagerhaus.getFutterliste().get(futterart).getEinheit();
        System.out.println("\n" + this + " muss " + futterart + " nachbestellen und kauft " + (stockMax - stockActual) + " " + einheit);
    }

    @Override
    public String toString(){
        return ("Direktorin " + super.getName());
    }
    @Override
    public void startDay(){
        System.out.println("\n" +  this + " öffnet den Zoo.");
    }
    @Override
    public void endDay(){
        System.out.println("\n" + this + " schließt den Zoo. ");
    }
    @Override
    public String getName(){
        return super.getName();
    }

}
