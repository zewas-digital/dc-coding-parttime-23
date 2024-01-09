package Matthias.week15_objects;

import java.text.NumberFormat;

public class Auto extends Object {
    // Attribute-> Eigenschaften der Instanz
    public String marke = "Marke   -> unbekannt";

    public String modell = "Model   -> unbekannt";

    public int baujahr = 0;
    public int km_Stand = 0;
    public int fahrzeug_stand=0;

    public double tankinhalt = 0;
    public int verbrauch_l_pro_km = 0; // 6l pro 100 km
    private int tankvolumen = 80;

    // Methode mit der Befugnisse zum Überschreiben (@Override), hier wird die Standard-Methode der Objekt Klasse (extended Object - on the Top) überschrieben und gibt eine individuelle Darstellung / Version
    // erzeugt leserliche Darstellung des Objekts Auto für Ausdruck/Ausgabe und übegibt einen String
    @Override
    public String toString() {
        return
                "Marke:" + marke + " " +
                        "Modell:"               + modell + " " +
                        "Baujahr:"              + baujahr + " " +
                        "Kilometerstand: "      + NumberFormat.getInstance( ).format( km_Stand ) + "km " +
                        "Tankinhalt: "          + String.format("%,.2f",tankinhalt )+ "l" +
                        "Verbrauch: " + verbrauch_l_pro_km +" l pro 100 km ";

    }

    public void fahren( int zuFahrendeKilometer ) {
            System.out.println("ich möchte "+ zuFahrendeKilometer +" km fahren.");

            boolean warned = false;
            // solange bis
            // 1 zuFahrendeKilometer gefahren sind
            // 2 tankinhalt nicht leer
            while (zuFahrendeKilometer > 0 && this.tankinhalt >= this.getlprokm()) {
                // fahre 1 kilometer ----------
                // --> zu fahrende kilometer--
                zuFahrendeKilometer--;
                this.km_Stand++;
                // --> tankinhalt reduziert sich um verbrauch pro km
                this.tankinhalt -= this.getlprokm();

                if (this.tankinhalt <= 5 && !warned) {
                    System.out.println("Es sind nur mehr 5 Liter im Tank. Restliche Kilometer: " + zuFahrendeKilometer);
                    warned = true;
                }
            }
            if (zuFahrendeKilometer > 0) {
                System.out.println("Der Tank ist leer. Restliche Kilometer: " + zuFahrendeKilometer);
            }

            // kontrollausgabe:
            System.out.println("tankinhalt: "+ String.format("%,.2f",this.tankinhalt)+", restliche KM: "+ zuFahrendeKilometer);
        }
        // solang ebis
        // 1 zuFahrende Kolometer gefahren sind
        // 2 tankinhalt nicht leer
/*
        double verbrauchlprokm=(this.verbrauch_l_pro_km/100); // Berechung Verbrauch l pro km
        double AbsolutTankVolumenInL=this.tankinhalt+(verbrauchlprokm*zuFahrendeKilometer); // Absolutverbrauch in l
        int differenzdesTankVolumenInL=AbsolutTankVolumenInL-

        while ( zuFahrendeKilometer > 0 && this.tankinhalt>0){
            zuFahrendeKilometer--;
            if ( this.tankinhalt == 5) {
                System.out.println( "Achtung: Es sind nur noch " + this.tankinhalt + " l im Tank!" );
            }
        }
        System.out.println( "Kann nicht mehr gefahren werden" );

        int gefahren=  // Berechung der gefahrenen km die gefahren werden

        return gefahren;
        */

    public int getKillometerstand() {
        return this.km_Stand;
    }
    public double getlprokm(){
            return ((double) this.verbrauch_l_pro_km /100);
        }

    public void volltanken(){
        int tankdif=0;
        while (this.tankinhalt<tankvolumen -1){
            tankinhalt++;
            tankdif++;
        }
        System.out.println( "Es sind "+ tankdif+" l " +"getankt worden" );

    }

    public Auto( String Marke, String Modell, int Baujahr, int km_Stand,int tankvolumen,int verbrauch_l_pro_km)  {
        this.marke= Marke;
        this.modell = Modell;
        this.baujahr= Baujahr;
        this.km_Stand= km_Stand;
        this.tankvolumen=tankvolumen;
        this.verbrauch_l_pro_km=verbrauch_l_pro_km;
    }
}
