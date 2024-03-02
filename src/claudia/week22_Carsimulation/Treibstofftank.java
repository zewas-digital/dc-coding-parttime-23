package claudia.week22_Carsimulation;

public class Treibstofftank extends Tank{
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
