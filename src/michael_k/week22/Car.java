package michael_k.week22;

public class Car {

    private String hersteller;
    private String modell;
    private int leistung;
    private double tankinhalt;
    private double tankVolumen;
    private Antriebsart antriebsart;
    private int gewicht;
    private double verbrauchAuf100;
    private Engine engine;
    private Tank tank;

    public Car(String hersteller, String modell, double tankVolumen, Antriebsart antriebsart, double verbrauchAuf100 ){
        this.hersteller = hersteller;
        this.modell = modell;
        this.tankVolumen = tankVolumen;
        this.tankinhalt = tankVolumen;
        this.antriebsart = antriebsart;
        this.verbrauchAuf100 = verbrauchAuf100;
    }

    public double drive(int kilometer){
        double kilometerNichtGefahren=0;
        double reichweite = this.tankinhalt / verbrauchAuf100 *100;

        if(kilometer < reichweite) {

            this.tankinhalt = this.tankinhalt - ( verbrauchAuf100 * kilometer / 100 );

        }else{
            kilometerNichtGefahren = kilometer-reichweite;
            this.tankinhalt = 0;
            System.out.println ( "Tank ist leer" );
        }

        if(tankinhalt < 5 && tankinhalt >0 ){
            System.out.println ( "Der Tankinhalt beträgt "+ this.tankinhalt+"L");
        }

        return kilometerNichtGefahren;
    }
    public double volltanken(){

        double getankt = this.tankVolumen - this.tankinhalt;
        this.tankinhalt = this.tankVolumen;

        return getankt;
    }
    public double getTankinhalt(){
        return this.tankinhalt;
    }
}
