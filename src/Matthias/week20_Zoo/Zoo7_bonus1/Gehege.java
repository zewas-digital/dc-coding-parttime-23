package Matthias.week20_Zoo.Zoo7_bonus1;

import java.util.ArrayList;
import java.util.Random;

public class Gehege{

    //Deklaration der Antribute
    private String Standort;    //Standort des Geheges
    private ArrayList<Tier> TierListe = new ArrayList<>( );
    private boolean gehegeFutterStatus =false;

    // Konstruktor für das Gehege
    public Gehege (String Standort){

        this.Standort=Standort;
    }
    public void fuetternAlleGehege(){
        for (Tier t:this.TierListe) {
            t.futtern();
        }
    }
    public void randomTierBeobachten(){
        Random random = new Random();
        int randomZahl=random.nextInt( this.TierListe.size() );
        this.TierListe.get( randomZahl ).beobachten();
    }

    public void setGehegeFutterStatus( boolean gehegeFutterStatus ) {
        this.gehegeFutterStatus = gehegeFutterStatus;
    }

    public Tier addNewAnimal( String animalName, String gattungName, Futter.Futtersorten futtersorte, Futterbedarf futterbedarf,int MaxGesunheit, int Biss) {
        Tier neuesTier=new Tier( animalName, gattungName, futtersorte, futterbedarf,MaxGesunheit,Biss);
        TierListe.add( neuesTier);
        return neuesTier;
    }

    public Tier zufallsTier(Gehege gehege){
        Random random = new Random();
        return gehege.getTierListe().get( random.nextInt( 0,gehege.getTierListe().size() ) );
    }

    public boolean getGehegeFutterStatus() {
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
