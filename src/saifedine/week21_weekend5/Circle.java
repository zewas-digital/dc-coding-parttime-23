package saifedine.week21_weekend5;

public class Circle extends Geometry {

    private double radius;

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getCircumference() {
        return 0;
    }
}
