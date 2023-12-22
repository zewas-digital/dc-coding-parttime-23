package Matthias.week15_objects;

import java.text.NumberFormat;

public class Auto extends Object {
    // Attribute-> Eigenschaften der Instanz
    public String marke = "Marke   -> unbekannt";

    public String modell = "Model   -> unbekannt";

    public int baujahr = 0;
    public int km_Stand = 0;

    public int fahrzeug_stand=0;

    public int tankinhalt = 0;
    public int verbrauch_l_pro_km = 0; //100 km pro 6 l
    private int tankvolumen = 80;

    @Override
    public String toString() {
        return
                "Marke:" + marke + " " +
                        "Modell:"               + modell + " " +
                        "Baujahr:"              + baujahr + " " +
                        "Kilometerstand: "      + NumberFormat.getInstance( ).format( km_Stand ) + "km " +
                        "Tankinhalt: "          + tankinhalt + "l" +
                        "Verbrauch: " + verbrauch_l_pro_km +" l pro 100 km ";


    }

    public int fahren( int zuFahrendeKilometer ) {
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
        return zuFahrendeKilometer;
    }
    public int getKillometerstand() {
        return this.km_Stand;
    }

    public void volltanken(){
        int tankdif=0;
        while (this.tankinhalt<tankvolumen ){
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
