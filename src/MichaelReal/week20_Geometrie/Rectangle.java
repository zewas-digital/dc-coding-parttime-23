package MichaelReal.week20_Geometrie;

public class Rectangle extends Geometry {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getCircumference() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

