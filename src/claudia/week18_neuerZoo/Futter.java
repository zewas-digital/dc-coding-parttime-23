package claudia.week18_neuerZoo;

public class Futter {
    private String name;
    private String einheit;
    private double preisProEinheit;

    public Futter(String name, String einheit, double preisProEinheit){
        this.name = name;
        this.einheit = einheit;
        this.preisProEinheit = preisProEinheit;
    }

    public String getName() {
        return this.name;
    }

    public String getEinheit() {
        return this.einheit;
    }

    public double getPreisProEinheit() {
        return this.preisProEinheit;
    }
}
