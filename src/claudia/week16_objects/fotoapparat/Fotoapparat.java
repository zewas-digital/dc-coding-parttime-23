package claudia.week16_objects.fotoapparat;

/*
Mit zumindest folgenden Attributen (es dürfen auch gerne mehr sein), Brennweite min/max (in mm, z.B. 24 <= f <= 70, Modell, Hersteller und Megapixel (zw. 12 u 40).
Sony Alpha, Sony Vlog, Kodak Pixpro
Erstelle für die Attribute getter und setter
Erstelle weiters die Methode takePhoto(), die ein Foto schießt (Mach einfach eine nette Ausgabe)
Überschreibe die toString() Methode und gib die relevanten Daten als String zurück
Erstelle verschiedene Instanzen der Fotoapparat Klasse und Teste diese ausgiebig.
*/
public class Fotoapparat {
    private final String hersteller;
    private String modell;
    private int aufloesung; //in Megapixel, z.B. zwischen 12 u. 40
    private int brennweite; //in mm, z.B. zwischen 24 u. 70
    private Objektiv objektiv;
    private Speicherkarte speicherkarte;
    private double speicherplatzProBild;

    //Konstruktoren:
    public Fotoapparat(){
        this.hersteller = "unbekannt";
        this.modell = "unbekannt";
    }
    //für Objekt_4_Fotoapparat
    public Fotoapparat(String hersteller, String modell, int aufloesung, int brennweite) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.aufloesung = aufloesung;
        this.brennweite = brennweite;
    }

    //für Objekt_5_FotoapparatBonus
    public Fotoapparat(String hersteller, String modell, int aufloesung){
        this.hersteller = hersteller;
        this.modell = modell;
        this.aufloesung = aufloesung;
        speicherplatzProBild = 0.3 * aufloesung * Math.pow(2, -10); //von MB in GB umgerechnet
    }

    public void takePhoto(int numberOfPhotos) {
        if (this.modell.equals("unbekannt"))
            System.out.println("Gerät nicht vernünftig definiert - kein Foto möglich! ");
        else if (speicherkarte == null)
            System.out.println("Keine Speicherkarte eingesetzt - kein Foto möglich! ");
        else if (objektiv == null)
            System.out.println("Kein Objektiv vorhanden - kein Foto möglich! ");
        else {
            for (int i = 0; i < numberOfPhotos; i++) {
                System.out.println("\nBenötigter Speicherplatz: " + speicherplatzProBild);
                if (speicherplatzProBild > speicherkarte.getMemoryFree())
                    System.out.println("Speicher voll - kein Foto möglich! " + speicherkarte.getMemoryFree());
                else {
                    System.out.println("*".repeat(15));
                    System.out.println("*.............*");
                    System.out.println("*......+......*");
                    System.out.println("*....+...+....*");
                    System.out.println("*..+++++++++..*");
                    System.out.println("*..+.......+..*");
                    System.out.println("*..+.......+..*");
                    System.out.println("*..+++++++++..*");
                    System.out.println("*.............*");
                    System.out.println("*".repeat(15));

                    speicherkarte.setNumberOfPhotosTaken(speicherkarte.getNumberOfPhotosTaken() + 1);
                    System.out.println("Bereits gespeicherte Fotos: " + speicherkarte.getNumberOfPhotosTaken());
                    speicherkarte.setMemoryFree(speicherkarte.getMemoryFree() - speicherplatzProBild);
                    System.out.println("Bereits belegter Speicherplatz: " + speicherkarte.getMemoryFree());
                }
            }
        }
    }
    public String toString(){
        if (hersteller.equals("unbekannt") || modell.equals("unbekannt"))
            return (super.toString() + ":\nNicht genügend Daten vorhanden!");
        else {
            String info = ":\nFotoapparat Marke " + hersteller + ", Modell " + modell + ", " +
                    "\nAuflösung: " + aufloesung + " Megapixel";
            if (speicherkarte != null) info = info + "\nSpeicherkarte vorhanden, Größe " + speicherkarte.getMemoryTotal() + " GB";

            return (super.toString() + info);
        }
    }

    public void setSpeicherkarte(Speicherkarte speicherkarte) {
        this.speicherkarte = speicherkarte;
    }

    public Objektiv getObjektiv() {
        return objektiv;
    }

    public void setObjektiv(Objektiv objektiv) {
        this.objektiv = objektiv;
        this.brennweite = objektiv.getBrennweite();
    }

    public void entferneObjektiv(){
        this.objektiv = null;
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

