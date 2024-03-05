package Alpi.week22;

public class Circle implements Geometry {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

}
