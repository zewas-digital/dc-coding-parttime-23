package florian.week_22_Geometry;

public class Triangle extends Geometry {

    private double length;

    public Triangle(double length) {
        this.length = length;
        this.area = getArea();
        this.circumference = getCircumference();
    }

    // Methoden

    public double triangle(double length) {
        return length;
    }

    @Override
    public double getArea() {
        return this.area = (this.length + this.length + this.length) / 2;
    }

    @Override
    public double getCircumference() {
        return this.circumference = this.length * 3;
    }
}
