package MichaelReal.week17_Zoo;

public class Tiere {
    private final String name;
    private final String art;
    private String futter;

    public Tiere(String name, String art, String futter) {
        this.name = name;
        this.art = art;
        this.futter = futter;
    }

    @Override
    public String toString() {
        return "Tier" +
                "\n Name = " + name +
                "\n Art = " + art +
                "\n Futter = " + futter;
    }

    public void add(Tiere tier) {
    }
}