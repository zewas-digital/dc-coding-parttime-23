package saifedine.week17_Zoo;

import java.util.ArrayList;

public class Gehege {

    private String gehegeName;

    public Gehege(String gehegeName){
        this.gehegeName = gehegeName;
    }

    public String toString(){
        return "Gehege: " + this.gehegeName;
    }

    public Gehege(String gehegeName, ArrayList<Gehege> gehegeArrayList){
        this.gehegeName = gehegeName;
        gehegeArrayList.add(this);
    }

    /*
    public Gehege(String gehegeName, ArrayList<Gehege> gehegeArrayList){
        this.gehegeName = gehegeName;
        gehegeArrayList.remove(this);
    }
     */
}
