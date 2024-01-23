package oliver.week18_Zoo;

import java.util.HashMap;
import java.util.Vector;

public class Gehege {
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













    public void berechneTaeglichenBedarf(HashMap<Futter, Integer> taeglicherBedarf) {
        for (Tier t: this.tiere) {
            t.berechneTaeglichenBedarf(taeglicherBedarf);
        }
    }
}
