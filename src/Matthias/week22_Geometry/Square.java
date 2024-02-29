package Matthias.week22_Geometry;

public class Square extends Geometry {
    private double length;
    public Square(double length){
        super();
        this.length=length;
        this.area = this.getArea();
        this.circumference=this.getCircumference();
    }

    @Override
    public double getArea() {
        double area=Math.pow( this.length,2 );
        System.out.println("Viereck: " + " Länge:" + this.length +" Flächeninhalt: " +area);
        return area; // Fläche eines Rechtecks A= a^2
    }

    @Override
    public double getCircumference() {
        double circumference=this.length*4;
        System.out.println("Viereck: " + " Länge:" + this.length +" Umfang: " +circumference);
        return circumference; // Umfang = 4*l
    }
}
