package MichaelReal.week17_Zoo;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ZooZoo {
    protected String name;
    protected int gruendungsjahr;
    protected Map<GehegeGehege, List<TierTier>> gehegeTierMap;

    public ZooZoo(String name, int gruendungsjahr) {
        this.name = name;
        this.gruendungsjahr = gruendungsjahr;
        this.gehegeTierMap = new HashMap<>();
    }

    public void gehegeHizufuegen(GehegeGehege gehege) {
        gehegeTierMap.put(gehege, new ArrayList<>());
    }

    public void removeGehege(GehegeGehege gehege) {
        gehegeTierMap.remove(gehege);
    }

    public void tierDemGehegeZuweisen(TierTier tier, GehegeGehege gehege) {
        List<TierTier> tierList = gehegeTierMap.get(gehege);
        if (tierList != null) {
            tierList.add(tier);
        }
    }

    public void futterZuweisen(TierTier tier, String futter) {
        tier.setFutter(futter);
    }

    public void sauberAusgeben() {
            System.out.println("├── Zoo🐯: " + name + ", gegründet " + gruendungsjahr);
            for (Map.Entry<GehegeGehege, List<TierTier>> entry : gehegeTierMap.entrySet()) {
                GehegeGehege gehege = entry.getKey();
                List<TierTier> tierList = entry.getValue();
                System.out.println("│   ├── Gehege🎞️: " + gehege.getName());
                for (TierTier tier : tierList) {
                    System.out.println("│   │   ├── Tier🦄: " + tier.getName() + " (" + tier.getFutter() + ")");
                }
            }
    }
}