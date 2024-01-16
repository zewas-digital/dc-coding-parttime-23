package saifedine.week16_weekend3_objects.week16.Wiederholung_V01;

public class Engine {

    public boolean isRunning;
    private int leistung;

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
