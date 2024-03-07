package MichaelReal.week22_Carsimulation;

public class PetrolCar extends Car implements Refuelable {
    private double tankinhalt; // Aktueller Tankinhalt in Litern
    private double maximaleTankkapazitaet; // Maximale Tankkapazität in Litern

    public PetrolCar(String hersteller, String modell, int kW, double gewicht, double verbrauch, double maximaleTankkapazitaet, double tankinhalt) {
        super(hersteller, modell, kW, Antriebsart.BENZIN, gewicht, verbrauch);
        this.maximaleTankkapazitaet = maximaleTankkapazitaet;
        this.tankinhalt = tankinhalt;
    }

    @Override
    public void refuel(double liter) {
        tankinhalt = Math.min(tankinhalt + liter, maximaleTankkapazitaet);
        System.out.println(getModell() + " betankt: Aktueller Tankinhalt ist jetzt " + tankinhalt + " Liter.");
    }

    @Override
    public int drive(int kilometer) {
        double verbrauchProKm = verbrauch / 100.0;
        int moeglicheDistanz = (int) (tankinhalt / verbrauchProKm);
        int gefahreneDistanz = Math.min(kilometer, moeglicheDistanz);
        tankinhalt -= gefahreneDistanz * verbrauchProKm;
        System.out.println(getModell() + " fährt " + gefahreneDistanz + " km, verbleibender Tankinhalt: " + String.format("%.2f", tankinhalt) + " Liter.");
        return gefahreneDistanz;
    }

    public double getTankinhalt() {
        return tankinhalt;
    }

    public double getMaximaleTankkapazitaet() {
        return maximaleTankkapazitaet;
    }
}

