package MichaelReal.week22_Carsimulation;

public class ElectricCar extends Car {
    public ElectricCar(String hersteller, String modell, int kW, double tankinhalt, double gewicht, double verbrauch, double maximaleTankkapazitaet) {
        super(hersteller, modell, kW, tankinhalt, Antriebsart.STROM, gewicht, verbrauch, maximaleTankkapazitaet);
    }

    @Override
    public void simulateDrive() {
        System.out.println("Das Elektroauto " + modell + " von " + hersteller + " beginnt die Fahrt.");
        // Hier könntest du Logik implementieren, um die Fahrt zu simulieren.
    }
}

