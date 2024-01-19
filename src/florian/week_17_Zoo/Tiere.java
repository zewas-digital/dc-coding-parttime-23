package florian.week_17_Zoo;

public class Tiere {


    String tiergattung;
    String tiername;


    public Tiere(String tiergattung, String tiername) {
        this.tiergattung = tiergattung;
        this.tiername = tiername;
    }

    @Override
    public String toString() {

        return tiergattung +
                tiername;
    }

}
