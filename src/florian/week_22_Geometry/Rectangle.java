package florian.week_22_Geometry;

public class Rectangle extends Geometry {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.area = getArea();
        this.circumference = getCircumference();
    }

    // Methoden

    public double rectangle(double length, double width) {
        return length + width;
    }

    public int rectangle(int length, int width) {
        return length + width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.area = this.length * this.width;
    }

    @Override
    public double getCircumference() {
        return this.circumference = (this.length * 2) + (this.width * 2);
    }
}
