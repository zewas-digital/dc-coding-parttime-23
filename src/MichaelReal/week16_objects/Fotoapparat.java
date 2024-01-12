package MichaelReal.week16_objects;

/*
Aufgabe: Fotoapparat
Erstelle eine Fotoapparat Klasse.

Mit zumindest folgenden Attributen (es dürfen auch gerne mehr sein), Brennweite min/max, Model, Hersteller und Megapixel.
Erstelle für die Attribute getter und setter
Erstelle weiters die Methode takePhoto(), die ein Foto schießt (Mach einfach eine nette Ausgabe)
Überschreibe die toString() Methode und gib die relevanten Daten als String zurück
Erstelle verschiedene Instanzen der Fotoapparat Klasse und Teste diese ausgiebig.
 */

public class Fotoapparat extends Object {
    private double brennweiteMin;
    private double brennweiteMax;
    private String modell;
    private String hersteller;
    private int megapixel;
    private Objektiv aktivesObjektiv;
    private Speicherkarte aktiveSpeicherkarte;


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

    public Objektiv getAktivesObjektiv() {
        return aktivesObjektiv;
    }

    public void setAktivesObjektiv(Objektiv aktivesObjektiv) {
        this.aktivesObjektiv = aktivesObjektiv;
    }

    public Speicherkarte getAktiveSpeicherkarte() {
        return aktiveSpeicherkarte;
    }

    public void setAktiveSpeicherkarte(Speicherkarte aktiveSpeicherkarte) {
        this.aktiveSpeicherkarte = aktiveSpeicherkarte;
    }


    @Override
    public String toString() {
        return "Fotoapparat " +
                "Brennweite (min) = " + brennweiteMin + "mm" +
                "\nBrennweite (max) = " + brennweiteMax + "mm " +
                "\nModell = '" + modell + '\'' +
                "\nHersteller = '" + hersteller + '\'' +
                "\nMegapixel = " + megapixel +
                "\nAktives Objektiv = " + (aktivesObjektiv != null ? aktivesObjektiv.toString() : "Kein Objektiv") +
                "\nAktive Speicherkarte = " + (aktiveSpeicherkarte != null ? aktiveSpeicherkarte.toString() : "Keine Speicherkarte");
    }

    public void takePhoto() {
        if (aktiveSpeicherkarte != null) {
            int groesse = 5; // Annahme: Ein Foto belegt 5 MB Speicherplatz
            aktiveSpeicherkarte.speicherplatzBelegen(groesse);
            System.out.println("Foto aufgenommen und " + groesse + " MB Speicherplatz belegt.");
            int verfuegbarerSpeicher = aktiveSpeicherkarte.verfuegbarerSpeicherplatz();
            System.out.println("Verfügbarer Speicherplatz auf der Karte: " + verfuegbarerSpeicher + " MB");
            System.out.println("📷📷📷📷" +
                    "\n🤓🤓🤓🤓" +
                    "\n📷📷📷📷" +
                    "\n😖😖😖😖");
        } else {
            System.out.println("Keine Speicherkarte eingelegt. Foto konnte nicht aufgenommen werden.");
        }
    }

}
