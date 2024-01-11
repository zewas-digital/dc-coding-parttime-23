package michael_k.week15;

import java.text.NumberFormat;
import java.util.Locale;

public class Auto extends Object {

    public String marke;
    public String model;
    public int baujahr;
    public double kmStand;
    public int tankVolumen = 80;
    public double tankInhalt = 10;
    public double verbrauchAuf100 = 5;

    public Auto (String marke, String model, int baujahr, double kmStand){

        this.marke = marke;
        this.model = model;
        this.baujahr = baujahr;
        this.kmStand = kmStand;

    }

    public String toSrting (){
        return
        "Marke: "+marke +
        "\nModel: "+model +
        "\nBaujahr: "+baujahr +
        "\nkm-Stand: "+ NumberFormat.getInstance ( Locale.GERMAN).format ( kmStand )+
        "\n";

    }

    public double fahren (int kilometer){

        double kilometerNichtGefahren=0;
        double reichweite = this.tankInhalt / verbrauchAuf100 *100;

        if(kilometer < reichweite) {
            this.kmStand = this.kmStand + kilometer;
            this.tankInhalt = this.tankInhalt - ( verbrauchAuf100 * kilometer / 100 );

        }else{
            kilometerNichtGefahren = kilometer-reichweite;
            this.tankInhalt = 0;
            this.kmStand = this.kmStand + ( kilometer-kilometerNichtGefahren );
            System.out.println ( "Tank ist leer" );
        }


        if(tankInhalt < 5 && tankInhalt >0 ){
            System.out.println ( "Der Tankinhalt beträgt "+ this.tankInhalt+"L");
        }

        return kilometerNichtGefahren;
    }

    public double volltanken(){

        double getankt = this.tankVolumen - this.tankInhalt;
        this.tankInhalt = this.tankVolumen;

        return getankt;
    }


}
