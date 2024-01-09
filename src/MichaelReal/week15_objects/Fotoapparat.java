package MichaelReal.week15_objects;

/*
Aufgabe: Fotoapparat
Erstelle eine Fotoapparat Klasse.

Mit zumindest folgenden Attributen (es dürfen auch gerne mehr sein), Brennweite min/max, Model, Hersteller und Megapixel.
Erstelle für die Attribute getter und setter
Erstelle weiters die Methode takePhoto(), die ein Foto schießt (Mach einfach eine nette Ausgabe)
Überschreibe die toString() Methode und gib die relevanten Daten als String zurück
Erstelle verschiedene Instanzen der Fotoapparat Klasse und Teste diese ausgiebig.
 */

public class Fotoapparat {
    private double brennweiteMin;
    private double brennweiteMax;
    private String modell;
    private String hersteller;
    private int megapixel;

    public Fotoapparat(double brennweiteMin, double brennweiteMax, String modell, String hersteller, int megapixel) {
        this.brennweiteMin = brennweiteMin;
        this.brennweiteMax = brennweiteMax;
        this.modell = modell;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
    }

    public double getBrennweiteMin() {
        return brennweiteMin;
    }

    public void setBrennweiteMin(double brennweiteMin) {
        this.brennweiteMin = brennweiteMin;
    }

    public double getBrennweiteMax() {
        return brennweiteMax;
    }

    public void setBrennweiteMax(double brennweiteMax) {
        this.brennweiteMax = brennweiteMax;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
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

    @Override
    public String toString() {
        return "Fotoapparat {" +
                "Brennweite (min) = " + brennweiteMin + "mm" +
                ", Brennweite (max) = " + brennweiteMax + "mm " +
                ", Modell = '" + modell + '\'' +
                ", Hersteller = '" + hersteller + '\'' +
                ", Megapixel = " + megapixel +
                '}';
    }

    public void takePhoto() {
        System.out.println("📷📷📷📷" +
                "\n🤓🤓🤓🤓" +
                "\n📷📷📷📷" +
                "\n😖😖😖😖");
    }

}
