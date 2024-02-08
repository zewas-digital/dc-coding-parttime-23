package saifedine.week20_Zoo.V02;

import java.util.ArrayList;

public class Gehege {

    // Attribute
    private String gehegeName;

    private ArrayList<Tiere> tiereArrayList;


    // Konstruktor
    public Gehege(String gehegeName) {
        this.gehegeName = gehegeName;
        this.tiereArrayList = new ArrayList<>();
    }


    // alle Methoden, wobei toString immer der erste sein soll
    @Override
    public String toString() {
        return "Gehege: " + this.gehegeName;
    }

    public void addTiere(Tiere tiere) {
        this.tiereArrayList.add(tiere);
    }
    public void removeTiere(Tiere tiere) {
        this.tiereArrayList.remove(tiere);
    }

    public ArrayList<Tiere> gettierArrayList() {
        return this.tiereArrayList;
    }

    public String getGehegeName() {
        return "Gehege " + this.gehegeName;
    }
}