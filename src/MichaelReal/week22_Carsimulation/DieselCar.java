package MichaelReal.week22_Carsimulation;

public class DieselCar extends Car {
    public DieselCar(String hersteller, String modell, int kW, double tankinhalt, double gewicht, double verbrauch) {
        super(hersteller, modell, kW, tankinhalt, Antriebsart.DIESEL, gewicht, verbrauch);
    }

    @Override
    public void simulateDrive() {
        System.out.println("Das Dieselauto " + modell + " von " + hersteller + " beginnt die Fahrt.");
        // Hier könntest du Logik implementieren, um die Fahrt zu simulieren.
    }
}
