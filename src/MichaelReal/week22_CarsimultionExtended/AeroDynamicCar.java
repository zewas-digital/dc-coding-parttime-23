package MichaelReal.week22_CarsimultionExtended;

public class AeroDynamicCar extends Car{
    public AeroDynamicCar(String hersteller, String modell, int kW, Antriebsart antrieb, double gewicht, double verbrauch, Engine engine, FuelTank tank) {
        super(hersteller, modell, kW, antrieb, gewicht, verbrauch, engine, tank);
    }

    @Override
    public boolean drive(int kilometers) {
        // Temporäre Reduzierung des Verbrauchs um 50% nur für diese Fahrt
        double originalConsumption = this.verbrauch;
        this.verbrauch *= 0.5;
        boolean driven = super.drive(kilometers);
        this.verbrauch = originalConsumption; // Setze den Verbrauch zurück
        return driven;
    }
}
