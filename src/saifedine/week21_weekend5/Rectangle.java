package saifedine.week21_weekend5;

public class Rectangle extends Geometry {

    private double length;
    private double width;

    public Rectangle(double length, double width){
        super();
        this.length = length;
        this.width = width;
        this.area = getArea();
        this.circumference = getCircumference();
    }

    public Rectangle(int length, int width){
        super();
        this.length = (double) length;
        this.width = (double) width;
        this.area = getArea();
        this.circumference = getCircumference();
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        this.area = this.length * this.width;
        return this.area;
    }

    public double getCircumference() {
        this.circumference = this.length * 2 + this.width * 2;
        return this.circumference;
    }
}
