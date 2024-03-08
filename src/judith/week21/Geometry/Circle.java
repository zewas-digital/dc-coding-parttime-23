package judith.week21.Geometry;

public class Circle extends Geometry {

    //Attribute

    private double radius;

    //Konstruktor


    public Circle(double radius) {
        super();
        this.radius = radius;
        this.area = getArea();
        this.circumference = getCircumference();
    }

    //Methoden

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
}
