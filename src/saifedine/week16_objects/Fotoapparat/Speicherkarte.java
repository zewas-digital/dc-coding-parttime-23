package saifedine.week16_objects.Fotoapparat;

public class Speicherkarte {

    public float speicher; // ganzer Speicher
    public float restSpeicher; // noch verfügbarer Speicher
    private float belegterSpeicher;

    public Fotoapparat fotoapparat;

    public Speicherkarte(float speicher, Fotoapparat f) {
        this.speicher = speicher;
        this.restSpeicher = this.speicher;
        this.fotoapparat = f;
    }

    public void setBelegterSpeicher(){

        // Berechnung der verbrauchten Speicherkapazität durch gemachten Fotos
        this.belegterSpeicher = (float) (this.fotoapparat.fotoCounter * (this.fotoapparat.getMegapixel() * 0.3));

        //System.out.println("Belegte Speicherkapazität ist: " + this.belegterSpeicher + " MB \n");
    }

    public void getBelegterSpeicher(){

        this.setBelegterSpeicher();
        System.out.println("Belegte Speicherkapazität ist: " + this.belegterSpeicher + " MB \n");
    }


    public void setRestSpeicher() {

        this.restSpeicher = this.speicher - this.belegterSpeicher;

        System.out.println("Der Restspeicher beträgt: " + this.restSpeicher + " MB \n");
    }
}