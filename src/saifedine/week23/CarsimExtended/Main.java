package saifedine.week23.CarsimExtended;


// lt. Matthias: 3 Tank typen (Big, Medium, Small) & Motortypen (V4, V6, V8), Objekte anlegen, dann "im" Auto einbauen

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> carArrayList = new ArrayList<>();

        Engine V8_12345 = new Engine(200, Engine.engineEnum.V8, 12345);

        Car vwtouareg = new Car("VW Touareg", Car.fuelEnum.BENZIN , V8_12345, new Tank("BT80",80,5.0),210000);

        System.out.println(vwtouareg);

        //carArrayList.add(0,vwtouareg);

        //System.out.println("CarArrayList " + carArrayList.get(0));

        Engine V8_67890 = new Engine(200, Engine.engineEnum.V8,67890);

        RepairStation atu = new RepairStation("ATU");

        atu.repairEngine(vwtouareg,V8_67890);

        Car vwpolo = new Car("VW Polo", Car.fuelEnum.BENZIN, new Engine(50, Engine.engineEnum.V4,98654), new Tank("BT40",40, 5.0),195000);

        System.out.println(vwpolo);

        boolean boolPolo = vwpolo.getEngine().engineDefect(vwpolo);



        System.out.println("\nVW Polo, Motordefekt: " + boolPolo);

        if(boolPolo){
            atu.repairEngine(vwpolo, new Engine(50, Engine.engineEnum.V4, 68746));
        }

        boolean boolTouareg = vwtouareg.getEngine().engineDefect(vwtouareg);

        System.out.println("\nVW Touareg, Motordefekt: " + boolTouareg);

        if(boolTouareg){
            atu.repairEngine(vwpolo, new Engine(200, Engine.engineEnum.V8, 12345));
        }

    }
}
