package Matthias.week17_objects;

public class Gehege{

    //Deklaration der Antribute
    private String Standort;    //Standort des Geheges

    // Konstruktor für das Gehege
    public Gehege (String Standort){
        this.Standort=Standort;
    }
    public String getStandort() {
        return Standort;
    }

    @Override
    public String toString(){
        return "Gehege: "+this.Standort;
    }
}
