package saifedine.week22.Geometry_V01;

abstract class Geometry implements Calculation {

    public double area;
    public double circumference;

    @Override
    public String toString(){
        return "Umfang: " + this.circumference + ", " + "Flächeninhalt: " + this.area;
    }
}
