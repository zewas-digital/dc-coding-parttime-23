package michael_k.week17;

import java.util.ArrayList;

public class Pfleger {

    public String name;

    public ArrayList<Gehege> gehege = new ArrayList<Gehege> ();


    public Pfleger(String name){
        this.name = name;
    }
    public void gehegeHinzufuegen(Gehege gehege){
        this.gehege.add ( gehege );
    }
    public void resetGehege(){
        this.gehege.clear ();
    }
}
