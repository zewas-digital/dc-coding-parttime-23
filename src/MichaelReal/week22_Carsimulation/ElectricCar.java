package MichaelReal.week22_Carsimulation;

public class ElectricCar extends Car implements Chargeable {
    private double batteriekapazitaet; // Maximale Batteriekapazität in kWh
    private double aktuelleLadung; // Aktuelle Ladung in kWh

    public ElectricCar(String hersteller, String modell, int kW, double gewicht, double verbrauch, double batteriekapazitaet, double aktuelleLadung) {
        super(hersteller, modell, kW, Antriebsart.STROM, gewicht, verbrauch);
        this.batteriekapazitaet = batteriekapazitaet;
        this.aktuelleLadung = aktuelleLadung;
    }

    @Override
    public void charge(double kWh) {
        aktuelleLadung = Math.min(aktuelleLadung + kWh, batteriekapazitaet);
        System.out.println(getModell() + " geladen: Aktuelle Ladung ist jetzt " + aktuelleLadung + " kWh.");
    }

    @Override
    public int drive(int kilometer) {
        double verbrauchProKm = verbrauch / 100.0;
        int moeglicheDistanz = (int) (aktuelleLadung / verbrauchProKm);
        int gefahreneDistanz = Math.min(kilometer, moeglicheDistanz);
        aktuelleLadung -= gefahreneDistanz * verbrauchProKm;
        System.out.println(getModell() + " fährt " + gefahreneDistanz + " km, verbleibende Ladung: " + String.format("%.2f", aktuelleLadung) + " kWh.");
        return gefahreneDistanz;
    }

    public double getBatteriekapazitaet() {
        return batteriekapazitaet;
    }

    public double getAktuelleLadung() {
        return aktuelleLadung;
    }
}
