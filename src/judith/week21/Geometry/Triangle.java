package judith.week21.Geometry;

public class Triangle extends Geometry {

    //Attribute

    private double length;

    // Konstruktor


    public Triangle(double length) {
        super();
        this.length = length;
        this.area = getArea();
        this.circumference = getCircumference();
    }

    // Methoden

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length * this.length * 0.25 * Math.sqrt(3);
    }

    @Override
    public double getCircumference() {
        return 3 * this.length;
    }
}
