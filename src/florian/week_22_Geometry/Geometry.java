package florian.week_22_Geometry;

public abstract class Geometry implements Calculation {

    public double area;
    public double circumference;


    public Geometry(double area, double circumference) {
        this.area = area;
        this.circumference = circumference;
    }

    public Geometry() {

    }


    public String toString() {
        return "Flächeninhalt: " + this.area + " ,Umfang: " + this.circumference + "\n";
    }
}
