package judith.week22_Carsimulation;

public class DieselAuto extends Auto{

    public DieselAuto(String hersteller, String modell, int baujahr, int kw, int gewicht, int kilometerstand, int tankVolumen, double verbrauchProKm, int tankinhalt) {
        super(hersteller, modell, baujahr, kw, gewicht, kilometerstand, Antriebsart.DIESEL, tankVolumen, verbrauchProKm, tankinhalt);
    }

   public String toString(){
        return getHersteller() + " " + getModell();
   }
}
