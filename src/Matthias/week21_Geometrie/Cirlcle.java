package Matthias.week21_Geometrie;

public class Cirlcle extends Geometry{
    private double radius;

    public Cirlcle(double radius){
        super();
        this.area=getArea();
        this.circumference=getCircumference();
        this.radius=radius;
    }
    @Override
    public double getArea() {
        double area= ((Math.pow(this.radius, 2)) *Math.PI);
        System.out.println("Kreis: " + "Radius:" + this.radius +" Flächeninhalt: " +area);
        return area;
    }

    @Override
    public double getCircumference() {
        double circumference=((2*Math.PI)*this.radius);
        System.out.println("Kreis: " + " Radius:" + this.radius +" Umfang: " +circumference);
        return circumference;
    }
}
