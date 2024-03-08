package Matthias.week22_Carsimulation;

public class RapairStation {

    private String RapairStationName;

    public RapairStation(String RapairSationName){
        this.RapairStationName=RapairSationName;
    }

    public void changeEngine(Car car,Engine engine){
        System.out.println(car.toString()+" -----------------------------------------------> neuer Motor " + engine.getEngineName());
        car.setEngine( engine );
    }


}
