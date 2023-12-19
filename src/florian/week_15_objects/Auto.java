package florian.week_15_objects;

import florian.week_14_objects.Person;

public class Auto extends Object {

    public String Marke;
    public String Modell;
    public int Baujahr;
    public int kmStand;

    public Auto(String Marke,String Modell,int Baujahr,int kmStand){
        this.Marke = Marke;
        this.Modell = Modell;
        this.Baujahr = Baujahr;
        this.kmStand = kmStand;
    }
    public String toString() {

        return ("Marke= " + Marke + ", Modell= " + Modell + ", Baujahr= " + Baujahr + ", Km-Stand= " + kmStand);
    }



}
