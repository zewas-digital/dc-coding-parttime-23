package MichaelReal.week20_Geometrie;

public class Square extends Geometry {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getCircumference() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

