package saifedine.week22.Geometry_V01;

public class Triangle extends Geometry {

    private double length;

    public Triangle(double length){
        super();
        setLength(length);
    }

    public Triangle(int length){
        super();
        this.length = (double) length;
        setLength(length);
    }

    public void setLength(double length) {
        this.length = length;
        super.area = getArea();
        super.circumference = getCircumference();
    }

    // https://www.mathespass.at/formeln/gleichseitiges-dreieck-formeln-und-eigenschaften
    @Override
    public double getArea() {return (Math.sqrt(3) * Math.pow(this.length,2))/4;}

    @Override
    public double getCircumference() {return this.length * 3;}
}