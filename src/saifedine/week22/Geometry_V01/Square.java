package saifedine.week22.Geometry_V01;

public class Square extends Geometry {

    // Attribute
    private double length;


    // Konstruktoren
    public Square(double length) {
        super();
        setLength(length);
    }

    public Square(int length) {
        super();
        this.length = (double) length;
        setLength(length);
    }


    // Methoden
    public void setLength(double length) {
        this.length = length;
        super.area = getArea();
        super.circumference = getCircumference();
    }

    @Override
    public double getArea() {
        return Math.pow(this.length,2);
    }

    @Override
    public double getCircumference() {
        return this.length * 4;
    }
}