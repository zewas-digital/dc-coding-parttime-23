package michael_k.week22;

public class Batterie extends Tank{

    public final String einheit = "kW";
    public Batterie(double tankvolumen){
        super ( );

        this.tankinhalt = tankvolumen;
        this.tankvolumen =tankvolumen;
    }
    public void tanken() {
        super.tanken ( );
    }
}
