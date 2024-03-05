package michael_k.week22;

public class ScheißAuto extends Car{
    public ScheißAuto(String hersteller, String modell, int gewicht, double tankVolumen, Antriebsart antriebsart, int leistung, double verbrauchAuf100) {
        super ( hersteller, modell, gewicht, tankVolumen, antriebsart, leistung, verbrauchAuf100, 0.5, false );
    }
}
