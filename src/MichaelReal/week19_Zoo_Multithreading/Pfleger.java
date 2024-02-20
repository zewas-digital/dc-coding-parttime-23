package MichaelReal.week19_Zoo_Multithreading;


public class Pfleger implements Runnable {
    private String name;
    private String lieblingsGattung;
    private Zoo zoo;

    public Pfleger(String name, String lieblingsGattung) {
        this.name = name;
        this.lieblingsGattung = lieblingsGattung;
        this.zoo = zoo;
    }

    public String getName() {
        return name;
    }

    public String getLieblingsGattung() {
        return lieblingsGattung;
    }

    @Override
    public void run() {
        zoo.simulateDayForPfleger(this);
    }
}



