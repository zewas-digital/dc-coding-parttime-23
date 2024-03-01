package claudia.week21_Threads.Restaurant;

public class Tisch {
    private int sitzplaetze;
    private boolean frei = true;
    private Kellner kellner;

    public Tisch(int sitzplaetze){
        this.sitzplaetze = sitzplaetze;
    }

    public int getSitzplaetze() {
        return this.sitzplaetze;
    }
    public boolean istFrei(){
        return this.frei;
    }
    public void changeStatus(){
        this.frei = !this.frei;
    }
    public void setKellner(Kellner k){
        this.kellner = k;
    }

    public Kellner getKellner() {
        return kellner;
    }
}
