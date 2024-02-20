package Simonsway.Week18Refactor;

import java.util.HashMap;

public class Tiere {

    private String name;
    private int taeglicherBedarf;
    private Futter futter;

    public Tiere(String name, Futter futter, int taeglicherBedarf){
        this.name = name;
        this.futter = futter;
        this.taeglicherBedarf = taeglicherBedarf;
    }


    public String toString(){
        return "Tier: " + this.name + " Täglicher Bedarf " + this.taeglicherBedarf + " Futter " + this.futter;
    }


    public void taeglicherBedrafberechung (HashMap<Futter, Integer> taeglicherBedarf){
        int bedarf = 0;

        if (taeglicherBedarf.containsKey(this.futter)) {
            bedarf = taeglicherBedarf.get(this.futter);
        }

        taeglicherBedarf.put(this.futter, bedarf + this.taeglicherBedarf);
    }

}


