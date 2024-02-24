package claudia.week21_Threads.Geometry;

public class Rectangle extends Geometry {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.area = getArea();
        this.circumference = getCircumference();
    }

    public void setLength(double length) {
        this.length = length;
        this.area = getArea();
        this.circumference = getCircumference();
    }

    public void setWidth(double width) {
        this.width = width;
        this.area = getArea();
        this.circumference = getCircumference();
    }

    public double getArea(){
        return this.length * this.width;
    }
    public double getCircumference(){
        return 2 * (this.length + this.width);
    }
}
