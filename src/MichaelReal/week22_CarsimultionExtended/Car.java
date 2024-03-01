package MichaelReal.week22_CarsimultionExtended;

public abstract class Car {

    // Enumeration für die Antriebsarten
    public enum Antriebsart {
        BENZIN, DIESEL, GAS, STROM
    }

        protected String hersteller;
        protected String modell;
        protected int kW; // Leistung
        protected Antriebsart antrieb;
        protected double gewicht;
        protected double verbrauch; // Abhängig von der Antriebsart, interpretiert in Unterklassen

        public Car(String hersteller, String modell, int kW, Antriebsart antrieb, double gewicht, double verbrauch) {
            this.hersteller = hersteller;
            this.modell = modell;
            this.kW = kW;
            this.antrieb = antrieb;
            this.gewicht = gewicht;
            this.verbrauch = verbrauch;
        }

        public abstract int drive(int kilometer);

        // Getter-Methoden
        public String getHersteller() { return hersteller; }
        public String getModell() { return modell; }
    }

