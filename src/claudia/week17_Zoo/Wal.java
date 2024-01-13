package claudia.week17_Zoo;

import java.util.ArrayList;

public class Wal extends Wassertiere {

    public Wal(String name, double mengeInKilo, ArrayList<Tiere> liste){
        super("Wal", name, 20000, "Krill", mengeInKilo, liste);
    }

    @Override
    public void feed() {
        System.out.println(toString());
        super.feed();
    }

}
