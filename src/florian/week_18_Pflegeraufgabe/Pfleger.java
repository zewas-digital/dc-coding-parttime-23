package florian.week_18_Pflegeraufgabe;

import java.util.ArrayList;

public class Pfleger {

    public String pflegerName;

    private ArrayList<Gehege> gehegeZustaendigkeitArrayList;


    public Pfleger(String pflegerName) {
        this.pflegerName = pflegerName;
        this.gehegeZustaendigkeitArrayList = new ArrayList<>();

    }

    // Getter und Setter
    public ArrayList<Gehege> getGehegeZustaendigkeitArrayList() {
        return gehegeZustaendigkeitArrayList;
    }

    public void setGehegeZustaendigkeitArrayList(ArrayList<Gehege> gehegeZustaendigkeitArrayList) {
        this.gehegeZustaendigkeitArrayList = gehegeZustaendigkeitArrayList;
    }

    @Override
    public String toString() {
        return this.pflegerName ;
    }

}
