package claudia.week21_Threads.Restaurant;

import java.util.Vector;

public class Raum {
    private Vector<Tisch> listeDerTische = new Vector<>();
    private Kellner kellner;
    public Raum(Kellner k){
        this.kellner = k;
    }
    public Vector<Tisch> getListeDerTische(){
        return this.listeDerTische;
    }
    public void tischZufuegen(Tisch t){
        this.listeDerTische.add(t);
        t.setKellner(this.kellner);
    }
    public Kellner getKellner(){
        return this.kellner;
    }

}
