package claudia.week18_neuerZoo;

public class Tier {
    private String name;
    private String art;
    private Lagerhaus.Futterarten futter;
    // futterArt: enum
    // menge: int
    private double futterBedarfInEinheit;

    public Tier(String name, String art, Lagerhaus.Futterarten futter, double futterBedarfInEinheit) {
        this.name = name;
        this.art = art;
        this.futter = futter;
        this.futterBedarfInEinheit = futterBedarfInEinheit;
    }

    public String getName() {
        return this.name;
    }

    public String getArt() {
        return this.art;
    }

    public String getFutter() {
        return this.futter.toString();
    }
    public Lagerhaus.Futterarten getFutterart(){
        return this.futter;
    }

    public double getFutterBedarfInEinheit() {
        return futterBedarfInEinheit;
    }
}
