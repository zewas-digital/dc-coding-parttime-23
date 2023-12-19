package Matthias.week15_objects;

import java.text.NumberFormat;

public class Auto extends Object{
    // Attribute-> Eigenschaften der Instanz
    public String marke =   "Marke   -> unbekannt";
    public String modell =  "Model   -> unbekannt";
    public int baujahr   =  0;
    public int km_Stand  =  0;
    @Override
    public String toString(){
        return
                "Marke:"+marke +" "+
                        "Modell:"           + modell   +" "+
                        "Baujahr:"          + baujahr  +" "+
                        "Kilometerstand: "  + NumberFormat.getInstance( ).format( km_Stand )+ "km";

    }
    public Auto( String Marke, String Modell, int Baujahr, int km_Stand)  {
        this.marke= Marke;
        this.modell = Modell;
        this.baujahr= Baujahr;
        this.km_Stand= km_Stand;
    }
}
