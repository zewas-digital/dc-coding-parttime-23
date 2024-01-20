package Matthias.week18_Zoo.Zoo4_Personal;

public class Futter {
    public enum Futtersorten{
        Fleisch,
        Fisch,
        Heu
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
