package saifedine.week17_Zoo;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {

    private String zooName;
    private int gruendungsjahr;
    private ArrayList<Gehege> gehegeArrayList = new ArrayList<>();


    public Zoo(String zooName, int gruendungsjahr) {
        this.zooName = zooName;
        this.gruendungsjahr = gruendungsjahr;
    }


    public String toString() {
        return "\nZoo: " + this.zooName + ", gegründet " + this.gruendungsjahr;
    }

    public void addGehege(Gehege gehege, ArrayList<Gehege> gehegeArrayList) {
        gehegeArrayList.add(gehege);
    }

    public void removeGehege(Gehege gehege, ArrayList<Gehege> gehegeArrayList) {
        gehegeArrayList.remove(gehege);
    }

    public ArrayList getgehegeArrayList() {
        return this.gehegeArrayList;
    }
}

