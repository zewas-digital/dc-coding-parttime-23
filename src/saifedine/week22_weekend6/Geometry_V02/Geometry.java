package saifedine.week22_weekend6.Geometry_V02;

abstract class Geometry implements Calculation {

    public double area;
    public double circumference;

    @Override
    public String toString(){
        return "Umfang: " + this.circumference + ", " + "Flächeninhalt: " + this.area;
    }
}