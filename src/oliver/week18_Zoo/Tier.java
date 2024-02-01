package oliver.week18_Zoo;

import java.util.HashMap;

public class Tier {
    private String name;

    private Futter futter;
    private int taeglicherBedarf;

    public Tier(String name, Futter futter, int taeglicherBedarf) {
        this.name = name;
        this.futter = futter;
        this.taeglicherBedarf = taeglicherBedarf;
    }

    public Futter getFutter() {
        return futter;
    }

    public void berechneTaeglichenBedarf(HashMap<Futter, Integer> taeglicherBedarf) {
        int bedarf = 0;

        if (taeglicherBedarf.containsKey(this.futter)) {
            bedarf = taeglicherBedarf.get(this.futter);
        }

        taeglicherBedarf.put(this.futter, bedarf + this.taeglicherBedarf);
    }
}







