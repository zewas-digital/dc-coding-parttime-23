package saifedine.week23.CarsimExtended;

import javax.naming.NamingEnumeration;
import java.util.Random;

public class Engine {

    // Attribute
    private int kw;
    public enum engineEnum{
        V4,
        V6,
        V8
    }
    private engineEnum engineType;
    private int engineID;
    public boolean isDefect;


    // Konstruktoren
    public Engine(int kw, engineEnum engineType, int engineID){
        this.kw = kw;
        this.engineType = engineType;
        this.engineID = engineID;
    }

    @Override
    // Methoden
    public String toString(){
        return  "Motorname: " + this.engineType +
                ",\tMotorID: " + this.engineID +
                ",\tLeistung: " + this.kw + " kW";
    }

    public engineEnum getEngineType() {
        return engineType;
    }

    public int getEngineID() {
        return engineID;
    }

    public boolean engineDefect(Car car){

        double engineBrokenProb = Math.random();

        if (car.getKmStand() < 200000 && engineBrokenProb <= 0.1){

            //System.out.println("Motordefektwahrscheinlichkeit: " + engineBrokenProb);

            return isDefect = true;
        }

        else if (car.getKmStand() > 200000 && engineBrokenProb <= 0.5) {

            //System.out.println("Motordefektwahrscheinlichkeit: " + engineBrokenProb);

            return isDefect = true;
        }
        else {
            return isDefect = false;
        }
    }


}
