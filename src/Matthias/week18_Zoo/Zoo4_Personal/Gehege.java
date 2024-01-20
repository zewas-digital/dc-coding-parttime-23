package Matthias.week18_Zoo.Zoo4_Personal;

import java.util.ArrayList;

public class Gehege{

    //Deklaration der Antribute
    private String Standort;    //Standort des Geheges
    private ArrayList<Tiere> TierListe = new ArrayList<>( );

    // Konstruktor für das Gehege
    public Gehege (String Standort){
        this.Standort=Standort;
    }
    public void addNewAnimal( Tiere newAnimal) {
        TierListe.add( newAnimal);
    }

    public void removeAnimal( Tiere newAnimal) {
        TierListe.remove( newAnimal);
    }
    public String getStandort() {
        return this.Standort;
    }

    public ArrayList<Tiere> getTierListe() {return this.TierListe;}

    @Override
    public String toString(){
        return "Gehege: "+this.Standort;
    }
}
