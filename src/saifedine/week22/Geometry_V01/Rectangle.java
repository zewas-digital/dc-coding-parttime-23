package saifedine.week22.Geometry_V01;

public class Rectangle extends Geometry {

    // Attribute
    private double length;
    private double width;


    // Konstruktoren
    public Rectangle(double length, double width){
        super();
        setDimensions(length,width);
    }

    public Rectangle(int length, int width){
        super();
        this.length = (double) length;
        this.width = (double) width;
        setDimensions(length,width);
    }


    // Methoden
    public void setDimensions (double length,double width){
        this.length = length;
        this.width = width;
        super.area = getArea();
        super.circumference = getCircumference();
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getCircumference() {
        return this.length * 2 + this.width * 2;
    }
}