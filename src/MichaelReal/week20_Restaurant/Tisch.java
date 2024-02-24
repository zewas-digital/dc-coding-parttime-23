package MichaelReal.week20_Restaurant;

public class Tisch {
    private int groesse;
    private Kellner zustandigerKellner;

    public Tisch(int groesse) {
        this.groesse = groesse;
    }

    public void setZustandigerKellner(Kellner kellner) {
        this.zustandigerKellner = kellner;
    }

    // Getter-Methode für den zuständigen Kellner
    public Kellner getZustandigerKellner() {
        return this.zustandigerKellner;
    }
}
