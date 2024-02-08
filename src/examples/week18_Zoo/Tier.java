package examples.week18_Zoo;

import java.util.HashMap;

public class Tier {
    public String name;

    public int gesundheit;
    private int maxGesundheit;
    public int biss;

    private Futter futter;
    private int taeglicherBedarf;

    public Tier(String name, Futter futter, int taeglicherBedarf, int maxGesundheit, int biss) {
        this.name = name;
        this.futter = futter;
        this.taeglicherBedarf = taeglicherBedarf;
        this.gesundheit = maxGesundheit;
        this.maxGesundheit = maxGesundheit;
        this.biss = biss;
    }

    public Futter getFutter() {
        return futter;
    }

    public void wirdGebissen(int biss) {
        this.gesundheit -= biss;
    }

    public void berechneTaeglichenBedarf(HashMap<Futter, Integer> taeglicherBedarf) {
        int bedarf = 0;

        if (taeglicherBedarf.containsKey(this.futter)) {
            bedarf = taeglicherBedarf.get(this.futter);
        }

        taeglicherBedarf.put(this.futter, bedarf + this.taeglicherBedarf);
    }
}







