package MichaelReal.week19_Zoo_ArztSimulation;

public class Futter {
    private String name;
    private String einheit;
    private double einheitspreis;

    public Futter(String name, String einheit, double einheitspreis) {
        this.name = name;
        this.einheit = einheit;
        this.einheitspreis = einheitspreis;
    }

    public String getName() {
        return name;
    }

    public String getEinheit() {
        return einheit;
    }

    public double getEinheitspreis() {
        return einheitspreis;
    }
}
