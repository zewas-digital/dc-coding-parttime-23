package florian.week_17_Zoo;

import java.util.ArrayList;

public class Gehege {

    String gehegeName;

    Tiere tiere;


    public Gehege(String gehegeName, Tiere tiere) {
        this.gehegeName = gehegeName;
        this.tiere = tiere;
    }

    public ArrayList<Tiere> tiereArrayList = new ArrayList<>();

    public void addTiere(Tiere tiere) {
        this.tiereArrayList.add(tiere);
    }

    public void removeTiere(Tiere tiere) {
        this.tiereArrayList.remove(tiere);
    }

    public ArrayList <Tiere> getListeDerTiere (){ return this.tiereArrayList;}

    @Override
    public String toString() {
        return "" + gehegeName;
    }
}
