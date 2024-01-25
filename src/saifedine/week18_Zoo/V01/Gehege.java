package saifedine.week18_Zoo.V01;

import java.util.ArrayList;

public class Gehege {

    private String gehegeName;

    private ArrayList<Tiere> tiereArrayList;

    public Gehege(String gehegeName) {
        this.gehegeName = gehegeName;
        this.tiereArrayList = new ArrayList<>();
    }

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
}