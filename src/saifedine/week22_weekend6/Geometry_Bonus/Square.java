package saifedine.week22_weekend6.Geometry_Bonus;

public class Square extends Geometry {

    // Attribute
    private double length;


    // Konstruktoren
    public Square(double length) {
        setLength(length);
    }

    public Square(int length) {
        this.length = (double) length;
        setLength(length);
    }


    // Methoden
    public void setLength(double length) {
        this.length = length;
        this.area = getArea();
        this.circumference = getCircumference();
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