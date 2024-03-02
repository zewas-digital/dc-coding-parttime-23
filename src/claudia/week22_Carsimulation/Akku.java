package claudia.week22_Carsimulation;

public class Akku extends Tank{
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
