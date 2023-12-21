package Simonsway.Week15;

import java.text.NumberFormat;
import java.util.Locale;

public class Auto {
    public String marke = "";

    public String model = "";
    public int bauJahr;
    public int kmStand;
    public int gefahren;
    public int tankVolumen;
    public int tankInhalt;
    public double verbrauchProKM;
    private double verbrauchTotal;
    private double kilometerBisZiel;


    public Auto(String marke, String model, int bauJahr, int kmStand, int tankVolumen, int tankInhalt, double verbrauchProKM, int gefahren, int kilometerBisZiel) {

        if (bauJahr < 1885) {
            throw new IllegalArgumentException("Das Baujahr soll mit vier Ziffern angegeben werden");
        }
        this.marke = marke;
        this.model = model;
        this.bauJahr = bauJahr;
        this.kmStand = kmStand;
        this.tankVolumen = tankVolumen;
        this.tankInhalt = tankInhalt;
        this.gefahren = gefahren;
        this.verbrauchProKM = verbrauchProKM;
        this.kilometerBisZiel = kilometerBisZiel;
    }

    public String toString() {
        return "--------------------------" +
                "\n" + "Marke " + marke + "\n"
                + "Model " + model + "\n"
                + "Baujahr " + bauJahr + "\n"
                + volltanken() + "\n"
                + fahren() + "\n"
                + verbrauch() + "\n"
                + warnungen() + "\n"
                + "--------------------------";
    }

    public String volltanken() {
        tankVolumen = tankVolumen - tankInhalt;
        return "Sie haben " + tankVolumen + " Liter getankt";
    }

    public String fahren() {
        kmStand = kmStand + gefahren;
        return "Kilomenterstand " + NumberFormat.getInstance(Locale.GERMAN).format(kmStand);
    }

    public String verbrauch() {
        double temp;
        temp = gefahren * verbrauchProKM;
        verbrauchTotal = tankInhalt - temp;
        kilometerBisZiel = kilometerBisZiel - gefahren;
        return "Sie sind " + gefahren + " KM" + " gefahren und haben " + temp + " Liter verbraucht " + "Sie haben immer noch " + verbrauchTotal + " Liter im Tank." + " Bis zum Endgültigen Ziel sind noch " + kilometerBisZiel + " KM nicht gefahren";
    }

    public String warnungen() {
        if (verbrauchTotal == 5) {
            return "Es sind nur noch 5 Liter im Tank bitte tanken gehen";
        } else if (verbrauchTotal <= 5) {
            return "Weniger als 5 Liter bitte sofort tanken gehen";
        }return "Tank Stand im grünen Bereich";
    }
}
