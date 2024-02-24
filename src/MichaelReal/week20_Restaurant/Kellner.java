package MichaelReal.week20_Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Kellner {
    private String name;
    private List<Raum> betreuteRaume = new ArrayList<>();

    public Kellner(String name) {
        this.name = name;
    }

    // Methode, um einen Raum zur Liste der betreuten Räume hinzuzufügen
    public void addRaum(Raum raum) {
        betreuteRaume.add(raum);
    }

    // Getter für den Namen des Kellners
    public String getName() {
        return name;
    }
    }