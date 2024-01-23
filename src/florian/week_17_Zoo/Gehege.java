package florian.week_17_Zoo;





import florian.week_18_Futteraufgabe.Tiere;

import java.util.ArrayList;

public class Gehege {

    public String bezeichnung;

    public ArrayList<Tiere> tiereImGehege;


    public Gehege(String bezeichung) {

        this.bezeichnung = bezeichung;
        this.tiereImGehege  = new ArrayList<>();

    }
    public void addTiere (Tiere tier ){
        this.tiereImGehege.add(tier);
    }

    public void removeTiere (Tiere tier){
        this.tiereImGehege.remove(tier);
    }

}


