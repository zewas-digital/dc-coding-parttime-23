package Alpi.week22_carsimulation;

public class Akku extends Tank {
    //private String akkuName;
    public Akku(String akkuName){
        super(100, akkuName);
        super.setTankAktuell(0);


    }

    @Override
    public String toString(){
        return "Akku: "+ super.toString();
    }
}
