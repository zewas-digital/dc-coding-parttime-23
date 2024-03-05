package Alpi.week22;

public class Square implements Geometry {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getCircumference() {
        return 4 * length;
    }

}
