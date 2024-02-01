package Simonsway.Week18;

public class Tiere {
    private String name;
    private String gattung;
    private float bedarf;
    Futterlager.futterArten futter;


    // Konstruktor
    public Tiere(String name, String gattung, Futterlager.futterArten futter, float bedarf){
        this.name = name;
        this.gattung = gattung;
        this.futter = futter;
        this.bedarf = bedarf;
    }

    // To String
    public String toString(){
        return this.name + ", " + this.gattung;
    }


    // Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setGattung(String gattung) {
        this.gattung = gattung;
    }
    public void setBedarf(float bedarf) {
        this.bedarf = bedarf;
    }


    // Getter
    public String getName() {
        return this.name;
    }
    public String getGattung() {
        return gattung;
    }
    public float getBedarf() {
        return this.bedarf;
    }
    public Futterlager.futterArten getFutter() {
        return futter;
    }
}
