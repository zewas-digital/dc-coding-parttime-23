package MichaelReal.week22_CarsimultionExtended;

public abstract class Car {

    public enum Antriebsart {
        BENZIN, DIESEL, GAS, STROM
    }

        protected String hersteller;
        protected String modell;
        protected int kW; // Leistung
        protected Antriebsart antrieb;
        protected double gewicht;
        protected double verbrauch;
        protected Engine engine;
        protected Tank tank;

        public Car(String hersteller, String modell, int kW, Antriebsart antrieb, double gewicht, double verbrauch, Engine engine, Tank tank) {
            this.hersteller = hersteller;
            this.modell = modell;
            this.kW = kW;
            this.antrieb = antrieb;
            this.gewicht = gewicht;
            this.verbrauch = verbrauch;
            this.engine = engine;
            this.tank = tank;
        }



        public abstract boolean drive(int kilometer);



        // Getter-Methoden
        public String getHersteller() { return hersteller; }
        public String getModell() { return modell; }

    public void replaceEngine(Engine newEngine) {
        this.engine = newEngine;
    }

    public void refillTank() {
        tank.refill();
    }


    }

