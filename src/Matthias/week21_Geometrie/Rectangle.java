package Matthias.week21_Geometrie;

public class Rectangle extends Geometry {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        super();
        this.length=length;
        this.width=width;
        this.area=getArea();
        this.circumference=getCircumference();
    }
    public void setLength( double length ) {
        this.length = length;
    }
    public void setWidth( double width ) {
        this.width = width;
    }
    @Override
    public double getArea() {
        double area=this.length *this.width;
        System.out.println("Rechteck: " + " Länge:" + this.length +" Breite: " +this.width +" Flächeninhalt: " +area);
        return area;
    }
    @Override
    public double getCircumference() {
        double circumference=((this.length*2)+(this.width*2));
        System.out.println("Rechteck: " + " Länge:" + this.length +" Breite: "+ this.width+" Umfang: " +circumference);
        return circumference; // Umfang = 2*l +2*w;
    }
}

