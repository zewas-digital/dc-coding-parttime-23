package MichaelReal.week19_Zoo_Pfleger_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Tier {
    private String name;
    private String gattung;
    private HashMap<Futter, Integer> futterBedarf;
    private ArrayList<String> pflegerTierList;


    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
        this.futterBedarf = new HashMap<>();
        this.pflegerTierList = new ArrayList<>();

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
}
