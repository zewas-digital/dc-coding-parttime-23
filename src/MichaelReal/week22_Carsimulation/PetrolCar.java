package MichaelReal.week22_Carsimulation;

public class PetrolCar extends Car {
    public PetrolCar(String hersteller, String modell, int kW, double tankinhalt, double gewicht, double verbrauch, double maximaleTankkapazitaet) {
        super(hersteller, modell, kW, tankinhalt, Antriebsart.BENZIN, gewicht, verbrauch, maximaleTankkapazitaet);
    }

    @Override
    public void simulateDrive() {
        System.out.println("Das Benzinauto " + modell + " von " + hersteller + " beginnt die Fahrt.");
        // Hier könntest du Logik implementieren, um die Fahrt zu simulieren.
    }
}
