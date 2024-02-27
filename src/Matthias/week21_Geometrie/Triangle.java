package Matthias.week21_Geometrie;

// Es wird von einem gleichschenkligem Dreieck ausgegangen
public class Triangle extends Geometry {
    private double length;

    public Triangle( double length){
        super();
        this.length=length;
        this.area=getArea();
        this.circumference=getCircumference();

    }
    @Override
    public double getArea() {
        double area= (((Math.sqrt( 3 ))/4)*this.length*2);
        System.out.println("gleichseitiges Dreieck: " + " Länge:" + this.length +" Flächeninhalt: " +area);
        return area; //(wurzel drei / 4 )* l^2;
    }

    @Override
    public double getCircumference() {
        double circumference=this.length*3;
        System.out.println("gleichseitiges Dreieck: " + " Länge:" + this.length +" Umfang: " +circumference);
        return circumference; // Umfang = 3*l
    }
}
