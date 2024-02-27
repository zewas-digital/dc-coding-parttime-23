package claudia.week22_Geometry;

public class Star extends Geometry {
    private double length;
    private Square square;
    private Triangle triangle;

    public Star(double length) {
        this.length = length;
        this.type = "Stern";
        this.square = new Square(this.length);
        this.triangle = new Triangle(this.length);
        super.area = getArea();
        super.circumference = getCircumference();
    }

    public double getArea() {
        return this.square.getArea() + 4 * this.triangle.getArea();
    }

    public double getCircumference() {
        return 4 * this.triangle.getCircumference() - this.square.getCircumference();

    }
}


