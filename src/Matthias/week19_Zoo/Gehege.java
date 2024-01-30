package Matthias.week19_Zoo;


import java.util.ArrayList;

public class Gehege{

    //Deklaration der Antribute
    private String Standort;    //Standort des Geheges
    private ArrayList<Tier> TierListe = new ArrayList<>( );
    private boolean gehegeFutterStatus =false;

    // Konstruktor für das Gehege
    public Gehege (String Standort){

        this.Standort=Standort;
    }

    public void setGehegeFutterStatus( boolean gehegeFutterStatus ) {
        this.gehegeFutterStatus = gehegeFutterStatus;
    }

    public Tier addNewAnimal( String animalName, String gattungName, Futter.Futtersorten futtersorte, Futterbedarf futterbedarf) {
        Tier neuesTier=new Tier( animalName, gattungName, futtersorte, futterbedarf);
        TierListe.add( neuesTier);
        return neuesTier;
    }

    public boolean isGehegeFutterStatus() {
        return gehegeFutterStatus;
    }

    public void removeAnimal( Tier newAnimal) {
        TierListe.remove( newAnimal);
    }
    public String getStandort() {
        return this.Standort;
    }

    public ArrayList<Tier> getTierListe() {return this.TierListe;}

    @Override
    public String toString(){
        return "Gehege: "+this.Standort;
    }
}
