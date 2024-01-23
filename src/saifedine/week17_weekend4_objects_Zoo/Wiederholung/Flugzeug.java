package saifedine.week17_weekend4_objects_Zoo.Wiederholung;

import java.util.ArrayList;

public class Flugzeug implements Move, Reifenwechsel {

    public Flugzeug(ArrayList<Move> list) {

        list.add(this);
    }

    public void move() {
        System.out.println("Ich fliege!");
    }

    public void change(int anzahlDerRaeder) {
        System.out.println("Es müssen drei Räder getauscht werden.");
    }
}
