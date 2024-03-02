package MichaelReal.week22_CarsimultionExtended;

public class CrapCar extends Car{
    public CrapCar(String hersteller, String modell, int kW, double gewicht, double verbrauch, double maximaleTankkapazitaet, double tankinhalt, double totalKilometers, Antriebsart antrieb) {
        super(hersteller, modell, kW, antrieb, gewicht, verbrauch, new Engine(), new FuelTank());
    }

    @Override
    public boolean drive(int kilometers) {
        // Erhöhe die Wahrscheinlichkeit eines Defekts um 50%.
        // Das könnte durch eine Anpassung in der `drive` Methode oder durch direkte Manipulation der Engine-Statuswerte erfolgen.
        return super.drive(kilometers);
    }
}
