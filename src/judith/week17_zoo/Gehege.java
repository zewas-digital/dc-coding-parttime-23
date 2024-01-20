package judith.week17_zoo;

import MichaelReal.week17_Zoo.Tier;

import java.util.ArrayList;

public class Gehege {
    //3/ Erstelle eine Gehege Klasse mit Name der als Beschreibung des Geheges dient.


    public String gehegeName;

    public Gehege(String gehegeName) {
        this.gehegeName = gehegeName;
    }

    public String toString() {
        return "Gehege: " + this.gehegeName;
    }

    public ArrayList<Tiere> tiereArrayList = new ArrayList<>();

    public void addTiere(Tiere tiere) {
        tiereArrayList.add(tiere);
    }

    public ArrayList<Tiere> getTiereArrayList(){
        return this.tiereArrayList;
    }


}
