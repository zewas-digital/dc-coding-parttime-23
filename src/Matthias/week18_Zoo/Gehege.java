package Matthias.week18_Zoo;

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
    public String getStandort() {
        return Standort;
    }

    @Override
    public String toString(){
        return "Gehege: "+this.Standort;
    }
}
