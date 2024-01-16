package MichaelReal.week17_Zoo;

public class Tier {
    private String name;
    private Futter futter;

    public Tier(String name, Futter futter) {
        this.name = name;
        this.futter = futter;
    }

    public String getName() {
        return name;
    }

    public Futter getFutter() {
        return futter;
    }

    public void setFutter(Futter futter) {
        this.futter = futter;
    }
}