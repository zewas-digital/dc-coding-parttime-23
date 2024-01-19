package claudia.week17_Zoo.Tiere;

import claudia.week17_Zoo.Futter;

import java.util.ArrayList;

public class Wal extends Wassertiere {

    public Wal(String name, Futter futter, double mengeInTonnen, ArrayList<Tiere> liste){
        super("Wal", name, 20000, futter, mengeInTonnen, liste);
    }
    public double preisinEinheit = this.getFutter().getPreisProEinheit();
    @Override
    public void feed() {
        System.out.println(toString());
        super.feed();
    }

}
