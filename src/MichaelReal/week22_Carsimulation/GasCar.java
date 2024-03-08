package MichaelReal.week22_Carsimulation;

public class GasCar extends Car implements Refuelable {
    private double tankinhalt; // Aktueller Tankinhalt in kg
    private double maximaleTankkapazitaet; // Maximale Tankkapazität in kg

    public GasCar(String hersteller, String modell, int kW, double gewicht, double verbrauch, double maximaleTankkapazitaet, double tankinhalt) {
        super(hersteller, modell, kW, Antriebsart.GAS, gewicht, verbrauch);
        this.maximaleTankkapazitaet = maximaleTankkapazitaet;
        this.tankinhalt = tankinhalt;
    }

    @Override
    public void refuel(double kilogramm) {
        tankinhalt = Math.min(tankinhalt + kilogramm, maximaleTankkapazitaet);
        System.out.println(getModell() + " betankt: Aktueller Tankinhalt ist jetzt " + tankinhalt + " Kilogramm.");
    }

    @Override
    public int drive(int kilometer) {
        double verbrauchProKm = verbrauch / 100.0;
        int moeglicheDistanz = (int) (tankinhalt / verbrauchProKm);
        int gefahreneDistanz = Math.min(kilometer, moeglicheDistanz);
        tankinhalt -= gefahreneDistanz * verbrauchProKm;
        System.out.println(getModell() + " fährt " + gefahreneDistanz + " km, verbleibender Tankinhalt: " + String.format("%.2f", tankinhalt) + " Kilogramm.");
        return gefahreneDistanz;
    }

    public double getTankinhalt() {
        return tankinhalt;
    }

    public double getMaximaleTankkapazitaet() {
        return maximaleTankkapazitaet;
    }
}
