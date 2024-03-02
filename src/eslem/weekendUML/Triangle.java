package eslem.weekendUML;
//Gleichschnekliges Dreieck
public class Triangle extends Geometry {
    private double length;

    public Triangle(double length){
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
    public double getArea() {
        this.area = Math.pow((this.length), 2 / 4) * Math.sqrt(3);       //length hoch 2 durch vier mal Wurzel aus 3
        return this.area;
    }
    public double getLength(){return this.length;}
    public double getCircumference() {
        this.circumfence = this.length * 3;
        return this.circumfence;
    }
}
