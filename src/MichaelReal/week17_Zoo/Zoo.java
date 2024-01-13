package MichaelReal.week17_Zoo;

import java.util.ArrayList;
import java.util.List;

public abstract class Zoo {

    private final String name;
    private final int GRUENDUNGSJAHR;
    private final List<Tiere> tiere;
    private final List<Gehege> gehege;

    public Zoo(String name, int gruendungsjahr) {
        this.name =name;
        this.GRUENDUNGSJAHR = gruendungsjahr;
        this.tiere = new ArrayList<>();
        this.gehege = new ArrayList<>();
    }

    public int getGRUENDUNGSJAHR() {
        return GRUENDUNGSJAHR;
    }

    public void tierHinzufuegen(Tiere tier) {
        tier.add(tier);
    }

    public void gehegeHünzufügen(Gehege gehege) {
        gehege.add(gehege);
    }

    @Override
    public String toString() {
        return "Zoo" +
                "\n Name = " + name +
                "\n Tier = " + tiere +
                "\n Gehege = " + gehege;
    }
}
