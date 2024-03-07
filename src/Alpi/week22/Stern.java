package Alpi.week22;

public class Stern implements Geometry {

    private Square s;
    private Triangle t;

    public Stern (double length) {
        this.s = new Square(length);
        this.t = new Triangle(length);
    }

    @Override
    public double getArea() {
        // Formel für Sternfläche
        return s.getArea() + 4 * t.getArea();
    }

    @Override
    public double getCircumference() {
        // Formel für Sternumfang
        return t.getCircumference() * 4 - s.getCircumference();
    }

}
