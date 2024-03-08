package judith.week21.Geometry;

public class Rectangle extends Geometry{

    //Attribute

    private double length;
    private double width;

    //Konstruktor


    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
        this.area = getArea();
        this.circumference = getCircumference();
    }

    //Methoden


    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }



    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getCircumference() {
        return 2 * (this.length + this.width);
    }
}
