package Matthias.week15_objects;

import java.text.NumberFormat;

public class Auto extends Object {
    // Attribute-> Eigenschaften der Instanz
    public String marke = "Marke   -> unbekannt";

    public String modell = "Model   -> unbekannt";

    public int bauJahr = 0;
    public int kmStand = 0;
    public int fahrzeugStand =0;
    public double tankInhalt = 0;
    public int verbrauchLProKm = 0; // 6l pro 100 km
    private int tankVolumen = 80;

    public Auto( String marke, String modell, int bauJahr, int kmStand, int tankVolumen, int verbrauchLProKm )  {
        this.marke= marke;
        this.modell = modell;
        this.bauJahr = bauJahr;
        this.kmStand = kmStand;
        this.tankVolumen = tankVolumen;
        this.verbrauchLProKm = verbrauchLProKm;
    }

    // Methode mit der Befugnisse zum Überschreiben (@Override), hier wird die Standard-Methode der Objekt Klasse (extended Object - on the Top) überschrieben und gibt eine individuelle Darstellung / Version
    // erzeugt leserliche Darstellung des Objekts Auto für Ausdruck/Ausgabe und übegibt einen String
    @Override
    public String toString() {
        return
                "Marke:" + marke + " " +
                        "Modell:"               + modell + " " +
                        "Baujahr:"              + bauJahr + " " +
                        "Kilometerstand: "      + NumberFormat.getInstance( ).format( kmStand ) + "km " +
                        "Tankinhalt: "          + String.format("%,.2f", tankInhalt )+ "l" +
                        "Verbrauch: " + verbrauchLProKm +" l pro 100 km ";

    }

    public void fahren( int zuFahrendeKilometer ) {
            System.out.println("ich möchte "+ zuFahrendeKilometer +" km fahren.");

            boolean warned = false;
            // solange bis
            // 1 zuFahrendeKilometer gefahren sind
            // 2 tankinhalt nicht leer
            while (zuFahrendeKilometer > 0 && this.tankInhalt >= this.getLProKm()) {
                // fahre 1 kilometer ----------
                // --> zu fahrende kilometer--
                zuFahrendeKilometer--;
                this.kmStand++;
                // --> tankinhalt reduziert sich um verbrauch pro km
                this.tankInhalt -= this.getLProKm();

                if (this.tankInhalt <= 5 && !warned) {
                    System.out.println("Es sind nur mehr 5 Liter im Tank. Restliche Kilometer: " + zuFahrendeKilometer);
                    warned = true;
                }
            }
            if (zuFahrendeKilometer > 0) {
                System.out.println("Der Tank ist leer. Restliche Kilometer: " + zuFahrendeKilometer);
            }

            // kontrollausgabe:
            System.out.println("tankinhalt: "+ String.format("%,.2f",this.tankInhalt )+", restliche KM: "+ zuFahrendeKilometer);
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
        return this.kmStand;
    }
    public double getLProKm(){
            return ((double) this.verbrauchLProKm /100);
        }

    public void vollTanken(){
        int tankdif=0;
        while (this.tankInhalt < tankVolumen -1){
            tankInhalt++;
            tankdif++;
        }
        System.out.println( "Es sind "+ tankdif+" l " +"getankt worden" );

    }


}
