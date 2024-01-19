package claudia.week17_Zoo.Tiere;

import claudia.week17_Zoo.Futter;

import java.util.ArrayList;

public class Storch extends Landtiere {

    public Storch(String name, Futter futter, double mengeInKilo, ArrayList<Tiere> liste){
        super("Storch", name, 20, futter, mengeInKilo, liste);
    }
    public double preisinEinheit = this.getFutter().getPreisProEinheit();
    @Override
    public void feed() {
        System.out.println(toString());
        super.feed();
    }

}
