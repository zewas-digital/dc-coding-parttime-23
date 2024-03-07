package saifedine.week22_weekend6.CarsimExtended;

public class Main {

    public static void main(String[] args) {

        Engine V8 = new Engine("V8", 200);




        Car car1 = new Car("VW Caddy", Car.fuelEnum.BENZIN , V8, new Tank("BT60",60));

        System.out.println(car1);

        // lt. Matthias: 3 Tank typen (Big, Medium, Small) & Motortypen (V4, V6, V8), Objekte anlegen, dann "im" Auto einbauen

    }
}
