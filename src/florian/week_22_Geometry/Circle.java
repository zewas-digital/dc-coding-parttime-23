package florian.week_22_Geometry;

public class Circle extends Geometry {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.area = getArea();
        this.circumference = getCircumference();
    }

    @Override
    public double getArea() {
        return this.area = Math.PI * (this.radius * this.radius);
    }

    @Override
    public double getCircumference() {
        return this.circumference = 2 * Math.PI * this.radius;
    }
}
