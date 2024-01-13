package claudia.week17_Zoo;

public class Murmeltier extends Tier {
    public Murmeltier(String name, double mengeInKilo) {
        super("Murmeltier", name, 25, "Gras und Kräuter", mengeInKilo);
    }

    @Override
    public void feed() {
        System.out.println(toString());
        super.feed();
    }
}
