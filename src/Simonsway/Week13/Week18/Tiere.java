package Simonsway.Week13.Week18;

// Erstelle eine Tier-Klasse mit einem Namen und einer Gattung
public class Tiere {

    private String tierName;
    private String tierGattung;


    public Tiere(String tierName,String tierGattung){
        this.tierName = tierName;
        this.tierGattung = tierGattung;
    }

    public String toString(){
        return this.tierName + ", " + this.tierGattung;
    }
}
