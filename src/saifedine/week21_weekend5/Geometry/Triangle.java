package saifedine.week21_weekend5.Geometry;

public class Triangle extends Geometry {

    private double length;

    public Triangle(double length){
        super();
        setLength(length);
    }

    public Triangle(int length){
        super();
        this.length = (double) length;
        this.area = getArea();
        getCircumference();
    }

    public void setLength(double length) {
        this.length = length;
        this.area = getArea();
        getCircumference();
    }

    // https://www.mathespass.at/formeln/gleichseitiges-dreieck-formeln-und-eigenschaften
    @Override
    public double getArea() {
        double area = (Math.sqrt(3) * Math.pow(this.length,2))/4;
        return area;
    }

    @Override
    public double getCircumference() {
        this.circumference = this.length * 3;
        return this.circumference;
    }
}