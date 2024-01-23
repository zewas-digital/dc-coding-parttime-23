package MichaelReal.week19_Zoo_Pfleger_2;

import java.util.HashMap;

public class Tier {
    private String name;
    private String gattung;
    private HashMap<Futter, Integer> futterBedarf;

    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
        this.futterBedarf = new HashMap<>();
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

    public HashMap<Futter, Integer> getFutterBedarf() {
        return futterBedarf;
    }
}
