package Alpi.week16_objekts;


/*
Mit zumindest folgenden Attributen (es dürfen auch gerne mehr sein), Brennweite min/max (in mm, z.B. 24 <= f <= 70, Modell, Hersteller und Megapixel (zw. 12 u 40).
Sony Alpha, Sony Vlog, Kodak Pixpro
Erstelle für die Attribute getter und setter
Erstelle weiters die Methode takePhoto(), die ein Foto schießt (Mach einfach eine nette Ausgabe)
Überschreibe die toString() Methode und gib die relevanten Daten als String zurück
Erstelle verschiedene Instanzen der Fotoapparat Klasse und Teste diese ausgiebig.
*/
public class Fotoapparat {
    private String hersteller;
    private String modell;
    private int aufloesung; //in Megapixel, z.B. zwischen 12 u. 40
    private int brennweite; //in mm, z.B. zwischen 24 u. 70
    private Objektiv objektiv;
    private Speicherkarte speicherkarte;

    //Konstruktoren:
    public Fotoapparat(){
        this.hersteller = "unbekannt";
        this.modell = "unbekannt";
    }
    public Fotoapparat(String hersteller, String modell, int aufloesung, int brennweite) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.aufloesung = aufloesung;
        this.brennweite = brennweite;
    }
    public Fotoapparat(String hersteller, String modell, int aufloesung, objektiv, Speicherkarte speicherkarte){
        this.hersteller = hersteller;
        this.modell = modell;
        this.aufloesung = aufloesung;
        this.brennweite = objektiv.getBrennweite();
        this.speicherkarte = speicherkarte;
    }

    public Fotoapparat(String Sony, String xz1, int aufloesung, Objektiv normalesObjektiv, Speicherkarte SD1) {
    }

    public void takePhoto() {
        if (this.modell.equals("unbekannt"))
            System.out.println("Gerät nicht vernünftig definiert - kein Foto möglich! ");
        else {
            System.out.println("*".repeat(15));
            System.out.println("*.............*");
            System.out.println("*".repeat(15));
        }
    }
    public String toString(){
        if (hersteller.equals("unbekannt") || modell.equals("unbekannt"))
            return (super.toString() + ":\nNicht genügend Daten vorhanden!");
        else {
            String info = ":\nFotoapparat Marke " + hersteller + ", Modell " + modell + ", " +
                    "\nAuflösung: " + aufloesung + " Megapixel, Brennweite: " + brennweite + " mm";
            if (speicherkarte != null) info = info + "\nSpeicherkarte vorhanden, Größe " + speicherkarte.getSize();

            return (super.toString() + info);
        }

    }

    public Objektiv getObjektiv() {
        return objektiv;
    }

    public void setObjektiv(Objektiv objektiv) {
        this.objektiv = objektiv;
        this.brennweite = objektiv.getBrennweite();
    }
    public String getHersteller(){
        return this.hersteller;
    }

    public String getModell() {
        return modell;
    }

    public int getAufloesung() {
        return aufloesung;
    }

    public int getBrennweite() {
        return brennweite;
    }
}

