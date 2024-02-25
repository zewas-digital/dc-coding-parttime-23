package saifedine.week21_weekend5.Geometry;

public class Triangle extends Geometry {

    private double length;

    public Triangle(double length){
        super();
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
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
