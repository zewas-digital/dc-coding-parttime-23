package Matthias.week17_objects.Wiederholung;

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

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

}
