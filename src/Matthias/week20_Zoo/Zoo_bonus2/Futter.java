package Matthias.week20_Zoo.Zoo_bonus2;

public class Futter {
    public enum Futtersorten{
        FLEISCH,
        FISCH,
        HEU
    }
    private  String futterArtikelname;

    private String einheit;

    private double einheitpreis;

    public Futter(String futterArtikelname, String einheit, double einheitspreis){
        this.futterArtikelname =futterArtikelname;
        this.einheit=einheit;
        this.einheitpreis=einheitspreis;
    }

    public String getFutterArtikelname() {
        return futterArtikelname;
    }

    public String getEinheit() {
        return einheit;
    }

    public double getEinheitpreis() {
        return einheitpreis;
    }
}
