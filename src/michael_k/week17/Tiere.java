package michael_k.week17;

public class Tiere extends Object{

    protected String name;
    public String futterart;
    public float futtermenge;
    public int gesundheitMax;
    public int gesundheitAbsolut;
    public int biss;

    public Tiere (String name, String futterart, float futtermenge, int gesundheit, int biss ){
        this.name = name;
        this.futterart = futterart;
        this.futtermenge = futtermenge;
        this.gesundheitMax = gesundheit;
        this.gesundheitAbsolut = gesundheit;
        this.biss = biss;
    }
    public double getGesundheitRelativ(){

        double relativ = (double) gesundheitAbsolut / (double)gesundheitMax *100;
        int gesundheitRel = (int)relativ;
        return relativ;
    }


}
