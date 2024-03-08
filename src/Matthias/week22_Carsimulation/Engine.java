package Matthias.week22_Carsimulation;

import java.util.Random;

public class Engine {

    private String EngineName;
    private Fuel fuel;
    private int performance; //kw
    private double consumption; // pro 100 km
    private double mileage;
    private boolean defect;

    public Engine(String EngineName, Fuel fuel,double consumption){
        this.EngineName=EngineName;
        this.fuel=fuel;
        this.consumption=consumption;
    }

    public boolean isEngineDefekt(){
        int engineFaktor=1;
        Random random= new Random(  );
        if ((random.nextDouble (101)*engineFaktor)/100 < ((this.mileage-2000)/100.0) ){this.defect=true;}
        return this.defect;
    }
    public double addMileage( ){
        return this.mileage++;
    };
    public  void start(Tank tank){//Startet den Motor und übergibt den Tank.

    }
    public void stop(){

    } //Stoppt den Motor.
    public void getDefektWahrscheinlichkeit(int kilometerstand){

    }//Berechnet die Wahrscheinlichkeit, dass der Motor bei der angegebenen Kilometerzahl kaputt geht
    public String getEngineName() {
        return this.EngineName;
    }

    public Fuel getFuel() {
        return this.fuel;
    }

    public double getConsumption() {
        return this.consumption;
    }
}
