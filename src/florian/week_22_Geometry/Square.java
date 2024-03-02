package florian.week_22_Geometry;

public class Square extends Geometry {
    private final double length;

    public Square(double length) {
        this.length = length;
        this.area = getArea();
        this.circumference = getCircumference();
    }


    // Methoden

    @Override
    public double getArea() {
        return this.area = this.length * this.length ;
    }

    @Override
    public double getCircumference() {
        return this.circumference = this.length * 2;
    }
}
