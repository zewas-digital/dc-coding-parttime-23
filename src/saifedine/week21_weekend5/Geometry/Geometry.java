package saifedine.week21_weekend5.Geometry;

abstract class Geometry implements Calculation {

    public double area;
    public double circumference;

    @Override
    public String toString(){
        return "Umfang: " + this.circumference + ", " + "Flächeninhalt: " + this.area;
    }

}
