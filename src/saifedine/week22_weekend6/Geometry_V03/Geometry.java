package saifedine.week22_weekend6.Geometry_V03;

abstract class Geometry implements Calculation {

    public double area;
    public double circumference;

    // Ausgabe zur Überprüfung der Formeln
    @Override
    public String toString(){return "Umfang: " + this.circumference + ", " + "Flächeninhalt: " + this.area;}
}