package claudia.week17_Zoo.Tiere;

import java.util.ArrayList;

public class Storch extends Landtiere {

    public Storch(String name, double mengeInKilo, ArrayList<Tiere> liste){
        super("Storch", name, 20, "Frösche", mengeInKilo, liste);
    }

    @Override
    public void feed() {
        System.out.println(toString());
        super.feed();
    }

}
