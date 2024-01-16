package saifedine.week16_weekend3_objects.week16.Fotoapparat;

public class Fotoapparat {
    private int brennweiteMin;
    private int brennweiteMax;
    private String model;
    private String hersteller;
    private int megapixel;

    // Konstruktor
    public Fotoapparat(int brennweiteMin, int brennweiteMax, String model, String hersteller, int megapixel) {
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
    }

    // Getter und Setter
    public int getBrennweiteMin() {
        return brennweiteMin;
    }

    public void setBrennweiteMin(int brennweiteMin) {
        this.brennweiteMin = brennweiteMin;
    }

    public int getBrennweiteMax() {
        return brennweiteMax;
    }

    public void setBrennweiteMax(int brennweiteMax) {
        this.brennweiteMax = brennweiteMax;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public int getMegapixel() {
        return megapixel;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    // Methode zum Fotografieren
    public void takePhoto() {
        System.out.println("Foto aufgenommen! Modell: " + model + ", Hersteller: " + hersteller +
                ", Megapixel: " + megapixel + ", Brennweite: " + brennweiteMin + "-" + brennweiteMax);
    }

    // Überschreiben der toString() Methode
    @Override
    public String toString() {
        return "Fotoapparat{" +
                "brennweiteMin=" + brennweiteMin +
                ", brennweiteMax=" + brennweiteMax +
                ", model='" + model + '\'' +
                ", hersteller='" + hersteller + '\'' +
                ", megapixel=" + megapixel +
                '}';
    }

}

