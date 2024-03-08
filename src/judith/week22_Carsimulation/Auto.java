package judith.week22_Carsimulation;


/*Erstelle eine Car Klasse.

Diese enthält alle gängigen Attribute die für ein Auto benötigt werden.
Zumindest sollte die Klasse folgende Attribute enthalten:

Hersteller
        Modell
kW (Leistung)
Tankinhalt
Antriebsart (erstelle dafür eine Enumeration Benzin, Diesel, Gas, Strom)
Gewicht

Überlege welche Attribute du im Konstruktor als Parameter erhalten willst.
Ohne welche kann eine Auto Instanz nicht existieren?


 */

public abstract class Auto {

    private String hersteller;
    private String modell;
    private int baujahr;
    private int kw;
    private int gewicht;
    private int kilometerstand;
    private Antriebsart antriebsart;
    private int tankVolumen;
    private double verbrauchProHKm;
    public int tankinhalt;


    public Auto() {

    }

    public Auto(String hersteller, String modell, int baujahr, int kw, int gewicht, int kilometerstand, Antriebsart antriebsart, int tankVolumen, double verbrauchProKm, int tankinhalt) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kw = kw;
        this.gewicht = gewicht;
        this.kilometerstand = kilometerstand;
        this.antriebsart = antriebsart;
        this.tankVolumen = tankVolumen;
        this.verbrauchProHKm = verbrauchProKm;
        this.tankinhalt = tankinhalt;
    }


    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public int getTankVolumen() {
        return tankVolumen;
    }

    public void setTankVolumen(int tankVolumen) {
        this.tankVolumen = tankVolumen;
    }

    public double getVerbrauchProHKm() {
        return verbrauchProHKm;
    }

    public void setVerbrauchProHKm(double verbrauchProHKm) {
        this.verbrauchProHKm = verbrauchProHKm;
    }

    public int getTankinhalt() {
        return tankinhalt;
    }

    public void setTankinhalt(int tankinhalt) {
        this.tankinhalt = tankinhalt;
    }

    public void drive(int zuFahrendeKilometer) {


        while (zuFahrendeKilometer > 0 && this.tankinhalt >= this.verbrauchProHKm) {
            this.kilometerstand++;
            zuFahrendeKilometer--;
            this.tankinhalt -= this.verbrauchProHKm;

        }




    }


}
