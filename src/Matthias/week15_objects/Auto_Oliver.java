package Matthias.week15_objects;

import java.text.NumberFormat;
import java.util.Locale;

public class Auto_Oliver extends Object {
    String marke;
    String modell;
    int baujahr;
    private int kilometerstand;
    String kilometerstandFormatiert;

    public int tankinhalt;
    private int tankvolumen = 80;

    public Auto_Oliver( String marke, String modell, int baujahr, int kilometerstand, int tankvolumen) {

        if (baujahr < 1885) {
            throw new IllegalArgumentException("Das Baujahr soll in mit vier Ziffern angegeben werden.");
        }
        if (tankvolumen > this.tankvolumen) {
            throw new IllegalArgumentException("Ein größeres Tankvolumen als "+ this.tankvolumen +" ist nicht möglich.");
        }
        
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kilometerstand = kilometerstand;
        this.kilometerstandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kilometerstand) +" km";
        this.tankvolumen = tankvolumen;

        System.out.println("Auto erzeugt mit Kilometerstand "+ kilometerstandFormatiert);
    }

    public int getTankvolumen() {
        return this.tankvolumen;
    }

    public void setTankinhalt(int neuerTankinhalt) {
        if (neuerTankinhalt <= this.tankvolumen && neuerTankinhalt >= 0)
            this.tankinhalt = neuerTankinhalt;
        else
            throw new IllegalArgumentException("Das ist nicht möglich.");
    }

    public String getFormatierterTankinhalt() {
        return this.tankinhalt +" Liter";
    }

    public void setKilometerstand(int neuerKilometerstand) {
        this.kilometerstand = neuerKilometerstand;
        this.kilometerstandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(neuerKilometerstand) +" km";
    }

    public int getKilometerstand() {
        return this.kilometerstand;
    }

    @Override
    public String toString() {
        return "Auto { " + super.toString() + // super entspricht der erweiterten Object-Klasse
                "\n marke = " + marke +
                ",\n modell = " + modell +
                ",\n baujahr = " + baujahr +
                ",\n kilometerstand = " + NumberFormat.getInstance(Locale.GERMAN).format(kilometerstand) +" km"
                + "\n}";
    }
}
