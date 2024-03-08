package florian.week_22_Carsimulation;

import java.text.NumberFormat;
import java.util.Locale;

public class Auto {
    public enum antriebsarten {
        Benzin,
        Diesel,
        Gas,
        Strom
    }

    String hersteller;
    String model;
    int leistung;
    double tankinhalt = 0;
    int tankvolumen;
    int kmStand;
    double literproKM;

    public Auto(String hersteller, String model, int leistung, double tankinhalt, int tankvolumen, double literproKM, int kmStand) {
        this.hersteller = hersteller;
        this.model = model;
        this.leistung = leistung;
        this.tankinhalt = tankinhalt;
        this.tankvolumen = tankvolumen;
        this.kmStand = kmStand;
        this.literproKM = literproKM;
    }

    public int drive(int zufahrendeStrecke) {

        while (zufahrendeStrecke >= 0 && this.tankinhalt >= 0) {
            zufahrendeStrecke--;
            kmStand++;
            this.tankinhalt -= this.literproKM;
        }
        if (this.tankinhalt <= 0) {
            tankinhalt += 20;
            System.out.println("Gefahrene Kilometer: " + this.kmStand);
        }
        return this.kmStand;
    }

    public double volltanken() {

        while (tankinhalt < tankvolumen) {
            tankinhalt++;
        }
        return tankinhalt;
    }


    public String toString() {

        return "Hersteller: " + this.hersteller +
                ", Model: " + this.model +
                ", Leistung: " + this.leistung +
                ", Tankinhalt: " + NumberFormat.getInstance(Locale.GERMAN).format(this.tankinhalt) + " Liter" +
                ", Tankvolumen: " + this.tankvolumen + " Liter" +
                ", Kilometerstand: " + this.kmStand;

    }

}
