package MichaelReal.week16_objects;

/*
Aufgabe: Fotoapparat & Objektiv & Speicherkarte

Erweitere das vorhergehende Beispiel um die Klassen Objektiv und Speicherkarte.
Die Brennweite der Kamera fällt demnach weg. Das Objektiv und die Speicherkarte sollen getauscht werden können.

Erstelle Methoden um zu erfragen, wieviele Fotos bereits aufgenommen wurden und wieviel Speicher noch frei ist.
Für die Berechnung speicherplatz pro bild, kann ein wert von 0.3mb pro Megapixel angenommen werden.
 */

 public class Objektiv extends Object {
    private String modell;
    private String hersteller;
    private double brennweite;

    public Objektiv(String modell, String hersteller, double brennweite) {
        this.modell = modell;
        this.hersteller = hersteller;
        this.brennweite = brennweite;
    }

     public String getObjektivModell() {
         return modell;
     }

     public void setObjektivModell(String modell) {
         this.modell = modell;
     }

     public String getObjektivHersteller() {
         return hersteller;
     }

     public void setObjektivHersteller(String hersteller) {
         this.hersteller = hersteller;
     }

     public double getObjektivBrennweite() {
         return brennweite;
     }

     public void setObjektivBrennweite(double brennweite) {
         this.brennweite = brennweite;
     }

    @Override
    public String toString() {
        return "Objektiv {" +
                "Modell = '" + modell + '\'' +
                "\nHersteller =" + hersteller + '\'' +
                "\nBrennweite = " + brennweite +
                '}';
    }
}