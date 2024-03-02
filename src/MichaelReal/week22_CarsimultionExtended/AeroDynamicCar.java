package MichaelReal.week22_CarsimultionExtended;

public class AeroDynamicCar extends Car{
    public AeroDynamicCar(String hersteller, String modell, int kW, double gewicht, double verbrauch, double maximaleTankkapazitaet, double tankinhalt, double totalKilometers, Antriebsart antrieb) {
        super(hersteller, modell, kW, antrieb, gewicht, verbrauch, new Engine(), new FuelTank());
    }

    @Override
    public boolean drive(int kilometers) {
        this.verbrauch *= 0.5; // Reduziere den Verbrauch um 50%.
        return super.drive(kilometers);
    }
}
