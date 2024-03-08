package judith.week21.Geometry;

public class Square extends Geometry {

    //Attribute

    private double length;

    // Konstruktor

    public Square(double length) {
        super();
        this.length = length;
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


    @Override
    public double getArea() {
         return this.length * this.length;
    }

    @Override
    public double getCircumference() {
        return 2 * (this.length + this.length);
    }
}