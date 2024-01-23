package volkan.week15_objects;

public class Auto extends Object {

    public String Marke = "unbekannt";
    public String Modell = "unbekannt";
    public int kmStand;
    public int baujahr;

    public Auto(String Marke, String Modell, int baujahr, int kmStand) {
        this.Marke = Marke;
        this.Modell = Modell;
        this.baujahr = baujahr;
        this.kmStand = kmStand;
    }
    @Override
    public String toString() {
        return "Auto { " + super.toString() +
                "\n Marke = " + Marke +
                ",\n Modell = " + Modell +
                ",\n bauJahr = " + baujahr +
                ",\n km-Stand = " + kmStand +
                ",\n}";
    }
}