package Alpi.week22_carsimulation;

public class AutoThread extends Thread{
    private Auto auto;
    private char x;
    private double strecke;
    public AutoThread (Auto auto, double strecke, char x){
        this.auto = auto;
        this.x = x;
        this.strecke = strecke;
    }

    public void run() {

        this.auto.fahren(strecke, x);
    }
}
