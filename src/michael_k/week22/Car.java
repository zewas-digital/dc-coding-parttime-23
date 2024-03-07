package michael_k.week22;

public class Car {

    private String hersteller;
    private String modell;
    private int gewicht;
    public Engine engine;
    public Tank tank;
    private boolean engineDefekt = false;
    private boolean tankLeer = false;
    private Repairstation garage;
    private Gasstation tankstelle;
    public final boolean selbstReparierend;

    public Car(String hersteller, String modell, int gewicht, double tankVolumen, Antriebsart antriebsart, int leistung, double verbrauchAuf100, double engineFaktor, boolean selbstReparierend){
        this.hersteller = hersteller;
        this.modell = modell;
        this.gewicht = gewicht;
        this.engine = new Engine ( antriebsart, leistung, engineFaktor );
        this.engine.verbrauchAuf100 = verbrauchAuf100;
        this.selbstReparierend = selbstReparierend;
        if ( antriebsart.equals ( Antriebsart.Strom )){
            this.tank = new Batterie ( tankVolumen );
        }else {this.tank = new Treibstofftank ( tankVolumen );}

    }
    public double drive(int kilometer){
        double kilometerNichtGefahren=0;
        double reichweite = tank.tankinhalt / engine.verbrauchAuf100 *100;

        if(kilometer < reichweite) {

            tank.tankinhalt = tank.tankinhalt - ( engine.verbrauchAuf100 * kilometer / 100 );

        }else{
            kilometerNichtGefahren = kilometer-reichweite;
            tank.tankinhalt = 0;
            tankLeer = true;
        }

        if(tank.tankinhalt < 5 && tank.tankinhalt >0 ){
            System.out.println ( "Der Tankinhalt beträgt nur noch "+ tank.tankinhalt+"L");
        }

        engineDefekt = engine.kilometerZuruecklegen ( kilometer-kilometerNichtGefahren );
        return kilometerNichtGefahren;

    }
    public double getTankinhalt(){
        return tank.tankinhalt;
    }
    public String statusCheck (){
        String status = "alles OK";
        if (engineDefekt == true){
            status = "Motor defekt";
        }
        if (tankLeer == true){
            status = "Tank leer";
        }
        if (tankLeer == true && engineDefekt == true){
            status = "Tank leer, Motor defekt";
        }
        return status;
    }
    public void garageZuordnen(Repairstation garage){
        this.garage = garage;
    }
    public void tankstelleZuordnen(Gasstation tankstelle){
        this.tankstelle = tankstelle;
    }
    public void motorreparieren(){
        engine.motorReparieren ();
        engineDefekt = false;
    }
    public void tanken(){
        tankstelle.tanken (tank);
        tankLeer = false;
    }
}
