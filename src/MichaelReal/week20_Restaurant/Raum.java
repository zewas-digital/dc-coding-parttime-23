package MichaelReal.week20_Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Raum {
    private List<Tisch> tische = new ArrayList<>();
    private Kellner zustandigerKellner;

    // Konstruktor, um einen Raum ohne spezifischen Kellner zu erstellen
    public Raum() {}

    // Methode, um einen Kellner zuzuweisen
    public void setZustandigerKellner(Kellner kellner) {
        this.zustandigerKellner = kellner;
        kellner.addRaum(this); // Fügt diesen Raum zur Liste der betreuten Räume des Kellners hinzu
    }

    // Methode, um Tische zum Raum hinzuzufügen
    public void addTisch(Tisch tisch) {
        tische.add(tisch);
    }

    // Getter für den zuständigen Kellner
    public Kellner getZustandigerKellner() {
        return zustandigerKellner;
    }
}
