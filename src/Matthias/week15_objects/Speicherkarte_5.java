package Matthias.week15_objects;

public class Speicherkarte_5 {
    public int megabyte;     // Angabe in megabyte
    public Speicherkarte_5(int megabyte){
        this.megabyte=megabyte;
    }
    @Override
    public String toString() {
        return "Die Brennweite ist: "+megabyte;
    }
}
