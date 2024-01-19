package Simonsway.Week17;

import java.util.ArrayList;

public class Zoo {

    Tiere tiere;
    private Gehege gehege;
    private String name;
    private int year;

    public void Zoo(String name, int year) {
        this.name = name;
        this.year = year;
    }
    /////////////////////////////////////////////////////////////
    public String getName() {
        return "Zoo: " + this.name;
    }
    public int getYear() {
        return this.year;
    }
    /////////////////////////////////////////////////////////////
    ArrayList<Gehege> gehegeList = new ArrayList<Gehege>();
    public void setGehege(Gehege gehege) {
        gehegeList.add(gehege);
    }
    public void getGehege() {
        for (Gehege gehege : gehegeList) {
            System.out.println(gehege.getName());
        }
    }
    /////////////////////////////////////////////////////////////
}

