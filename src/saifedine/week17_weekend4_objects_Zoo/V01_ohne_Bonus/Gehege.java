package saifedine.week17_weekend4_objects_Zoo.V01_ohne_Bonus;

import java.util.ArrayList;

public class Gehege {

    private String gehegeName;

    private ArrayList<Tiere> tiereArrayList = new ArrayList<>();

    public Gehege(String gehegeName){
        this.gehegeName = gehegeName;
    }

    public String toString(){
        return "Gehege: " + this.gehegeName;
    }

    public void addTiere(Tiere tiere){
        tiereArrayList.add(tiere);
    }

    public void removeTiere(Tiere tiere){
        tiereArrayList.remove(tiere);
    }

    public ArrayList<Tiere> gettierArrayList(){return this.tiereArrayList;}


}
