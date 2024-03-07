package saifedine.week23.CarsimExtended;

public class RepairStation {

    // Attribute
    public String repairStationName;


    // Konstruktoren
    public RepairStation(String repairStationName){
        this.repairStationName = repairStationName;
    }


    // Methoden
    public String toString(){ return this.repairStationName;}

    public void repairEngine(Car car, Engine engine){
        System.out.println("\n" + car.getEngine() + " vom " + car.getModel() + " wird ausgetauscht" + " mit dem MotorID: " + engine.getEngineType() + "_" + engine.getEngineID() + ".");
        car.setEngine(engine);
        System.out.println("Neue Autokonfiguration nach der Reparatur: " + "\n" + car);
    }
}