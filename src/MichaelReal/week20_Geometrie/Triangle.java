package MichaelReal.week20_Geometrie;

public class Triangle extends Geometry {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getCircumference() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = getCircumference() / 2; // Semiperimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }
}
