package saifedine.week21.oliver_Zoo_Threads;

import java.util.HashMap;
import java.util.Vector;

public class Gehege extends Object {
    public String bezeichnung;
    private Vector<Tier> tiere;

    public Gehege(String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.tiere = new Vector<>();
    }

    public Tier tierHinzufuegen(String name, Futter futter, int taeglicherBedarf) {
        Tier tier = new Tier(name, futter, taeglicherBedarf);
        this.tiere.add(tier);

        return tier;
    }

    public Tier tierHinzufuegen(String name, int biss, int maxGesundheit, Tiere tiere) {
        Tier tier = new Tier(name, biss, maxGesundheit, tiere);
        this.tiere.add(tier);

        return tier;
    }

    public Vector<Tier> getTiere() {
        return tiere;
    }

    public void berechneTaeglichenBedarf(HashMap<Futter, Integer> taeglicherBedarf) {
        for (Tier t: this.tiere) {
            t.berechneTaeglichenBedarf(taeglicherBedarf);
        }
    }
}










