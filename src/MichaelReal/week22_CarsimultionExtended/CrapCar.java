package MichaelReal.week22_CarsimultionExtended;

public class CrapCar extends Car{
    public CrapCar(Engine engine, Tank tank) {
        super(engine, tank);
    }

    @Override
    public boolean drive(int kilometers) {
        // Erhöhe die Wahrscheinlichkeit eines Defekts um 50%.
        // Das könnte durch eine Anpassung in der `drive` Methode oder durch direkte Manipulation der Engine-Statuswerte erfolgen.
        return super.drive(kilometers);
    }
}
