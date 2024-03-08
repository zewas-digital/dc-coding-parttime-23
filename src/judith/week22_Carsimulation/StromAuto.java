package judith.week22_Carsimulation;

public class StromAuto extends Auto{

    public StromAuto(String hersteller, String modell, int baujahr, int kw, int gewicht, int kilometerstand, int tankVolumen, double verbrauchProKm, int tankinhalt) {
        super(hersteller, modell, baujahr, kw, gewicht, kilometerstand, Antriebsart.STROM, tankVolumen, verbrauchProKm, tankinhalt);
    }


}
