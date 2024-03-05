package claudia.week23;

import java.util.HashMap;

public class Schalter {
    private int lfdNr;
    private Bank bank;
    public boolean frei;
    private double geldmenge;
    private HashMap<Kunde, Double> statistik;



    public Schalter(Bank bank, int lfdNr){
        this.lfdNr = lfdNr;
        this.bank = bank;
        this.frei = true;
        this.geldmenge = 1000.0;
        this.statistik = new HashMap<Kunde, Double>();
    }

    public void pause(boolean lang){
        //lang: Dauer von drei Kunden, die Bank betreten und verlassen haben (nach jedem Kunden mit Wahrscheinlichkeit von 20%)
        //nicht lang: Dauer von einem Kunden (beim "Auffüllen")
        int anzahlDerKunden = this.bank.getAktuelleAnzahlDerKunden();

    }
}
