package saifedine.week22.Geometry_V01;

public class Circle extends Geometry {

    private double radius;

    public Circle(double radius){
        super();
        this.radius = radius;
        this.area = (double) getArea();
        this.circumference = (double) getCircumference();
    }

    public Circle(int radius){
        super();
        this.radius = (double) radius;
        this.area = (double) getArea();
        this.circumference = (double) getCircumference();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        this.area = Math.pow(this.radius, 2) * Math.PI;
        return this.area;
    }

    @Override
    public double getCircumference() {
        this.circumference = 2 * this.radius * Math.PI;
        return this.circumference;
    }
}
