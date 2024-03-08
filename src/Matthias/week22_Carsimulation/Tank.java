package Matthias.week22_Carsimulation;

public class Tank {
    private double tankCapacity;  // l kwh
    private double fillLevel=50;

    public Tank( double tankCapacity){
        this.tankCapacity= tankCapacity;
    }

    public double reduceFillLevel(double fillLevelReduceL){
     return (this.fillLevel-=fillLevelReduceL);
    }
    public double getTankCapacity() {
        return this.tankCapacity;
    }

    public void addFuel( double fillLevel ) {
        this.fillLevel += fillLevel;
    }

    public double getFillLevel() {
        return this.fillLevel;
    }
}
