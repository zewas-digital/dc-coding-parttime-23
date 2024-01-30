package MichaelReal.week19_Zoo_Pfleger_Shit;

import java.util.HashMap;

public class Tier {
    private String name;
    private String gattung;
    private HashMap<Futter, Integer> futterBedarf;
    private final HashMap<Pfleger, Integer> zustandigePfleger;

    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
        this.futterBedarf = new HashMap<>();
        this.zustandigePfleger = new HashMap<>();
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



    public void addZustandigerPfleger(Pfleger pfleger, int anzahl) {
        zustandigePfleger.put(pfleger, anzahl);
    }

    public void removeZustandigerPfleger(Pfleger pfleger) {
        zustandigePfleger.remove(pfleger);
    }

    public HashMap<Pfleger, Integer> getZustandigePfleger() {
        return zustandigePfleger;
    }

    public HashMap<Futter, Integer> getFutterBedarf() {
        return futterBedarf;
    }
}
