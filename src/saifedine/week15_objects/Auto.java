package saifedine.week15_objects;

import java.text.NumberFormat;
import java.util.Locale;

public class Auto extends Object {

    // Attribute
    public String marke = "Marke -> unbekannt";
    public String modell = "Model -> unbekannt";;
    public int baujahr;
    private int kmStand;
    String kilometerstandFormatiert;


    private int tankvolumen = 80;
    public int tankinhalt;
    public int getankteMenge;

    public double verbrauch;

//        Double[] fahrOutput = {(double) this.gefahreneKm, this.tankinhaltverbrauch};
//        return fahrOutput;

    //public int gefahreneKm = (int) Double fahrOutput[0];
    //public double tankinhaltverbrauch = fahrOutput[1];



    public Auto() {
    }

    public Auto(String marke, String modell, int baujahr, int kmStand, int tankvolumen, int tankinhalt, double verbrauch) {

        if (baujahr < 1885) {
            throw new IllegalArgumentException("Das Baujahr ist ungültig, bitte geben Sie es mit vier Ziffern ein");
        }

        if (tankvolumen > this.tankvolumen) {
            throw new IllegalArgumentException("Ein größeres Tankvolumen als " + this.tankvolumen + " ist nicht möglich.");
        }

        // Objekt_1_Auto
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmStand = kmStand;
        this.kilometerstandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " km";
        // Objekt_2_Autofahren
        this.tankvolumen = tankvolumen;
        this.tankinhalt = tankinhalt;
        this.verbrauch = verbrauch;
    }

    @Override
    public String toString() {
        // Objekt_1_Auto
        return "Auto { " + super.toString() +
                "\n Marke: " + marke +
                "\n Modell: " + modell +
                "\n Baujahr: " + baujahr +
                "\n Km-Stand: " + NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " km" +
                // Objekt_2_Autofahren
                "\n Tankvolumen: " + tankvolumen +
                "\n Tankinhalt: " + tankinhalt +
                "\n}";
    }

    // Objekt_2_Autofahren
    // getKilometerstand(): Gibt den Kilometerstand des Autos zurück (Eigenschaft: private int kmStand)
    public int getKilometerstand() {
        return this.kmStand;
    }

    public double getVerbrauchProKm(){
        return verbrauch / 100;
    }

    // Objekt_2_Autofahren
    // fahren(): Setzt den neuen Kilometerstand des Autos (Eigenschaft: private int kmStand; & String kilometerstandFormatiert;)
    public Double[] fahren(int gefahreneKm) {
        this.kmStand = kmStand + gefahreneKm;
        this.kilometerstandFormatiert = NumberFormat.getInstance(Locale.GERMAN).format(kmStand) + " km";
        System.out.println("Das Auto ist " + gefahreneKm + " km gefahren.");
        //this.gefahreneKm = gefahreneKm;

        //tankinhaltverbrauch = (int) (this.tankinhalt - (this.gefahreneKm * this.getVerbrauchProKm()));
        //this.tankinhaltverbrauch = tankinhaltverbrauch;

        //Double[] fahrOutput = {(double) this.gefahreneKm, this.tankinhaltverbrauch};
        //return fahrOutput;
        return null;
    }

    // Objekt_2_Autofahren
    // vollTanke(): Füllt den Tankinhalt bis Tankvolumen auf (Eingenschaft: private int tankvolumen = 80; & public int tankinhalt; & public int getankteMenge;)
    public int vollTanken() {
        getankteMenge = 0;
        while (this.tankinhalt < this.tankvolumen){
            tankinhalt++;
            getankteMenge++;
        }
        System.out.println("Es sind " + getankteMenge + " l getankt worden" );
        return this.getankteMenge;
    }

    // Objekt_2_Autofahren
    // getTankinhalt(): Gibt den Tankinhalt des Autos zurück (Eigenschaft: public int tankinhalt; & public int getankteMenge;
    public double getTankinhalt(){
        return this.tankinhalt;
    }
}


