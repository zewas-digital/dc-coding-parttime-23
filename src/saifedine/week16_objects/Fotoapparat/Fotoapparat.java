package saifedine.week16_objects.Fotoapparat;


public class Fotoapparat {

    private String hersteller;
    private String model;
    private float megapixel;
    //private int brennweite;

    Objektiv objektiv;

    Speicherkarte speicherkarte;

    public int fotoCounter;
    //private float restSpeicher;
    private float belegterSpeicher;

    /*
    public Fotoapparat(String hersteller, String model, float megapixel, int brennweite){

        this.hersteller = hersteller;
        this.model = model;
        this.megapixel = megapixel;
        this.brennweite = brennweite;
    }
     */

    public void setHersteller(String hersteller){
        this.hersteller = hersteller;
    }
    public String getHersteller(){return this.hersteller;}

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){return this.model;}

    public void setMegapixel(float megapixel){
        this.megapixel = megapixel;
    }
    public float getMegapixel(){return this.megapixel;}

    /*
    public void setBrennweite(int brennweite){
        this.brennweite = brennweite;
    }
    public int getBrennweite(){return this.brennweite;}
     */

    public String toString(){

        return "Fotoapparat { " + super.toString() +
                "\n Hersteller: " + hersteller +
                "\n Model: " + model +
                "\n Megapixel: " + megapixel +
                //"\n Brennweite: " + brennweite +
                "\n}";
    }

    public void takePhoto(){
        System.out.println("Click, ein Foto wurde erstellt");
        this.fotoCounter++;
        System.out.println("Sie haben " + this.fotoCounter + " Fotos gemacht" + "\n");

    }

    public void verbindeObjektiv(Objektiv objektiv){
        this.objektiv = objektiv;
    }

    public void verbindeSpeicherkarte(Speicherkarte speicherkarte){
        this.speicherkarte = speicherkarte;
    }

    /*
    public void belegterSpeicherKapa (){

        // Berechnung der verbrauchten Speicherkapazität durch gemachten Fotos
        this.belegterSpeicher = (float) (this.fotoCounter * (this.megapixel * 0.3));

        System.out.println("Belegte Speicherkapazität ist: " + this.belegterSpeicher + " MB \n");
    }
     */


    public void gemachteFotosMitRestspeicher(){
        //System.out.println("\n" + "Sie haben " + this.fotoCounter + " Fotos gemacht");
        //System.out.println("Der Speicher ist: " + this.speicherkarte.speicher);
        //System.out.println("Megapixel: " + this.megapixel);

        //this.restSpeicher = (float) (this.speicherkarte.speicher - (this.fotoCounter * (this.megapixel * 0.3)));

        //System.out.println("Der Restspeicher beträgt: " + this.restSpeicher);

        System.out.println("Die Speicherkapazität des Speichers beträgt: " + this.speicherkarte.speicher + " MB \n");

        //this.belegterSpeicherKapa();

        this.speicherkarte.getBelegterSpeicher();

        this.speicherkarte.setRestSpeicher();
    }
}
