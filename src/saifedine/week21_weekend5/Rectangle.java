package saifedine.week21_weekend5;

public class Rectangle extends Geometry {

    private double length;
    private double width;

    public Rectangle(double length, double width){
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length, int width){
        super();
        this.length = (double) length;
        this.width = (double) width;
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
        return 0;
    }
}
