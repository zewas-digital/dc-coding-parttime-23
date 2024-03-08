package judith.week22_Carsimulation;

public class GasAuto extends Auto{

    public GasAuto(String hersteller, String modell, int baujahr, int kw, int gewicht, int kilometerstand, int tankVolumen, double verbrauchProKm, int tankinhalt) {
        super(hersteller, modell, baujahr, kw, gewicht, kilometerstand, Antriebsart.GAS, tankVolumen, verbrauchProKm, tankinhalt);
    }

}
