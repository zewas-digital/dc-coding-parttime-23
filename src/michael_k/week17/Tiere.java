package michael_k.week17;

public class Tiere extends Object{

    protected String name;
    public String futterart;
    public float futtermenge;
    public int gesundheit;
    public int biss;

    public Tiere (String name, String futterart, float futtermenge, int gesundheit, int biss ){
        this.name = name;
        this.futterart = futterart;
        this.futtermenge = futtermenge;
        this.gesundheit = gesundheit;
        this.biss = biss;
    }

}
