package saifedine.week22_weekend6.CarsimExtended;

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
    Engine engine;
    Tank tank;


    // Konstruktoren
    public Car(String model, fuelEnum fuelType, Engine engine, Tank tank){
        this.model = model;
        this.fuelType = fuelType;
        this.engine = engine;
        this.tank = tank;
    }

    @Override
    // Methoden
    public String toString(){
        return  "Car: " +
                "\nModel: " + this.model +
                ",\n|--- Motor: " + this.engine +
                ",\n|------ Tank: " + this.tank +
                ",\tAntriebsart: " + this.fuelType;
    }
}
