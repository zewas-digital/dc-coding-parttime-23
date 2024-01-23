package florian.week_18_Pflegeraufgabe;

import java.util.ArrayList;

public class Pfleger {

    public String pflegerName;

    public ArrayList<Pfleger> gehegeZustaendigkeitArrayList;



    public Pfleger(String pflegerName) {
        this.pflegerName = pflegerName;
        this.gehegeZustaendigkeitArrayList = new ArrayList<>();

    }

    public void addPfleger (Pfleger pfleger){
        this.gehegeZustaendigkeitArrayList.add(pfleger);
    }

    public void removePfleger (Pfleger pfleger){
        this.gehegeZustaendigkeitArrayList.add(pfleger);
    }

@Override
    public String toString () {return this.pflegerName;}

}
