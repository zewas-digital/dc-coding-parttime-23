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
}
