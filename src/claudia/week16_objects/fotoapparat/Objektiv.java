package claudia.week16_objects.fotoapparat;
/*
Objektiv Weitwinkel: Brennweite 10 - 28
        Objektiv normal: Brennweite 50
        Objektiv Tele: 70 - 200
        */
public class Objektiv {
    private int brennweite;

    public Objektiv (int brennweite){
        this.brennweite = brennweite;
    }
    public int getBrennweite(){
        return brennweite;
    }
    public String toString(){
        return("Das Objektiv hat eine Brennweite von " + brennweite + " mm.");
    }
}
