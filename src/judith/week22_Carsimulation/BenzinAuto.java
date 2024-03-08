package judith.week22_Carsimulation;

public class BenzinAuto extends Auto {


    public BenzinAuto(String hersteller, String modell, int baujahr, int kw, int gewicht, int kilometerstand, int tankVolumen, double verbrauchProKm, int tankinhalt) {
        super(hersteller, modell, baujahr, kw, gewicht, kilometerstand, Antriebsart.BENZIN, tankVolumen, verbrauchProKm, tankinhalt);
    }


    @Override
    public String toString() {
        return  getHersteller() + " " + getModell();
    }


}
