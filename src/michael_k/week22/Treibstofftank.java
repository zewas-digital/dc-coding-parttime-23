package michael_k.week22;

public class Treibstofftank extends Tank{
    public final String einheit = "L";
    public Treibstofftank(double tankvolumen){
        super ( );

        this.tankinhalt = tankvolumen;
        this.tankvolumen =tankvolumen;
    }
    public void tanken() {
        super.tanken ( );
    }

}
