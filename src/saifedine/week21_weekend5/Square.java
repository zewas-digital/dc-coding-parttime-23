package saifedine.week21_weekend5;

public class Square extends Geometry {

    private double length;

    public Square(double length) {
        super();
        this.length = length;
        this.area = getArea();
        this.circumference = getCircumference();
    }



    public void setLength(double length) {
        this.length = length;
    }


    public double getArea() {
        this.area = Math.pow(this.length, 2);
        return this.area;
    }

    public double getCircumference() {
        this.circumference = this.length * 4;
        return this.circumference;
    }
}
