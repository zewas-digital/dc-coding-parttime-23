package Matthias.week22_Carsimulation;

public class GasStation {
    private String gasStationName;

    private Car car;

    public GasStation(String gasStationName){
        this.gasStationName=gasStationName;
    }
     public void checkIn(Car car){
        this.car=car;
         System.out.println(car.toString() +"->"+ "wird getankt");
    }
    public void refuel(double refuel){
        System.out.println( this.car.toString() + " TankFüllStand: " + this.car.getTank().getFillLevel() );
        this.car.getTank().addFuel( refuel );
        System.out.println( this.car.toString() + " TankFüllStandNeu: " + this.car.getTank().getFillLevel() );
    }




}
