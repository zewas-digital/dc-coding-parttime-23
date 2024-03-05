package Alpi.week22;

public class Rectangle implements Geometry {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getCircumference() {
        return 2 * (length + width);
    }

}
