package Simonsway.Week18;

public class Futterdaten {

    private String bezeichung;
    private float preis;
    public enum Einheit {
        KG,
        STK
    }
    Einheit einheit;

    public Futterdaten (String bezeichung, Einheit einheit, float preis){
        this.preis = preis;
        this.einheit = einheit;
        this.bezeichung = bezeichung;
    }
}
