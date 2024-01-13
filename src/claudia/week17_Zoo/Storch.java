package claudia.week17_Zoo;

public class Storch extends Tier{

    public Storch(String name, double mengeInKilo){
        super("Storch", name, 20, "Frösche", mengeInKilo);
    }

    @Override
    public void feed() {
        System.out.println(toString());
        super.feed();
    }

}
