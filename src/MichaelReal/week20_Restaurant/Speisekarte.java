package MichaelReal.week20_Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Speisekarte {
    private List<Gericht> gerichte = new ArrayList<>();
    private List<Getraenk> getranke = new ArrayList<>();

    public void addGericht(Gericht gericht) {
        gerichte.add(gericht);
    }

    public void addGetraenk(Getraenk getraenk) {
        getranke.add(getraenk);
    }
}
