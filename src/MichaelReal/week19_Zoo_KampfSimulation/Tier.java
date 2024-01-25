package MichaelReal.week19_Zoo_KampfSimulation;

import java.util.ArrayList;
import java.util.HashMap;

public class Tier {
    private String name;
    private String gattung;
    private HashMap<Futter, Integer> futterBedarf;
    private ArrayList<String> pflegerTierList;
    private int gesundheit;
    private int maxGesundheit;
    private int bissStaerke;


    public Tier(String name, String gattung, int maxGesundheit, int bissStaerke) {
        this.name = name;
        this.gattung = gattung;
        this.futterBedarf = new HashMap<>();
        this.pflegerTierList = new ArrayList<>();
        this.maxGesundheit = maxGesundheit;
        this.gesundheit = maxGesundheit; // Gesundheit ist anfangs gleich Maximalgesundheit
        this.bissStaerke = bissStaerke;

    }

    public String getName() {
        return name;
    }

    public String getGattung() {
        return gattung;
    }

    public void addFutterBedarf(Futter futter, int menge) {
        futterBedarf.put(futter, menge);
    }

    public void addPfleger(String name) {
        pflegerTierList.add(name);
    }

    public HashMap<Futter, Integer> getFutterBedarf() {
        return futterBedarf;
    }

    public ArrayList<String> getPflegerTierList() {
        return pflegerTierList;
    }

    public void beissen(Tier anderesTier) {
        if (this.gesundheit > 0) { // Nur lebende Tiere beißen
            anderesTier.gesundheit -= this.bissStaerke;
            System.out.println(this.name + " hat " + anderesTier.getName() + " gebissen!");
        }
    }

    public boolean istLebendig() {
        return gesundheit > 0;
    }
}
