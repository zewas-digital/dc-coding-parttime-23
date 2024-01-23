package MichaelReal.week19_Zoo_Pfleger_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Pfleger {
    private String name;
    private HashMap<Gehege, Integer> zustaendigeGehege; // Zuordnung von Gehegen zu Pflegern
    private ArrayList<Tier> zustaendigeTiere; // Liste der zuständigen Tiere

    public Pfleger(String name) {
        this.name = name;
        this.zustaendigeGehege = new HashMap<>();
        this.zustaendigeTiere = new ArrayList<>();
    }

    // Hinzufügen eines Geheges zu den zuständigen Gehegen des Pflegers
    public void addZustaendigesGehege(Gehege gehege) {
        // Prüfen, ob das Gehege bereits in der Liste ist, und hinzufügen, falls nicht
        if (!this.zustaendigeGehege.containsKey(gehege)) {
            this.zustaendigeGehege.put(gehege, 0);
        }
        this.zustaendigeGehege.put(gehege, this.zustaendigeGehege.get(gehege) + 1);
    }

    // Methode zum Entfernen eines Geheges
    public void removeZustaendigesGehege(Gehege gehege) {
        int count = zustaendigeGehege.getOrDefault(gehege, 0);
        if (count > 1) {
            zustaendigeGehege.put(gehege, count - 1);
        } else {
            zustaendigeGehege.remove(gehege);
        }
    }

    // Hinzufügen eines Tieres zu den zuständigen Tieren des Pflegers
    public void addZustaendigesTier(Tier tier) {
        // Prüfen, ob das Tier bereits in der Liste ist, und hinzufügen, falls nicht
        if (!this.zustaendigeTiere.contains(tier)) {
            this.zustaendigeTiere.add(tier);
        }
    }

    // Methode zum Entfernen eines Tieres
    public void removeZustaendigesTier(Tier tier) {
        zustaendigeTiere.remove(tier);
    }

    public String getName() {
        return name;
    }

    public HashMap<Gehege, Integer> getZustaendigeGehege() {
        return new HashMap<>(zustaendigeGehege);
    }

    public ArrayList<Tier> getZustaendigeTiere() {
        return new ArrayList<>(zustaendigeTiere);
    }
}

