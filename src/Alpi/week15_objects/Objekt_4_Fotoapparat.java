package Alpi.week15_objects;

/*
Aufgabe: Fotoapparat
Erstelle eine Fotoapparat Klasse.

Mit zumindest folgenden Attributen (es dürfen auch gerne mehr sein), Brennweite min/max, Model, Hersteller und Megapixel.
Erstelle für die Attribute getter und setter
Erstelle weiters die Methode takePhoto(), die ein Foto schießt (Mach einfach eine nette Ausgabe)
Überschreibe die toString() Methode und gib die relevanten Daten als String zurück
Erstelle verschiedene Instanzen der Fotoapparat Klasse und Teste diese ausgiebig.
 */

public class Objekt_4_Fotoapparat {

        private double minBrennweite;
        private double maxBrennweite;
        private String model;
        private String hersteller;
        private int megapixel;

        public Objekt_4_Fotoapparat (double minBrennweite, double maxBrennweite, String model, String hersteller, int megapixel) {
            this.minBrennweite = minBrennweite;
            this.maxBrennweite = maxBrennweite;
            this.model = model;
            this.hersteller = hersteller;
            this.megapixel = megapixel;
        }

        public double getMinBrennweite() {
            return minBrennweite;
        }

        public void setMinBrennweite(double minBrennweite) {
            this.minBrennweite = minBrennweite;
        }

        public double getMaxBrennweite() {
            return maxBrennweite;
        }

        public void setMaxBrennweite(double maxBrennweite) {
            this.maxBrennweite = maxBrennweite;
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

        public void takePhoto() {
            System.out.println("Foto geschossen!");
        }

        @Override
        public String toString() {
            return "Fotoapparat{" +
                    "minBrennweite=" + minBrennweite +
                    ", maxBrennweite=" + maxBrennweite +
                    ", model='" + model + '\'' +
                    ", hersteller='" + hersteller + '\'' +
                    ", megapixel=" + megapixel +
                    '}';
        }
    }

