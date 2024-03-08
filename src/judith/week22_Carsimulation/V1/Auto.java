package judith.week22_Carsimulation.V1;

/*
Erstelle eine Car Klasse.
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
public class Auto {

    //Attribute
    private String hersteller;
    private String modell;
    private int baujahr;
    private int kw;
    private int tankVolumen;
    private double verbrauchProKm;
    private int gewicht;
    private int kilometerstand;
   private Antriebsart abtriebsart;

    public int tankinhalt;




    //Konstruktor
    public Auto(String hersteller, String modell, int baujahr, int kw, Antriebsart antriebsart){
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kw = kw;
    }

    public Auto(String hersteller, String modell, int baujahr, int kw, int tankVolumen, double verbrauchProKm, int gewicht, int kilometerstand, Antriebsart abtriebsart, int tankinhalt) {



        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kw = kw;
        this.tankVolumen = tankVolumen;
        this.verbrauchProKm = verbrauchProKm;
        this.gewicht = gewicht;
        this.kilometerstand = kilometerstand;
        this.abtriebsart = abtriebsart;
        this.tankinhalt = tankinhalt;
    }
//Methoden





}
