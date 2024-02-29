package saifedine.week22.Geometry_V01;

public class Square extends Geometry {

    private double length;

    public Square(double length) {
        super();
        setLength(length);
    }

    public Square(int length) {
        super();
        this.length = (double) length;
        setLength(length);
    }


    public void setLength(double length) {
        this.length = length;
        super.area = getArea();
        super.circumference = getCircumference();
    }


    public double getArea() {
        return Math.pow(this.length, 2);
    }

    public double getCircumference() {
        return this.length * 4;
    }
}
