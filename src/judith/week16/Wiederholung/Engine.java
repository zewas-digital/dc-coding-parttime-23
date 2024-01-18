package judith.week16.Wiederholung;

public class Engine {

    public boolean isRunning;
    private int leistung;
        // Leistung ist hier privat gesetzt da es ja keinen Sinn ergibt wenn der Motor einmal
       // angegeben wurde diesen nochmals zu ändern.

    public Engine(int leistung) {
        this.leistung = leistung;
        this.isRunning = false;
    }

    public void start() {
        this.isRunning = true;
    }

    public void stop() {
        this.isRunning = false;
    }

    public int getLeistung() {
        return leistung;
    }


}
