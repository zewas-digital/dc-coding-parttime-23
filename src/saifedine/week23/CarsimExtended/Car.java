package saifedine.week23.CarsimExtended;

public class Car {

    // Attribute
    private String manufacturer;
    private String model;
    public enum fuelEnum {
        BENZIN,
        DIESEL,
        GAS,
        STROM
    }
    private fuelEnum fuelType;
    private int weight;
    private Engine engine;
    private Tank tank;
    private int kmStand;


    // Konstruktoren
    public Car(String model, fuelEnum fuelType, Engine engine, Tank tank, int kmStand){
        this.model = model;
        this.fuelType = fuelType;
        this.engine = engine;
        this.tank = tank;
        this.kmStand = kmStand;
    }

    @Override
    // Methoden
    public String toString(){
        return  "Car: " +
                "\nModel: " + this.model +
                ",\nKm-Stand: " + this.kmStand +
                ",\n|--- Motor: " + this.engine +
                ",\n|------ Tank: " + this.tank +
                ",\tAntriebsart: " + this.fuelType;
    }

    public String getModel() {
        return this.model;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tank getTank() {
        return this.tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public int getKmStand() {
        return kmStand;
    }

    public void setKmStand(int kmStand) {
        this.kmStand = kmStand;
    }
}
