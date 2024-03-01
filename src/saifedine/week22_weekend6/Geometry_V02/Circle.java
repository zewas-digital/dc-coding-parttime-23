package saifedine.week22_weekend6.Geometry_V02;

public class Circle extends Geometry {

    // Attribute
    private double radius;


    // Konstruktoren
    public Circle(double radius){
        super();
        setRadius(radius);
    }

    public Circle(int radius){
        super();
        this.radius = (double) radius;
        setRadius(radius);
    }

    // Methoden
    public void setRadius(double radius) {
        this.radius = radius;
        super.area = getArea();
        super.circumference = getCircumference();
    }

    @Override
    public double getArea() {return Math.pow(this.radius,2) * Math.PI;}

    @Override
    public double getCircumference() {return 2 * this.radius * Math.PI;}
}