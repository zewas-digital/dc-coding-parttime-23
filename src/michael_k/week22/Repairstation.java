package michael_k.week22;

public class Repairstation {

    public String name;
    public Repairstation (String name){
        this.name = name;
    }

    public void engineAustauschen(Car car, int leistung, Antriebsart antriebsart){
        car.engine = new Engine ( antriebsart, leistung );
    }
    public void tankAustauschen(Car car, double tankvolumen){
        if ( car.engine.antriebsart.equals ( Antriebsart.Strom )){
            car.tank = new Batterie ( tankvolumen );
        }else {car.tank = new Treibstofftank ( tankvolumen );}
    }
}
