package saifedine.week18_Zoo.V01_ohne_Bonus;

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
