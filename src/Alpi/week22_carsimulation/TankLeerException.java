package Alpi.week22_carsimulation;

public class TankLeerException extends Exception {
    public TankLeerException(Auto auto, Tankstelle ts){
        System.out.print("\n" + auto + " hat keinen Treibstoff mehr!\n");
        ts.ansteuern(auto);
        ts.volltanken(auto);
    }
}
