package Matthias.week15_objects;

import java.text.NumberFormat;

public class Auto extends Object{
    // Attribute-> Eigenschaften der Instanz
    public String marke =   "Marke   -> unbekannt";
    public String modell =  "Model   -> unbekannt";
    public int baujahr   =  0;
    public int km_Stand  =  0;

    public int tankinhalt=0;
    private int tankvolumen = 80;

    @Override
    public String toString(){
        return
                "Marke:"+marke +" "+
                        "Modell:"           + modell   +" "+
                        "Baujahr:"          + baujahr  +" "+
                        "Kilometerstand: "  + NumberFormat.getInstance( ).format( km_Stand )+ "km "+
                        "Tankinhalt: "+ tankinhalt;


    }
    public void fahren(int drove_km){
        this.km_Stand=km_Stand+drove_km;
    }
    public int getKillometerstand() {
        return this.km_Stand;
    }

    public void volltanken(){
        int counter=0;
        while (this.tankinhalt<tankvolumen ){
            tankinhalt++;
            counter++;
        }
        System.out.println( "Es sind "+ counter+" l " +"getankt worden" );

    }

    public Auto( String Marke, String Modell, int Baujahr, int km_Stand,int tankvolumen)  {
        this.marke= Marke;
        this.modell = Modell;
        this.baujahr= Baujahr;
        this.km_Stand= km_Stand;
        this.tankvolumen=tankvolumen;
    }
}
