package MichaelReal.week16_objects;

public class Speicherkarte extends Object {
    private String modell;
    private String hersteller;
    private int kapazitaet;
    private int belegterSpeicherplatz;

    public Speicherkarte(String modell, String hersteller, int kapazitaet) {
        this.modell = modell;
        this.hersteller = hersteller;
        this.kapazitaet = kapazitaet;
        this.belegterSpeicherplatz = 0;
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

    public int getKapazitaet() {
        return kapazitaet;
    }

    public void setKapazitaet(int kapazitaet) {
        this.kapazitaet = kapazitaet;
    }

    public int getBelegterSpeicherplatz() {
        return belegterSpeicherplatz;
    }

    public void speicherplatzBelegen(int groesse) {
        if (groesse > 0 && belegterSpeicherplatz + groesse <= kapazitaet) {
            belegterSpeicherplatz += groesse;
            System.out.println("Speicherplatz belegt: " + belegterSpeicherplatz + " MB");
        } else {
            System.out.println("Nicht genügend freier Speicherplatz auf der Karte.");
        }
    }

    public int verfuegbarerSpeicherplatz() {
        return kapazitaet - belegterSpeicherplatz;
    }

        @Override
        public String toString() {
            return "Speicherkarte {" +
                    "\nModell = '" + modell + '\'' +
                    "\nHersteller = '" + hersteller + '\'' +
                    "\nKapazität = " + kapazitaet + " MB" +
                    "\nBelegter Speicherplatz = " + belegterSpeicherplatz + " MB" +
                    '}';
        }
    }
