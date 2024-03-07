package florian.week_15_objects;

import java.text.NumberFormat;
import java.util.Locale;

public class Auto extends Object {

    public String marke;
    public String modell;
    public int baujahr;
    public int kmStand;
    public int tankvolumen = 80;
    public double literproKm;
    public int tankinhalt;

    public Auto(String Marke, String Modell, int Baujahr, int kmStand, int tankvolumen, int tankinhalt, double literproKm) {
        this.marke = Marke;
        this.modell = Modell;
        this.baujahr = Baujahr;
        this.kmStand = kmStand;
        this.tankvolumen = tankvolumen;
        this.tankinhalt = tankinhalt;
        this.literproKm = literproKm;
    }

    public int fahren(int zufahrendeStrecke) {

        this.kmStand += zufahrendeStrecke;

        return this.kmStand;
    }

    public int volltanken() {

        while (tankinhalt < tankvolumen) {
            tankinhalt++;
        }

        return this.tankinhalt;
    }

    public int verbrauchproKm() {

        while (kmStand * (int) literproKm - tankinhalt == 0) {
            if (tankinhalt == 5) {
                System.out.println("Bitte Tanken, es sind nur noch 5 Liter im Tank");
            } else if (tankinhalt == 0) {
                System.out.println("Tank ist leer");
            }
        }


        return tankinhalt;
    }


    public String toString() {

        return "Marke: " + marke +
                ", Modell: " + modell +
                ", Baujahr: " + baujahr +
                ", Km-Stand: " + NumberFormat.getInstance(Locale.GERMAN).format(kmStand) +
                ", Tankvolumen: " + tankvolumen +
                ", Tankinhalt: " + tankinhalt +
                ", literproKm: " + literproKm;
    }


}
