package MichaelReal.week20_Restaurant;

import java.util.HashMap;
import java.util.Map;

public class Bestellung {
    private Map<Gericht, Integer> bestellteGerichte = new HashMap<>();
    private Map<Getraenk, Integer> bestellteGetraenke = new HashMap<>();

    public void addGericht(Gericht gericht, int anzahl) {
        bestellteGerichte.put(gericht, anzahl);
    }

    public void addGetraenk(Getraenk getraenk, int anzahl) {
        bestellteGetraenke.put(getraenk, anzahl);
    }
}
