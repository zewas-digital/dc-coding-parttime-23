package saifedine.week22_weekend6.Geometry_Bonus;

public class Triangle extends Geometry {

    // Attribute
    private double length;


    // Konstruktoren
    public Triangle(double length){
        setLength(length);
    }

    public Triangle(int length){
        this.length = (double) length;
        setLength(length);
    }

    // Methoden
    public void setLength(double length) {
        this.length = length;
        this.area = getArea();
        this.circumference = getCircumference();
    }

    public double getLength(){return this.length;}

    // https://www.mathespass.at/formeln/gleichseitiges-dreieck-formeln-und-eigenschaften
    @Override
    public double getArea() {return (Math.sqrt(3) * Math.pow(this.length,2))/4;}

    @Override
    public double getCircumference() {return this.length * 3;}
}