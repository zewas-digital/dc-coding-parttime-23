package Simonsway.Week18Refactor;

import oliver.week18_Zoo.Tier;

import java.util.ArrayList;
import java.util.HashMap;

public class Gehege {

    public String name;
    private ArrayList<Tiere> tiere;

    public Gehege(String name) {
        this.name = name;
        this.tiere = new ArrayList<>();
    }

    public Tiere neuesTier(String name, Futter futter, int taeglicherBedarf) {
        Tiere tiere = new Tiere(name, futter, taeglicherBedarf);
        this.tiere.add(tiere);

        return tiere;
    }

    public String toString() {
        return "Gehege: " + this.name;
    }

    public ArrayList<Tiere> getTiere() {
        return tiere;
    }

    public void taeglicherBedrafberechung (HashMap<Futter, Integer> taeglicherBedarf){
        for (Tiere t: this.tiere) {
            t.taeglicherBedrafberechung(taeglicherBedarf);
        }
    }

}

