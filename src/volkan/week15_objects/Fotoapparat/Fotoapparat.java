package volkan.week15_objects.Fotoapparat;

public class Fotoapparat {
    private  String hersteller;
    private String modell;
    private int aufloesung;
    private int brennweite;
    private Objektiv objektiv;
    private Speicherkarte speicherkarte;

    //Konstruktoren:

    public Fotoapparat() {
        this.hersteller = "unbekannt";
        this.modell = "unbekannt";
    }

    public Fotoapparat(String hersteller, String modell, int aufloesung, int brennweite){
        this.hersteller = hersteller;
        this.modell = modell;
        this.aufloesung = aufloesung;
        this.brennweite = brennweite;
        this.speicherkarte = speicherkarte;
    }

}
