package claudia.week17_Zoo.Tiere;

import claudia.week17_Zoo.Futter;

import java.util.ArrayList;

public class Goldfisch extends Wassertiere {

    public Goldfisch(String name, Futter futter, double mengeInTonnen, ArrayList<Tiere> liste){
        super("Goldfisch", name, 20, futter, mengeInTonnen, liste);
    }
    public double preisinEinheit = this.getFutter().getPreisProEinheit();
    @Override
    public void feed() {
        System.out.println(toString());
        super.feed();
    }

}