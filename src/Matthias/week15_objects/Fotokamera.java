package Matthias.week15_objects;

public class Fotokamera extends Object{

    //Festlegen der Attribute des Objektes
    private String hersteller;  // Herstellername der Kamera
    private String Modell;      // Modelname der Kamera
    private int brennweite;     // Angabe in mm bei Fotoobjektiven
    private int aufloesung;     // Auflösung der Kamera in MegaPixel

    //Definieren den Konstrukter -> dem Konstruktor werden die Attribute übergeben, die Inizial wichtig sind
    // diese beschreiben die Objekt instanz -> wird somit unterscheidbar
    // Es können verschiedene Konstruktoren, implementiert werden
    // im Konstruktor wird nur das Implementiert was für das Objekt WIRKLICH & INIZIAL RELEVANT IST!!!

    public Fotokamera( String Hersteller, String Modell, int brennweite, int aufloesung){

        this.hersteller =Hersteller;
        this.Modell=Modell;
        this.brennweite=brennweite;
        this.aufloesung=aufloesung;
    }
    public void takePhoto(boolean Foto){
        if ( Foto ) {
            System.out.println( " ---------------------------------------------------------------\n" +
                    "|                                                           |\n" +
                    "|                                                           |\n" +
                    "|                                                           |\n" +
                    "|                                                           |\n" +
                    "|                                                           |\n" +
                    "|                                                           |\n" +
                    "|                                                           |\n" +
                    "|                                                           |\n" +
                    "|                                                           |\n" +
                    "|                                                           |\n" +
                    "|                                                           |\n" +
                    "|                                                           |\n" +
                    " ---------------------------------------------------------------\n" );
        }
    }

    //Getter und Setter der Instanzen

    //Getter 1: Holt sich die Brennweite
    public int getBrennweite(){
        return this.brennweite;
    }
    //Getter 2: Holt sich die Aufloesung
    public int getAufloesung(){
        return this.aufloesung;
    }

    //Getter 3: Holt sich das Modell
    public String getModell(){
        return this.Modell;
    }

    //Getter 4: HOlt sich den Hersteller
    public String getHersteller(){
        return this.hersteller;
    }

    //Setter 1: Setzt den Wert der Brennweite
    public void setHersteller(String hersteller){
       this.hersteller=hersteller;
    }

    //Setter 2: Setzt den Wert des Herstellers
    public void setBrennweite(int brennweite){
        this.brennweite=brennweite;
    }

    //Setter 3: Setzt den Wert des Modelles
    public void setModell (String Modell){
        this.Modell=Modell;
    }

    //Setter 4: setzt den Wert der Auflösung
    public void setAufloesung(int aufloesung){
        this.aufloesung=aufloesung;
    }


    //to String ist eine Rückgabe die für die Instanz einen unterscheidbaren Rückgabewert liefert
    @Override
    public String toString() {
        return "Foto { " + super.toString() + // super entspricht der erweiterten Object-Klasse
                "\n Hersteller = " + hersteller +
                ",\n Model = " + Modell +
                ",\n Brennweite = " + brennweite + " in mm"+
                ",\n Auflösung = " + aufloesung +" in MegaPixel"+
                "\n}";
    }

}
