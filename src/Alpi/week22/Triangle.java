package Alpi.week22;

public class Triangle implements Geometry {

    private double length;

    public Triangle(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return (length * length) / 4 * Math.pow(3, 0.5);
    }

    @Override
    public double getCircumference() {
        return 3 * length;
    }

}
