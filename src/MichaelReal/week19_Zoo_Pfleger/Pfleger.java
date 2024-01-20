package MichaelReal.week19_Zoo_Pfleger;

import java.util.ArrayList;
import java.util.HashMap;

public class Pfleger {
    private String name;
    private HashMap<String, ArrayList<String>> zustaendigeGehege;

    public Pfleger(String name) {
        this.name = name;
        this.zustaendigeGehege = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void zuweisenGehege(String gehegeName) {
        zustaendigeGehege.put(gehegeName, new ArrayList<>());
    }

    public void entfernenGehege(String gehegeName) {
        zustaendigeGehege.remove(gehegeName);
    }

    public void zuweisenTier(String gehegeName, String tierName) {
        if (zustaendigeGehege.containsKey(gehegeName)) {
            ArrayList<String> zugeordneteTiere = zustaendigeGehege.get(gehegeName);
            zugeordneteTiere.add(tierName);
        }
    }

    public void entfernenTier(String tierName) {
        for (String gehege : zustaendigeGehege.keySet()) {
            ArrayList<String> zugeordneteTiere = zustaendigeGehege.get(gehege);
            zugeordneteTiere.remove(tierName);
        }
    }
}