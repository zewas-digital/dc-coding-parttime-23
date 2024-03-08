package Alpi.week22_carsimulation;

public class Treibstofftank extends Tank {
    //private String tankName;
    public Treibstofftank(double tankMax, String tankName){
        super(tankMax, tankName);
        super.setTankAktuell(0);
    }

    @Override
    public String toString(){
        return "Tank: " + super.toString();
    }
}
