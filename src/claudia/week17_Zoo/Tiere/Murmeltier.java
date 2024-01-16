package claudia.week17_Zoo.Tiere;

import java.util.ArrayList;

public class Murmeltier extends Landtiere {
    public Murmeltier(String name, double mengeInKilo, ArrayList<Tiere> liste) {
        super("Murmeltier", name, 25, "Gras und Kräuter", mengeInKilo, liste);
    }

    @Override
    public void feed() {
        System.out.println(toString());
        super.feed();
    }
}
