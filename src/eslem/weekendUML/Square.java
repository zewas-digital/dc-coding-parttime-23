package eslem.weekendUML;

public class Square extends Geometry {
    private double length;

    public Square(double length) {
        super();
        this.length = length;
        this.area = getArea();
        this.circumfence = getCircumference();
    }

    @Override
    public String toString(){
       return "Fläche: " + this.area + ", Umfang: " + this.circumfence;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {return this.length;}
    public double getArea() {
        this.area = Math.pow(this.length, 2);
        return this.area;
    }

    public double getCircumference() {
        this.circumfence = this.length * 4;
        return this.circumfence;
    }

}
