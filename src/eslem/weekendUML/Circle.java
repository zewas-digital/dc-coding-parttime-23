package eslem.weekendUML;

public class Circle extends Geometry {
    private double radius;
    private double pi = Math.PI;

    public Circle(double radius){
        super();
        this.radius = radius;
        this.area = getArea();
        this.circumfence = getCircumference();
    }
    @Override
    public String toString(){
        return "Fläche: " + this.area + ", Umfang: " + this.circumfence;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        this.area = Math.PI * Math.pow(this.radius , 2);
        return this.area;
    }
    public double getCircumference() {
        this.circumfence = 2 * Math.PI * this.radius;
        return this.circumfence;
    }
}
