package Alpi.week15_objects;

import java.text.NumberFormat;
import java.util.Locale;

public class Auto extends Object {
    String marke;
    String modell;
    int baujahr;
    private int kilometerstand;
    String kilometerstandFormatiert;

    public double tankinhalt;
    private int tankvolumen = 80;
    private double verbrauchProKm = 0.1;

    public Auto(String marke, String modell, int baujahr, int kilometerstand, int tankvolumen) {

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

    public String getKilometerstandFormatiert() {
        return NumberFormat.getInstance(Locale.GERMAN).format(kilometerstand) +" km";
    }

    public void fahren(int zuFahrendeKilometer) {
        System.out.println("ich möchte "+ zuFahrendeKilometer +" km fahren.");

        boolean warned = false;
        // solange bis
        // 1 zuFahrendeKilometer gefahren sind
        // 2 tankinhalt nicht leer
        while (zuFahrendeKilometer > 0 && this.tankinhalt >= this.verbrauchProKm) {
            // fahre 1 kilometer ----------
            // --> zu fahrende kilometer--
            zuFahrendeKilometer--;
            this.kilometerstand++;
            // --> tankinhalt reduziert sich um verbrauch pro km
            this.tankinhalt -= this.verbrauchProKm;

            if (this.tankinhalt <= 5 && !warned) {
                System.out.println("Es sind nur mehr 5 Liter im Tank. Restliche Kilometer: " + zuFahrendeKilometer);
                warned = true;
            }
        }
        if (zuFahrendeKilometer > 0) {
            System.out.println("Der Tank ist leer. Restliche Kilometer: " + zuFahrendeKilometer);
        }

        // kontrollausgabe:
        System.out.println("tankinhalt: "+ this.tankinhalt +", restliche KM: "+ zuFahrendeKilometer);
    }

    public void fahreBerechnet(int zuFahrendeKilometer) {
        System.out.println("ich möchte "+ zuFahrendeKilometer +" km fahren.");

        // wie weit kann ich fahren?
        double reichweite = this.tankinhalt / this.verbrauchProKm;
        // wieviel liter benötige ich, um die zuFahrendeKilometer zurück zu legen?
        double bedarf = zuFahrendeKilometer * this.verbrauchProKm;

        // warnmeldung:
        // bei welchen gefahrenen km soll die Warnmeldung kommen?
        double streckeFuer5Liter = 5 / this.verbrauchProKm;
        if ((reichweite - streckeFuer5Liter) <= zuFahrendeKilometer) {
            System.out.println("Es sind nur mehr 5 Liter im Tank.");
        }

        // geht sich das aus?
        if (this.tankinhalt < bedarf) {
            // geht sich nicht aus
            this.tankinhalt = 0;
            double rest = zuFahrendeKilometer - reichweite;

            System.out.println("Tank ist leer. Restliche zu fahrende Kilometer: "+ rest);
        } else {
            // es geht sich aus
            this.tankinhalt -= bedarf;
            this.kilometerstand += zuFahrendeKilometer;
            System.out.println("Ziel erreicht. Restlicher Tankinhalt: "+ this.tankinhalt +" l");
        }

        // kontrollausgabe:
        System.out.println("reichweite: "+ reichweite +" km, bedarf: "+ bedarf +" l, strecke 5 liter: "+ streckeFuer5Liter +" km");
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
