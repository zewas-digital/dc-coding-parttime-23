package Matthias.week18_Zoo.Zoo2;

public class Futter {
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
