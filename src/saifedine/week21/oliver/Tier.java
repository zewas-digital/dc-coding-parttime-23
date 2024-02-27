package saifedine.week21.oliver;

import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class Tier {
    private String name;

    private Futter futter;
    private int taeglicherBedarf;

    private int maxGesundheit;
    private int biss;

    private Tiere tier;

    public Tier(String name, Futter futter, int taeglicherBedarf) {
        this.name = name;
        this.futter = futter;
        this.taeglicherBedarf = taeglicherBedarf;
    }

    public Tier(String name, int biss, int maxGesundheit, Tiere tier) {
        this.name = name;
        this.biss = biss;
        this.maxGesundheit = maxGesundheit;
        this.tier = tier;
    }

    public Tiere getTier() {
        return tier;
    }

    public Futter getFutter() {
        return futter;
    }

    public String getName() {
        return name;
    }

    public String getNameUndKraft() {
        return name + " (" + this.maxGesundheit + ")";
    }

    public int getMaxGesundheit() {
        return maxGesundheit;
    }

    public void berechneTaeglichenBedarf(HashMap<Futter, Integer> taeglicherBedarf) {
        int bedarf = 0;

        if (taeglicherBedarf.containsKey(this.futter)) {
            bedarf = taeglicherBedarf.get(this.futter);
        }

        taeglicherBedarf.put(this.futter, bedarf + this.taeglicherBedarf);
    }

    public void streunt(Gehege gehege) {
        // frisst?

        // Tier sucht und beisst mit 40-prozentiger Wahrscheinlichkeit
        if (Math.random() < 0.4) {
            Vector<Tier> mitbewohner = (Vector) gehege.getTiere().clone();
            Collections.shuffle(mitbewohner);

            Tier einesZumBeissen = null;
            for (Tier naechstesTier : mitbewohner) {
                if (naechstesTier.getTier() != this.getTier()) {
                    einesZumBeissen = naechstesTier;
                    break;
                }
            }
            if (einesZumBeissen != null) {
                if (einesZumBeissen.istLebendig())
                    this.beisst(einesZumBeissen);
                else
                    System.out.println("| "+ this.getNameUndKraft() +" schnuppert an † "+ einesZumBeissen.getName());
            }
        }
    }

    public void beisst(Tier tier) {
        String ausgabe = "| " + this.getNameUndKraft() + " beisst " + tier.name + " (" + tier.getMaxGesundheit();
        tier.wirdGebissen(this.biss);
        ausgabe += " --> " +
                (tier.istLebendig() ? tier.getMaxGesundheit() : "†")
                + ")";

        System.out.println(ausgabe);
    }

    public void wirdGebissen(int biss) {
        this.maxGesundheit -= biss;
    }

    public Boolean istLebendig() {
        return this.maxGesundheit > 0;
    }
}







