package michael_k.week22;

public class selbstReparierendesAuto extends Car{
    public selbstReparierendesAuto(String hersteller, String modell, int gewicht, double tankVolumen, Antriebsart antriebsart, int leistung, double verbrauchAuf100) {
        super ( hersteller, modell, gewicht, tankVolumen, antriebsart, leistung, verbrauchAuf100, 1 , true);
    }
}
