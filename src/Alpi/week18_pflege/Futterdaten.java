package Alpi.week18_pflege;

public class Futterdaten {
    public String bezeichnung, einheit;
    public float preis;

    public Futterdaten(String bezeichnung, String einheit, float preis) {
        this.preis = preis;
        this.einheit = einheit;
        this.bezeichnung = bezeichnung;
    }
}
