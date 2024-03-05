package saifedine.week22_weekend6.CarsimExtended;

public class Tank {

    // Attribute
    private String tankName;
    private int tankCapacity;
    private double tankLevel;


    // Konstruktoren
    public Tank(String tankName,int tankCapacity){
        this.tankName = tankName;
        this.tankCapacity = tankCapacity;
    }

    // Methoden
    public String toString(){
        return  "Tankname: " + this.tankName +
                ",\tTankkapazität: " + this.tankCapacity;
    }
}
