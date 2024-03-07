package saifedine.week23.CarsimExtended;

public class GasStation {

    // Attribute
    public String gasStationName;


    // Konstruktoren
    public GasStation(String gasStationName){
        this.gasStationName = gasStationName;
    }


    // Methoden
    @Override
    public String toString(){
        return "Tanksstelle: " + this.gasStationName;
    }

    /*
    public void refill(Tank tank){
        System.out.println("Fahrzeug wird getankt");
    }
     */
}