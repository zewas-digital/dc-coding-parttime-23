package Alpi.week22;

public class House implements Geometry {

    private double length;
    private Square square;
    private Triangle triangle;
    /*
    private double width;

     */

    public House(double length, double width) {
        this.length = length;
        this.square = new Square(this.length);
        this.triangle = new Triangle(this.length);
    }

    @Override
    public double getArea() {
        // Formel für Hausfläche (Grundfläche + 2 * Dachfläche)
        return this.square.getArea() + this.triangle.getArea();
    }

    @Override
    public double getCircumference() {
        // Formel für Hausumfang
        return this.square.getCircumference() + this.triangle.getCircumference() * 3.6674;
    }

}
