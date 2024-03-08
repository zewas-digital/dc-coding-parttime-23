package Alpi.week22_carsimulation;

public abstract class Tank {
    private double tankMax;
    private double tankAktuell = 0;
    private String tankMaxFormatiert;
    private String tankAktuellFormatiert;
    private String tankName;
    public Tank(double tankMax, String tankname){
        this.tankMax = tankMax;
        this.tankAktuell = 0;
        this.tankName = tankname;
    }

    public void setTankAktuell(double tankAktuell) {
        this.tankAktuell = tankAktuell;
        this.tankAktuellFormatiert = this.tankAktuell + " Liter";
    }

    public void tankfuellen(){
        this.tankAktuell = this.tankMax;
    }
    /*
    public String getTankMaxFormatiert() { //fragt aktuellen Wert ab und gibt ihn formatiert zurück
        return this.tankMax + " Liter";
    }
*/
    public double getTankMax() {
        return tankMax;
    }

    public double getTankAktuell() {
        return tankAktuell;
    }

    @Override
    public String toString(){
        return this.tankName;
    }
}
