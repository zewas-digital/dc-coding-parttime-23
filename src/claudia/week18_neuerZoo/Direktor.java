package claudia.week18_neuerZoo;

import claudia.BasicFunctions;

import java.util.ArrayList;
import java.util.Scanner;

public class Direktor extends Pfleger{


    public Direktor(String name, ArrayList<Pfleger> ListeDerPfleger, ArrayList<Gehege> ListeAllerGehege, boolean abfrage) {
        super(name, ListeDerPfleger, ListeAllerGehege, false);
        //lösche Direktor aus der Pflegerliste:
        ListeDerPfleger.remove(this);
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
