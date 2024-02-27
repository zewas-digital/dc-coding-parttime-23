package claudia.week22_Geometry;

public class Rectangle extends Geometry {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        super.area = getArea();
        super.circumference = getCircumference();
        this.type = "Rechteck";

    }

    public void setLength(double length) {
        this.length = length;
        super.area = getArea();
        super.circumference = getCircumference();
    }

    public void setWidth(double width) {
        this.width = width;
        super.area = getArea();
        super.circumference = getCircumference();
    }

    public double getArea(){
        return this.length * this.width;
    }
    public double getCircumference(){
        return 2 * (this.length + this.width);
    }
}
