package Matthias.week22_Geometry;

public abstract class Geometry implements Calculation {
    double area;
    double circumference;

    // Konstruktor für Abstrakte Klasse


    @Override
    public String toString() {
        return "Fläche: "+ this.area +" Umfang: "+this.circumference;
    }

    public Geometry() {

    }
}
