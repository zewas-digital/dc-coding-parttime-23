package saifedine.week23.CarsimExtended;

public class Tank {

    // Attribute
    // Tankname besteht aus Treibstoffart (B) für Benzin, (T) für Tank und (60) für 60 l Tankkapazität = BT60
    private String tankName;
    private int tankCapacity;
    private double tankLevel;


    // Konstruktoren
    public Tank(String tankName, int tankCapacity, double tankLevel){
        this.tankName = tankName;
        this.tankCapacity = tankCapacity;
        this.tankLevel = tankLevel;
    }

    // Methoden
    public String toString(){
        return  "Tankname: " + this.tankName +
                ",\tTankkapazität: " + this.tankCapacity +
                ",\tTankinhalt: " + this.tankLevel;
    }

    public String getTankName() {
        return tankName;
    }

    public void setTankName(String tankName) {
        this.tankName = tankName;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getTankLevel() {
        return tankLevel;
    }

    public void setTankLevel(double tankLevel) {
        this.tankLevel = tankLevel;
    }
}